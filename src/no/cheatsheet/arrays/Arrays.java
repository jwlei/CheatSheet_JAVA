package no.cheatsheet.arrays;

@SuppressWarnings("MismatchedReadAndWriteOfArray")
public class Arrays {
    public class NormalArray {

    }

    public void MultiDimensionalArray() {

        boolean[][] audp;

        int ANTALL = 8;
        int RADER = 6;

        boolean[][] d111 = new boolean[RADER][ANTALL];

        boolean[][] aud =
                {
                        {false, false, false, false}, // rad 0
                        {false, false, true, false}, // rad 1
                        {true, false, true, true}, // rad 2
                        {true, true, true, true}, // rad 3
                };

        // Read a value
        boolean plass12 = aud[1][2];
        System.out.println(plass12);


        // Print a row
        boolean[] rad0 = new boolean[5];
        for (int p = 0; p < rad0.length; p++) {

            boolean plass = rad0[p];

            if (plass) {
                System.out.print("X");
            } else {
                System.out.print("O");
            }
        }

        // Enhanced for loop
        for (boolean[] rad : aud) {

            for (boolean plass : rad) {

                if (plass) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }

            }
            System.out.println();
        }
    }

    public class ArrayWithMultipleValues {
//        Student[] sTab = new Student[3];
//
//        // Legge inn studenter
//        sTab[0] = new Student(7, "Ole", "Olsen");
//        sTab[1] = new Student(11, "Kari", "Nilsen");
//        sTab[2] = new Student (15, "Nils", "Nilsen");
//
//        // Print all objects
//		for (Student s : sTab) {
//            s.skrivUt();
//        }
    }
}
