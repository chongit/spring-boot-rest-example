package com.pdager.tianyi.user.account.service;

import com.pdager.tianyi.user.account.bean.Account;
import com.pdager.tianyi.user.account.bean.PointsHistory;

/**
 * 账户的业务处理
 * 
 * @author chova
 * 
 */
public interface AccountService {
	/**
	 * 获取积分
	 */
	public int getPoints(String uid);

	/**
	 * 获取基本资料
	 */
	public Account getProfile(String uid);

	public void post(Account account);

	/**
	 * 根据param修改积分
	 * 
	 * 同时生成一条修改历史 {@link PointsHistory}
	 * 
	 * @param param
	 * @return 修改后的值
	 */
	public int updatePoints(String uid, int param);
}
