package interfejs;

import artikal.Artikal;

public interface MagacinInterface {
	
	public void dodajArtikal(Artikal artikal, int kolicina);
	public void izbaciArtikal(Artikal artikal, int kolicina);
	public Artikal pronadjiArtikal(int sifra);
}
