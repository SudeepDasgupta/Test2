package Arraytest;
//Multidimensional java array
public class Arraytest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[][]= new int[3][3];
   int a1[][]={{1,2,4},{1,77,5},{7,8,9}};
   
   for(int i=0;i<3;i++){
	   for(int j=0;j<3;j++){
		   System.out.print(a1[i][j]+" ");
	   }
	   System.out.println();
   }
   
	}

}
