package com.spboot.mongo.pagination.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Document(collection = "BulkData")
public class BulkData {
    private String id;
    private String name;
    private Integer age;
}
