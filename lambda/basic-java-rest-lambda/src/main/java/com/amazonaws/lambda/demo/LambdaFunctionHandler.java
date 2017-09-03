package com.amazonaws.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.example.dto.RequestParams;
import com.example.dto.customerDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LambdaFunctionHandler implements RequestHandler<RequestParams, String> {

    @Override
    public String handleRequest(RequestParams input, Context context) {
        context.getLogger().log("Input: " + input);
       // console.log(input);
    	customerDTO customer=null;
    	ObjectMapper om= new ObjectMapper();
    	String responseString="";
    	try {
    		responseString=om.writeValueAsString(input);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	if(null!=input.getBody()) {
    		customer=(customerDTO)input.getBody();
    		responseString+="Id: "+customer.getId()+"\nName: "+customer.getFirstName()+" "+customer.getLastName()
			+"\nQuote: "+customer.getQuote()+" \n ";
    	}
    	
        
			return responseString;
		
    }

}
