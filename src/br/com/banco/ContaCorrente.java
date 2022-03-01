package br.com.banco;

public class ContaCorrente {
	
	protected String numero;
	protected int agencia;	
	
	
	public ContaCorrente() {
		super();
	}
	
	public ContaCorrente(String numero, int agencia) {
		super();
		this.numero = numero;
		this.agencia = agencia;
	}


	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	
	

}
