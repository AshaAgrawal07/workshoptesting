package workshop.testing;

/**
 * This code is used by a emergency radio bouy
 * It listens for strings of repeated SOS sent over the radio
 * When it receives these messages, sometimes they
 * are scrambled by interference. These methods are used
 * to count the number of changes
 * <p>
 * For example:
 * SOSSAS
 * has one change O->A
 * SOSSOSSOSSOS
 * Has zero changes
 * <p>
 * This method takes in a String formatted as so:
 * It is all capital letters
 * Length of string%3 = 0
 * The string
 */
public class SOSChecker {
	public static int countChangesGood(String message) {
		String sos = "SOS";
		int count = 0;
		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) != sos.charAt(i % 3)) count++;
		}
		return count;
	}

	public static int countChangesBad(String s) {
		int l = s.length();
		int b = l / 3;
		int count = 0;
		for (int i = 0; i < b; i++) {
			if (s.charAt(i) != s.charAt(i + b)) {
				count++;
			}
		}
		return count;
	}
}
