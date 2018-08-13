package br.com.achimid.sdk.getnet.ecommerce.response;

public class Teste {

    private void teste(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
    }

}
