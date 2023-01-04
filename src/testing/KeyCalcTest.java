package testing;

import java.util.ArrayList;

import exceptions.ImproperAccidentalValue;
import exceptions.ImproperNoteLetterException;
import notation.CircleOfFifths;
import notation.Note;

public class KeyCalcTest {

	public static void main(String[] args) {

		final ArrayList<Note> fifths = new ArrayList<Note>();
		try {
			fifths.add(new Note('C'));
			fifths.add(new Note('G'));
			fifths.add(new Note('D'));
			fifths.add(new Note('A'));
			fifths.add(new Note('E'));
			fifths.add(new Note('B'));
			fifths.add(new Note('G', -1));
			fifths.add(new Note('D', -1));
			fifths.add(new Note('A', -1));
			fifths.add(new Note('E', -1));
			fifths.add(new Note('B', -1));
			fifths.add(new Note('F'));
		} catch (ImproperNoteLetterException e) {
			System.out.println(e.getMessage());
			System.exit(-1);
		} catch (ImproperAccidentalValue e) {
			System.out.println(e.getMessage());
			System.exit(-2);
		}

		for (int i = 0; i < fifths.size(); i++) {
			System.out.println(CircleOfFifths.calcKey(fifths.get(i)));
		}
	}

}
