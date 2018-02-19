package workshop.testing;

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
public class CommonIngredients {
	static int findCommonIngredients(String[] arr) {
		int n = arr.length;
		char c = 'a';
		int[] a = new int[26];
		int count = 0;
		for (int i = 0; i < n; i++) {
			String s = arr[i];
			for (int j = 0; j < s.length(); j++)
				if (a[s.charAt(j) % c] == i)
					a[s.charAt(j) % c]++;
		}
		for (int i = 0; i < 26; i++)
			if (a[i] == n) count++;
		return count;
	}
}
