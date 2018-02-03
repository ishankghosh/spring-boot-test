package com.unitTest.testdemo.Iservice;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface PersonalDetail {

	ResponseEntity<List> addDetail(int num);
}
