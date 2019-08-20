/**
 * Project Name:dt48_spring2
 * File Name:Window.java
 * Package Name:cn.java.aop2
 * Date:下午3:48:58
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
*/

package cn.java.aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description: <br/>
 * Date: 下午3:48:58 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public class Window {

    public static void main(String[] args) {

        // BankServiceProxy bsp = new BankServiceProxy();
        // bsp.chaMoney();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BankServiceImpl bsi = (BankServiceImpl) context.getBean("bankServiceImpl");
        // bsi.getMoney();
        bsi.bbb();
    }

}
