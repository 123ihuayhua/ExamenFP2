/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P543_2;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class version1 {
    
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        int min=6;
        int max=1000000;    
        int number;
        boolean goldbach = false;
        System.out.println("Enter the even number beetwen 6 y 1000000");
        number = sc.nextInt();
        if (number % 2 > 0) {
            System.out.println("Enther other even number: ");
            number = sc.nextInt();
        } else if (number % 2 == 0 && number >= min && number <= max) {
            for (int i = 2; i <= number / 2; ++i) {
                if (checkPrime(i)) {
                if (checkPrime(number - i)) {
                    System.out.println(number + " = " + i + " + "  + (number - i));
                }
                goldbach = true;
                }
            }
            if (!goldbach) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }else if (number == 0) {
            System.out.println("End of program");            
        }
    }

    static boolean checkPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


 

