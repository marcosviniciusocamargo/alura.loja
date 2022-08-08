package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		
		Desconto cadeiaDeDescontos = new MaisDeCincoItens(
				new ValorMaiorQueQuinhentos(
						new SemDesconto()));
		
		return cadeiaDeDescontos.calcular(orcamento);
	}

}
