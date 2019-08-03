package com.neng.eloquasdk.constant;

public final class CampaignUri {

    private CampaignUri() {

    }

    public static final String ACTIVATE = "/api/REST/2.0/assets/campaign/active/{id}";
    public static final String CREATE = "/api/REST/2.0/assets/campaign";
    public static final String DEACTIVATE = "/api/REST/2.0/assets/campaign/draft/{id}";
    public static final String DELETE = "/api/REST/2.0/assets/campaign/{id}";
    public static final String RETRIEVE = "/api/REST/2.0/assets/campaign/{id}";
    public static final String RETRIEVE_LIST = "/api/REST/2.0/assets/campaigns";
    public static final String UPDATE = "/api/REST/2.0/assets/campaign/{id}";
}