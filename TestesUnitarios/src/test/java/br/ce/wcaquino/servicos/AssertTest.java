package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;

public class AssertTest {
	
	@Test
	public void test() {
		//Comparativos Booleanos para Teste
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		//Comparativo de igualdade e comparativo de valores double ou float, devemos usar um auxiliar para até qual casa decimal comparar.
		Assert.assertEquals(1, 1);
		//podemos por uma String para apontar o erro
		Assert.assertEquals("Erro de comparação", 1, 1);
		Assert.assertEquals(0.51, 0.51, 0.01);
		Assert.assertEquals(Math.PI, 3.14, 0.01);
		
		//Comparativo de tipos primitivos e não primitivos.
		int i = 5;
		Integer i2 = 5;
		Assert.assertEquals(Integer.valueOf(i), i2);
		Assert.assertEquals(i, i2.intValue());
		
		
		//Comparativo de Strings
		Assert.assertEquals("bola", "bola");
		//Lembrando que quase todas as operações possuem seus negativos, true tem o false, equals tem o NotEquals e etc.
		Assert.assertNotEquals("bola", "casa");
		Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
		Assert.assertTrue("bola".startsWith("bo"));
		
		//Comparativo de Objetos
		Usuario u1 = new Usuario("Gabriel");
		Usuario u2 = new Usuario("Gabriel");
		Usuario u3 = null;
		
		//Para funcionar nessa parte do teste faz-se necessario importar os metodos hashCode e Equals para o objeto que queremos comparar.
		Assert.assertEquals(u1, u2);
		
		//Comparar objetos da mesma instancia
		Assert.assertSame(u2, u2);
		//O NotSame compara objetos iguais porém de instancias diferentes
		Assert.assertNotSame(u1, u2);
		
		//Verificar se objeto é nulo.
		Assert.assertTrue(u3 == null);
		//OU
		Assert.assertNull(u3);
		//O Null possui o NotNull para verificar se os objetos não estão vazios.
		Assert.assertNotNull(u2);
		
		
	}

}
