package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.sql.SQLOutput;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //task-1
         Movie movie=(Movie)context.getBean("movie");
      System.out.println(movie.getActor());
        //task-2
       Movie movieA=(Movie)context.getBean("movie1");
       System.out.println(movieA.getActor());
      System.out.println(movie=movieA);
      //  BeanLifecycleDemoBean beanLifecycleDemoBean = context.getBean("BeanLifecycle", BeanLifecycleDemoBean.class);
        //System.out.println(beanLifecycleDemoBean);

         //context.registerShutdownHook();



    }
}
