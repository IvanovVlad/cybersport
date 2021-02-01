package com.java.cybersport.Tools;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HTMLloader {
    public String sendRequest(String address) {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(address)).build();

        try {
            HttpResponse httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            return  httpResponse.body().toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
