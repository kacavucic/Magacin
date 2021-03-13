package artikal;

import java.util.Objects;

public class Artikal {
	
	private String naziv;
	private int sifra;
	private String opis;
	private int kolicina;
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public int getSifra() {
		return sifra;
	}
	
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	
	public String getOpis() {
		return opis;
	}
	
	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	public int getKolicina() {
		return kolicina;
	}
	
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina=" + kolicina + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(sifra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Artikal)) {
			return false;
		}
		Artikal other = (Artikal) obj;
		return sifra == other.sifra;
	}
	
	
}
