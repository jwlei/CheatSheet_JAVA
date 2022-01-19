package no.cheatsheet.oop.object;

public class CreatingAnObject {

    public static class Student {
            //Creating student
            private int studentNr;
            private String name;
            private String lastName;

            // Getters and setters
            public int getStudentNr()   {return studentNr;}
            public String getName()     {return name;}
            public String getLastName() {return lastName;}

            public void setStudentNr(int studentNr)     {this.studentNr = studentNr;}
            public void setName(String name)            {this.name = name;}
            public void setLastName(String lastName)    {this.lastName = lastName;}

            public Student() {}

            //Constructor creating a student with studentnr, name and lastname
            public Student(int studentNr, String name, String lastName) {
                this.studentNr = studentNr;
                this.name = name;
                this.lastName = lastName;
            }

            //Creating another instance of student without studentnr
            public Student(String name, String lastName) {
                this(0, name, lastName);
            }

            public void print() {
                System.out.println(studentNr + " " + name + " " + lastName);
            }

        }

    public static void main(String[] args) {
        // Opprette studenter
        Student s1 = new Student();
        s1.setStudentNr(2);
        s1.setName("Ole");
        s1.setLastName("Olsen");
        s1.print();

        Student s2 = new Student(1, "Per", "Karlsen");
        s2.print();

        Student s3 = new Student("Kari", "Nilsen");
        s3.print();

        System.out.println(s1.getName());

    }
}
