package oop.example.example5;

public class EmployeeTest {
	public static void main(String[] args) {
		int[] e0 = {2,4,3,4,5,8,8};
		int[] e1 = {7,3,4,3,3,4,4};
		int[] e2 = {3,3,4,3,3,2,2};
		int[] e3 = {9,3,4,7,3,4,1};
		int[] e4 = {3,5,4,3,6,3,8};
		int[] e5 = {3,4,4,6,3,4,4};
		int[] e6 = {3,7,4,8,3,8,4};
		int[] e7 = {6,3,5,9,2,7,9};

		Employee em0 = new Employee("e0", e0);
		Employee em1 = new Employee("e1", e1);
		Employee em2 = new Employee("e2", e2);
		Employee em3 = new Employee("e3", e3);
		Employee em4 = new Employee("e4", e4);
		Employee em5 = new Employee("e5", e5);
		Employee em6 = new Employee("e6", e6);
		Employee em7 = new Employee("e7", e7);
		
		EmployeeArr[] arr = new EmployeeArr[8];
		
		arr[0] = new EmployeeArr("em0", em0.totalHours());
		arr[1] = new EmployeeArr("em1", em1.totalHours());
		arr[2] = new EmployeeArr("em2", em2.totalHours());
		arr[3] = new EmployeeArr("em3", em3.totalHours());
		arr[4] = new EmployeeArr("em4", em4.totalHours());
		arr[5] = new EmployeeArr("em5", em5.totalHours());
		arr[6] = new EmployeeArr("em6", em6.totalHours());
		arr[7] = new EmployeeArr("em7", em7.totalHours());
		
		//
		EmployeeArr temp;
		for(int i =0; i< arr.length; i++) {
			for(int j =0; j< arr.length - 1; j++ ) {
				if(arr[j].sum < arr[j + 1].sum) {
					
					temp = arr[j+1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
 		
	}
	
}
