/**
 * @author Jarred
 * Notes may only be notated as letters A, B, C, D, E, F, G. Attempts to use any other letter is an exception of this kind.
 */

package exceptions;

@SuppressWarnings("serial")
public class ImproperNoteLetterException extends Exception {

	/**
	 * Attempted use of any letter that isn't A, B, C, D, E, F, or G as note
	 * notation.
	 * 
	 * @param msg
	 */
	public ImproperNoteLetterException(String msg) {
		super(msg);
    }
}
