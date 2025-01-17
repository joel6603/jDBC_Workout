package JavaLearning;
import java.util.Arrays;

public class Variables {
    public static void main (String[] args){
        int a;
        float b= 8.0f;
        int c =0b1110;
        double d =9.56d;

        int[] nArray;
        nArray=new int[10];
        System.out.println("Element at last index :"+ nArray[9]);
        int[] aArray = {1,2,3,4,5,6,7,8,9,10};
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
        System.out.println(names.length);

        //a new method called array copy can be found here
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");

        }
        Arrays.sort(copyTo);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");

        }

    }
}
