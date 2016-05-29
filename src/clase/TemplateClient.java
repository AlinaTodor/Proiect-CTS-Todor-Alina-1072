package clase;

import java.util.ArrayList;
import java.util.List;

import clase.Serviciu.serviciu;

public abstract class TemplateClient {

	protected String nume;
	protected String oras;
	protected List<AbstractObserver> observers = new ArrayList<>();
	protected Serviciu.serviciu srv;

	protected abstract void cereServiciu();

	protected abstract void acceptaServicu();

	protected abstract void achitaServiciu();

	public void procesareClient() {
		cereServiciu();
		acceptaServicu();
		achitaServiciu();
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getOras() {
		return oras;
	}

	public void setOras(String oras) {
		this.oras = oras;
	}

	public TemplateClient(String nume, String oras) {
		super();
		this.nume = nume;
		this.oras = oras;
	}
	
	

	public TemplateClient(String nume, String oras, serviciu srv) {
		super();
		this.nume = nume;
		this.oras = oras;
		this.srv = srv;
	}

	public Serviciu.serviciu getSrv() {
		return srv;
	}

	public void setSrv(Serviciu.serviciu srv) {
		this.srv = srv;
	}

	public TemplateClient() {

	}

	

	@Override
	public String toString() {
		return "TemplateClient [nume=" + nume + ", oras=" + oras + ", srv=" + srv.toString() + "]";
	}

	public void addObserver(AbstractObserver obs) {
		this.observers.add(obs);
	}

	public void notifyAllObservers(int cod) {
		for (AbstractObserver observer : observers) {
			observer.update(srv, cod);
		}
	}
}
