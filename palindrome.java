/*


1. It prompts the user to enter a sentence.
2. The input sentence is split into individual words using the space character as a delimiter.
3. A StringBuilder named "output" is initialized to store the resulting output.
4. It iterates over each word in the input sentence.
5. For each word, it checks if it is a palindrome using the "isPalindrome" method.
6. If the word is a palindrome, it proceeds to iterate over each letter in the word.
7. For each letter, it retrieves the letter itself and its corresponding hash code using the "charAt" and "hashCode" methods.
8. The letter and its hash code are appended to the "output" StringBuilder, separated by a space.
9. Once all the words have been processed, the program prints the final output, which is the sequence of letters and hash codes.
10. The output is displayed as a summary, prefixed with "Output: ".

In summary, the code takes a sentence, finds palindromic words, extracts the letters and hash codes from those words, and produces an output sequence of letters and hash codes.
*/




import java.util.Scanner;

public class PalindromeHash {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        String[] words = sentence.split(" ");

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (isPalindrome(word)) {
                for (int j = 0; j < word.length(); j++) {
                    char letter = word.charAt(j);
                    int hashCode = letter;
                    output.append(letter).append(" ").append(hashCode).append(" ");
                }
            }
        }

        System.out.println("Output: " + output.toString().trim());
    }

    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
