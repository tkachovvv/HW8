public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] simpleNumbers = new int[]{1, 2, 3};
        simpleNumbers[0] = 1;
        simpleNumbers[1] = 2;
        simpleNumbers[2] = 3;
        for (int i = 0; i < simpleNumbers.length; i++) {
            System.out.println(simpleNumbers[i]);
        }
        double[] numbers = new double[]{1.57, 7.654, 9.986};
        float[] random = new float[]{2.555f, 28.784f, 34.552f, 109.8567f};
    }
}
