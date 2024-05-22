package org.example;

import org.example.config.AppConfig;
import org.example.config.Desktop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien alien= context.getBean(Alien.class);
        Alien alien2= context.getBean(Alien.class);

        if(alien.equals(alien2)){
            System.out.println("Bean is sigleton");
        }
        else{
            System.out.println("Bean is prototype");
        }

        System.out.println("****************************");

        //This is an example of a "prototype" if you like.
        Desktop desktop = context.getBean(Desktop.class);
        Desktop desktop2= context.getBean(Desktop.class);

        if(desktop.equals(desktop2)){
            System.out.println("Bean is singleton");
        }
        else {
            System.out.println("Bean is prototype");
        }
    }
}
