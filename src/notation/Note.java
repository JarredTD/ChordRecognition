package notation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import exceptions.ImproperAccidentalValue;
import exceptions.ImproperNoteLetterException;


public class Note {

    private char noteLetter;
	private int accidental;

    private static Set<Character> allowedLetters = new HashSet<Character>(
	    Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G'));

	/**
	 * Neutral Note Constructor
	 * 
	 * @param letter
	 * @throws ImproperNoteLetterException
	 */
    public Note(char letter) throws ImproperNoteLetterException {
		if (allowedLetters.contains(letter)) {
			this.noteLetter = letter;
			this.accidental = 0;;
		} else {
			throw new ImproperNoteLetterException(
					String.format("%c is not a valid character for note notation.", letter));
		}
    }

	/**
	 * Accidental Note Constructor
	 * 
	 * @param letter
	 * @param accidental
	 * @throws ImproperNoteLetterException
	 * @throws ImproperAccidentalValue
	 */
	public Note(char letter, int accidental) throws ImproperNoteLetterException, ImproperAccidentalValue {
		this(letter);
		
		if (accidental >= -1 && accidental <= 1) {
			this.accidental = accidental;
		} else {
			throw new ImproperAccidentalValue(String.format("%i is not a valid value for the accidental. ", accidental));
		}
	}

}
