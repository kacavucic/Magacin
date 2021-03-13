package artikal;

import java.util.Date;

public class KucnaHemija extends Artikal {

	private Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		if (rokTrajanja.after(new Date())) {
			this.rokTrajanja = rokTrajanja;
		} else {
			throw new RuntimeException("Rok trajanja je istekao");
		}
	}

	@Override
	public String toString() {
		return super.toString() + "KucnaHemija [rokTrajanja=" + rokTrajanja + "]";
	}

}
