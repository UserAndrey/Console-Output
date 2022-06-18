import java.util.Scanner;
public class Listing3_1 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String name;
        String surName;
        int yearBorn;
        int yearNow;
        System.out.print("Ваше имя:");
        name = input.nextLine();
        System.out.print("Ваше отчество:");
        surName = input.nextLine();
        System.out.print("Какой сейчас год?");
        yearNow = input.nextInt();
        System.out.print("В каком году вы родились?");
        yearBorn = input.nextInt();
        System.out.println("Здравствуйте, "+name+" "+surName+"!");
        System.out.println ("Ваш возраст: "+ (yearNow-yearBorn) +".");  
    }
}