package magacin;

import java.util.LinkedList;
import java.util.Objects;

import artikal.Artikal;

public class Magacin {

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

}
