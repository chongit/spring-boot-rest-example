package com.pdager.tianyi.user.account.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pdager.tianyi.user.account.bean.Account;

public interface AccountRepository extends MongoRepository<Account, String> {
}
