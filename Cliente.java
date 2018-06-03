package modelo;

import java.util.Calendar;

public class Cliente {
	
	private String cpf, endereço, nome, telefone, nascimento;
	private Conta conta;
	
	private Calendar cal;
	
	public Cliente(String cpf, String endereço, String nome, String telefone, String nascimento) {
		this.setCpf(cpf);
		this.setEndereço(endereço);
		this.setNascimento(nascimento);
		this.setNome(nome);
		this.setTelefone(telefone);
	}
	
	public void criarConta(Agencia agencia) {
		cal = Calendar.getInstance();
		conta = new Conta(agencia, cal.get(cal.DATE) + "/" + cal.get(cal.MONTH) + "/" + cal.get(cal.YEAR));
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
}
