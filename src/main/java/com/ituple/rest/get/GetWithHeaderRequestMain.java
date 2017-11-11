package com.ituple.rest.get;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class GetWithHeaderRequestMain {
	/**
	 * GET with Headers call using Spring RestTemplate
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		Map map = new HashMap<String, String>();
		map.put("Accept", "application/json");
		map.put("nf-auth-token",
				"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJTT1VSQ0VfSUQiOiJDVjZZNWdweGc2VTdaSnl4UVZHaWFnPT0iLCJYLUFQUC1JRCI6IkVGQVhHUkciLCJleHAiOjE0ODUyMzQ4NTAwNDh9.scqJlIyTcyG4kSkYTvvzbXIlq-8vF3YPf8GCH72QFnk");
		headers.setAll(map);
		HttpEntity<?> request = new HttpEntity<>(headers);
		String requestId = "EFAX1485200365180";
		String url = "http://192.168.110.51:8070/notification-portal/rest/notification/efax/" + requestId
				+ "/status.rest";
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, request, String.class);
		System.out.println(response);
	}

}
