package DataStructure.MyDataStructures.Stacks;


/**
 * Created by Nikhi on 12/14/2016 2:50 AM.
 */
public class Client {
    public static void main(String[] args) {
        String testBracket = "asdq()[asdaj](((";            //Not balanced
        String testBracket1 = "asdq()[asdaj]((()))";        //balanced
        String testBracket2 = "}asdq()[asdaj]((())){";      //not balancecd
        String empytyString ="";
        //Working!
        System.out.println("Using Array, Testing");
        System.out.println(testBracket + " has "+ (ArrayStack.hasMatchingBrackets(testBracket)? " Balanced Brackets" : "Brackets not balanced"));
        System.out.println(testBracket1 +" has "+ (ArrayStack.hasMatchingBrackets(testBracket1)? "Balanced Brackets " : "Brackets not balanced"));
        System.out.println(testBracket2 +" has "+ (ArrayStack.hasMatchingBrackets(testBracket2)? "Balanced Brackets " : "Brackets not balanced"));
        System.out.println(empytyString +" has "+ (ArrayStack.hasMatchingBrackets(empytyString)? "Balanced Brackets " : "Brackets not balanced"));
        //Working!
        System.out.println("Using LinkedList, Testing");
        System.out.println(testBracket + " has "+ (LinkedListStack.hasMatchingBrackets(testBracket)? " Balanced Brackets" : "Brackets not balanced"));
        System.out.println(testBracket1 +" has "+ (LinkedListStack.hasMatchingBrackets(testBracket1)? "Balanced Brackets " : "Brackets not balanced"));
        System.out.println(testBracket2 +" has "+ (LinkedListStack.hasMatchingBrackets(testBracket2)? "Balanced Brackets " : "Brackets not balanced"));
        System.out.println(empytyString +" has "+ (LinkedListStack.hasMatchingBrackets(empytyString)? "Balanced Brackets " : "Brackets not balanced"));

        //Test for htmlTag
        String html1 ="<body><h1>Nikhil You are doing good </h1></body>";
        System.out.println("Test Using Arraybased Stack");
        System.out.println(ArrayStack.matchHTMLTags(html1) ? "Has Matching Tags" : "Doesnt have matching tags");
        System.out.println("Test Using LinkedListStack");
        System.out.println(LinkedListStack.matchHTMLTags(html1)? "Has Matching Tags" : "Doesnt have matching tags");

        //Testing LinkedStack first remove or last remove.
        System.out.println("First or Last popping test");
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.push(4);
        System.out.println(linkedListStack.toString());
    }
}
