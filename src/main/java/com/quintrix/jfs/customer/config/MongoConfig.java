package com.quintrix.jfs.customer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoConfig {

  // connects to mongo database path in yml
  @Value("${customerService.getUrl}")
  String customerServiceGetUrl;

  @Bean
  public MongoClient mongo() {
    ConnectionString connectionString = new ConnectionString(customerServiceGetUrl);
    MongoClientSettings mongoClientSettings =
        MongoClientSettings.builder().applyConnectionString(connectionString).build();

    return MongoClients.create(mongoClientSettings);
  }

  @Bean
  public MongoTemplate mongoTemplate() throws Exception {
    return new MongoTemplate(mongo(), "test");
  }

}
