package clase;

public abstract class Atribut extends Serviciu{

	protected TemplateClient client;
	protected float durata;
	
	public TemplateClient getClient() {
		return client;
	}
	public void setClient(TemplateClient client) {
		this.client = client;
	}
	public float getDurata() {
		return durata;
	}
	public void setDurata(float durata) {
		this.durata = durata;
	}
	
	
	
}
