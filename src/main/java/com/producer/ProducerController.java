package com.producer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
	
	// Recibe una pathVaribale cuando es 1 envia una respuesta valida, cuando es diferetne de 1 se produce
	// una excepction y envia la ExceptionResponse
	@RequestMapping(path = "/producer/{value}", method = RequestMethod.POST)
	public ResponseEntity<ValidResponse> getValidResponse(
			@RequestHeader(name = "county", required = false) String country,
			@RequestHeader(name = "Accept", required = true) String Accept,
			@RequestHeader(name = "uuid", required = true) String uuid,
			@RequestHeader(name = "code", required = false) String code,
			@PathVariable (name = "value")String value) throws Exception {
		System.err.println("Headers Accept: {" + Accept + "} uuid: {" + uuid +"} code:{" + code +"}" + " counrty:{"+country+"}");
		if (value.equals("1")) {
			return new ResponseEntity<ValidResponse>(new ValidResponse("hola", value), HttpStatus.OK);	// envia un objeto 
		} else {
			throw new Exception();
		}
		
	}

}
