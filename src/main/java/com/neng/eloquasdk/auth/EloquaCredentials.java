package com.neng.eloquasdk.auth;

import lombok.Data;

@Data
public class EloquaCredentials {

    public String baseUrl;

    public String companyName;

    public String username;

    public String password;
}