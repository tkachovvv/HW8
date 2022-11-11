import java.util.StringJoiner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] array = new int[]{1, 2, 3};
        double[] numbers = new double[]{1.57, 7.654, 9.986};
        printNeatly(array, numbers);
    }

    public static void printNeatly(int[] array, double [] numbers) {
        StringJoiner stringJoiner = new StringJoiner(", ");
        for (int aNum : array)
            stringJoiner.add("" + aNum);
        System.out.print(stringJoiner.toString());
        System.out.println();
        StringJoiner stringJoiner1 = new StringJoiner(", ");
        for (double numAm : numbers)
            stringJoiner1.add("" + numAm);
        System.out.print(stringJoiner1.toString());
    }
        float[] random = new float[]{2.555f, 28.784f, 34.552f, 109.8567f};
}


