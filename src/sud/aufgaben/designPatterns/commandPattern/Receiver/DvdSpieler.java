package designPatterns.commandPattern.Receiver;

public class DvdSpieler extends Receiver {
	String beschreibung;
	int aktuellerTrack;
	Verstaerker verstaerker;
	String film;

	public DvdSpieler(String beschreibung, Verstaerker verstaerker) {
		this.beschreibung = beschreibung;
		this.verstaerker = verstaerker;
	}

	public void ein() {
		System.out.println(beschreibung + " an");
	}

	public void aus() {
		System.out.println(beschreibung + " aus");
	}

	public void auswerfen() {
		System.out.println(beschreibung + " wirft DVD " + film + " aus");
		film = null;
	}

	public void spielen(String film) {
		this.film = film;
		aktuellerTrack = 0;
		System.out.println(beschreibung + " spielt \"" + film + "\"");
	}

	public void spielen(int track) {
		if (film == null) {
			System.out.println(beschreibung + " kann Track " + track + " nicht abspielen, keine DVD eingelegt");
		} else {
			aktuellerTrack = track;
			System.out.println(beschreibung + " spielt Track " + aktuellerTrack + " von \"" + film + "\"");
		}
	}

	public void anhalten() {
		aktuellerTrack = 0;
		System.out.println(beschreibung + " beende \"" + film + "\"");
	}

	public void pause() {
		System.out.println(beschreibung + " halte \"" + film + "\" an");
	}

	public void setZweiKanalAudio() {
		System.out.println(beschreibung + " setze Zwei-Kanal-Audio");
	}

	public void setSurroundAudio() {
		System.out.println(beschreibung + " setze Surround-Audio");
	}

	public String toString() {
		return beschreibung;
	}
}
