package es.temes.JsonMap;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;

import es.coderfromscratch.jsonparsing.Json;

public class JsonTestMain {

	public static void main(String[] args) {
		
		String jsonSource = "{\"title\":\"Coder From Scratch\"}";
		
		try {
			JsonNode node = Json.parse(jsonSource);
			
			System.out.println(node.get("title").asText());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
