package com.amigos;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// driver class

        Scanner input= new Scanner(System.in);
        String choice;
        String input_name,input_id,input_date;
        float input_sem;
        System.out.println("Type 'one' to enter student details\nType 'two' to see books available\nEnter choice: ");
        choice = input.nextLine();

           //choice = input.nextInt();
            if (choice.equals("one") ){
       module1 obj1 = new  module1();
       //Scanner input = new Scanner(System.in);

                System.out.println("Enter Student full name: ");
                input_name=input.nextLine();
                obj1.setName(input_name);


                System.out.println("Enter Student id: ");
                input_id= input.nextLine();
                obj1.setUni_id(input_id);

                System.out.println("Enter date of borrowing: ");
                input_date=input.nextLine();
                obj1.setDate(input_date);

                System.out.println("Enter semester of borrowing: ");
                input_sem=input.nextFloat();
                obj1.setSem(input_sem);
                //outputting student info
                System.out.println("Student name: "+obj1.getName());
                System.out.println("Student University ID: "+obj1.getUni_id());
                System.out.println("Date of borrowing: "+obj1.getDate());
                System.out.println("Semester of borrowing: "+obj1.getSem());


            } else if(choice.equals("two")){
                module2 obj2 = new module2();
                obj2.chemistry();
                obj2.biology();
                obj2.physics();
            }
            else{
                System.out.println("Invalid choice.Run Program again.");
            }


input.close();
    }
}
