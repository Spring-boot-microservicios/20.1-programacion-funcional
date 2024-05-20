package com.debuggeando_ideas.code_challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@FunctionalInterface
interface PerformOperation {
    boolean check(int a);
}

class CodeImpl {

    //Es impar? impar return true - par return false
    public static PerformOperation isOdd() {
        return n -> !(n % 2 == 0); // es par
    }

    //Es un numero primo
    public static PerformOperation isPrime() {
//         return n -> (!(n == 1) && (n / n == 1) && (n / 1 == n) && !(n % 2 == 0)) || n == 2;

        // Curso
//        return n -> {
//            int divider = 1;
//            int count = 0;
//
//            while (divider <= n) {
//                if (n % divider == 0) count++;
//                if (count > 2) break;
//                divider++;
//            }
//
//            return count == 2;
//        };

        // Eficiente
        return n -> {
            if (n <= 1) return false;
            if (n == 2 || n == 3) return true;
            if (n % 2 == 0 || n % 3 == 0) return false;
            int sqrt = (int) Math.sqrt(n);
            for (int i = 5; i <= sqrt; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) return false;
            }
            return true;
        };

    }

    //Es un numero palindromo? 98589
    public static PerformOperation isPalindrome() {
//        return n -> (n == Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString()));
//        return n -> (n == revertNumber(n));

        // Curso
//        return n -> {
//            String numString = Integer.toString(n);
//            char[] chars = numString.toCharArray();
//            int charsLength = chars.length;
//
//            for (int i = 0, reverse = charsLength - 1; i < charsLength; i++, reverse--) {
//                if (chars[i] != chars[reverse]) return false;
//            }
//
//            return true;
//        };

        // Eficiente
        return n -> {
            if (n < 0) return false;  // Los números negativos no son palíndromos
            int original = n;
            int reversed = 0;

            while (n != 0) {
                int digit = n % 10;
                reversed = reversed * 10 + digit;
                n /= 10;
            }

            return original == reversed;
        };
    }

    private static Integer revertNumber(Integer number) {
        String numberToString = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder(numberToString);
        String reverseString = stringBuilder.reverse().toString();
        return Integer.parseInt(reverseString);
    }

}

public class CodeChallenge {

    @Test
    public void startTest() {

        PerformOperation isOdd = CodeImpl.isOdd();
        PerformOperation isPrime = CodeImpl.isPrime();
        PerformOperation isPalindrome = CodeImpl.isPalindrome();

        int[] isOddCases = {3,7,9,2,8};
        int[] isPrimeCases = {2,31,97,42,98,1};
        int[] isPalindromeCases = {54322345,710101017,888,7848729,783483002};


        assertAll( "Test isOdd" ,
                () -> assertTrue(isOdd.check(isOddCases[0])),
                () -> assertTrue(isOdd.check(isOddCases[1])),
                () -> assertTrue(isOdd.check(isOddCases[2])),
                () -> assertFalse(isOdd.check(isOddCases[3])),
                () -> assertFalse(isOdd.check(isOddCases[4]))
        );

       assertAll( "Test isPrime" ,
              () -> assertTrue(isPrime.check(isPrimeCases[0])),
              () -> assertTrue(isPrime.check(isPrimeCases[1])),
              () -> assertTrue(isPrime.check(isPrimeCases[2])),
              () -> assertFalse(isPrime.check(isPrimeCases[3])),
              () -> assertFalse(isPrime.check(isPrimeCases[4])),
              () -> assertFalse(isPrime.check(isPrimeCases[5]))
       );

       assertAll( "Test isPalindrome" ,
               () -> assertTrue(isPalindrome.check(isPalindromeCases[0])),
               () -> assertTrue(isPalindrome.check(isPalindromeCases[1])),
               () -> assertTrue(isPalindrome.check(isPalindromeCases[2])),
               () -> assertFalse(isPalindrome.check(isPalindromeCases[3])),
               () -> assertFalse(isPalindrome.check(isPalindromeCases[4]))
       );
    }

}


// Descomenta para probar con main method
//public class CodeChallenge {
//
//    public static void main(String[] args) {
//        PerformOperation isOdd = CodeImpl.isOdd();
//        PerformOperation isPrime = CodeImpl.isPrime();
//        PerformOperation isPalindrome = CodeImpl.isPalindrome();
//        int[] isOddCases = {3,7,9,2,8};
//        int[] isPrimeCases = {2,31,97,42,98};
//        int[] isPalindromeCases = {54322345,710101017,888,7848729,783483002};
//        System.out.println("Odd test");
//        Arrays.stream(isOddCases).forEach(i -> System.out.println(isOdd.check(i))); //true, true, true, false, false
//        System.out.println("isPrime test");
//        Arrays.stream(isPrimeCases).forEach(i -> System.out.println(isPrime.check(i))); //true, true, true, false, false
//        System.out.println("isPalindrome test");
//        Arrays.stream(isPalindromeCases).forEach(i -> System.out.println(isPalindrome.check(i))); //true, true, true, false, false
//    }
//}


