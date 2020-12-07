package br.ce.wcaquino.servicos;

import java.util.Date;

import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.exceptions.FilmeSemEstoqueException;
import br.ce.wcaquino.exceptions.LocadoraException;
import br.ce.wcaquino.utils.DataUtils;

public class LocacaoServiceTest {
	
	//Existe a op��o de error Collector, uma biblioteca do jUnit com algumas regras para execu��o de baterias de testes.
	
	
	private LocacaoService service;
	//para o service funcionar deve ser uma instancia global, para ser visivel para todos os m�todos e instancias.
	
	
	//Criando um contzdor de testes.
	//Defini��o do contador.
	private static int contador = 0;
	
	@Rule
	public ErrorCollector error = new ErrorCollector();
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	
	//inserindo o Before e After
	
	@Before
	public void setup() {
		System.out.println("@Before - Setup");
		service = new LocacaoService();
		
		//incremento do contador.
		contador++;		
		
		//impress�o do contador.
		System.out.println("Contador: "+contador);
	}
	
	@After
	public void tearDown() {
		System.out.println("@After - TearDown");
	}
	
	//Inserindo BeforeClass e AfterClass
	//BeforeClass antes da classe e instancia e AfterClass ap�s destruir a classe e instancia
	@BeforeClass
	public static void setupClass() {
		System.out.println("@BeforeClass - SetupClass");
		
		
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("@AfterClass - TearDownClass");
	}
	
	
	@Test
	public void testeLocacao() throws Exception {
		//cenario
		//A Linha LocacaoService service se repete em todos os testes - Devemos levar para o BEFORE
		//LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Gabriel 1");
		Filme filme = new Filme("Kill Bill", 2, 5.0);
		
		System.out.println("TESTE!");
		//A��o2 - Criando Throws na classe.
		Locacao locacao= service.alugarFilme(usuario, filme);
		
		//Verifica��o 2 - Com o Throws posso executar a verifica��o e diferenciar falha e de erro
		//Falhas ocorrem quando testes executados sem problemas, por�m encontram condi��es n�o atentidas no meu c�digo representado na forma de assertivas.
		//Erros: acontece algum problema durante a execu��o do teste impede que o mesmo seja concluido.
		//Quando ocorre exce��es que n�o s�o tratadas.
		error.checkThat(locacao.getValor(), CoreMatchers.is(CoreMatchers.not(6.0)));
		error.checkThat(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()), CoreMatchers.is(true));
		error.checkThat(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)), CoreMatchers.is(true));
				
		
		
		//a��o
		//Posso usar try e cath para tratar erros e exce��es, por�m posso por um Throw no TEST e o pr�prio jUNIT gerencia a exce��o
		//Vou comentar abaixo e refazer.
		//Locacao locacao;
		//try {
			//locacao = service.alugarFilme(usuario, filme);
			
			//error.checkThat(locacao.getValor(), CoreMatchers.is(CoreMatchers.not(6.0)));
			//error.checkThat(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()), CoreMatchers.is(true));
			//error.checkThat(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)), CoreMatchers.is(true));
			
		//} catch (Exception e) {
			
			//e.printStackTrace();
			//Lan�o uma tratativa de exce��o no teste e posso por uma mensagem.
			//Assert.fail("N�o deveria lan�ar exce��o");
		}
		
		//verifica��o
		//Assert.assertEquals(5.0, locacao.getValor(), 0.01);
		//Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		//Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
		
		
		//verifica��o do AssertThat
		//Assert.assertThat(locacao.getValor(), CoreMatchers.is(CoreMatchers.equalTo(5.0)));
		
		//Com nega��o - Utiliza argumentos Booleanos
		//Assert.assertThat(locacao.getValor(), CoreMatchers.is(CoreMatchers.not(6.0)));
		//Assert.assertThat(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()), CoreMatchers.is(true));
		//Assert.assertThat(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)), CoreMatchers.is(true));
		
		
		//Verifica��o com ErrorCollector() - Muito semelhante ao AssertThat
		//Para validar o como funciona o ErrorCollector coloquei erro na primeira op��o e na terceira
		//Observe que ele percorre todo o teste e aponta onde est�o os erros, diferente do primeiro modelo que para o teste no primeiro erro.
		//Troquei para is(6.0) e no terceiro: para false
		//error.checkThat(locacao.getValor(), CoreMatchers.is(CoreMatchers.not(6.0)));
		//error.checkThat(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()), CoreMatchers.is(true));
		//error.checkThat(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)), CoreMatchers.is(true));
		
	
	
	//---------------------
	//Existem 3 formas de apresentar um teste:
	
	//Forma 1 - Elegante:
	//Nessa forma � melhor criar um pacote com classes de Exce��es.
	//Criei um pacote Exceptions extendendo da classe Exception do Java
	//A forma elegante funciona bem apenas quando a exce��o importa para voc�
	//Quando vodce consegue garantir o motivo pelo qual a exce��o foi lan�ada.
	//Mas se precisar de mensagens do Exception vai precisar da forma robusta ou forma Nova	
	@Test(expected = FilmeSemEstoqueException.class)
	public void testLocacao_filmeSemEstoque() throws Exception {
		//cenario
		//A Linha LocacaoService service se repete em todos os testes - Devemos levar para o BEFORE
		//LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Gabriel 1");
		Filme filme = new Filme("Kill Bill", 0, 5.0);
		
		
		//A��o
		service.alugarFilme(usuario, filme);
	}
	
	//Forma 2 - Robusta
	//@Test
	//public void testLocacao_filmeSemEstoque_2() {
		//cenario
		//LocacaoService service = new LocacaoService();
		//Usuario usuario = new Usuario("Gabriel 1");
		//Filme filme = new Filme("Kill Bill", 2, 5.0);
				
		//A��o
		//try {
			//service.alugarFilme(usuario, filme);
			//Assert.fail("Deveria ter lan�ado uma exce��o!");
		//} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//Assert.assertThat(e.getMessage(), CoreMatchers.is("Filme sem estoque!"));
		//}
	//}
	
	//Forma 3 - Forma atual ou mais recente
	//Depende de uma nova Rule - ExpectedException
	//@Test
	//public void testLocacao_filmeSemEstoque_3() throws Exception {
		//cenario
		//LocacaoService service = new LocacaoService();
		//Usuario usuario = new Usuario("Gabriel 1");
		//Filme filme = new Filme("Kill Bill", 0, 5.0);
		
		//Deve ser declarado antes da a��o - Como se fizesse parte do Cenario de teste.
		//exception.expect(Exception.class);
		//exception.expectMessage("Filme sem estoque!");
		
		//A��o
		//service.alugarFilme(usuario, filme);

		
	//}
	
	//CHECAGEM DO USUARIO
	@Test
	public void testLocacao_usuarioVazio() throws FilmeSemEstoqueException {
		
		//Para verifica��o vamos usar a forma 2 - Robusta
		
		//cenario
		//A Linha LocacaoService service se repete em todos os testes - Devemos levar para o BEFORE
		//LocacaoService service = new LocacaoService();
		Filme filme = new Filme("O Patriota", 1, 4.0); //Precisei colocar no estoque um filme para teste
		//Usuario usuario = new Usuario("Gabriel 2");
		
		//acao
		try {
			service.alugarFilme(null, filme);
			Assert.fail();
		} catch (LocadoraException e) {
			Assert.assertThat(e.getMessage(), CoreMatchers.is("Usuario vazio"));
			
		}
		
		System.out.println("FORMA ROBUSTA");
		
		
	}
	
	//Outro teste � o de valida��o do Filme
	//Vamos usar a 3� forma de teste - Nova forma
	@Test
	public void testLocacao_FilmeVazio() throws FilmeSemEstoqueException, LocadoraException {
		
		//cenario
		//A Linha LocacaoService service se repete em todos os testes - Devemos levar para o BEFORE
		//LocacaoService service = new LocacaoService();
	
		Usuario usuario = new Usuario("Gabriel 1");
		
		exception.expect(LocadoraException.class);
		exception.expectMessage("Filme vazio");
		
		//acao
		service.alugarFilme(usuario, null);
		
		
		System.out.println("FORMA NOVA");
		
	}
	
	
	
	
}


