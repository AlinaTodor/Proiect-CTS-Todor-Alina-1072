package clase;

public abstract class AbstractObserver {

	protected TemplateClient client;

	public abstract void update(Serviciu.serviciu srv, int cod);

	public TemplateClient getClient() {
		return client;
	}

	public void setClient(TemplateClient client) {
		this.client = client;
	}

}
