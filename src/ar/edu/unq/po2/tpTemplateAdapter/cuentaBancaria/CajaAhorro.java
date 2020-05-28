package ar.edu.unq.po2.tpTemplateAdapter.cuentaBancaria;

public class CajaAhorro extends CuentaBancaria {

	private int limite;
		
	public CajaAhorro(String titular, int limite){
		super(titular);
		this.limite=limite;
	}
	
	public int getLimite(){
		return this.limite;
	}
	
	@Override
	public boolean puedoExtraer(int monto) {
		return (this.getSaldo()>=monto && this.getLimite()>=monto);
	}
}
