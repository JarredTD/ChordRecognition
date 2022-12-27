package notation;

import java.util.ArrayList;
import java.util.List;

public class Chord {

	private List<Note> chordNotes;
	private String keySignature;
	private String chordNotation;

	public Chord(List<Note> notes) {
		chordNotes = new ArrayList<Note>(notes);
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

//	private String calcKeySignature() {
//
//	}

//	private String calcChordNotation() {
//		chordNotes = this.getChordNotes();
//		
//	}
}
