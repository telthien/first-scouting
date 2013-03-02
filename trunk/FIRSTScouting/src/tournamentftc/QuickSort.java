package tournamentftc;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {

    private static int[] index;

    public static void sort(Double[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(Double[] array, int begin, int end) {

        index = new int[array.length];
        for (int i = 0; i < index.length; i++) {
            index[i] = i + 1;
        }
        if (begin < end) {
            int pivotIndex = (begin + end) / 2;
            int pos = partition(array, begin, end, pivotIndex);
            sort(array, begin, pos - 1);
            sort(array, pos + 1, end);
        }
    }

    public static void sort(ArrayList<Double> array) {
        sort(Arrays.copyOf(array.toArray(), array.toArray().length, Double[].class));
    }

    public static void sort(ArrayList<Double> array, int begin, int end) {
        sort(Arrays.copyOf(array.toArray(), array.toArray().length, Double[].class), begin, end);
    }

    private static void swap(Double[] array, int i, int j) {
        double t = array[i];
        array[i] = array[j];
        array[j] = t;
        int a = index[i];
        index[i] = index[j];
        index[j] = a;
    }

    private static int partition(Double[] a, int left, int right, int pivotIndex) {
        swap(a, pivotIndex, right);
        int pos = left;
        for (int i = left; i < right; i++) {
            if (a[i] < a[right]) {
                swap(a, i, pos);

                pos++;
            }
        }
        swap(a, right, pos);
        return pos;
    }

    public static void main(String[] args) {
        Double[] d = {0.0, 80.0, 80.0, 10.0, 50.0, 70.0, 60.0, 90.0, 20.0, 30.0, 40.0, 0.0};
        System.out.println(Arrays.toString(d));
        sort(d, 0, d.length - 1);
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(index));
    }
}