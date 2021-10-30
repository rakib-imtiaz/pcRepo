package quiz_aug1;

public class test {
	
	public static void main(String[] args) {
		
		
		int [][] matrix1= {{1,2},{3,4}};
		
		int [][] matrix2= {{5,6},{7,8}};
		int [][] matrix3= {{10,20,30},{40,50,60}};
		
		subtractMatrix(matrix2,matrix1);
		subtractMatrix(matrix1,matrix3);

	}

	private static void subtractMatrix(int[][] mat1, int[][] mat2) {
		int a1 = mat1.length;  
       int  b1 = mat1[0].length;  
       
       int a2 = mat2.length;  
       int  b2 = mat2[0].length;  
       
       if(a1==a2 && b1==b2)
       {
    	   
    	   int sub[][] = new int[a1][b1];  
    	   
           for(int i = 0; i < a1; i++){  
               for(int j = 0; j < b1; j++){  
                   sub[i][j] = mat1[i][j] - mat2[i][j];  
               }  
           }  
           System.out.println("Subtraction of two matrices: ");  
           for(int i = 0; i < a1; i++){  
               for(int j = 0; j < b1; j++){  
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
