package br.com.analiseinfo.ckeckskills.util;
import org.hibernate.Session;
import org.junit.Test;


public class HibernateUtilTest {
	
	@Test
	public void conectar(){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.close();
		HibernateUtil.getSessionFactory().close();
		//mais um codigo de teste
	}
}