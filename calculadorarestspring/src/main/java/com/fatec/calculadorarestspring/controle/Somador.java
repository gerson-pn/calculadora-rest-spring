package com.fatec.calculadorarestspring.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Somador {	
	@GetMapping("/soma/{n1}/{n2}")
	public String somar(@PathVariable String n1, @PathVariable String n2) {
		double n1convertido = Double.parseDouble(n1);
		double n2convertido = Double.parseDouble(n2);
		Double soma = n1convertido + n2convertido;
		return soma.toString();
	}
}