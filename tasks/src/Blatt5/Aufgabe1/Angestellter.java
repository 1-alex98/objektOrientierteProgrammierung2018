public class Angestellter {
	private String vorname;
	private String nachname;
	private int alter;
	private int gehalt;
	
	public void altern() {
		alter++;
	}
	
	public void mehrGeld(int betrag) {
		gehalt += betrag;
	}
	}
