package br.com.achimid.sdk.getnet.ecommerce.response;

import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;
import java.util.Collections;

public class Teste {

    private String URL = "https://api-sandbox.getnet.com.br";
    private String seller_id = "5050b865-087e-4350-8f67-f2ad248a74fa";
    private String client_id = "10cb71a2-cf65-4fa4-aa62-7f9051f2d0f0";
    private String client_secret = "d82bd19f-b295-40d1-b5c2-9ccddc92aa13";


    public static void main(String[] args) {
        new Teste().teste();
    }

    private void teste(){
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        System.out.println("Authorization: Basic " +  Base64.getEncoder().encodeToString("10cb71a2-cf65-4fa4-aa62-7f9051f2d0f0:d82bd19f-b295-40d1-b5c2-9ccddc92aa13".getBytes()));

        headers.add("Authorization", "Authorization: Basic " +  Base64.getEncoder().encodeToString(
                "10cb71a2-cf65-4fa4-aa62-7f9051f2d0f0:d82bd19f-b295-40d1-b5c2-9ccddc92aa13".getBytes()));

        MultiValueMap<String, String> map= new LinkedMultiValueMap<>();
        map.add("scope", "oob");
        map.add("grant_type", "client_credentials");

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

        ResponseEntity<String> response = restTemplate.exchange(URL + "/auth/oauth/v2/token", HttpMethod.POST, request, String.class);
        System.out.println(response.getBody());

    }

}

