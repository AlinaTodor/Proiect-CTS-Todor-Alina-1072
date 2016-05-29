package clase;

import clase.Serviciu.serviciu;

public class Multinationala extends TemplateClient{

	@Override
	protected void cereServiciu() {
		System.out.println("Multinationala "+this.toString()+" solicita un nou serviciu "+srv.toString());
		this.notifyAllObservers(1);
	}

	@Override
	protected void acceptaServicu() {
		System.out.println("Multinationala "+this.toString()+" a acceptat serviciul "+srv.toString());
		this.notifyAllObservers(2);
	}

	@Override
	protected void achitaServiciu() {
		System.out.println("Multinationala "+this.toString()+" a achitat serviciul "+srv.toString());
		this.notifyAllObservers(3);
	}
	
	public Multinationala(String nume, String oras, Serviciu.serviciu srv)
	{
		super(nume, oras, srv);
	}
}
