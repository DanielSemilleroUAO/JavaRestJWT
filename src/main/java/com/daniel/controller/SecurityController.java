package com.daniel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecurityController {
	
	@GetMapping("/access")
	public ResponseEntity<List<String>> informacionBancaria(){
		System.out.println("Exito");
		List<String> movimientosBancarios = obtenerUltimosMovientosBancarios();
		if(movimientosBancarios != null) {
			return new ResponseEntity<>(movimientosBancarios, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	private List<String> obtenerUltimosMovientosBancarios(){
		List<String> movimientos = new ArrayList<>();
		movimientos.add("20");
		movimientos.add("-20");
		movimientos.add("450");
		movimientos.add("100");
		return movimientos;
	}
	
}
