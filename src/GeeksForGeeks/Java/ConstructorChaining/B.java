package GeeksForGeeks.Java.ConstructorChaining;

import Java.RandomTest.*;

/**
 * Created by Nikhil on 1/8/2017 7:17 AM.
 */
public class B extends A{
    B(){
        System.out.println("B SubClass Constructor");
        System.out.println("Current Objects HashCode " + this.hashCode() + " Super Class Hashcode " + super.hashCode());
        System.out.println("This Class Name " + this.getClass() + "Super Class Name" + super.getClass());
    }

    public static void main(String[] args) {
        B b = new B();
        /*
        A Super Class Constructor
        Objects HashCode 460141958 -> hashcode of this and super is same which is of object B.
        Class Name class GeeksForGeeks.Java.ConstructorChaining.B       (noticed when this object created,even in parent class constructor this.getclass print B. Which is a child class.
        B SubClass Constructor
        Current Objects HashCode 460141958 Super Class Hashcode 460141958 -> same object B
        This Class Name class GeeksForGeeks.Java.ConstructorChaining.BSuper Class Nameclass GeeksForGeeks.Java.ConstructorChaining.B -> same class name of this and super -> B
         */

        A a = new A();
        /*
        A Super Class Constructor
        Objects HashCode 1163157884
        Class Name class GeeksForGeeks.Java.ConstructorChaining.A
         */

        A ab = new B();
        /*      same as first case.
        A Super Class Constructor
        Objects HashCode 1956725890 ->B Object hashcode
        Class Name class GeeksForGeeks.Java.ConstructorChaining.B -> this in A's constrctor print B class
        B SubClass Constructor
        Current Objects HashCode 1956725890 -> this hascode | Super Class Hashcode 1956725890 -> B's object
        This Class Name class GeeksForGeeks.Java.ConstructorChaining.B Super Class Nameclass GeeksForGeeks.Java.ConstructorChaining.B -> this and super both print B class as name.
         */
    }
}
