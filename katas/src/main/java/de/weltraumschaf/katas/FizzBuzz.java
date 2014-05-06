package de.weltraumschaf.katas;

/**
 * You can find a possible solution here:
 * http://technologyconversations.com/2014/03/12/java-tutorial-through-katas-fizz-buzz-easy/
 */
final class FizzBuzz {

    public static String getResult(int number) {
        if (number % 15 == 0) {
            return "fizzbuzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0) {
            return "buzz";
        }

        return Integer.toString(number);
    }
}
