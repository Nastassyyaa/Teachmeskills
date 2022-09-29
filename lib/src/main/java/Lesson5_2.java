import jdk.jfr.Frequency;

public class Lesson5_2
{
{
    public static void main(String[]args) {
        Friend friend = new Friend("Sasha", 25,"25.01.20");
        Friend friend2 = new Friend(" ", 30);
        friend.born();
    //    friend.age = 30;
    //    friend.name = "Sasha";

    }
}

class  Friend {

   private String name;
   private int age;
   private String birthday;

    public Friend(String name2, int age2) {
        this.name = name2;    // добавление конструктора , this
        this.age = age2;


    }

    void born () {
        String congratulations = "";

        if (birthday == null || birthday.isEmpty()) {
            congratulations = " no birthday";

        } else {
            System.out.println(name + "has B on" + birthday + "  " + age + "old");
        }


    }
}}

