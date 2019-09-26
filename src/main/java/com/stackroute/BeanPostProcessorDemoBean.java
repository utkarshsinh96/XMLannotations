package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class BeanPostProcessorDemoBean implements BeanPostProcessor,InitializingBean, DisposableBean {

    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        ((AnnotationConfigApplicationContext) factory).registerShutdownHook();
        BeanPostProcessorDemoBean beanLifeCycleDemo = (BeanPostProcessorDemoBean) factory.getBean("lifecycle");
    }
    @PostConstruct
    public void Init ()
    {
        System.out.println("Initialization");
    }
    public  void clean()
    {
        System.out.println("custom destroy");
    }
    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("After properties");
    }
}