/**
 * Project Name:dt48_spring2
 * File Name:BankServiceProxy.java
 * Package Name:cn.java.aop2
 * Date:下午3:44:31
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
*/

package cn.java.aop2;

/**
 * Description: 代理类<br/>
 * Date: 下午3:44:31 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public class BankServiceProxy {
    private BankServiceImpl bsi = new BankServiceImpl();

    private Security s = new Security();

    private RiZhi rz = new RiZhi();

    private Clean c = new Clean();

    public void chaMoney() {
        s.isSecurity();// 首先监测安全
        bsi.getMoney();// 目标方法
        rz.log();// 记录日志
        c.clearResouce();// 清空数据
    }

    public void moneyZhuan() {
        s.isSecurity();// 首先监测安全
        bsi.zhuanMoney();// 业务
        rz.log();// 记录日志
        c.clearResouce();// 清空数据
    }

    public void touzi() {
        s.isSecurity();// 首先监测安全
        bsi.invest();// 业务
        rz.log();// 记录日志
        c.clearResouce();// 清空数据
    }

	public BankServiceProxy(BankServiceImpl bsi, Security s) {
		super();
		this.bsi = bsi;
		this.s = s;
	}

	@Override
	public String toString() {
		return "BankServiceProxy [bsi=" + bsi + ", s=" + s + ", rz=" + rz + ", c=" + c + "]";
	}
	
	
    
    
}
