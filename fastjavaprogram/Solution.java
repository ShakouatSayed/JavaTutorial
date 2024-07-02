package fastjavaprogram;

import java.util.*;

class Solution {
    public static void main(String[] argh) {
        try (Scanner in = new Scanner(System.in)) {
            int t = in.nextInt();
            int ser = 0, sum;
            for (int i = 0; i < t; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                sum = (a + (2 * (i * i)) * b) + ser;
                System.out.println(sum);
            }
        }
    }
}
