package com.example.demo_proc.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo_proc.models.ModelBasicoRequest;
import com.example.demo_proc.models.ModelBasicoResponse;

@Transactional
@Service
public class ServiceBasico {

	public ModelBasicoResponse processa(@Valid ModelBasicoRequest req) throws Exception {
		ModelBasicoResponse res = new ModelBasicoResponse();
		res.setColuna_nova(req.getColuna()+1);
		res.setLinha_nova(req.getLinha()+1);
		res.setUmBool_novo(!req.getUmBool());
		
		if (res.getColuna_nova() == 1001) {
			throw new Exception("Error") ;
		}
		
		return res;
	}
}
