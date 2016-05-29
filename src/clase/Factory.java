package clase;

public class Factory {

	public Serviciu getServiciu(Serviciu.serviciu srv, float pret, TemplateClient client, float durata){
		switch(srv){
		case Consultanta:{
			Consultanta c1=new Consultanta();
			c1.setPret(pret);
			c1.setDurata(durata);
			c1.setClient(client);
			return c1;
		}
		case Implementare:{
			Implementare i1=new Implementare();
			i1.setPret(pret);
			i1.setDurata(durata);
			i1.setClient(client);
			return i1;
		}
		case Dezvoltare:{
			Dezvoltare d1=new Dezvoltare();
			d1.setPret(pret);
			d1.setDurata(durata);
			d1.setClient(client);
			return d1;
		}
		case Suport:{
			Suport s1=new Suport();
			s1.setPret(pret);
			s1.setDurata(durata);
			s1.setClient(client);
			return s1;
		}
		default: return null;
		}
	}
	
}
