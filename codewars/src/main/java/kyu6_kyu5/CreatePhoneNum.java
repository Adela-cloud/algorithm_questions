package kyu6_kyu5;

public class CreatePhoneNum {


    //time: O(1)
    //space: O(1)
    public static String createPhoneNum(int[]  num){
       return String.format("(%d%d%d)-%d%d%d-%d%d%d%d", num[0],num[1],num[2], num[3], num[4], num[5],
                num[6], num[7], num[8], num[9]);
    }

    public static void main(String[] args) {
        System.out.println(createPhoneNum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
