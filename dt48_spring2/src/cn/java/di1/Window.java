/**
 * Project Name:dt48_spring1
 * File Name:Window.java
 * Package Name:cn.java.ioc1
 * Date:下午3:05:37
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
*/

package cn.java.di1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description: <br/>
 * Date: 下午3:05:37 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public class Window {

    public static void main(String[] args) {
        // 1、启动框架(context代表spring容器)
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2、获取spring容器中创建的对象(通过id值获取)
        Person p1 = (Person) context.getBean("person");
        System.out.println(p1);
    }

}
