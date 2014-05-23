package com.pdager.tianyi.user.account.web;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pdager.tianyi.user.account.bean.Account;
import com.pdager.tianyi.user.account.service.AccountService;

@RestController(value = "/service/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping("{uid}/profile")
	Account profile() {
		Account account = new Account();
		account.setId(new ObjectId().toString());
		account.setImsi("imsi号");
		account.setMdn("手机号");
		account.setPoints(10);
		accountService.post(account);
		return account;
	}

}
