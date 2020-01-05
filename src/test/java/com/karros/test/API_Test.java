package com.karros.test;

import org.testng.annotations.Test;

import commons.AbstractTest;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Test extends AbstractTest{
	@Test
	public void verifyAPI() {
		RestAssured.baseURI = "https://my-json-server.typicode.com/typicode/demo/posts";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("/1");

		log.info("Validate Response Status");
		verifyEquals(response.getStatusCode(), 200);
		
		
		log.info("Validate Response Header");
		verifyEquals(response.header("access-control-allow-credentials"), "true");
		verifyEquals(response.header("cache-control"), "no-cache");
		verifyEquals(response.header("cf-cache-status"), "DYNAMIC");
		verifyEquals(response.header("content-length"), "34");
		verifyEquals(response.header("content-type"), "application/json; charset=utf-8");
		verifyEquals(response.header("etag"), "W/\"22-ORE+sIpA7k7Lz7HudwoA9jNFWEk\"");
		verifyEquals(response.header("expect-ct"),
				"max-age=604800, report-uri=\"https://report-uri.cloudflare.com/cdn-cgi/beacon/expect-ct\"");
		verifyEquals(response.header("expires"), "-1");
		verifyEquals(response.header("pragma"), "no-cache");
		verifyEquals(response.header("server"), "cloudflare");
		verifyEquals(response.header("vary"), "Origin, Accept-Encoding");
		verifyEquals(response.header("via"), "1.1 vegur");
		verifyEquals(response.header("x-content-type-options"), "nosniff");
		verifyEquals(response.header("x-powered-by"), "Express");

		log.info("Validate Response Body");
		JsonPath jsonPathEvaluator = response.jsonPath();
		verifyEquals(jsonPathEvaluator.get("id"), 1);
		verifyEquals(jsonPathEvaluator.get("title"), "Post 1");
	}
}
