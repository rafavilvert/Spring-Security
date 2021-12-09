package br.com.springsecurity.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteResource {
	
	@RequestMapping("/clientes")
	public String helloCustomers() {
		return "Clientes";
	}

}
