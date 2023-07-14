/*Naveen.B 
202107116*/

public class AlphabetConverter {
    public static void main(String[] args) {
        String input = "india";
        String converted = convertAlphabet(input);
        String swapped = swapNearbyVariables(converted);
        System.out.println(change);
    }

    public static String convertAlphabet(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isLetter(currentChar)) {
                char nextChar = (char) (currentChar + 1);
                output.append(nextChar);
            } else {
                output.append(currentChar);
            }
        }
        return output.toString();
    }

    public static String swapNearbyVariables(String output) {
        StringBuilder swap = new StringBuilder(output);
        for (int i = 0; i < swap.length() - 1; i += 2) {
            char current = swap.charAt(i);
            char next = swap.charAt(i + 1);
            swap.setCharAt(i, next);
            swap.setCharAt(i + 1, current);
        }
        return swap.toString();
    }
}
