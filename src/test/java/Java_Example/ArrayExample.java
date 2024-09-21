package Java_Example;

public class ArrayExample{
	  public static void main(String args[]){
	    //array declaration, instantiation and initialization
	    int number[] = {11, 22, 33, 44, 55};

	    //print array elements
	    //length property return the size of the array
	    for(int i:number) {
	    	System.out.println(i);
	    }
	    
	    
	    
	    
	   
	    int arr[][]={{11,22,33},{44,55,66}};

	    //outer loop 0 till number of rows
	    for(int i=0;i<2;i++){
	      //inner loop from 0 till number of columns
	      for(int j=0;j<3;j++){
	        System.out.print(arr[i][j]+" ");
	      }
	      //new line after each row
	      System.out.println();
	    }
	  }
	
}