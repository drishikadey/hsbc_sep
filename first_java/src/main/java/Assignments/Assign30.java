package Assignments;

import java.io.*;
public class Assign30 {

	public static void main(String[] args)throws IOException {
	 BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Enter size");
	int size = Integer.parseInt(stdin.readLine());
	
	 
	 int arr1[][]= new int[size][size];
	 int arr2[][]= new int[size][size];
	 int add[][]= new int[size][size];
	 
	 //input
	 System.out.println("Enter arr 1");
	 int i,j;
     for(i=0;i<size;i++)
     {
    	 for(j=0;j<size;j++)
         {
    		   arr1[i][j]= Integer.parseInt(stdin.readLine());
         }
     }
     System.out.println("Enter arr 2");
     for(i=0;i<size;i++)
     {
    	 for(j=0;j<size;j++)
         {
    		   arr2[i][j]= Integer.parseInt(stdin.readLine());
         }
     }
     //add
     for(i=0;i<size;i++)
     {
    	 for(j=0;j<size;j++)
         {
    		   add[i][j]= arr1[i][j]+arr2[i][j];
         }
     }
     System.out.println("add is");
     for(i=0;i<size;i++)
     {
    	 for(j=0;j<size;j++)
         {
    		   System.out.println(add[i][j]);
         }
     }
  

	}

}