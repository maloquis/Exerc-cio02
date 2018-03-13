package test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import model.Pais;

public class PaisTest {
	Pais pais, copia;
	int id = 0;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		pais = new Pais(id, "Brasil", (long)181000.000, 4500000.00 );
		copia = new Pais(id, "EUA", (long)181000.000, 4500000.00 );
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(id);
	}

	@Test
	public void test01Criar() {
		System.out.println("criar");
		pais.criar();
		id = pais.getId();
		System.out.println(id);
		copia.setId(id);
		assertEquals("testa criacao", pais, copia);
	}

	@Test
	public void test02Atualizar() {
		System.out.println("atualizar");
		pais.setPopulacao(1234512000);
		copia.setPopulacao(1234512000);		
		pais.atualizar();
		pais.carregar();
		assertEquals("testa atualizacao", pais, copia);
	}

	@Test
	public void test03Excluir() {
		System.out.println("excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setPopulacao(0);
		copia.setArea(0);
		pais.excluir();
		pais.carregar();
		assertEquals("testa exclusao", pais, copia);
	}
	@Test
	public void test00Carregar() {
		System.out.println("carregar");
		//para funcionar o cliente 1 deve ter sido carregado no banco por fora
		Pais fixture = new Pais(1, "Japão", 8968658, 528586585);
		Pais novo = new Pais(1, null, -1, -1);
		novo.carregar();
		assertEquals("testa inclusao", novo, fixture);
	}
	@Test
	public void test04MaiorPopulacao() {
		System.out.println("maiorpopulacao");
		pais.maiorPopulacao();
	}
	@Test
	public void test05vetorTresPaises() {
		System.out.println("vetorTresPaises");
		pais.vetorTresPaises();
	}
	@Test
	public void test06menorArea() {
		System.out.println("menorArea");
		pais.menorPopulacao();
	}
	



}
