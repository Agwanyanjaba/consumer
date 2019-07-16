package com.wycliffe.consumer.service;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;


public class AccountConsumerService {

   public void getAccountList() {
       final String accountURL="http://127.0.0.1:8050/v1/accounts";
       HttpHeaders headers  =new HttpHeaders();
       headers.setContentType(MediaType.APPLICATION_JSON_UTF8);

       HttpEntity<String> entity = new HttpEntity<String>(headers);

       RestTemplate restTemplate  = new RestTemplate();
       ResponseEntity<String> response  = restTemplate.exchange(accountURL, HttpMethod.GET,entity,String.class);
       if(response.getStatusCode().equals(200)) {
           System.out.println("Response" + response.toString());
       }
       else{
           System.out.println("System error");
       }
   }
}
