package workshop.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static workshop.testing.CommonIngredients.findCommonIngredients;

import org.junit.Rule;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * A famous chef has disguised all his recipes
 * By replacing the name of all the ingredients
 * in his recipes with a lower case letter
 * from 'a'-'z' and then placing them in a String.
 * Your job is to figure out which ingredients
 * are common among the recipes given.
 * <p>
 * For example:
 * {abcdde, baccd, eeabg}
 * Would return that there are 2 ingredients common among the
 * three recipes: 'a' and 'b'
 */
public class CommonIngredientsTest {
	/*
	Only one implementation to test:
	int findCommonIngredients(String[] arr) {
	 */
	@Test
    public void givenTest() {
	    String[] input = {"abcdde", "baccd", "eeabg"};
	    String[] output = {"a", "b"};
	    assertEquals(output, findCommonIngredients(input));
    }

    @Test
    public void emptyTest() {
        String[] input = {"abcdde", "baccd", "eeabg", ""};
        String[] output = {""};
        assertEquals(output, findCommonIngredients(input));
    }

    @Test
    public void allSameTest() {
        String[] input = {"abcddge", "bacgced", "eeacbgd"};
        String[] output = {"a", "b", "c", "d", "e", "g"};
        assertEquals(output, findCommonIngredients(input));
    }
    @Rule

    @Test
    public void nullTest() {
	    String[] input = {null, "abc"};
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Null input");
        findCommonIngredients(input);
	}
}