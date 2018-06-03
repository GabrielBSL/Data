package modelo;

import java.util.ArrayList;
import java.util.Calendar;

class CCorrente extends ValoresContas{
	
	private int codigo;
	private double saldo;
	private String abertura;
	private double valorManuten;
	
	private Calendar cal;
	
	private ArrayList<Historico> historico;
	
	public CCorrente(int codigo, double saldo, String abertura, double valorManuten) {
		super(codigo, saldo, abertura);
		this.setValorManuten(valorManuten);
	}
	
	public void creditarConta(double valor) {
		this.setSaldo(this.getSaldo() + valor);
		cal = Calendar.getInstance();
		historico.add(new Historico(cal.get(cal.DATE), cal.get(cal.MONTH), cal.get(cal.YEAR), valor, 0));
	}
	
	public void debitarConta(double valor){
		this.setSaldo(this.getSaldo() - valor);
		cal = Calendar.getInstance();
		historico.add(new Historico(cal.get(cal.DATE), cal.get(cal.MONTH), cal.get(cal.YEAR), valor, 1));
	}
	
	public void transferirConta(double valor, int numCodigo){
		this.setSaldo(this.getSaldo() - valor);
		cal = Calendar.getInstance();
		historico.add(new Historico(cal.get(cal.DATE), cal.get(cal.MONTH), cal.get(cal.YEAR), numCodigo, valor, 2));
	}
	
	public void descontoManutencao() {
		this.setSaldo(this.getSaldo() - this.getValorManuten());
		cal = Calendar.getInstance();
		historico.add(new Historico(cal.get(cal.DATE), cal.get(cal.MONTH), cal.get(cal.YEAR), this.getValorManuten(), 3));
	}
	
	public void consultarHistorico(){
		for (int i = 0; i < historico.size(); i++) {
			historico.get(i).mostrarHistorico();
		}
		System.out.println();
	}
	
	public double getValorManuten() {
		return valorManuten;
	}

	public void setValorManuten(double valorManuten) {
		this.valorManuten = valorManuten;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getAbertura() {
		return abertura;
	}

	public void setAbertura(String abertura) {
		this.abertura = abertura;
	}
}
