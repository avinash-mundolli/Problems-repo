import java.util.Arrays;
public class RotateLeftRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // Left rotate
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) arr[i] = arr[i + 1];
        arr[arr.length - 1] = first;
        System.out.println("Left rotate: " + Arrays.toString(arr));
        
        int[] arr1 = {1, 2, 3, 4, 5};
        // Right rotate
        int last = arr1[arr1.length - 1];
        for (int i = arr1.length - 1; i > 0; i--) arr1[i] = arr1[i - 1];
        arr1[0] = last;
        System.out.println("Right rotate: " + Arrays.toString(arr1));
    }
}