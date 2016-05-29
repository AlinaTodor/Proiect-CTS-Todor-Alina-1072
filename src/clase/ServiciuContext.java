package clase;

public class ServiciuContext {
	private Serviciu serviciu;

	public ServiciuContext(Serviciu serviciu) {
		super();
		this.serviciu = serviciu;
	}

	public void executeServiciu() {
		serviciu.serviciu();
	}

	public Serviciu getServiciu() {
		return serviciu;
	}

	public void setServiciu(Serviciu serviciu) {
		this.serviciu = serviciu;
	}
	
	
}
