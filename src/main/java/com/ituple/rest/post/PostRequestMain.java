package com.ituple.rest.post;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;


public class PostRequestMain {

	/**
	 * POST with Headers call using Spring RestTemplate
	 * 
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		Map map = new HashMap<String, String>();
		map.put("Content-Type", "application/json");
		map.put("auth-token",
				"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJTT1VSQ0VfSUQiOiJScTFXdWx6ci9NSk15ZmRHaFJpMVlnPT0iLCJTT1VSQ0VfS0VZIjoidmNLL25uRnpQQ2RxNWpyK0xhemc0UT09IiwiVEVOQU5UX0tFWSI6IkVXU0dSRyIsIlVTRVIiOnsiTEFTVF9OQU1FIjoiYWJjIiwiRU1BSUwiOiJhYmMueHl6QHBxci5jb20iLCJGSVJTVF9OQU1FIjoieHl6In0sImV4cCI6MTQ4MzQzNTExNzQwOH0.vEo8WcLySplZYaeYSdXYL-kV2e6itLBP2iUo2VxJ4YY");
		headers.setAll(map);

		Map req_payload = new HashMap();
		req_payload.put("name", "piyush");

		HttpEntity<Map> request = new HttpEntity<Map>(req_payload, headers);
		String url = "http://localhost:8080/ews-portal/clients/";

		ResponseEntity<String> response = new RestTemplate().postForEntity(url, request, String.class);
	/*	ServiceResponse entityResponse = (ServiceResponse) response.getBody();
		System.out.println(entityResponse.getData());*/
	}

}
