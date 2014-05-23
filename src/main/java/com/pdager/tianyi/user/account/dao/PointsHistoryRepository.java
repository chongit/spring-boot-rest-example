package com.pdager.tianyi.user.account.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pdager.tianyi.user.account.bean.PointsHistory;

public interface PointsHistoryRepository extends
		MongoRepository<PointsHistory, String> {
}
