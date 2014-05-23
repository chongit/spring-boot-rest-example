package com.pdager.tianyi.user.account;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.WriteConcern;

@Configuration
public class MongodbConfiguration extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "enavi";
	}

	@Override
	public Mongo mongo() throws Exception {
		Mongo mongo = new MongoClient("localhost", 27017);
		mongo.setWriteConcern(WriteConcern.SAFE);
		return mongo;
	}

}
