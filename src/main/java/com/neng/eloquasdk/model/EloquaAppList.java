package com.neng.eloquasdk.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class EloquaAppList<T> {

    @JsonProperty
    private List<T> elements;

    @JsonProperty
    private Integer page;

    @JsonProperty
    private Integer pageSize;

    @JsonProperty
    private Integer total;

    @JsonProperty
    private String type;
}