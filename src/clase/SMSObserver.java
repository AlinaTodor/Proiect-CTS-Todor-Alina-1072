package clase;

import clase.Serviciu.serviciu;

public class SMSObserver extends AbstractObserver{

	@Override
	public void update(serviciu srv, int cod) {
		System.out.println(
				this.client.toString() + "care a solicitat serviciul "+srv.toString() + " a fost anuntat prin sms");
		switch (cod) {
		case 1: {
			System.out.println("Serviciul a fost solicitat");
			break;
		}
		case 2: {
			System.out.println("Serviciul a fost acceptat de client");
			break;
		}
		case 3: {
			System.out.println("Serviciul a fost achitat");
			break;
		}
		default:
			break;
		}
	}
	
	public SMSObserver(TemplateClient client) {
		super();
		this.client=client;
	}
}
