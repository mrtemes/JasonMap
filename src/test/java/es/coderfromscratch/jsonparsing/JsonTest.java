package es.coderfromscratch.jsonparsing;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.JsonNode;

class JsonTest {
	
	private String simpleTestCaseJsonSource = "{\"title\":\"Coder From Scratch\"}";

	@org.junit.jupiter.api.Test
	void parse() throws IOException {

		JsonNode node = Json.parse(simpleTestCaseJsonSource);
		assertEquals(node.get("title").asText(), actual: "Coder From Scratch");
		//System.out.println(node.get("title").asText());
	}

}
