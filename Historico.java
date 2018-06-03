package modelo;

class Historico {
	private int dia, mes, ano, transferencia, tipo;
	private double valor;

	public Historico (int dia, int mes, int ano, int transferencia, double valor, int tipo){
		this.setAno(ano);
		this.setDia(dia);
		this.setMes(mes);
		this.setTransferencia(transferencia);
		this.setValor(valor);
		this.setTipo(tipo);
	}
	
	public Historico (int dia, int mes, int ano, double valor, int tipo){
		this.setAno(ano);
		this.setDia(dia);
		this.setMes(mes);
		this.setValor(valor);
		this.setTipo(tipo);
	}

	public void mostrarHistorico() {
		if (this.getTipo() == 0) {
			System.out.println("Valor R$" + this.getValor() + " creditado no dia: " + this.getDia() + "/" + this.getMes() + "/" + this.getAno());
		}
		
		else if (this.getTipo() == 1) {
			System.out.println("Valor R$" + this.getValor() + " debitado no dia: " + this.getDia() + "/" + this.getMes() + "/" + this.getAno());
		}
		
		else if (this.getTipo() == 2) {
			System.out.println("Valor R$" + this.getValor() + " transferido para a conta " + this.getTransferencia() + " no dia: " + this.getDia() + "/" + this.getMes() + "/" + this.getAno());
		}
		
		else if (this.getTipo() == 3) {
			System.out.println("Valor R$" + this.getValor() + " Utilizado na manutenção da conta corrente no dia: " + this.getDia() + "/" + this.getMes() + "/" + this.getAno());
		}
		
		else if (this.getTipo() == 4) {
			System.out.println("Valor R$" + this.getValor() + " Rendeu em sua conta poupança no dia: " + this.getDia() + "/" + this.getMes() + "/" + this.getAno());
		}
	}
	
 	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getTransferencia() {
		return transferencia;
	}

	public void setTransferencia(int transferencia) {
		this.transferencia = transferencia;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
	public int getTipo() {
		return tipo;
	}

	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}
