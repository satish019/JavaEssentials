public class Odd {
    public static void main(String[] args) {    
        int [] arr = new int [] {1, 2, 3, 4, 5};    
        System.out.println("Elements of given array present on odd position: ");    
        for (int i = 0; i < arr.length; i = i+2) {   
            System.out.println(arr[i]);  
        }
    }
}

import java.util.*;
public class Add {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        System.out.println("Enter the elements:");
        for (int i=0; i<10; i++)
        {
            array[i] = sc.nextInt();
        }
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Sum of array elements is :" +sum);
        sc.close();
     }
}

import java.util.*;
public class Avenger{
    String name,power,weapon,planet;
    int age;
    Scanner sc =new Scanner(System.in);
    public void getdetails(){
        System.out.println("enter name is :");
        name = sc.nextLine();
        System.out.println("enter age is :");
        age = sc.nextInt();
        System.out.println("enter power :");
        power = sc.next();
        System.out.println("enter weapon :");
        weapon = sc.next();
        System.out.println("enter planet :");
        planet =sc.next();
    }     
    public void displaydetails(){
        System.out.println("the name of avenger is : " +name);
        System.out.println("the age of "+ name + " is : " +age);
        System.out.println("power of "+ name + " is : " +power);
        System.out.println("weapon of "+ name + " is : " + weapon);
        System.out.println("planet of "+name+" is : " + planet);
    }
    public static void main(String args[]) {
        Avenger obj = new Avenger();
        obj.getdetails();
        obj.displaydetails();
    }
}
