import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		Oficina oficina = new Oficina();
		assertEquals(oficina.getMaquina().size(), 0);
		
		oficina.cadastrarMaquina(new Maquina("2525-55", new Especificacao("ROMI", "555", "00055-2", "Ferramentaria")));
		oficina.cadastrarMaquina(new Maquina("2525-22", new Especificacao("ROMIM", "55566", "02255-2", "USINAGEM")));
		oficina.cadastrarSetor(new Setor("USINAGEM", "ADILSON"));
		
		assertEquals(oficina.getMaquina().size(), 2);
		assertEquals(oficina.getSetor().size(), 1);
		
		Maquina maquinaEncontrada = oficina.buscarMaquinaPorNumeroDeCadastro("2525-55");
		Setor setorEncontrado = oficina.buscarSetorPorNome("USINAGEM");
		
		assertEquals(maquinaEncontrada.getEspec().getModelo(), "555");
		assertEquals(setorEncontrado.getResponsavel(), "ADILSON");
		
		List<Maquina> maquinasEncontradas = oficina.buscarMaquinaPorEspecificacao(new Especificacao("ROMIM", "55566", "02255-2", "USINAGEM"));
		
		assertEquals(maquinasEncontradas.get(0).getEspec().getModelo(), "55566");
	}

}
