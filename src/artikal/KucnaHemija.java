package artikal;

import java.util.Date;

public class KucnaHemija extends Artikal {

	private Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}

	@Override
	public String toString() {
		return super.toString() + "KucnaHemija [rokTrajanja=" + rokTrajanja + "]";
	}
	

}
