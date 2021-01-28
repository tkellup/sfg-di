package guru.framework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//a class that represents the Spring Bean LifeCycle
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleBean constructor.");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set.");
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("## Bean Name is " + beanName);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("##The Lifecycle has been terminated.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("##The LifeCycleBean has its properties.");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application Context has been set.");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("##The post construct annotated method has been called.");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("##The pre destroy annotated method has been called.");
    }

    public void beforeInit() {
        System.out.println("## -Before Init-Called by Bean Post Processor");
    }

    public void afterInit() {
        System.out.println("## -After Init-Called by Bean Post Processor");
    }
}
