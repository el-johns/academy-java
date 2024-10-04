package com.bptn.course._08_inheritance;

public class Registration {
    private String name;
    public Registration(String name) {
       this.name = name;
    }
    public String toString() {
       return name;
    }
    public static void main(String[] args) {
       Registration x = new Registration("Eve");
       Member y = new Member("Mathew", 1001);
       System.out.println(x); //call Person toString method
       System.out.println(y);  //call Student toString method


       //create an object of APStudent class and pass ("Faraday", 26341, 85) as parameters
       //NewStudent a = new NewStudent("Faraday", 1001, 90);
       //System.out.println(a);
    }
}
       

