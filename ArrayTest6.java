package Arraytest;

public class ArrayTest6 {
//Addition of 2 matrices in java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{2,4,7},{6,7,9}};
		int b[][]={{7,12,75},{66,12,6}};
		
		int c[][]= new int[2][3];
		
		for(int i=0;i<2;i++){
		for(int j=0;j<3;j++){
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
			
		}
		
		System.out.println();
		}
		
	}

}
