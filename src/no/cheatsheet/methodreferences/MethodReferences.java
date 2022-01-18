package no.cheatsheet.methodreferences;

public class MethodReferences {
//    Java provides a new feature called method reference in Java 8. Method reference is used to refer method of functional interface.
//    It is compact and easy form of lambda expression. Each time when you are using lambda expression to just referring a method, you
//    can replace your lambda expression with method reference. In this tutorial, we are explaining method reference concept in detail.

//    Reference to a static method.
//    You can refer to static method defined in the class. Following is the syntax and example which describe the process of referring static method in Java.
//
//            Syntax
//
//    ContainingClass::staticMethodName
//
//    Example 1
//
//    In the following example, we have defined a functional interface and referring a static method to it's functional method say().
//
//    interface Sayable{
//        void say();
//    }
//    public class MethodReference {
//        public static void saySomething(){
//            System.out.println("Hello, this is static method.");
//        }
//        public static void main(String[] args) {
//            // Referring static method
//            Sayable sayable = MethodReference::saySomething;
//            // Calling interface method
//            sayable.say();
//        }
//    }

// --------------------------------------------------------------------------------------

//    Reference to an instance method.
//    like static methods, you can refer instance methods also. In the following example, we are describing the process of referring the instance method.
//
//            Syntax
//
//    containingObject::instanceMethodName
//
//    Example 1
//
//    In the following example, we are referring non-static methods. You can refer methods by class object and anonymous object.
//
//    interface Sayable{
//        void say();
//    }
//    public class InstanceMethodReference {
//        public void saySomething(){
//            System.out.println("Hello, this is non-static method.");
//        }
//        public static void main(String[] args) {
//            InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object
//            // Referring non-static method using reference
//            Sayable sayable = methodReference::saySomething;
//            // Calling interface method
//            sayable.say();
//            // Referring non-static method using anonymous object
//            Sayable sayable2 = new InstanceMethodReference()::saySomething; // You can use anonymous object also
//            // Calling interface method
//            sayable2.say();
//        }
//    }

// --------------------------------------------------------------------------------------

//    3) Reference to a Constructor
//    You can refer a constructor by using the new keyword. Here, we are referring constructor with the help of functional interface.
//
//    Syntax
//
//    ClassName::new
//
//    Example
//
//    interface Messageable{
//        Message getMessage(String msg);
//    }
//    class Message{
//        Message(String msg){
//            System.out.print(msg);
//        }
//    }
//    public class ConstructorReference {
//        public static void main(String[] args) {
//            Messageable hello = Message::new;
//            hello.getMessage("Hello");
//        }
//    }

}
