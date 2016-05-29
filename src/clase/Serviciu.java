package clase;

public abstract class Serviciu {
	
	public static enum serviciu {Consultanta, Implementare, Dezvoltare, Suport};
	
	protected float pret;

	public float suport() {
		return pret;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}
	
	public float getPret() {
		return pret;
	}

	public abstract void serviciu();
}
