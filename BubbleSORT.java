/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class BubbleSORT {
    public void bubblesort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSORT bs = new BubbleSORT();
        int arr[] = {10, 15, 2, 6, 8, 5};
        
        System.out.println("Original Array:");
        bs.PrintArray(arr);

        bs.bubblesort(arr);

        System.out.println("Sorted Array:");
        bs.PrintArray(arr);
    }
}
