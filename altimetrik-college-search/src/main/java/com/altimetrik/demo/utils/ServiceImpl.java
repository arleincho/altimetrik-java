package com.altimetrik.demo.utils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ServiceImpl implements Serivce {

	@Autowired
	RestTemplate client;

	@Override
	public ReturnResponse search(String degres, int year, int zip, int distance, int per_page, int page) {

		StringBuilder url = new StringBuilder()
	            .append("https://api.data.gov/ed/collegescorecard/v1/schools.json?")
	            .append("api_key=0OPgPUihcxtFhUd6ooh6pGHmdyA10ThPdN3KN4tK&")
	            .append("distance=" + distance + "mi&")
	            .append("fields=id,school.name," + year + ".student.size&zip=" + zip + "&")
	            .append("per_page=" + per_page + "&page=" + page + "&")
	            .append("school.degrees_awarded.predominant=" + degres);
		
		Response response = client
				  .getForObject(url.toString(), Response.class);

		response.sort();
		response.getMetadata().setPages();
		ReturnResponse  returnReponse = new ReturnResponse(response.getMetadata(), response.getList());
		
		return returnReponse;
	}

}