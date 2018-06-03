package modelo;

public abstract class ValoresContas {
	private int codigo;
	private double saldo;
	private String abertura;
	
	public ValoresContas(int codigo, double saldo, String abertura) {
		this.setCodigo(codigo);
		this.setSaldo(saldo);
		this.setAbertura(abertura);
	}
	
	abstract public void creditarConta(double valor);
	abstract public void debitarConta(double valor);
	abstract public void transferirConta(double valor, int numCodigo);
	abstract public void consultarHistorico();

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
