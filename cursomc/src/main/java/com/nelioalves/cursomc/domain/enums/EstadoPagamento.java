package com.nelioalves.cursomc.domain.enums;

public enum EstadoPagamento {

	CANCELADO (1, "Cancelado"),
	PENDENTE  (2, "Pendente"),
	QUITADO   (3, "Quitado");

	private Integer cod;
	private String descricao;

	private EstadoPagamento(Integer cod, String descricao) {

		this.cod = cod;
		this.descricao = descricao;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static EstadoPagamento toEnum(Integer id) {

		if (id == null) {
			return null;
		}

		for (EstadoPagamento x : EstadoPagamento.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
