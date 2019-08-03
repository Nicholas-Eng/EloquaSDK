package com.neng.eloquasdk.client;

import org.springframework.web.reactive.function.client.WebClient;

public abstract class EloquaWebClient {

    protected WebClient _webClient;

    public EloquaWebClient(WebClient webClient) {
        _webClient = webClient;
    }
}