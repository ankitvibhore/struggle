package com.struggle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.struggle.model.CveData;
//import com.struggle.dto.CveDataDTO;
import com.struggle.service.CveDataService;

@SpringBootApplication
public class StruggleApplication {

	public static void main(String[] args)throws IOException {
		SpringApplication.run(StruggleApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(CveDataService cveDataService) {
		return args -> {
		
		byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\Ankit.vibhore\\Downloads\\nvdcve-1.0-2018.json\\nvdcve-1.0-2018.json"));
//    	ObjectMapper objectMapper = new ObjectMapper();
//		CveData cve=objectMapper.readValue(jsonData, CveData.class);
//		System.out.println(cve);
		List<CveData> myMap = new ArrayList<CveData>();

		ObjectMapper objectMapper = new ObjectMapper();
		myMap = objectMapper.readValue(jsonData, ArrayList.class);
		//System.out.println("Map is: "+myMap);
		cveDataService.save(myMap); 
		//another way
//		myMap = objectMapper.readValue(jsonData, new TypeReference<HashMap<String,String>>() {});
//		System.out.println("Map using TypeReference: "+myMap);
	};
	}
}
