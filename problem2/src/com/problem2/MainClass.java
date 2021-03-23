package com.problem2;

import java.util.Scanner;

public class MainClass {
    private static int BinaryReversal(int number){
        StringBuilder binaryStringBuilder=new StringBuilder(Integer.toBinaryString(number));
        binaryStringBuilder=binaryStringBuilder.reverse();
        if(binaryStringBuilder.length()<8){
            for(int i=binaryStringBuilder.length();i<8;i++){
                binaryStringBuilder.append("0");
            }
        }
        return Integer.parseInt(binaryStringBuilder.toString(),2);


    }
    public static void main(String[] args) {
        System.out.println("Enter the input number");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println(BinaryReversal(number));
    }
}
