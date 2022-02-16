package com.fatec.calculadorarestspring.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.calculadorarestspring.modelo.Dado;
import com.fatec.calculadorarestspring.modelo.Resposta;

@RestController
public class Somador {
	@PostMapping("/soma")
	public Resposta somar(@RequestBody Dado dado) {
		double n1convertido = Double.parseDouble(dado.getN1());
		double n2convertido = Double.parseDouble(dado.getN2());
		Double soma = n1convertido + n2convertido;
		Resposta resposta = new Resposta();
		resposta.setResultado(soma.toString());
		return resposta;
	}
	
	@GetMapping("/dado")
	public Dado dado() {
		Dado dado = new Dado();
		dado.setN1("2");
		dado.setN2("5");
		return dado;
	}
}