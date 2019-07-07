package com.neng.eloquasdk.client;

import org.springframework.web.reactive.function.client.WebClient;

import lombok.Data;

@Data
public abstract class EloquaWebClient {

    private WebClient webClient;
}