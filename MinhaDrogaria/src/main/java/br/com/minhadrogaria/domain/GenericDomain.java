package br.com.minhadrogaria.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@SuppressWarnings("serial")
@MappedSuperclass
public class GenericDomain implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}

	
	
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

}
