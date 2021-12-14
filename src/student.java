/*     Q5. Create a class 'Student' with three data members which are name, age and address.
        The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available".
        It has two member methods with the same name “setInfo”. First method has two parameters for name and age and assigns
        the same whereas the second method takes three parameters which are assigned to name, age and address respectively.
        Print the name, age and address of 10 students.
        */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class student {
    String name;
    int age;
    String address;

    public student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not avaliable";
    }

    public void setInfo(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public void setinfo(int age, String name, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
//TOSTRING FOR OVERRIDE
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

    public static void main(String[] args) {
        //USING GENERICS CONCEPT
        List<student> stud = new ArrayList<>();
        stud.add(new student());
        stud.add(new student());
        stud.add(new student());
        stud.add(new student());
        stud.add(new student());
        stud.add(new student());
        stud.add(new student());
        stud.add(new student());
        stud.add(new student());
        stud.add(new student());
        stud.get(0).setinfo(20, "abhay", "mathura");
        stud.get(1).setinfo(22,"ram","aligarh");
        stud.get(2).setinfo(21, "aman", "mumbai");
        stud.get(3).setinfo(22, "aditya", "Bhopal");
        stud.get(5).setinfo(23, "mohit", "India");
        stud.get(6).setinfo(24, "manu", "Delhi");
        //FOR EACH LOOP
        for (student s : stud) {
            System.out.println(s);
        }
    }
}