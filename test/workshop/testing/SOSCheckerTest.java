package workshop.testing;

import org.junit.jupiter.api.Test;

import org.junit.Rule;
import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static workshop.testing.SOSChecker.countChangesGood;

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
 *
 * SOSSOSSOSSOS
 * Has zero changes
 *
 * SOSBOBPOP
 * has 4 changes
 */
public class SOSCheckerTest {
	/*
	 * There are two implementations to test
	 * int countChangesGood(String message)
	 * and
	 * int countChangesBad(String message)
	 */

	@Test
	public void oneChangeTest() {
		assertEquals("has one change 0->A", countChangesGood("SOSSAS"));
	}

	@Test
	public void nullTest() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Null input");
		countChangesGood(null);
	}

	@Test
	public void lowerCaseTest() {
		assertEquals("has one change 0->A", countChangesGood("sossas"));
	}

	@Test
	public void randomCaseTest() {
		assertEquals("has one change 0->A", countChangesGood("SossAs"));
	}

	@Test
	public void oneLetter() {
		assertEquals("has 2 changes", countChangesGood("s"));
	}
}