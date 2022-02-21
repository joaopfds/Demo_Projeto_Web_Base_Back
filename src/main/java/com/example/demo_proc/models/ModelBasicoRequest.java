package com.example.demo_proc.models;

import java.io.Serializable;

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
	private Integer linha;
	
	@NotBlank
	@NotNull
	private Integer coluna;
	
	@NotBlank
	@NotNull
	private Boolean umBool;
}
