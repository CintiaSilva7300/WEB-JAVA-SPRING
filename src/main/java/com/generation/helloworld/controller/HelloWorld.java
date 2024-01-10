package com.generation.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorld {

	@GetMapping("/teste")
	public String helloWorldText(){
		return "Hellor world";
	}
	
	@GetMapping("/bsm")
	public List<String> bsms(){
		List<String> listaDeItens = new ArrayList<>();
		
		listaDeItens.add("Responsabilidade Pessoal");
		listaDeItens.add("Mentalidade de Crescimento");
		listaDeItens.add("Orientação ao futuro");
		listaDeItens.add("Persistência");
		listaDeItens.add("Comunicação");
		listaDeItens.add("Atenção aos detalhes");
		listaDeItens.add("Atenção aos detalhes");
		listaDeItens.add("Trabalho em equipe");
		listaDeItens.add("Persistência");
	        
		
		return listaDeItens;
	}
	
	@GetMapping("/obj")
	public List<String> objetivos(){
		List<String> listaDeItens = new ArrayList<>();
		
		listaDeItens.add("Aprofundar o entendimento em técnico");
		listaDeItens.add("Explorar os princípios de spring boot");
		listaDeItens.add("Aprender a implementar funcionalidades");
		listaDeItens.add("Praticar o desenvolvimento");
	        
		
		return listaDeItens;
	}
}