package com.tts;
import java.util.*;


public class loopsHW {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        int i = 0;
        int product = 1;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        while (i < 5) {
            System.out.println("Enter an integer between 1 and 100");
            a.add(in.nextInt());
            i++;
        }
        Collections.sort(a);
        for(int z : a){
            product *= z;
        }
        for(int w : a){
            sum += w;
        }
        System.out.println("Lowest number is: " + a.get(0));
        System.out.println("Highest number is: " + a.get(4));
        System.out.println("The product of your inputs is: " + product);
        System.out.println("The sum of your inputs is: " + sum);
    }
}



