package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //Actor actor=content.getBean("actor",Actor.class);
        //System.out.println(actor);
       // Movie movie=(Movie) content.getBean("movie");
       // System.out.println( movie);
        Movie movie=(Movie)context.getBean("movie");
        System.out.println(movie.getActor());


       // BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        //Movie m=(Movie)context.getBean("movie");
       // System.out.println(m);
        //m.display();



    }
}
