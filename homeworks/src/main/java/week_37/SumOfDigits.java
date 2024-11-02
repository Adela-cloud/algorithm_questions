package week_37;

import java.util.Arrays;

public class SumOfDigits {

    public static int sumOFDigits(int num) {
        while (num > 9) {
            num = Arrays.stream((String.valueOf(num)).split(""))
                    .mapToInt(s -> Integer.parseInt(s))
                    .sum();
        }
        return num;
    }


    public static void main(String[] args) {
        System.out.println(sumOFDigits(16));
        System.out.println(sumOFDigits(942));
        System.out.println(sumOFDigits(132189));
        System.out.println(sumOFDigits(493193));
    }

}
