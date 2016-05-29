package clase;

import javax.activation.MailcapCommandMap;

import clase.Serviciu.serviciu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Administrator administrator=new Administrator("Maria");
		Consultant consultant1=new Consultant("Laura");
		Consultant consultant2=new Consultant("Paula");
		Consultant consultant3=new Consultant("Elena");
		GeneralManager generalManager=new GeneralManager("Calin");
		DirectorDepartamentAdapter director=new DirectorDepartamentAdapter("Andreea");
		
		generalManager.adauga(administrator);
		generalManager.adauga(director);
		
		director.adauga(consultant1);
		director.adauga(consultant2);
		director.adauga(consultant3);
		
		Companie companie= new Companie.CompanieBuilder("Serra Software").Oras("Bucuresti").NumarAngajati(9).GeneralManager(generalManager).build();
		System.out.println(companie.toString());
		
		IMM MGT=new IMM("MGT", "Bucuresti", serviciu.Consultanta);
		MGT.addObserver(new SMSObserver(MGT));
		IMM ASK4IT=new IMM("ASK4IT", "Brasov", serviciu.Dezvoltare);
		ASK4IT.addObserver(new MailObserver(ASK4IT));
		Multinationala Oscar=new Multinationala("Oscar", "Bucuresti", serviciu.Implementare);
		Oscar.addObserver(new SMSObserver(Oscar));
		Multinationala DSC=new Multinationala("DSC", "Bucuresti", serviciu.Suport);
		DSC.addObserver(new MailObserver(DSC));
		
		Factory serviciuFactory=new Factory();
		Consultanta consultanta=(Consultanta) serviciuFactory.getServiciu(serviciu.Consultanta, 1000, MGT, 12);
		Dezvoltare dezvoltare= (Dezvoltare) serviciuFactory.getServiciu(serviciu.Dezvoltare, 2000, ASK4IT, 6);
		Implementare implementare=(Implementare) serviciuFactory.getServiciu(serviciu.Implementare, 3000, Oscar, 8);
		Suport suport=(Suport) serviciuFactory.getServiciu(serviciu.Suport, 1500, DSC, 24);
		
		ServiciuContext serviciuStrategy=new ServiciuContext(consultanta);
		serviciuStrategy.executeServiciu();
		serviciuStrategy.setServiciu(dezvoltare);
		serviciuStrategy.executeServiciu();
		serviciuStrategy.setServiciu(implementare);
		serviciuStrategy.executeServiciu();
		serviciuStrategy.setServiciu(suport);
		serviciuStrategy.executeServiciu();
		
		
	}

}
