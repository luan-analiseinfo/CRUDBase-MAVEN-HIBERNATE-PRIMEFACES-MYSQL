package br.com.analiseinfo.ckeckskills.dao;

import org.junit.Test;

import br.com.minhadrogaria.dao.EstadoDAO;
import br.com.minhadrogaria.domain.Estado;

public class EstadoDAOTest {

	@Test
	public void salvar() {
		// TODO Auto-generated method stub
		Estado estado = new Estado();
		estado.setNome("luan");
		estado.setSigla("SD");
		
		EstadoDAO dao = new EstadoDAO();
		dao.salvar(estado);
		dao.commit();
	}
}
