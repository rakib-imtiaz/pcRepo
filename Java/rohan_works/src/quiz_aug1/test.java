package quiz_aug1;

public class test {
	
	public static void main(String[] args) {
		
		
		int [][] matrix1= {{1,2},{3,4}};
		
		int [][] matrix2= {{5,6},{7,8}};
		int [][] matrix3= {{10,20,30},{40,50,60}};
		
		subtractMatrix(matrix2,matrix1);

	}

	private static void subtractMatrix(int[][] mat1, int[][] mat2) {
		int rows1 = mat1.length;  
       int  cols1 = mat1[0].length;  
       
       int rows2 = mat2.length;  
       int  cols2 = mat2[0].length;  
       
       if(rows1==rows2 && cols1==cols2)
       {
    	   
    	   int sub[][] = new int[rows1][cols1];  
    	   
           //Performs subtraction of matrices a and b. Store the result in matrix diff  
           for(int i = 0; i < rows1; i++){  
               for(int j = 0; j < cols1; j++){  
                   sub[i][j] = mat1[i][j] - mat2[i][j];  
               }  
           }  
           System.out.println("Subtraction of two matrices: ");  
           for(int i = 0; i < rows1; i++){  
               for(int j = 0; j < cols1; j++){  
                  System.out.print(sub[i][j] + " ");  
               }  
               System.out.println();  
           }  
       }
       else {
    	   
    	   System.out.println("sorry cannot subtract as the dimensoin dont match");
       }
  
       
  
    
		
	}
	
	



}