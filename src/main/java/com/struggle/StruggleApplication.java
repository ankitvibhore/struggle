package com.struggle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.struggle.dto.CveDataDTO;
import com.struggle.dto.CveDataDTO;

@SpringBootApplication
public class StruggleApplication {

	public static void main(String[] args)throws IOException {
		SpringApplication.run(StruggleApplication.class, args);
		
		byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\Ankit.vibhore\\Downloads\\nvdcve-1.0-2018.json\\nvdcve-1.0-2018.json"));
    	ObjectMapper objectMapper = new ObjectMapper();
		CveDataDTO cve=objectMapper.readValue(jsonData, CveDataDTO.class);
		System.out.println(cve);
//		Map<String,String> myMap = new HashMap<String, String>();
//
//		ObjectMapper objectMapper = new ObjectMapper();
//		myMap = objectMapper.readValue(jsonData, HashMap.class);
//		System.out.println("Map is: "+myMap);

		//another way
//		myMap = objectMapper.readValue(jsonData, new TypeReference<HashMap<String,String>>() {});
//		System.out.println("Map using TypeReference: "+myMap);
	}
}
