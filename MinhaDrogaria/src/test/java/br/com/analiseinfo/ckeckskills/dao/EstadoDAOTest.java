package br.com.analiseinfo.ckeckskills.dao;

import java.util.List;

import org.junit.Test;

import br.com.minhadrogaria.dao.EstadoDAO;
import br.com.minhadrogaria.domain.Estado;

public class EstadoDAOTest {

	@Test
	public void salvar() {
		Estado estado = new Estado();
		estado.setNome("luan");
		estado.setSigla("SD");
		
		EstadoDAO dao = new EstadoDAO();
		dao.salvar(estado);
		dao.commit();
	}
	
	
	@Test
	public void Listar(){
		EstadoDAO dao = new EstadoDAO();
		List<Estado> listar = (List<Estado>) dao.getBeans();
		for (Estado item : listar) {
			System.out.println(" " + item.getNome());
		}
	}
	
}
