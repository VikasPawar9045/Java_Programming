/*
 * 3. Apply private, public, protected and default access modifiers to the constructor
 * 4. Write constructors with return type int and String
 * 5. Try to call the constructor multiple times with the same object
 */

package com.constructors;


public class PublicPrivateProtectedDefault {
    int rollNo;
    String name;
    String clg;
    String city;

    {System.out.println("Student Details");}
    //default access modifier
    PublicPrivateProtectedDefault() {
        this(11);
    }

    //public access modifier
    public PublicPrivateProtectedDefault(int rollNo) {
        this("Ankit");
        this.rollNo = rollNo;
        System.out.println("rollNo : " + rollNo);
    }

    //private access modifiers
    private PublicPrivateProtectedDefault(String name) {
        this("ICFAI", "Hyderabad");
        this.name = name;
        System.out.println("Name : " + name);
    }

    //protected access modifiers
    protected PublicPrivateProtectedDefault(String clg, String city) {
        this.clg = clg;
        this.city = city;
        System.out.println("college : " + clg);
        System.out.println("City : " + city);
    }

    public static void main(String[] args) {
        //calling the constructor multiple times with the same object
        PublicPrivateProtectedDefault c = new PublicPrivateProtectedDefault();
    }
    
}
