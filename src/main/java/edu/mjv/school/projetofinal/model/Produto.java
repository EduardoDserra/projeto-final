package edu.mjv.school.projetofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String nome;
	private String descricao;
	private String marca;
	private String categoria;
	@ManyToOne
	private Funcionario funcionario;
	@ManyToOne
	private Cliente	cliente;
	private StatusPedido statusPedido;
}
