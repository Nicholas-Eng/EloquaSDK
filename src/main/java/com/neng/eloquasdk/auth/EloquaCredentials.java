package com.neng.eloquasdk.auth;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.util.Assert;

import lombok.Data;

@Data
public class EloquaCredentials {

    public String baseUrl;

    public String companyName;

    public String username;

    public String password;

    public String basicAuth() {
        
        Assert.notNull(companyName, "Company name cannot be null");
        Assert.notNull(username, "Username cannot be null");
        Assert.notNull(password, "Password cannot be null");

        final String creds = companyName + "\\" + username + ":" + password;
        final String encodedCreds = Base64.getEncoder().encodeToString(creds.getBytes(StandardCharsets.UTF_8));
        return "Basic " + encodedCreds;
    }
}