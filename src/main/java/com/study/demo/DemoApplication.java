package com.study.demo;

import netscape.javascript.JSObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@SpringBootApplication
public class DemoApplication {

	@RequestMapping("/")
	ResponseEntity<HashMap> home(){
		Map<String, Object> map = new HashMap<> ();
		map.put("id",1);
		map.put("content","hello world!");
		return new ResponseEntity<HashMap>((HashMap) map, HttpStatus.OK);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
