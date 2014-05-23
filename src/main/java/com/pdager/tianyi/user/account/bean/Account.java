package com.pdager.tianyi.user.account.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 账户
 * 
 * @author chova
 * 
 */
@Document(collection = "account")
public class Account {
	@Id
	private String id;
	private String mdn;// 手机号

	private String imsi;// imsi号

	private int points;// 当前积分值

	public String getId() {
		return id;
	}

	public String getImsi() {
		return imsi;
	}

	public String getMdn() {
		return mdn;
	}

	public int getPoints() {
		return points;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public void setMdn(String mdn) {
		this.mdn = mdn;
	}

	public void setPoints(int points) {
		this.points = points;
	}
}
