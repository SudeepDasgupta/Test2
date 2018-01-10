package Arraytest;
//Passing Array to method in java

public class TestArray2 {

	static void min(int arr[]){
		int min=arr[0];
		//System.out.println(min);
		for(int i=1;i<arr.length;i++){
			if(min>arr[i])
				min=arr[i];
					
		}
		System.out.println("min value is "+min); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]={56,5,4,55};
    min(a);
    
	}
}
