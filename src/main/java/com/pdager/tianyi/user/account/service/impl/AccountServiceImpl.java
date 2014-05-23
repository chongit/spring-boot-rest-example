package com.pdager.tianyi.user.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdager.tianyi.user.account.bean.Account;
import com.pdager.tianyi.user.account.dao.AccountRepository;
import com.pdager.tianyi.user.account.dao.PointsHistoryRepository;
import com.pdager.tianyi.user.account.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private PointsHistoryRepository pointsHistoryRepository;

	public int getPoints(String uid) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Account getProfile(String uid) {
		return accountRepository.findOne(uid);
	}

	public void post(Account account) {
		accountRepository.save(account);
	}

	public int updatePoints(String uid, int param) {
		return 0;
	}

}
