/**
 * @author Jarred
 * Accidentals can only exist within a tri-state between -1, 0, and 1. Any attempt to use any other value is an exception of this kind.
 */

package exceptions;

@SuppressWarnings("serial")
public class ImproperAccidentalValue extends Exception {

	/**
	 * Attempted use of an accidental value that was not -1, 0, or 1.
	 * 
	 * @param msg
	 */
	public ImproperAccidentalValue(String msg) {
		super(msg);
	}
}
