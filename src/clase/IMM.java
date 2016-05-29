package clase;

import clase.Serviciu.serviciu;

public class IMM extends TemplateClient{

	@Override
	protected void cereServiciu() {
		System.out.println("IMM-ul "+this.toString()+" solicita un nou serviciu "+srv.toString());
		this.notifyAllObservers(1);
	}

	@Override
	protected void acceptaServicu() {
		System.out.println("IMM-ul "+this.toString()+" a acceptat serviciul "+srv.toString());
		this.notifyAllObservers(2);
	}

	@Override
	protected void achitaServiciu() {
		System.out.println("IMM-ul "+this.toString()+" a achitat serviciul "+srv.toString());
		this.notifyAllObservers(3);
	}
	
	public IMM(String nume, String oras, Serviciu.serviciu srv)
	{
		super(nume, oras, srv);
	}
}
