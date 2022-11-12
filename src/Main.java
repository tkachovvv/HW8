import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] array = new int[]{1, 2, 3};
        double[] numbers = new double[]{1.57, 7.654, 9.986};
        float[] random = new float[]{2.555f, 28.784f, 34.552f, 109.8567f};
        printNeatly(array, numbers, random);

    }

    public static void printNeatly(int[] array, double[] numbers, float[] random) {
        StringJoiner stringJoiner = new StringJoiner(", ");
        for (int aNum : array)
            stringJoiner.add("" + aNum);
        System.out.print(stringJoiner.toString());
        System.out.println();
        StringJoiner stringJoiner1 = new StringJoiner(", ");
        for (double numAm : numbers)
            stringJoiner1.add("" + numAm);
        System.out.print(stringJoiner1.toString());
        System.out.println();
        StringJoiner stringJoiner2 = new StringJoiner(", ");
        for (float aNum : random)
            stringJoiner2.add("" + aNum);
        System.out.println(stringJoiner2.toString());
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        for (double i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[(int) i] + ", ");
        }
        System.out.println();
        for (float i = random.length - 1; i >= 0; i--) {
            System.out.print(random[(int) i] + ", ");
        }
        System.out.println();
        for (int l = 0; l < stringJoiner.toString().length(); l++) {
            while (l % 2 != 0) {
                l = l + 1;
                System.out.print(l);
            }
        }
    }
}