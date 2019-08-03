package com.neng.eloquasdk.api.application;

import com.neng.eloquasdk.exception.BadRequestException;

import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class CampaignAppApiImpl implements CampaignAppApi {

    public CampaignAppApiImpl(WebClient webClient) {
        
    }

    public void activate(Integer id, Boolean activateNow) throws BadRequestException {
        
    }
}