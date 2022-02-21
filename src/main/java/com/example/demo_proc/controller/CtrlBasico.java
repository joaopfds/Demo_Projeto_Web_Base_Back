package com.example.demo_proc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_proc.models.ModelBasicoRequest;
import com.example.demo_proc.models.ModelBasicoResponse;
import com.example.demo_proc.service.ServiceBasico;

@RestController
@RequestMapping
public class CtrlBasico {

	@Autowired
	private ServiceBasico service;

	@PostMapping(value = "/v1/processar", produces = { "application/json", "application/xml" }, consumes ={ "application/json", "application/xml" })
	public ResponseEntity<ModelBasicoResponse> metodoPostProcessa(@Valid @RequestBody ModelBasicoRequest req) throws Exception {
		ModelBasicoResponse res = service.processa(req);
		return ResponseEntity.ok(res);
	}
	
	@GetMapping
	public ResponseEntity<String> teste() {
		return ResponseEntity.ok("OKAY");
	}
	
//	@PostMapping(value = "/postBasico", produces = { "application/json", "application/xml" }, consumes ={ "application/json", "application/xml" })
//	public ResponseEntity<ModelBasicoResponse> metodoPostBasic(@Valid @RequestBody ModelBasicoRequest req) throws IllegalStateException, IOException {
//		//
//		return null;
//	}
//	
//	@PatchMapping(value = "/patchBasico/{id}", consumes = { "application/json", "application/xml" })
//	public ResponseEntity<?> metodoPatchBasic(@Valid @RequestBody ModelBasicoRequest req, @PathVariable Long id) throws IllegalStateException, IOException {
//		//
//		return null;
//	}
//	
//	@DeleteMapping("/deleteBasico/{id}")
//	public ResponseEntity<String> delete(@PathVariable Long id) {
//		//
//		return null;
//	}
//	
//	@GetMapping(value = "/getBasico/{id}", produces = { "application/json",
//			"application/xml" })
//	public ResponseEntity<ModelBasicoResponse> findClientById(@PathVariable Long id) {
//		//
//		return null;
//	}		
}


