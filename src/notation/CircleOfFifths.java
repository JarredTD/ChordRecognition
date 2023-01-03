package notation;

import java.util.HashMap;
import java.util.Map;

public class CircleOfFifths {

	private static final Map<Integer, String> noteMapFlat = new HashMap<Integer, String>();
	static {
		noteMapFlat.put(0, "C");
		noteMapFlat.put(1, "Db");
		noteMapFlat.put(2, "D");
		noteMapFlat.put(3, "Eb");
		noteMapFlat.put(4, "E");
		noteMapFlat.put(5, "F");
		noteMapFlat.put(6, "Gb");
		noteMapFlat.put(7, "G");
		noteMapFlat.put(8, "Ab");
		noteMapFlat.put(9, "A");
		noteMapFlat.put(11, "B");
	}

	public CircleOfFifths() {
	}

	public int calcSemitoneDistance(Note note1, Note note2) {
		int distance = 0;

		char note1Char = note1.getNoteLetter();
		char note2Char = note2.getNoteLetter();

		while (note1Char != note2Char) {
			if (note1Char == 'B' || note1Char == 'E') {
				distance++;
			} else {
				distance += 2;
			}
			note1Char++;
		}

		return distance;

	}

}
