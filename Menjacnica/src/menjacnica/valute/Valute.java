package menjacnica.valute;

import java.util.GregorianCalendar;

public class Valute {
	private String punNaziv;
	private String skracenica;
	private GregorianCalendar datumKursa;
	private double gornjiKurs;
	private double srednjiKurs;
	private double donjiKurs;

	public String getPunNaziv() {
		return punNaziv;
	}

	public void setPunNaziv(String punNaziv) {
		if (punNaziv == null)
			throw new RuntimeException("Pun naziv nije dobro unet");
		this.punNaziv = punNaziv;
	}

	public String getSkracenica() {
		return skracenica;
	}

	public void setSkracenica(String skracenica) {
		if (skracenica == null)
			throw new RuntimeException("Skracenica nije dobro uneta");
		this.skracenica = skracenica;
	}

	public GregorianCalendar getDatumKursa() {
		return datumKursa;
	}

	public void setDatumKursa(GregorianCalendar datumKursa) {
		if (datumKursa == null)
			throw new RuntimeException("Datum nije dobro unet");
		this.datumKursa = datumKursa;
	}

	public double getGornjiKurs() {
		return gornjiKurs;
	}

	public void setGornjiKurs(double gornjiKurs) {
		if (gornjiKurs == 0)
			throw new RuntimeException("Gornji kurs nije dobro unet");
		this.gornjiKurs = gornjiKurs;
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(double srednjiKurs) {
		if (srednjiKurs == 0)
			throw new RuntimeException("Srednji kurs nije dobro unet");
		this.srednjiKurs = srednjiKurs;
	}

	public double getDonjiKurs() {
		return donjiKurs;
	}

	public void setDonjiKurs(double donjiKurs) {
		if (donjiKurs == 0)
			throw new RuntimeException("Donji kurs nije dobro unet");
		this.donjiKurs = donjiKurs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datumKursa == null) ? 0 : datumKursa.hashCode());
		long temp;
		temp = Double.doubleToLongBits(donjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(gornjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((punNaziv == null) ? 0 : punNaziv.hashCode());
		result = prime * result + ((skracenica == null) ? 0 : skracenica.hashCode());
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Valute) {
			Valute pom = (Valute) obj;
			if (pom.getDatumKursa() != this.datumKursa || pom.donjiKurs != this.donjiKurs
					|| pom.gornjiKurs != this.gornjiKurs || pom.srednjiKurs != this.srednjiKurs
					|| !pom.punNaziv.equals(this.punNaziv) || !pom.skracenica.equals(this.skracenica)) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Pun naziv valute: " + punNaziv + ",\nSkracen naziv: " + skracenica + ",\nDatum kursa="
				+ datumKursa.getTime() + ",\nGornji kurs=" + gornjiKurs + ",\nSrednjiKurs=" + srednjiKurs
				+ ",\nDonji kurs=" + donjiKurs;
	}

}
