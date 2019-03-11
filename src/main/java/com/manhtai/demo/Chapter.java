package com.manhtai.demo;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@Getter
public class Chapter {
    @Id
    private String id;
    private String name;

    public Chapter(String name) {
        this.name = name;
    }
}
