package modelo;

interface OperacoesContas {
	
	public void criarCorrente(int codigo, double saldo, double valorManuten);
	public void criarPoupanca(int codigo, double saldo, String dataCorrente, double jurosPerc);
	public void fecharCorrente();
	public void fecharPoupanca();

}
