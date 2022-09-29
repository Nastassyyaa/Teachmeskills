package com.example.lib;

public class Child extends Parent {
    public static void main(String[] args) {
        Parent child = new Child();
        Parent parent = new Parent();
        child.eye_color = "green";
        //child age = 5;




        System.out.println("eye color of the child " + child.eye_color);
        System.out.println("eye color of the parent " + parent.eye_color);
    }
    void speak(){
        super.speak();

    }

    void phonenumer (int number){

    }
    void phonenumer (int number, String mobile_operator){  // перегрузка метода-полиморфизм

    }
}

class Parent {

String eye_color = "blue";

void speak() {
    System.out.println("I speak quietly");
}
        }

class Uncle {
    public static void main(String[] args) {
        Parent parent = new Parent();
    }
}
