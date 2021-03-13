package magacin;

import java.util.LinkedList;
import java.util.Objects;

import artikal.Artikal;
import interfejs.MagacinInterface;

public class Magacin implements MagacinInterface {

	private LinkedList<Artikal> artikli;

	public LinkedList<Artikal> getArtikli() {
		return artikli;
	}

	public void setArtikli(LinkedList<Artikal> artikli) {
		if (artikli == null) {
			throw new NullPointerException("Artikli ne smeju biti null!");
		} else {
			this.artikli = artikli;
		}
	}

	@Override
	public String toString() {
		return "Magacin [artikli=" + artikli + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(artikli);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Magacin)) {
			return false;
		}
		Magacin other = (Magacin) obj;
		return Objects.equals(artikli, other.artikli);
	}

	@Override
	public void dodajArtikal(Artikal artikal, int kolicina) {

		if (artikal == null || kolicina <= 0) {
			throw new RuntimeException("Ulazni parametri nisu validni");
		}

		for (Artikal a : artikli) {
			if (a.equals(artikal)) {
				int k = a.getKolicina();
				a.setKolicina(k + kolicina);
				return;
			}
		}
		artikal.setKolicina(kolicina);
		artikli.add(artikal);

	}

	@Override
	public void izbaciArtikal(Artikal artikal, int kolicina) {

		for (Artikal a : artikli) {
			if (a.equals(artikal)) {
				int k = a.getKolicina();
				a.setKolicina(k - kolicina);
				return;
			}
		}

	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		for (Artikal a : artikli) {
			if (a.getSifra() == sifra) {
				return a;
			}
		}
		throw new RuntimeException("Trazeni artikal ne postoji");

	}
}
