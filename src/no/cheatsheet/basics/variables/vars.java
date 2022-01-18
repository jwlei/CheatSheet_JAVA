package no.cheatsheet.basics.variables;

public class vars {

    //Numbers
    int i = 9, ii = 10; //Int can be cast to double
    // An integer can contain whole numbers whose values lie between -2147483648 and 2147483647.
    //Integer.valueOf() | Integer.parseInt()


    double d = 0.1;
    //Double.valueOf() | Double.parseDouble()

    float f = 20; //Cannot be cast to int
    //Float.valueOf() | Float.parseFloat()

    String s = "String";
    //

    char c = 'c';

    boolean b = true;
    //Can be converted to boolean
    //Boolean.valueOf(string) - returns true/false



    String number = "42";
    int iNumber = Integer.valueOf(number); // or Double.valueOf

//    Integer.parseInt()	                                                                            Integer.valueOf()
//    It can only take a String as a parameter.	                                                        It can take a String as well as an integer as parameter.
//    It returns a primitive int value.	                                                                It returns an Integer object.
//    When an integer is passed as parameter, it produces an error due to incompatible types	        When an integer is passed as parameter, it returns an Integer object corresponding to the given parameter.
//    This method produces an error(incompatible types) when a character is passed as parameter.	    This method can take a character as parameter and will return the corresponding unicode.
//    This lags behind in terms of performance.                                                         This method is likely to yield significantly better space and time performance by caching frequently requested values.
//    If we need the primitive int datatype then Integer.parseInt() method is to be used.	            If Wrapper Integer object is needed then valueOf() method is to be used.
}

/*
1. Local Variables

A variable defined within a block or method or constructor is called a local variable.

    These variables are created when the block is entered, or the function is called and destroyed after exiting from the block or when the call returns from the function.
    The scope of these variables exists only within the block in which the variable is declared. i.e., we can access these variables only within that block.
    Initialization of the local variable is mandatory before using it in the defined scope.

2. Instance Variables

Instance variables are non-static variables and are declared in a class outside any method, constructor, or block.

    As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
    Unlike local variables, we may use access specifier for instance variables. If we do not specify any access specifier, then the default access specifier will be used.
    Initialization of Instance Variable is not Mandatory. Its default value is 0
    Instance Variable can be accessed only by creating objects.

3. Static Variables

Static variables are also known as Class variables.

    These variables are declared similarly as instance variables. The difference is that static variables are declared using the static keyword within a class outside any method constructor or block.
    Unlike instance variables, we can only have one copy of a static variable per class irrespective of how many objects we create.
    Static variables are created at the start of program execution and destroyed automatically when execution ends.
    Initialization of Static Variable is not Mandatory. Its default value is 0
    If we access the static variable like the Instance variable (through an object), the compiler will show the warning message, which won’t halt the program. The compiler will replace the object name with the class name automatically.
    If we access the static variable without the class name, the compiler will automatically append the class name.

Differences between the Instance variable Vs. the Static variables

Now let us do discuss the differences between the Instance variable Vs. the Static variables

    Each object will have its copy of the instance variable, whereas We can only have one copy of a static variable per class irrespective of how many objects we create.
    Changes made in an instance variable using one object will not be reflected in other objects as each object has its own copy of the instance variable. In the case of static, changes will be reflected in other objects as static variables are common to all objects of a class.
    We can access instance variables through object references, and Static Variables can be accessed directly using the class name.

    Creating objects without a constructor
     public static void main(String[] args) {

        // Oppretter objekt med konstruktør
        var ansatt = new Ansatt();

        // Oppretter nye objekter uten konstruktør (clone)
        var atle = (Ansatt)ansatt.clone();
        atle.setNavn("Atle Patle");
        atle.setAlder(32);

        var per = (Ansatt)ansatt.clone();
        per.setNavn("Per Viskelær");
        per.setAlder(30);

        new ObjectOutputStream(new FileOutputStream("ansatt.obj"))
                .writeObject(ansatt);

        // Oppretter nytt objekt uten konstruktør (deserialisering)
        var anne = (Ansatt)new ObjectInputStream(new FileInputStream("ansatt.obj"))
                .readObject();

        anne.setNavn("Anne Ananas");
        anne.setAlder(40);

        // "munged" konstruktør, bruker ikke klassens egne konstruktører
        // Dette eksempelet er ikke avhengig av eksisterende objekter
        var ansattKlasse = ReflectionFactory.getReflectionFactory()
                .newConstructorForSerialization(Ansatt.class);

        var gunnar = (Ansatt)ansattKlasse.newInstance();

        gunnar.setNavn("Gunnar");
        gunnar.setAlder(23);

        Arrays.asList(ansatt, per, atle, anne, gunnar)
                .forEach(System.out::println);

        System.out.println("\nAntall ganger konstruktører ble brukt: " + Ansatt.antallKjorteKonstruktorer);
    }
 */
