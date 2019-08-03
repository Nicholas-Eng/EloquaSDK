package com.neng.eloquasdk.client;

import com.neng.eloquasdk.api.application.CampaignAppApi;
import com.neng.eloquasdk.api.application.CampaignAppApiImpl;
import com.neng.eloquasdk.auth.EloquaCredentials;
import com.neng.eloquasdk.builder.EloquaWebClientBuilder;

import org.springframework.http.HttpHeaders;
import org.springframework.util.Assert;
import org.springframework.web.reactive.function.client.WebClient;

public class EloquaAppWebClient extends EloquaWebClient {

    private CampaignAppApi _campaignAppApi;

    private EloquaAppWebClient(Builder builder) {
        super(builder.webClient);
        _campaignAppApi = new CampaignAppApiImpl(builder.webClient);
    }

    public CampaignAppApi campaign() {
        return _campaignAppApi;
    }

    public static class Builder implements EloquaWebClientBuilder {

        private WebClient webClient;

        private EloquaCredentials credentials;

        public EloquaAppWebClient build() {
            this.webClient = WebClient.builder()
                .defaultHeader(HttpHeaders.AUTHORIZATION, credentials.basicAuth())
                .build();
            return new EloquaAppWebClient(this);
        }

        public Builder credentials(EloquaCredentials credentials) {

            Assert.notNull(credentials, "Credentials cannot be null");
            
            this.credentials = credentials;
            return this;
        }
    }
}