package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import exceptions.ImproperAccidentalValueException;
import exceptions.ImproperNoteLetterException;
import notation.Note;

public class InputTesting {

	public static void main(String[] args) {
		
		List<Note> cMaj, eMaj, gbMaj, ebMaj, aMaj;

		try {
			cMaj = new ArrayList<Note>(Arrays.asList(new Note('C'), new Note('E'), new Note('G')));
			eMaj = new ArrayList<Note>(Arrays.asList(new Note('E'), new Note('G', 1), new Note('B')));
			gbMaj = new ArrayList<Note>(Arrays.asList(new Note('G', -1), new Note('B', -1), new Note('D', -1)));
			ebMaj = new ArrayList<Note>(Arrays.asList(new Note('E', -1), new Note('G'), new Note('B', -1)));
			aMaj = new ArrayList<Note>(Arrays.asList(new Note('A'), new Note('C', 1), new Note('E')));
		} catch (ImproperNoteLetterException e) {
			System.out.println(e.getMessage());
			System.exit(-1);
		} catch (ImproperAccidentalValueException e) {
			System.out.println(e.getMessage());
			System.exit(-2);
		}
		

	}

}
