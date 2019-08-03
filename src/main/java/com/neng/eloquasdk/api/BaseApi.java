package com.neng.eloquasdk.api;

import java.time.Duration;

import com.neng.eloquasdk.exception.BadRequestException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
public abstract class BaseApi {

    @Value("${com.neng.eloquasdk.default.timeout}")
    protected Integer _defaultTimeout;

    protected Duration DEFAULT_TIMEOUT;

    protected WebClient _webClient;

    public BaseApi(WebClient webClient) {
        _webClient = webClient;
        DEFAULT_TIMEOUT = Duration.ofMillis(_defaultTimeout);
    }

    protected Mono<Throwable> handleHttpError(ClientResponse response) {
        return response.bodyToMono(String.class)
            .flatMap(msg -> {
                log.error("Request failed with " + response.statusCode() + " status code");
                return Mono.error(new BadRequestException(response.statusCode(), msg));
            });
    }
}