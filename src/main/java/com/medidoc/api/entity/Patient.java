package com.medidoc.api.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@DynamoDBTable(tableName = "Patient")

@Data
public class Patient {

    @DynamoDBHashKey(attributeName = "patientid")
    @DynamoDBAutoGeneratedKey
    private String patientid;

    @DynamoDBAttribute(attributeName = "patientname")
    private String patientname;

    @DynamoDBAttribute(attributeName = "phone")
    private String phone;

    @DynamoDBAttribute(attributeName = "email")
    private String email;

}