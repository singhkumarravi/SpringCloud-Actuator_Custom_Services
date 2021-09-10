package com.olive.custom.endpoint;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "test")
public class MyCustomEndPoint {
	
	@ReadOperation
	public Map<String, String> myCustomDataA(){
		Map<String, String> m=new HashMap<String, String>();
		m.put("T1", "A1");
		m.put("T2", "A2");
		m.put("T3", "A3");
		m.put("T4", "A4");
		return m;
	}
	
	@WriteOperation
	public String myCustomDataB(@Selector String code) {
		return"DUMMY SERVICE FROM POST!" + code;
	}
	
	@DeleteOperation
	public String myCustomDataC(String id) {
		return"DUMMY SERVICE FROM DELETE!" + id;
	}

}
