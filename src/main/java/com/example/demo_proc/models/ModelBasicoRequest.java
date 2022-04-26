package com.example.demo_proc.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ModelBasicoRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotBlank
	@NotNull
	private String Divida;
	
	@NotBlank
	@NotNull
	private String Garantia;
	
	@NotBlank
	@NotNull
	private String Historia;
	
	@NotBlank
	@NotNull
	private String Renda;
	
	
	//private List<String> teste;
}
