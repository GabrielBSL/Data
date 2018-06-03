package modelo;

import java.util.ArrayList;
import java.util.Calendar;

class CPoupanca{
	
	private int codigo;
	private double saldo;
	private String abertura;
	private String dataCorrente;
	private double jurosPerc;
	
	private Calendar cal;
	
	private ArrayList<Historico> historico;
	
	public CPoupanca(int codigo, double saldo, String abertura, String dataCorrente, double jurosPerc) {
		this.setCodigo(codigo);
		this.setSaldo(saldo);
		this.setAbertura(abertura);
		this.setDataCorrente(dataCorrente);
		this.setJurosPerc(jurosPerc);
	}

	public void creditarConta(double valor) {
		this.setSaldo(this.getSaldo() + valor);
		cal = Calendar.getInstance();
		historico.add(new Historico(cal.get(cal.DATE), cal.get(cal.MONTH), cal.get(cal.YEAR), 0, valor, 0));
	}
	
	public void debitarConta(double valor){
		this.setSaldo(this.getSaldo() - valor);
		cal = Calendar.getInstance();
		historico.add(new Historico(cal.get(cal.DATE), cal.get(cal.MONTH), cal.get(cal.YEAR), 0, valor, 1));
	}
	
	public void transferirConta(double valor, int numCodigo){
		this.setSaldo(this.getSaldo() - valor);
		historico.add(new Historico(cal.get(cal.DATE), cal.get(cal.MONTH), cal.get(cal.YEAR), numCodigo, valor, 2));
		cal = Calendar.getInstance();
	}
	
	public void calcularRendimentoMensal() {
		this.setSaldo(this.getSaldo() + this.getSaldo() * this.getJurosPerc());
		historico.add(new Historico(cal.get(cal.DATE), cal.get(cal.MONTH), cal.get(cal.YEAR), this.getSaldo() * this.getJurosPerc(), 4));
		cal = Calendar.getInstance();
	}
	
	public void consultarHistorico(){
		for (int i = 0; i < historico.size(); i++) {
			historico.get(i).mostrarHistorico();
		}
		System.out.println();
	}
	
	public String getDataCorrente() {
		return dataCorrente;
	}

	public void setDataCorrente(String dataCorrente) {
		this.dataCorrente = dataCorrente;
	}

	public double getJurosPerc() {
		return jurosPerc;
	}

	public void setJurosPerc(double jurosPerc) {
		this.jurosPerc = jurosPerc;
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
