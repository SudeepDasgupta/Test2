package Arraytest;

public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr1 = new double[5];
		double[] arr2 = {1.4,7.7,6.6,7.9};
		
		// Print all the array elements
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i]+" ");
			}
		System.out.println();
		
		// Summing all elements
		double total = 0, total1=0;
		for(int j=0; j<arr2.length; j++){
			total = total+arr2[j];
			total1 +=arr2[j];
			
		}
           System.out.println(total);
           System.out.println(total1);
           
        // Finding the largest element
           double max=arr2[0];
           for(int i=1; i<arr2.length; i++){
        	   if(arr2[i]>max)
        		   max=arr2[i];
           }
           System.out.println("max is: "+max);
	}

}
