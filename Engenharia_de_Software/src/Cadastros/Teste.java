package Cadastros;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		
		Oficina oficina = new Oficina();
		assertEquals(oficina.getMaquina().size(), 0);
		
		oficina.cadastrarmaquina(new Maquina("2525-55", new Especificacao("ROMI", "555", "00055-2", "Ferramentaria")));
		oficina.cadastrarmaquina(new Maquina("2525-22", new Especificacao("ROMIM", "55566", "02255-2", "USINAGEM")));
		
		assertEquals(oficina.getMaquina().size(), 2);
		
		Maquina maquinaEncontrada = oficina.buscarMaquinaPorNumeroDeCadastro("2525-55");
		
		assertEquals(maquinaEncontrada.getEspec().getModelo(), "555");
		
		List<Maquina> maquinasEncontradas = oficina.buscarMaquinaPorEspecificacao(new Especificacao("ROMIM", "55566", "02255-2", "USINAGEM"));
		
		assertEquals(maquinasEncontradas.get(0).getEspec().getModelo(), "55566");
	}

}
