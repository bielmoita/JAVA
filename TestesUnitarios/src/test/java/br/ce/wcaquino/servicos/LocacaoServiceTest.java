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
	
	//Existe a opção de error Collector, uma biblioteca do jUnit com algumas regras para execução de baterias de testes.
	
	
	private LocacaoService service;
	//para o service funcionar deve ser uma instancia global, para ser visivel para todos os métodos e instancias.
	
	
	//Criando um contzdor de testes.
	//Definição do contador.
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
		
		//impressão do contador.
		System.out.println("Contador: "+contador);
	}
	
	@After
	public void tearDown() {
		System.out.println("@After - TearDown");
	}
	
	//Inserindo BeforeClass e AfterClass
	//BeforeClass antes da classe e instancia e AfterClass após destruir a classe e instancia
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
		//Ação2 - Criando Throws na classe.
		Locacao locacao= service.alugarFilme(usuario, filme);
		
		//Verificação 2 - Com o Throws posso executar a verificação e diferenciar falha e de erro
		//Falhas ocorrem quando testes executados sem problemas, porém encontram condições não atentidas no meu código representado na forma de assertivas.
		//Erros: acontece algum problema durante a execução do teste impede que o mesmo seja concluido.
		//Quando ocorre exceções que não são tratadas.
		error.checkThat(locacao.getValor(), CoreMatchers.is(CoreMatchers.not(6.0)));
		error.checkThat(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()), CoreMatchers.is(true));
		error.checkThat(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)), CoreMatchers.is(true));
				
		
		
		//ação
		//Posso usar try e cath para tratar erros e exceções, porém posso por um Throw no TEST e o próprio jUNIT gerencia a exceção
		//Vou comentar abaixo e refazer.
		//Locacao locacao;
		//try {
			//locacao = service.alugarFilme(usuario, filme);
			
			//error.checkThat(locacao.getValor(), CoreMatchers.is(CoreMatchers.not(6.0)));
			//error.checkThat(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()), CoreMatchers.is(true));
			//error.checkThat(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)), CoreMatchers.is(true));
			
		//} catch (Exception e) {
			
			//e.printStackTrace();
			//Lanço uma tratativa de exceção no teste e posso por uma mensagem.
			//Assert.fail("Não deveria lançar exceção");
		}
		
		//verificação
		//Assert.assertEquals(5.0, locacao.getValor(), 0.01);
		//Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		//Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
		
		
		//verificação do AssertThat
		//Assert.assertThat(locacao.getValor(), CoreMatchers.is(CoreMatchers.equalTo(5.0)));
		
		//Com negação - Utiliza argumentos Booleanos
		//Assert.assertThat(locacao.getValor(), CoreMatchers.is(CoreMatchers.not(6.0)));
		//Assert.assertThat(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()), CoreMatchers.is(true));
		//Assert.assertThat(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)), CoreMatchers.is(true));
		
		
		//Verificação com ErrorCollector() - Muito semelhante ao AssertThat
		//Para validar o como funciona o ErrorCollector coloquei erro na primeira opção e na terceira
		//Observe que ele percorre todo o teste e aponta onde estão os erros, diferente do primeiro modelo que para o teste no primeiro erro.
		//Troquei para is(6.0) e no terceiro: para false
		//error.checkThat(locacao.getValor(), CoreMatchers.is(CoreMatchers.not(6.0)));
		//error.checkThat(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()), CoreMatchers.is(true));
		//error.checkThat(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)), CoreMatchers.is(true));
		
	
	
	//---------------------
	//Existem 3 formas de apresentar um teste:
	
	//Forma 1 - Elegante:
	//Nessa forma é melhor criar um pacote com classes de Exceções.
	//Criei um pacote Exceptions extendendo da classe Exception do Java
	//A forma elegante funciona bem apenas quando a exceção importa para você
	//Quando vodce consegue garantir o motivo pelo qual a exceção foi lançada.
	//Mas se precisar de mensagens do Exception vai precisar da forma robusta ou forma Nova	
	@Test(expected = FilmeSemEstoqueException.class)
	public void testLocacao_filmeSemEstoque() throws Exception {
		//cenario
		//A Linha LocacaoService service se repete em todos os testes - Devemos levar para o BEFORE
		//LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Gabriel 1");
		Filme filme = new Filme("Kill Bill", 0, 5.0);
		
		
		//Ação
		service.alugarFilme(usuario, filme);
	}
	
	//Forma 2 - Robusta
	//@Test
	//public void testLocacao_filmeSemEstoque_2() {
		//cenario
		//LocacaoService service = new LocacaoService();
		//Usuario usuario = new Usuario("Gabriel 1");
		//Filme filme = new Filme("Kill Bill", 2, 5.0);
				
		//Ação
		//try {
			//service.alugarFilme(usuario, filme);
			//Assert.fail("Deveria ter lançado uma exceção!");
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
		
		//Deve ser declarado antes da ação - Como se fizesse parte do Cenario de teste.
		//exception.expect(Exception.class);
		//exception.expectMessage("Filme sem estoque!");
		
		//Ação
		//service.alugarFilme(usuario, filme);

		
	//}
	
	//CHECAGEM DO USUARIO
	@Test
	public void testLocacao_usuarioVazio() throws FilmeSemEstoqueException {
		
		//Para verificação vamos usar a forma 2 - Robusta
		
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
	
	//Outro teste é o de validação do Filme
	//Vamos usar a 3ª forma de teste - Nova forma
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


