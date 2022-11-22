/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P543_2;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Iterator;

class version2 {
    
    public static void main (String [] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        int min=6;
        int max=1000000; 
        int number;
        boolean goldbach = false;
        System.out.println("Enter the even number beetwen 6 y 1000000");
        ArrayList<Integer> numbers = new ArrayList();
        do{
            number = Integer.parseInt(br.readLine());
            if(number%2 == 0 && number >= min && number <= max)
                numbers.add(number);
            else if(number !=0){
            System.out.println("Imput invalid");
            System.out.println("Enter other even number");
            }
        }while (number != 0);
        Iterator<Integer> it = numbers.iterator(); 
        long init = System.nanoTime();
        while (it.hasNext()) {   
            number = it.next();
                for (int i = 2; i <= number / 2; i++) {
                    if (checkPrime(i)) {
                        if (checkPrime(number - i)) {
                            System.out.println(number + " = " + i + " + "  + (number - i));
                            goldbach = true;
                            break;
                        }
                    }       
                }
                if (!goldbach) {
                System.out.println(number + " Goldbach's conjecture is wrong. ");
                }  
        }
        System.out.println("End of programm");
        long termino = System.nanoTime();
        System.out.println((termino - init) + " ns.");
        System.out.println((termino - init)/1000000000.0 + " s." );
    }
    
    static boolean checkPrime(int num) {
        for (int i = 2; i <= num/2; i++) {
               if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


        
