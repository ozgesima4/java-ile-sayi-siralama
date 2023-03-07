package javaapplication10;

import java.util.Scanner;

public class JavaApplication10 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double a , b,c;
        System.out.println("3 adet sayi gir:");
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
        
        if(a<b &&a <c){
            if(b<c){
                System.out.println(a+"<"+b+"<"+c);
            }
            else{
                System.out.println(a+"<"+c+"<"+b);
            }
        }
        else if(b<a && b<c){
            if(a<c){
                System.out.println(b+"<"+a+"<"+c);
            }
            else{
                System.out.println("b<c<a");
            }
        }
        else if(c<a && c<b){
            if(a<b){
                System.out.println("c<a<b");
            }
            else{
                System.out.println("c<b<a");
            }
        }
    }
    
}
