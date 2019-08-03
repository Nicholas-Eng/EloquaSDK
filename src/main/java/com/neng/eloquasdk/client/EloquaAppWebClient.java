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

            if(webClient == null) {
                this.webClient = WebClient.builder()
                    .baseUrl(credentials.getBaseUrl())
                    .defaultHeader(HttpHeaders.AUTHORIZATION, credentials.basicAuth())
                    .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                    .build();
            }
            
            return new EloquaAppWebClient(this);
        }

        public Builder webClient(WebClient webClient) {
            Assert.notNull(webClient, "WebClient cannot be null");         
            this.webClient = webClient;
            return this;
        }

        public Builder credentials(EloquaCredentials credentials) {
            Assert.notNull(credentials, "Credentials cannot be null");         
            this.credentials = credentials;
            return this;
        }
    }
}