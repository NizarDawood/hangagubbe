
package com.company;

public class Main {

    public static void main(String[] args) {
        String start = "16,1,2,0,4,2,7,1,2,14";
        String[] s = start.split(",");
        int[] k = new int[s.length];
        int A = 0;
        int B = 0;
        for (int i = 0; i < s.length; i++) {
            k[i] = Integer.parseInt(s[i]);

                while () {
                    if (k[i] <= 2) {
                        //k[i] = k[i] + 1;
                        A = A + 2 - k[i];

                    } else if (k[i] >= 2) {
                        //k[i] = k[i] - 1;
                        B = B + k[i] - 2;
                    }
                }
        }
        int Steg = A + B;
        System.out.println(Steg);

    }
}
