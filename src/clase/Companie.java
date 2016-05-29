package clase;

import clase.Companie;

public class Companie {

	private String denumire;
	private String oras;
	private int numarAngajati;
	private GeneralManager generalManager;

	private static Companie instanta;

	private Companie() {
		super();
		this.denumire = "Serra Software";
		this.oras = "Bucuresti";
		this.numarAngajati = 9;
	}

	private static Companie getInstanta(CompanieBuilder builder) {
		if (instanta == null) {
			instanta = new Companie();
			instanta.denumire = builder.denumire;
			instanta.oras = builder.oras;
			instanta.numarAngajati = builder.numarAngajati;
			instanta.generalManager = builder.generalManager;
		}
		return instanta;
	}

	@Override
	public String toString() {
		return "Companie [denumire=" + denumire + ", oras=" + oras
				+ ", numarAngajati=" + numarAngajati + "]";
	}
	
	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	
	
	public int getNumarAngajati() {
		return numarAngajati;
	}

	public void setNumarAngajati(int numarAngajati) {
		this.numarAngajati = numarAngajati;
	}

	public String getOras() {
		return oras;
	}

	public GeneralManager getGeneralManager() {
		return generalManager;
	}





	public static class CompanieBuilder {
		private String denumire;
		private String oras;
		private int numarAngajati;
		private GeneralManager generalManager;

		public CompanieBuilder(String denumire) {
			this.denumire = denumire;
		}

		public CompanieBuilder Oras(String oras) {
			this.oras = oras;
			return this;
		}

		public CompanieBuilder NumarAngajati(int numarAngajati) {
			this.numarAngajati = numarAngajati;
			return this;
		}

		public CompanieBuilder GeneralManager(GeneralManager generalManager) {
			this.generalManager = generalManager;
			return this;
		}

		public Companie build() {
			return Companie.getInstanta(this);
		}
	}

}
