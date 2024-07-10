import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //1.Write a Java program that accept three numbers from the user and print the largest number .
        Scanner scanner = new Scanner(System.in);
       /* int n1;
        int n2;
        int n3;
        int max=0;
        System.out.println("enter number 1:");
        n1 = scanner.nextInt();
        System.out.println("enter number 2:");
        n2 = scanner.nextInt();
        System.out.println("enter number 3:");
        n3 = scanner.nextInt();
        if(n1>n2&&n1>n3){
            max=n1;
        }else if(n2>n1&&n2>n3){
            max=n2;
        }else max=n3;
        System.out.println("the max is :"+max);

        */

        //2Write a Java program that accept a String and a number from the user,then print the character in the given index .
        /*int number;
        String st;

        System.out.println("please enter a string");
        st = scanner.nextLine();
        System.out.println("enter a number");
        number = scanner.nextInt();

        System.out.println(st.charAt(number));

         */
        // 3.Write a program to enter the numbers till the user wants and at the end it should display the sum entered .
       /* String ch="";
        int num;
        int sum=0;

         do{
             System.out.println("enter a number");
             num = scanner.nextInt();
            sum=sum+num;
            // System.out.println("the sum is "+sum);

             System.out.println("do you want to contenue: y/n");
             ch = scanner.next();


         }while (ch.equals("y"));
        System.out.println("the sum is "+sum);

        */

       //4.Write a Java program to find positive and negative numbers of a given array:
      /* int arr[]={10,-21,30,31,-25} ;

       for(int i=0;i<arr.length;i++){

           if(arr[i]>0){
               System.out.println(arr[i]+"is positive number");
           }else if(arr[i]<0){
               System.out.println(arr[i]+"is negative number");
           }
       }




       */

        //5.Write a Java program to find a shortest word of a given array:
/*
String arr[]={"Tuwaiq", "Bootcamp" , "Student","JAVA"};

         String shortw=arr[0];
         for(int i=1;i<arr.length;i++) {
             if(arr[i].length()<shortw.length()) {
                 shortw=arr[i];
             }
         }
        System.out.println(shortw);
*/
    }
}
