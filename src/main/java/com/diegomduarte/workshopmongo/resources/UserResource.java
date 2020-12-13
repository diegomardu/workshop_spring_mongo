package com.diegomduarte.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.diegomduarte.workshopmongo.domain.User;
import com.diegomduarte.workshopmongo.service.UserService;

@RestController //Anotação do spring para identificar a classe como um recurso rest
@RequestMapping(value="/users") //Setar caminho do endpoint
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET) //informa que o endpoint sera um endpoint rest(@GetMapping poderia ser usado tmbm)
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();		
		return ResponseEntity.ok().body(list); 
		//.ok() resposta de conexão ok
		//.body() o que sera retornado na requisição
	}

}
