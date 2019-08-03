package com.neng.eloquasdk.api.application;

import com.neng.eloquasdk.api.BaseApi;
import com.neng.eloquasdk.constant.CampaignUri;
import com.neng.eloquasdk.exception.BadRequestException;
import com.neng.eloquasdk.model.Campaign;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class CampaignAppApiImpl extends BaseApi implements CampaignAppApi {

    public CampaignAppApiImpl(WebClient webClient) {
        super(webClient);
    }

    public Campaign activate(Integer id, Boolean activateNow) throws BadRequestException {
        return _webClient.post()
            .uri(uriBuilder -> uriBuilder.path(CampaignUri.ACTIVATE)
                .queryParam("activateNow", activateNow)
                .build(id)
            )
            .retrieve()
            .onStatus(HttpStatus::isError, response -> handleHttpError(response))
            .bodyToMono(Campaign.class)
            .doOnError(e -> {
                log.error("Failed to activate campaign", e);
            })
            .doFinally(signal -> {
                log.debug("Finished activate campaign");
            })
            .block(DEFAULT_TIMEOUT);
    }
}