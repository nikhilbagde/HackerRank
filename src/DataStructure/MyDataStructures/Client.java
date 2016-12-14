package DataStructure.MyDataStructures;

/**
 * Created by Nikhi on 12/13/2016 8:34 PM.
 */
public class Client {
    public static void main(String[] args) {
        //Stack Int

        StackInt stackInt = new StackInt(10);
        stackInt.push(1);   stackInt.push(2);   stackInt.push(3);   stackInt.push(4);
        stackInt.push(5);   stackInt.push(6);   stackInt.push(7);   stackInt.push(8);
        stackInt.push(9);
        stackInt.push(10);
        //stackInt.push(11);

        System.out.println(stackInt.peek());
        System.out.println(stackInt.pop());
        System.out.println(stackInt.pop());
        System.out.println(stackInt.pop());
        System.out.println(stackInt.pop());
        System.out.println(stackInt.pop());
        System.out.println(stackInt.pop());
        System.out.println(stackInt.pop());
        //System.out.println(stackInt.pop());

    }
}
