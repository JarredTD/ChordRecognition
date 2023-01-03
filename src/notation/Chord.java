package notation;

import java.util.ArrayList;
import java.util.List;

public class Chord {

	private List<Note> chordNotes;
	private String keySignature;
	private String chordNotation;
	private int inversion;

	public Chord(List<Note> notes) {
		this.chordNotes = new ArrayList<Note>(notes);
		this.inversion = this.calcInversion();
	}

	public List<Note> getChordNotes() {
		return this.chordNotes;
	}

	public String getKeySignature() {
		return this.keySignature;
	}

	public String getChordNotation() {
		return this.chordNotation;
	}

	private Note getRoot() {
		return this.getChordNotes().get(0);
	}

	private Note getLastNote() {
		return this.getChordNotes().get(this.getChordNotes().size() - 1);
	}

//	private int calcInversion() {
//		int distance = this.getRoot().calcSemitoneDistance(this.getLastNote());
//
//		switch (distance) {
//
//		case 7:
//			return 0;
//
//		case 8:
//			return 1;
//
//		case 9:
//			return 2;
//
//		default:
//			return 0;
//		}
//	}

	private String calcChordNotation() {
		String chordNotation = "";

		if (inversion == 0) {
			chordNotation += this.getRoot().getNoteLetter();
		}
		if ((this.getRoot().calcSemitoneDistance(this.getChordNotes().get(1)) == 4)
				&& this.getRoot().calcSemitoneDistance(this.getChordNotes().get(2)) == 7) {
			return chordNotation;
		}

		return chordNotation;

	}

//	private String calcKeySignature() {
//
//	}
}
