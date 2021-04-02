package learn.java;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * After loading the “.class” file, JVM creates an object of type Class to represent this file in the heap memory.
 * Please note that this object is of type Class predefined in java.lang package.
 * These Class object can be used by the programmer for getting class level information
 * like the name of the class, parent name, methods and variable information etc.
 * To get this object reference we can use getClass() method of Object class.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("JVM Architecture!");
        Student student1 = new Student();
        Student student2 = new Student("Hasan", 20, 102);

        student1.setName("Robin");
        student1.setAge(25);
        student1.setId(101);

        System.out.println("Students are : \n" + student1.toString() + "\n" + student2.toString() + "\n");

        //Getting student1 object type
        String classData = student1.getClass().getName();
        System.out.println("classData = " + classData + "\n");

        //Method list used by student1 object
        Method[] methods = student1.getClass().getDeclaredMethods();
        System.out.println("student1 object's class methods are : ");
        for (Method m : methods) {
            System.out.println(m.getName());
        }
        //Field list used by student1 object
        Field[] fields = student1.getClass().getDeclaredFields();
        System.out.println("\nstudent1 object's class fields are : ");
        for (Field f : fields) {
            System.out.println(f.getName());
        }

        //Get Student class ClassLoader
        System.out.println("\nClassLoader: " + Student.class.getClassLoader());
    }
}
