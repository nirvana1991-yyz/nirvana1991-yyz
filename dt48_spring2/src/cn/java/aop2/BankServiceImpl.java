/**
 * Project Name:dt48_spring2
 * File Name:BankServiceImpl.java
 * Package Name:cn.java.aop2
 * Date:下午3:31:44
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
*/

package cn.java.aop2;

/**
 * Description: 核心业务<br/>
 * Date: 下午3:31:44 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public class BankServiceImpl {

    /**
     * 
     * Description: 查询余额<br/>
     *
     * @author dingP
     */
    public void getMoney() {// 高内聚，低耦合
        System.out.println("BankServiceImpl.........getMoney().........余额为500万");

    }

    /**
     * 
     * Description: 转账业务<br/>
     *
     * @author dingP
     */
    public void zhuanMoney() {
        System.out.println("BankServiceImpl.........zhuanMoney().........转账100万");
    }

    /**
     * 
     * 
     * Description: 投资理财<br/>
     *
     * @author dingP
     */
    public void invest() {
        System.out.println("BankServiceImpl.........invest().........投资100万，投资失败");

    }

    public void aaa() {

    }

    public void bbb() {
        System.out.println("BankServiceImpl.........bbb().........pppp");
    }
}
