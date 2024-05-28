package com.medidoc.api.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

@Configuration
@EnableDynamoDBRepositories(basePackages = "com.medidoc.api.repository")
public class DynomoDBConfig {
    @Value("dynamodb.us-east-1.amazonaws.com")
    String endpoint;
    @Value("AKIAZQ3DRRIWX#######")
    String accesskey;
    @Value("r637P8Bf+NO402Qcc9KLSGYvh783tqZg########")
    String secretkey;
    @Value("us-east-1")
    String region;

    @Bean
    public AmazonDynamoDB amazonDynamoDB() {
        return AmazonDynamoDBClientBuilder
                .standard()
                .withEndpointConfiguration(
                        new AwsClientBuilder.EndpointConfiguration(endpoint,region))
                .withCredentials(new AWSStaticCredentialsProvider(
                        new BasicAWSCredentials(accesskey, secretkey)))
                .build();
    }

}
