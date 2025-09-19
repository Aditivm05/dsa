class SelectionSORT {

	public void selectionSort(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			int minIndex = i;


			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}


			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public void PrintArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SelectionSORT ss = new SelectionSORT();
		int arr[] = {10, 15, 3, 6, 8, 5};

		System.out.println("Original Array:");
		ss.PrintArray(arr);

		ss.selectionSort(arr);

		System.out.println("Sorted Array:");
		ss.PrintArray(arr);
	}
}
