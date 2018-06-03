package modelo;

class Conta implements OperacoesContas{
	
	private CCorrente cc;
	private CPoupanca cp;
	private Agencia agencia;
	private String abertura;
	
	public Conta(Agencia agencia, String abertura) {
		this.setAgencia(agencia);
		this.setAbertura(abertura);
	}
	
	public void criarCorrente(int codigo, double saldo, double valorManuten) {
		cc = new CCorrente(codigo, saldo, this.getAbertura(), valorManuten);
	}
	
	public void criarPoupanca(int codigo, double saldo, String dataCorrente, double jurosPerc) {
		cp = new CPoupanca(codigo, saldo, this.getAbertura(), dataCorrente, jurosPerc);
	}
	
	public void fecharCorrente() {
		cc = null;
	}
	
	public void fecharPoupanca() {
		cp = null;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public String getAbertura() {
		return abertura;
	}

	public void setAbertura(String abertura) {
		this.abertura = abertura;
	}

}
