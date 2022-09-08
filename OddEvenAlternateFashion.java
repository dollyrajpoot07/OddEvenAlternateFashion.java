// Rearrange Odd and Even values in Alternate Fashion in Ascending Order
// Given an array of integers (both odd and even), the task is to arrange them in such a way that odd and even values come in alternate fashion in non-decreasing order(ascending) respectively. 
// If the smallest value is Even then we have to print Even-Odd pattern.
// If the smallest value is Odd then we have to print Odd-Even pattern.
// Input: arr[] = {1, 3, 2, 5, 4, 7, 10} 
// Output: 1, 2, 3, 4, 5, 10, 7 
// Input: arr[] = {9, 8, 13, 2, 19, 14} 
// Output: 2, 9, 8, 13, 14, 19 

// Java implementation of the above approach

import java.util.* ;

class OddEvenAlternateFashion {

	static void AlternateRearrange(int arr[], int n) {
		Arrays.sort(arr) ;
		
		Vector v1 = new Vector();
		Vector v2 = new Vector();
	
		for (int i = 0; i < n; i++)
			if (arr[i] % 2 == 0)
				v1.add(arr[i]);
			else
				v2.add(arr[i]);
	
		int index = 0, i = 0, j = 0;
	
		boolean flag = false;
	
		if (arr[0] % 2 == 0)
			flag = true;
	
		while (index < n) {
	
			if (flag == true) {
				arr[index] = (int)v1.get(i);
				i += 1 ;
				index += 1 ;
				flag = !flag;
			}
	
			else {
				arr[index] = (int)v2.get(j) ;
				j += 1 ;
				index += 1 ;
				flag = !flag;
			}
		}

		for (i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		AlternateRearrange(arr, n);
        sc.close();
	}
}
