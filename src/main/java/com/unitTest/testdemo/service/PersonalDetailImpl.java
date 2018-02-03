package com.unitTest.testdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.unitTest.testdemo.Iservice.PersonalDetail;
import com.unitTest.testdemo.model.DataModel;

@Service
public class PersonalDetailImpl implements PersonalDetail{

	
	    @Bean
	    RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
	
	
	@Autowired
	RestTemplate restTemplate;
	@Override
	public ResponseEntity<List> addDetail(int num) {
		List<DataModel> listData = new ArrayList<>();
		for(int i=0;i<num;i++)
		{
			DataModel info = new DataModel();
			info.setFirst_name("first_name"+i);
			info.setLast_name("last_name"+i);
			info.setAddress("address"+i);
			listData.add(info);
		}
		HttpEntity<List> entity = new HttpEntity<List>(listData);
		ResponseEntity<List> listDataPerson = restTemplate.exchange(
				"url", HttpMethod.POST, entity, List.class);
				
		return new ResponseEntity<List>(listData, HttpStatus.OK);
	}

}
