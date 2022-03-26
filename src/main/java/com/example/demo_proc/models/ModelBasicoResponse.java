package com.example.demo_proc.models;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ModelBasicoResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer linha_nova;
	
	private Integer coluna_nova;
	
	private Boolean umBool_novo;
	
	private List<String> teste_novo;
	
	private List<String> teste_2;

}
