package algorithms.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 33, 1, 32, 454, 3, 45, 676, 787, 9, 3, 2, 34, 576};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length-1; j++) {

                System.out.println(arr[j-1]+"--vs--"+arr[j]);
                if (arr[j-1] > arr[j]){
                    int temp;
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
