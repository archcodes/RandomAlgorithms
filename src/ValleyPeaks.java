/**
 * Created by archus on 11/3/16.
 */
public class ValleyPeaks {

    public static void main(String[] args) {

        int arr[] = {0,1,1,0,0,6,9};

        System.out.print("Given array: " );
        for(int j = 0; j < arr.length; j++)
            System.out.print(arr[j] + " ");

        System.out.println();

        System.out.print("Sorted Array: ");
        int sortedArr[] = sortArray(arr);
        for(int i = 0; i < sortedArr.length; i++ )
            System.out.print(sortedArr[i] + " ");

        System.out.println();

        System.out.print("Valley Peaks: ");
        int [] output = valleyPeaks(sortedArr);
        for(int j = 0; j < sortedArr.length; j++)
            System.out.print(output[j] + " ");

    }

    private static int[] sortArray(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length-i; j++) {
             int temp;
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] valleyPeaks(int[] arr) {
        int [] output = new int[arr.length];
        int j = 0;
        int k = arr.length-1;
        int i = 0;
            while(j<k) {
                output[i] = arr[j];
                output[i+1] = arr[k];
                j++;
                k--;
                i = i+2;
            }
        if(arr.length % 2 != 0)
            output[i] = arr[j];
        return output;
    }
}
