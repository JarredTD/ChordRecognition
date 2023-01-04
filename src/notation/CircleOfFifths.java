package notation;

import java.util.ArrayList;
import java.util.List;

public class CircleOfFifths {	
	
	private static final int MOD = 12;

	private static final ArrayList<String> fifths = new ArrayList<String>();
	static {
		fifths.add("C");
		fifths.add("G");
		fifths.add("D");
		fifths.add("A");
		fifths.add("E");
		fifths.add("B");
		fifths.add("Gb");
		fifths.add("Db");
		fifths.add("Ab");
		fifths.add("Eb");
		fifths.add("Bb");
		fifths.add("F");
	}

	public static int calcSemitoneDistance(Note note1, Note note2) {
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
	
	public static List<String> calcKey(Note n) {
		char letter = n.getNoteLetter();
		String noteLetter = (n.getAccidental() == -1 ) ? letter+"b" : letter+"";
		boolean isFlat = (n.getAccidental() == -1 || letter == 'F') ? true : false;
		final List<String> keySignature = new ArrayList<String>();
		
		int index = fifths.indexOf(noteLetter);
		
		if (!isFlat) {
			for (int i = 0; i < index; i++) {
				int idx = (i - 1);

				idx = (idx < 0) ? idx + MOD : idx;
				
				keySignature.add(fifths.get(idx) + "#");
			}
		} else {
			for (int i = 11; i >= index; i--) {
				if (i == 6) {
					keySignature.add(fifths.get(0));
					continue;
				}
				keySignature.add(fifths.get(i - 1));
			}
		}

		return keySignature;
	}

}
