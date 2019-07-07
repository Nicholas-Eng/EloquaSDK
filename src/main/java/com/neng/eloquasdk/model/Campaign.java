package com.neng.eloquasdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Campaign {

    @JsonProperty
    private String accessedAt;

    @JsonProperty
    private String actualCost;

    @JsonProperty
    private String badgeId;

    @JsonProperty
    private String budgetedCost;

    @JsonProperty
    private String campaignCategory;

    @JsonProperty
    private String campaignType;

    @JsonProperty
    private String clrEndDate;

    @JsonProperty
    private String createdAt;

    @JsonProperty
    private String createdBy;

    @JsonProperty
    private String crmId;

    @JsonProperty
    private String currentStatus;

    @JsonProperty
    private String depth;

    @JsonProperty
    private String description;

    // @JsonProperty
    // private List<Something> elements;

    @JsonProperty
    private String endAt;

    // @JsonProperty
    // private List<Something> fieldValues;

    @JsonProperty
    private String firstActivation;

    @JsonProperty
    private String folderId;

    @JsonProperty
    private String id;

    @JsonProperty
    private String isEmailMarketingCampaign;

    @JsonProperty
    private String isIncludedInROI;

    @JsonProperty
    private String isMemberAllowedReEntry;

    @JsonProperty
    private String isReadOnly;

    @JsonProperty
    private String isSyncedWithCRM;

    @JsonProperty
    private String memberCount;

    @JsonProperty
    private String name;

    // @JsonProperty
    // private List<Something> permissions;

    @JsonProperty
    private String product;

    @JsonProperty
    private String region;

    @JsonProperty
    private String runAsUserId;

    @JsonProperty
    private String scheduledFor;

    @JsonProperty
    private String sourceTemplateId;

    @JsonProperty
    private String startAt;

    @JsonProperty
    private String type;

    @JsonProperty
    private String updatedAt;

    @JsonProperty
    private String updatedBy;
}