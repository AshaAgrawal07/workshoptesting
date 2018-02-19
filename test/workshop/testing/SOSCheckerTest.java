package workshop.testing;

import org.junit.jupiter.api.Test;

/**
 * This code is used by a emergency radio bouy
 * It listens for strings of repeated SOS sent over the radio
 * When it receives these messages, sometimes they
 * are scrambled by interference. These methods are used
 * to count the number of changes
 *
 * For example:
 * SOSSAS
 * has one change O->A
 * SOSSOSSOSSOS
 * Has zero changes
 *
 * This method takes in a String formatted as so:
 * It is all capital letters
 * Length of string%3 = 0
 * The string
 */
public class SOSCheckerTest {
	/*
	 * There are two implementations to test
	 * int countChangesGood(String message)
	 * and
	 * int countChangesBad(String message)
	 */
}