package com.neng.eloquasdk.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Depth {
    MINIMAL("minimal"),
    PARTIAL("partial"),
    COMPLETE("complete");

    @Getter
    private String label;
}