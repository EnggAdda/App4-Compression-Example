package com.example.app4.controller;


import com.example.app4.filter.GZIPFilterConfig;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class GZIPController {
    @Autowired
    private GZIPFilterConfig gzipFilterConfig;
    @Autowired
    private RestTemplate restTemplate;


    @Value("${app3.base.url}")
private String baseUrl;

    @GetMapping("/app4")
    public String callApp3() {
        // Generate some sample data (replace this with your actual data retrieval logic
        // Simulate a long response to see the effect of compression
        StringBuffer url = new StringBuffer(baseUrl);
        url.append("/api/data");

            HttpEntity<String> httpEntity  = new HttpEntity<>(gethttpHeaders());
           val response  =  restTemplate.exchange(url.toString() , HttpMethod.GET,httpEntity, String.class);

        return  response.getBody();
    }

    @GetMapping("/api/data")
    public String getData() {
        // Generate some sample data (replace this with your actual data retrieval logic)
        String data = "mjhjhbjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj" +
                "kjbjmbjkkkkkkkkkkkkkkkkkkkkkkkkLorem ipsum dolor sit amet,nbvnvhv" +
                "jhjhvjhjkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" +
                "hjhvhvjhvjhvjhvvhhvh" +
                "jbhvjhvhjv" +
                "nvhvhjvhvvhjvvhv" +
                "" +
                "" +
                "" +
                "hhjvvh" +
                "bjhvhv" +
                " consectetur adipiscing elit.";
        System.out.println( gzipFilterConfig.gzipFilter());

        // Simulate a long response to see the effect of compression
        try {
            Thread.sleep(1000); // Simulate some delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return data;
    }

    @GetMapping("/hello")
    public String getData1() {
        // Generate some sample data (replace this with your actual data retrieval logic)
        String data = "mjhjhbjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj" +
                "kjbjmbjkkkkkkkkkkkkkkkkkkkkkkkkLorem ipsum dolor sit amet,nbvnvhv" +
                "jhjhvjhjkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" +
                "hjhvhvjhvjhvjhvvhhvh" +
                "jbhvjhvhjv" +
                "nvhvhjvhvvhjvvhv" +
                "" +
                "" +
                "" +
                "hhjvvh" +
                "bjhvhv" +
                " consectetur adipiscing elit.";

        System.out.println( gzipFilterConfig.gzipFilter());

        // Simulate a long response to see the effect of compression
        try {
            Thread.sleep(1000); // Simulate some delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return data;
    }

    private HttpHeaders gethttpHeaders(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
      /*  headers.add(HttpHeaders.CONTENT_ENCODING, "application/gzip");
        headers.add(HttpHeaders.ACCEPT_ENCODING, "application/gzip");*/
        return headers;
    }
}

