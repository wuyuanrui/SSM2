package com.wyr.test;

import com.wyr.po.Categroy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("驱动加载完毕");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            //1、读取xml配置文件  application继承beanFactory
            ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring-applicationContext.xml");
            //2、通过bean的ID或者name找打这个bean
            Categroy categroy= (Categroy) applicationContext.getBean("cate");
            System.out.println(categroy.getName()+categroy.getId()+categroy.getProduct().getName());
            
            
          
            
            
        

    }
}
