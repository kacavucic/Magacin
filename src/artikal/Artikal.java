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
		if (naziv == null) {
			throw new NullPointerException("Naziv ne sme biti null!");
		} else {
			this.naziv = naziv;
		}
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		if (sifra <= 0) {
			throw new IllegalArgumentException("Sifra mora biti veca od nule!");
		} else {
			this.sifra = sifra;
		}
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		if (opis == null) {
			throw new NullPointerException("Opis ne sme biti null!");
		} else {
			this.opis = opis;
		}
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		if (kolicina < 0) {
			throw new IllegalArgumentException("Kolicina ne sme biti manja od nule!");
		} else {
			this.kolicina = kolicina;
		}
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
