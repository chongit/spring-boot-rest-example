package com.pdager.tianyi.user.account.bean;

import java.util.Date;

/**
 * 积分历史
 * 
 * @author chova
 * 
 */
public class PointsHistory {
	private int param;// 参数(积分值)
	private String actionName;// 积分原因
	private Date datetime;// 时间

	public String getActionName() {
		return actionName;
	}

	public Date getDatetime() {
		return datetime;
	}

	public int getParam() {
		return param;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public void setParam(int param) {
		this.param = param;
	}

}
