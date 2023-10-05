public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade) {
        if (grade >= 90) {
            return 'A';
        }
        else if (grade >= 80) {
            return 'B';
        }
        else if (grade >= 70) {
            return 'C';
        }
        else if (grade >= 60) {
            return 'D';
        }
        return 'F';
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int input) {
        if ((input%3 == 0) && (input%5 == 0)) {
            return "fizzbuzz";
        }
        else if (input%3 == 0) {
            return "fizz";
        }
        else if (input%5 == 0) {
            return "buzz";
        }
        return "unlucky";
    }

    // Question 3 - frontBack
    public static String frontBack(String user) {
        if (user.length() <=1) {
            return user;
        }
        else {
            return user.substring(0,2) + user + user.substring(0,2);
        }
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c) {
        int sumAB = a+b;
        int sumAC = a+c;
        int sumBC = b+c;
        return (sumAB == c) || sumBC == a || (sumAC == b);
    }
    // Question 5 - endUp
    public static String endUp(String capital) {
        if (capital.length() >=3) {
            String lastThreeChar = capital.substring(capital.length()-3);
            String upperCase = lastThreeChar.toUpperCase();
            return capital.substring(0,capital.length()-3) + upperCase;

        }
        else {
            return capital.toUpperCase();
        }
    }
}
