public class LargestElementRecursion {
    static int findMax(int[] arr, int index) {
        int len=arr.length-1;
        if (index == len) 
            return arr[index];
        int maxRest = findMax(arr, index + 1);
        return Math.max(arr[index], maxRest);
    }
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        System.out.println("Largest element: " + findMax(arr, 0));
    }
}