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


        /*ArrayList <String> original=new ArrayList<>();
        original.add("Tuwaiq");
        original.add("Bootcamp");
        original.add("Student");
        original.add("JAVA");
        System.out.println("the original list is:"+original);
for(String s:original) {

    if (s.length()>(s.length())+1) {

        System.out.println((s.length())+1);

    }
}

         */
        String arr[]={"Tuwaiq", "Bootcamp" , "Student","JAVA"};
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>arr[i+1].length()){
                System.out.println(arr[i+1]);
            }else if(arr[i+1].length()>arr[i+2].length()){
                System.out.println(arr[i+2]);

            }else
                if(arr[i+2].length()>arr[i+3].length()){
                    System.out.println(arr[i+3]);
                }
            else System.out.println(arr[i+4]);
        }

    }
}