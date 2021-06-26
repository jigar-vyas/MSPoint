import java.io.*;
import java.util.*;

class Matrix{
	
	int i, j, k, rowOfMatrixA, colOfMatrixA, rowOfMatrixB, colOfMatrixB, counter=0;
	int[][] matrixA, matrixB;
	boolean flag = false;
	
	Scanner s = new Scanner(System.in);
	
	public Matrix(String choice){
		if(choice.equals("A")){
			System.out.println("\n --------------------------");
			System.out.println("| ADDITION OF TWO MATRICES |");
			System.out.println(" --------------------------");
			System.out.println(" -------------------------------------------------------------");
			System.out.println("| NOTE :- NO. OF ROWs & COLUMNs OF MATRICES ARE MUST BE EQUAL |");
			System.out.println(" -------------------------------------------------------------\n");
		} else if (choice.equals("D")){
			System.out.println("\n ----------------------------");
			System.out.println("| DIFFERENCE OF TWO MATRICES |");
			System.out.println(" ----------------------------");
			System.out.println(" -------------------------------------------------------------");
			System.out.println("| NOTE :- NO. OF ROWs & COLUMNs OF MATRICES ARE MUST BE EQUAL |");
			System.out.println(" -------------------------------------------------------------\n");
		}else if (choice.equals("M")){
			System.out.println("\n --------------------------------");
			System.out.println("| MULTIPLICATION OF TWO MATRICES |");
			System.out.println(" --------------------------------");
			System.out.println(" --------------------------------------------------------------------------------");
			System.out.println("| NOTE :- NO. OF COLUMNs OF MATRIX A & NO. OF ROWs OF MATRIX B ARE MUST BE EQUAL |");
			System.out.println(" --------------------------------------------------------------------------------\n");
		}else if (choice.equals("BJM")){
			System.out.println("\n ------------------------------");
			System.out.println("| BOOLEAN JOIN OF TWO MATRICES |");
			System.out.println(" ------------------------------");
			System.out.println(" -------------------------------------------------------------");
			System.out.println("| NOTE :- NO. OF ROWs & COLUMNs OF MATRICES ARE MUST BE EQUAL |");
			System.out.println(" -------------------------------------------------------------\n");
		}else if (choice.equals("BMM")){
			System.out.println("\n ------------------------------");
			System.out.println("| BOOLEAN MEET OF TWO MATRICES |");
			System.out.println(" ------------------------------");
			System.out.println(" -------------------------------------------------------------");
			System.out.println("| NOTE :- NO. OF ROWs & COLUMNs OF MATRICES ARE MUST BE EQUAL |");
			System.out.println(" -------------------------------------------------------------\n");
		}else if (choice.equals("BPM")){
			System.out.println("\n ---------------------------------");
			System.out.println("| BOOLEAN PRODUCT OF TWO MATRICES |");
			System.out.println(" ---------------------------------");
			System.out.println(" --------------------------------------------------------------------------------");
			System.out.println("| NOTE :- NO. OF COLUMNs OF MATRIX A & NO. OF ROWs OF MATRIX B ARE MUST BE EQUAL |");
			System.out.println(" --------------------------------------------------------------------------------\n");
		}
		
		System.out.print("\nEnter No. of Rows for Matrix A: ");
		try{
			rowOfMatrixA = s.nextInt();
		}catch(Exception e){
			System.out.println("\nEnter Only DIGITS.");
			flag = true;
		}

		if(flag == false){
			System.out.print("Enter No. of Cols for Matrix A: ");
			try{
				colOfMatrixA = s.nextInt();
			}catch(Exception e){
				System.out.println("\nEnter Only DIGITS.");
				flag = true;
			}
			
			if(flag == false){
				System.out.print("\nEnter No. of Rows for Matrix B: ");
				try{
					rowOfMatrixB = s.nextInt();
				}catch(Exception e){
					System.out.println("\nEnter Only DIGITS.");
					flag = true;
				}
				
				if(flag == false){
					System.out.print("Enter No. of Cols for Matrix B: ");
					try{
						colOfMatrixB = s.nextInt();
					}catch(Exception e){
						System.out.println("\nEnter Only DIGITS.");
						flag = true;
					}
				}
			}
		}	
	}
	
	public Matrix(int choice){
		if (choice == 1){
			System.out.println("\n -----------------------------------");
			System.out.println("| MATRIX MULTIPLICATION WITH NUMBER |");
			System.out.println(" -----------------------------------");
		}else if (choice == 2){
			System.out.println("\n ---------------------");
			System.out.println("| TRANSPOSE OF MATRIX |");
			System.out.println(" ---------------------");
		}else if (choice == 3){
			System.out.println("\n -------------------------");
			System.out.println("| UPPER TRIANGULAR MATRIX |");
			System.out.println(" -------------------------");
			System.out.println("--------------------------------------------");
			System.out.println("NOTE :- THE MATRIX IS MUST BE SQUARE MATRIX.");
			System.out.println("--------------------------------------------\n");
		}else if (choice == 4){
			System.out.println("\n -------------------------");
			System.out.println("| LOWER TRIANGULAR MATRIX |");
			System.out.println(" -------------------------");
			System.out.println("--------------------------------------------");
			System.out.println("NOTE :- THE MATRIX IS MUST BE SQUARE MATRIX.");
			System.out.println("--------------------------------------------\n");
		}else if (choice == 5){
			System.out.println("\n -----------------");
			System.out.println("| DIAGONAL MATRIX |");
			System.out.println(" -----------------");
			System.out.println("--------------------------------------------");
			System.out.println("NOTE :- THE MATRIX IS MUST BE SQUARE MATRIX.");
			System.out.println("--------------------------------------------\n");
		}else if (choice == 6){
			System.out.println("\n -----------------");
			System.out.println("| IDENTITY MATRIX |");
			System.out.println(" -----------------");
			System.out.println("--------------------------------------------");
			System.out.println("NOTE :- THE MATRIX IS MUST BE SQUARE MATRIX.");
			System.out.println("--------------------------------------------\n");
		}else if (choice == 7){
			System.out.println("\n ------------------");
			System.out.println("| SYMMETRIC MATRIX |");
			System.out.println(" ------------------");
			System.out.println("--------------------------------------------");
			System.out.println("NOTE :- THE MATRIX IS MUST BE SQUARE MATRIX.");
			System.out.println("--------------------------------------------\n");
		}else if (choice == 8){
			System.out.println("\n ---------------");
			System.out.println("| SPARSE MATRIX |");
			System.out.println(" ---------------");
		}else if (choice == 9){
			System.out.println("\n ----------------");
			System.out.println("| BOOLEAN MATRIX |");
			System.out.println(" ----------------");
		}
	
		System.out.print("\nEnter No. of Rows for Matrix A: ");
		try{
			rowOfMatrixA = s.nextInt();
		}catch(Exception e){
			System.out.println("\nEnter Only DIGITS.");
			flag = true;
		}

		if(flag == false){
			System.out.print("Enter No. of Cols for Matrix A: ");
			try{
				colOfMatrixA = s.nextInt();
			}catch(Exception e){
				System.out.println("\nEnter Only DIGITS.");
				flag = true;
			}
		}
		matrixA = new int[rowOfMatrixA][colOfMatrixA];
	}
}

class AdditionOfMatrices extends Matrix{
	
	public AdditionOfMatrices(){
		super("A");
		if(flag == false)
			getMatrices();
	}
	
	public void getMatrices(){
		
		if((rowOfMatrixA==rowOfMatrixB) && (colOfMatrixA==colOfMatrixB)){
			
			matrixA = new int[rowOfMatrixA][colOfMatrixA];
			matrixB = new int[rowOfMatrixB][colOfMatrixB];
			
			System.out.println("\nEnter Elements of Matrix A:");
			LoopForGetElement:
			for(i=0; i<rowOfMatrixA; i++){
				for(j=0; j<colOfMatrixA; j++){
					try{
						matrixA[i][j] = s.nextInt();
					}catch(Exception e){
						System.out.println("\nEnter Only DIGITS.");
						flag = true;
						break LoopForGetElement;
					}
				}
			}
			if(flag == false){
				System.out.println("\nEnter Elements of Matrix B:");
				LoopForGetElement:
				for(i=0; i<rowOfMatrixB; i++){
					for(j=0; j<colOfMatrixB; j++){
						try{
							matrixB[i][j] = s.nextInt();
						}catch(Exception e){
							System.out.println("\nEnter Only DIGITS.");
							flag = true;
							break LoopForGetElement;
						}
					}
				}
				if(flag == false)
					displayMatrices();
			}		
		} else {
			System.out.print("\nNo. of Rows and No. of Columns of Matrix A & B are Must be Equal.\n");
			System.out.println("Because Addition of Matrices is Possible Only if No. of Rows and No. of Columns of Matrix A & B are Equal.");
		}
	}
	
	public void displayMatrices(){
		System.out.print("\nMatrix A:\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				System.out.print(matrixA[i][j] + "\t");
			}
			System.out.println();
		}
				
		System.out.print("\nMatrix B:\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				System.out.print(matrixB[i][j] + "\t");
			}
			System.out.println();
		}
		
		additionOfMatrices();
	}
	
	public void additionOfMatrices(){
		System.out.print("\nAddition of Matrices A & B/(A + B):\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				System.out.print((matrixA[i][j] + matrixB[i][j])+ "\t");
			}
			System.out.println();
		}
	}
	
}

class DifferenceOfMatrices extends Matrix{
	
	public DifferenceOfMatrices(){
		super("D");
		if(flag == false)
			getMatrices();
	}
	
	public void getMatrices(){
		
		if((rowOfMatrixA==rowOfMatrixB) && (colOfMatrixA==colOfMatrixB)){
			
			matrixA = new int[rowOfMatrixA][colOfMatrixA];
			matrixB = new int[rowOfMatrixB][colOfMatrixB];
			
			System.out.println("\nEnter Elements of Matrix A:");
			LoopForGetElement:
			for(i=0; i<rowOfMatrixA; i++){
				for(j=0; j<colOfMatrixA; j++){
					try{
						matrixA[i][j] = s.nextInt();
					}catch(Exception e){
						System.out.println("\nEnter Only DIGITS.");
						flag = true;
						break LoopForGetElement;
					}
				}
			}
			if(flag == false){
				System.out.println("\nEnter Elements of Matrix B:");
				LoopForGetElement:
				for(i=0; i<rowOfMatrixB; i++){
					for(j=0; j<colOfMatrixB; j++){
						try{
							matrixB[i][j] = s.nextInt();
						}catch(Exception e){
							System.out.println("\nEnter Only DIGITS.");
							flag = true;
							break LoopForGetElement;
						}
					}
				}
				if(flag == false)
					displayMatrices();
			}		
		} else {
			System.out.print("\nNo. Rows and No. Columns of Matrix A & B are Must be Equal.\n");
			System.out.println("Because Difference of Matrices is Possible Only if No. Rows and No. of Columns of Matrix A & B are Equal.");
		}
	}
	
	public void displayMatrices(){
		System.out.print("\nMatrix A:\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				System.out.print(matrixA[i][j] + "\t");
			}
			System.out.println();
		}
			
		System.out.println("\nMatrix B:\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				System.out.print(matrixB[i][j] + "\t");
			}
			System.out.println();
		}
		
		differenceOfMatrices();
		
	}
	
	public void differenceOfMatrices(){
		System.out.print("\nDifference of Matrices A & B/(A - B):\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				System.out.print((matrixA[i][j] - matrixB[i][j]) + "\t");
			}
			System.out.println();
		}
	}
	
}

class MultiplicationOfMatrices extends Matrix{
	
	int r=0, c=0;
	int[][] mulA_B;
	
	public MultiplicationOfMatrices(){
		super("M");
		if(flag == false)
			getMatrices();
	}
	
	public void getMatrices(){
		if(colOfMatrixA == rowOfMatrixB){
			
			matrixA = new int[rowOfMatrixA][colOfMatrixA];
			matrixB = new int[rowOfMatrixB][colOfMatrixB];
			mulA_B = new int[rowOfMatrixA][colOfMatrixB];
			
			System.out.println("\nEnter Elements of Matrix A:");
			LoopForGetElement:
			for(i=0; i<rowOfMatrixA; i++){
				for(j=0; j<colOfMatrixA; j++){
					try{
						matrixA[i][j] = s.nextInt();
					}catch(Exception e){
						System.out.println("\nEnter Only DIGITS.");
						flag = true;
						break LoopForGetElement;
					}
				}
			}
			if(flag == false){
				System.out.println("\nEnter Elements of Matrix B:");
				LoopForGetElement:
				for(i=0; i<rowOfMatrixB; i++){
					for(j=0; j<colOfMatrixB; j++){
						try{
							matrixB[i][j] = s.nextInt();
						}catch(Exception e){
							System.out.println("\nEnter Only DIGITS.");
							flag = true;
							break LoopForGetElement;
						}
					}
				}
				if(flag == false)
					displayMatrices();
			}		
		} else {
			System.out.print("\nNo. of Columns of Matrix A & No. of Rows of Matrix B are Must be Equal.\n");
			System.out.println("Because Multiplication of Matrices is Possible Only if No. of Columns of Matrix A & No. of Rows of Matrix B are Equal.");
		}
	}
	
	public void displayMatrices(){
		System.out.print("\nMatrix A:\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				System.out.print(matrixA[i][j] + "\t");
			}
			System.out.println();
		}
			
		System.out.print("\nMatrix B:\n");
		for(i=0; i<rowOfMatrixB; i++){
			for(j=0; j<colOfMatrixB; j++){
				System.out.print(matrixB[i][j] + "\t");
			}
			System.out.println();
		}
		
		multiplicationOfMatrices();	
	}
	
	public void multiplicationOfMatrices(){
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixB; j++){
				for(k=0; k<colOfMatrixA; k++){
					mulA_B[r][c] = mulA_B[r][c] + matrixA[i][k] * matrixB[k][j];
				}
				c++;
			}
			r++;
			c=0;
		}
		System.out.print("\nMultiplication of Matrices A & B/(A * B) :\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixB; j++){
				System.out.print(mulA_B[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

class MatrixMultiplicationWithNumber extends Matrix{
	
	int numberForMultiplication;
	
	public MatrixMultiplicationWithNumber(){
		super(1);
		if(flag == false)
			getMatrix();
	}
	
	public void getMatrix(){
		
		matrixA = new int[rowOfMatrixA][colOfMatrixA];
		
		System.out.println("\nEnter Elements of Matrix A:");
		LoopForGetElement:
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				try{
					matrixA[i][j] = s.nextInt();
				}catch(Exception e){
					System.out.println("\nEnter Only DIGITS.");
					flag = true;
					break LoopForGetElement;
				}
			}
		}
		
		if(flag == false){
			displayMatrix();
		}
	}
	
	public void displayMatrix(){
		System.out.print("\nMatrix A:\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				System.out.print(matrixA[i][j] + "\t");
			}
			System.out.println();
		}
		matrixMultiplicationWithNumber();
	}
	
	public void matrixMultiplicationWithNumber(){
		System.out.print("\nEnter No. for Multiplication of Matrix: ");
		try{
			numberForMultiplication = s.nextInt();
		}catch(Exception e){
			System.out.println("\nEnter Only DIGITS.");
			flag = true;
		}
		if(flag == false){
			System.out.print("\nMultiplication of Matrix A with " +numberForMultiplication+ ":\n");
			for(i=0; i<rowOfMatrixA; i++){
				for(j=0; j<colOfMatrixA; j++){
					System.out.print((matrixA[i][j] * numberForMultiplication) + "\t");
				}
				System.out.println();
			}
		}
	}
}

class TransposeOfMatrix extends Matrix{
	
	int r=0, c=0;
	int[][] transposeOfA; 
	
	public TransposeOfMatrix(){
		super(2);
		if(flag == false)
			getMatrix();
	}
	
	public void getMatrix(){
		
		matrixA = new int[rowOfMatrixA][colOfMatrixA];
		transposeOfA = new int[colOfMatrixA][rowOfMatrixA];
		
		System.out.println("\nEnter Elements of Matrix A:");
		LoopForGetElement:
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				try{
					matrixA[i][j] = s.nextInt();
				}catch(Exception e){
					System.out.println("\nEnter Only DIGITS.");
					flag = true;
					break LoopForGetElement;
				}
			}
		}
		
		if(flag == false){
			displayMatrix();
		}
	}
	
	public void displayMatrix(){
		System.out.print("\nMatrix A:\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				System.out.print(matrixA[i][j] + "\t");
			}
			System.out.println();
		}
		transposeOfMatrix();
	}
	
	public void transposeOfMatrix(){
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				transposeOfA[r][c] = matrixA[i][j];
				r++;
			}
			c++;
			r=0;
		}
		System.out.print("\nTranspose of Matrix A:\n");
		for(i=0; i<colOfMatrixA; i++){
			for(j=0; j<rowOfMatrixA; j++){
				System.out.print(transposeOfA[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

class UpperTriangularMatrix extends Matrix{ 
	
	public UpperTriangularMatrix(){
		super(3);
		if(flag == false)
			getMatrix();
	}
	
	public void getMatrix(){
		if(rowOfMatrixA == colOfMatrixA){
			
			matrixA = new int[rowOfMatrixA][colOfMatrixA];
			
			System.out.println("\nEnter Elements of Matrix A:");
			LoopForGetElement:
			for(i=0; i<rowOfMatrixA; i++){
				for(j=0; j<colOfMatrixA; j++){
					try{
						matrixA[i][j] = s.nextInt();
					}catch(Exception e){
						System.out.println("\nEnter Only DIGITS.");
						flag = true;
						break LoopForGetElement;
					}
				}
			}
			
			if(flag == false){
				displayMatrix();
			}
		} else {
			System.out.println("\nNo. of Rows & No. of Colunms are Must be Equal.");
			System.out.println("\nTo Check Matrix A is Upper Trianguler Matrix or Not, Its Must be a Square Matrix.");
		}
	}
	
	public void displayMatrix(){
		System.out.print("\nMatrix A:\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				System.out.print(matrixA[i][j] + "\t");
			}
			System.out.println();
		}
		upperTriangularMatrix();
	}
	
	public void upperTriangularMatrix(){
		LoopForUpperTriangulerMatrix:
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				if(i > j){
				    if(matrixA[i][j] == 0){
						counter=0;
					} else {
						counter++;
					}
				}
				if(counter > 0){
					break LoopForUpperTriangulerMatrix;
				}
			}
		}
		if(counter == 0){
			System.out.print("\nMATRIX A IS A UPPER TRIANGULAR MATRIX.\n");
		}else{
			System.out.print("\nMATRIX A IS NOT A UPPER TRIANGULAR MATRIX.\n");
		}
	}
}

class LowerTriangularMatrix extends Matrix{ 
	
	public LowerTriangularMatrix(){
		super(4);
		if(flag == false)
			getMatrix();
	}
	
	public void getMatrix(){
		if(rowOfMatrixA == colOfMatrixA){
			
			matrixA = new int[rowOfMatrixA][colOfMatrixA];
			
			System.out.println("\nEnter Elements of Matrix A:");
			LoopForGetElement:
			for(i=0; i<rowOfMatrixA; i++){
				for(j=0; j<colOfMatrixA; j++){
					try{
						matrixA[i][j] = s.nextInt();
					}catch(Exception e){
						System.out.println("\nEnter Only DIGITS.");
						flag = true;
						break LoopForGetElement;
					}
				}
			}
			
			if(flag == false){
				displayMatrix();
			}
		} else {
			System.out.println("\nNo. of Rows & No. of Colunms are Must be Equal.");
			System.out.println("\nTo Check Matrix A is Lower Trianguler Matrix or Not, Its Must be a Square Matrix.");
		}
	}
	
	public void displayMatrix(){
		System.out.print("\nMatrix A:\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				System.out.print(matrixA[i][j] + "\t");
			}
			System.out.println();
		}
		lowerTriangularMatrix();
	}
	
	public void lowerTriangularMatrix(){
		LoopForLowerTriangulerMatrix:
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				if(i < j){
				    if(matrixA[i][j] == 0){
						counter=0;
					} else {
						counter++;
					}
				}
				if(counter > 0){
					break LoopForLowerTriangulerMatrix;
				}
			}
		}
		if(counter == 0){
			System.out.print("\nMATRIX A IS A LOWER TRIANGULAR MATRIX.\n");
		}else{
			System.out.print("\nMATRIX A IS NOT A LOWER TRIANGULAR MATRIX.\n");
		}
	}
}

class DiagonalMatrix extends Matrix{ 
	
	public DiagonalMatrix(){
		super(5);
		if(flag == false)
			getMatrix();
	}
	
	public void getMatrix(){
		if(rowOfMatrixA == colOfMatrixA){
			
			matrixA = new int[rowOfMatrixA][colOfMatrixA];
			
			System.out.println("\nEnter Elements of Matrix A:");
			LoopForGetElement:
			for(i=0; i<rowOfMatrixA; i++){
				for(j=0; j<colOfMatrixA; j++){
					try{
						matrixA[i][j] = s.nextInt();
					}catch(Exception e){
						System.out.println("\nEnter Only DIGITS.");
						flag = true;
						break LoopForGetElement;
					}
				}
			}
			
			if(flag == false){
				displayMatrix();
			}
		} else {
			System.out.println("\nNo. of Rows & No. of Colunms are Must be Equal.");
			System.out.println("\nTo Check Matrix A is Diagonal Matrix or Not, Its Must be a Square Matrix.");
		}
	}
	
	public void displayMatrix(){
		System.out.print("\nMatrix A:\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				System.out.print(matrixA[i][j] + "\t");
			}
			System.out.println();
		}
		diagonalMatrix();
	}
	
	public void diagonalMatrix(){
		LoopForDiagonalMatrix:
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				if((i < j) || (i > j)){
				    if(matrixA[i][j] == 0){
						counter=0;
					} else {
						counter++;
					}
				}
				if(counter > 0){
					break LoopForDiagonalMatrix;
				}
			}
			/*for(j=0; j<colOfMatrixA; j++){
				if(i > j){
				    if(matrixA[i][j] == 0){
						counter=0;
					} else {
						counter++;
					}
				}
				if(counter > 0){
					break LoopForDiagonalMatrix;
				}
			}*/
			
		}
		if(counter == 0){
			System.out.print("\nMATRIX A IS A DIAGONAL MATRIX.\n");
		}else{
			System.out.print("\nMATRIX A IS NOT A DIAGONAL MATRIX.\n");
		}
	}
}

class IdentityMatrix extends Matrix{ 
	
	public IdentityMatrix(){
		super(6);
		if(flag == false)
			getMatrix();
	}
	
	public void getMatrix(){
		if(rowOfMatrixA == colOfMatrixA){
			
			matrixA = new int[rowOfMatrixA][colOfMatrixA];
			
			System.out.println("\nEnter Elements of Matrix A:");
			LoopForGetElement:
			for(i=0; i<rowOfMatrixA; i++){
				for(j=0; j<colOfMatrixA; j++){
					try{
						matrixA[i][j] = s.nextInt();
					}catch(Exception e){
						System.out.println("\nEnter Only DIGITS.");
						flag = true;
						break LoopForGetElement;
					}
				}
			}
			
			if(flag == false){
				displayMatrix();
			}
		} else {
			System.out.println("\nNo. of Rows & No. of Colunms are Must be Equal.");
			System.out.println("\nTo Check Matrix A is Identity Matrix or Not, Its Must be a Square Matrix.");
		}
	}
	
	public void displayMatrix(){
		System.out.print("\nMatrix A:\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				System.out.print(matrixA[i][j] + "\t");
			}
			System.out.println();
		}
		identityMatrix();
	}
	
	public void identityMatrix(){
		LoopForIdentityMatrix:
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				if((i < j) || (i > j) || (i == j)){
				    if(matrixA[i][j] == 0){
						counter=0;
					} else if(i == j){
						if(matrixA[i][j] == 1){
							counter=0;
						}else{ 
							counter++;
						}
						
						if(counter > 0){
							break LoopForIdentityMatrix;
						}
					} else {
						counter++;
					}
				}
				if(counter > 0){
					break LoopForIdentityMatrix;
				}
			}
		}
		if(counter == 0){
			System.out.print("\nMATRIX A IS A IDENTITY MATRIX.\n");
		}else{
			System.out.print("\nMATRIX A IS NOT A IDENTITY MATRIX.\n");
		}
	}
}

class SymmetricMatrix extends Matrix{ 
	
	int r=0, c=0;
	int[][] AT;
	
	public SymmetricMatrix(){
		super(7);
		if(flag == false)
			getMatrix();
	}
	
	public void getMatrix(){
		if(rowOfMatrixA == colOfMatrixA){
			
			matrixA = new int[rowOfMatrixA][colOfMatrixA];
			AT = new int[rowOfMatrixA][colOfMatrixA];
			
			System.out.println("\nEnter Elements of Matrix A:");
			LoopForGetElement:
			for(i=0; i<rowOfMatrixA; i++){
				for(j=0; j<colOfMatrixA; j++){
					try{
						matrixA[i][j] = s.nextInt();
					}catch(Exception e){
						System.out.println("\nEnter Only DIGITS.");
						flag = true;
						break LoopForGetElement;
					}
				}
			}
			
			if(flag == false){
				displayMatrix();
			}
		} else {
			System.out.println("\nNo. of Rows & No. Colunms are Must be Equal.");
			System.out.println("\nTo Check Matrix A is Symmetric Matrix or Not, Its Must be a Square Matrix.");
		}
	}
	
	public void displayMatrix(){
		System.out.print("\nMatrix A:\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				System.out.print(matrixA[i][j] + "\t");
			}
			System.out.println();
		}
		symmetricMatrix();
	}
	
	public void symmetricMatrix(){
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				AT[r][c] = matrixA[i][j];
				r++;
			}
			c++;
			r=0;
		}
		System.out.print("\nTranspose of Matrix A:\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				System.out.print(AT[i][j] + "\t");
			}
			System.out.println();
		}
		
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				if(AT[i][j] == matrixA[i][j]){
					counter++;
				}	
			}
		}
		if(counter == (colOfMatrixA*colOfMatrixA)){
			System.out.print("\nHERE, A = A'. \n");
			System.out.print("\nSO, MATRIX A IS A SYMMETRIC MATRIX.\n");
		}else{
			System.out.print("\nHERE, A IS NOT EQUALS TO A'. \n");
			System.out.print("\nSO, MATRIX A IS NOT A SYMMETRIC MATRIX.\n");
		}
	}
}

class SparseMatrix extends Matrix{
	
	int countZero=0, countNonZero=0;
	
	public SparseMatrix(){
		super(8);
		if(flag == false)
			getMatrix();
	}
	
	public void getMatrix(){
		
		matrixA = new int[rowOfMatrixA][colOfMatrixA];
			
		System.out.println("\nEnter Elements of Matrix A:");
		LoopForGetElement:
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				try{
					matrixA[i][j] = s.nextInt();
				} catch(Exception e){
					System.out.println("\nEnter Only DIGITS.");
					flag = true;
					break LoopForGetElement;
				}
			}
		}

		if(flag == false){
			displayMatrix();
		}
	}
	
	public void displayMatrix(){
		System.out.print("\nMatrix A:\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				System.out.print(matrixA[i][j] + "\t");
			}
			System.out.println();
		}
		sparseMatrix();
	}
	
	public void sparseMatrix(){
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				if(matrixA[i][j] == 0){
					countZero++; 
				} else {
					countNonZero++;	
				}
			}
		}
		if(countZero > countNonZero){
			System.out.print("\nMATRIX A IS SPARSE MATRIX.\n");
		} else {
			System.out.print("\nMATRIX A IS NOT A SPARSE MATRIX.\n");
		}
	}
}

class BooleanMatrix extends Matrix{
	
	public BooleanMatrix(){
		super(9);
		if(flag == false)
			getMatrix();
	}
	
	public void getMatrix(){
		
		matrixA = new int[rowOfMatrixA][colOfMatrixA];
			
		System.out.println("\nEnter Elements of Matrix A:");
		LoopForGetElement:
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				try{
					matrixA[i][j] = s.nextInt();
				}catch(Exception e){
					System.out.println("\nEnter Only DIGITS.");
					flag = true;
					break LoopForGetElement;
				}
			}
		}
		
		if(flag == false){
			displayMatrix();
		}
	}
	
	public void displayMatrix(){
		System.out.print("\nMatrix A:\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				System.out.print(matrixA[i][j] + "\t");
			}
			System.out.println();
		}
		booleanMatrix();
	}
	
	public void booleanMatrix(){
		LoopForBooleanMatrix:
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				if(matrixA[i][j] == 0 || matrixA[i][j] == 1){
					counter=0; 
				} else{
					counter++;
				}
				if(counter > 0){
					break LoopForBooleanMatrix;
				}
			}
		}
		if(counter == 0){
			System.out.print("\nMATRIX A IS BOOLEAN MATRIX.\n");
		} else {
			System.out.print("\nMATRIX A IS NOT A BOOLEAN MATRIX.\n");
		}
	}
}

class BooleanJoinOfMatrices extends Matrix{
	
	int elementOfJoin;
	boolean elementOfA, elementOfB;
	
	public BooleanJoinOfMatrices(){
		super("BJM");
		if(flag == false)
			getMatrices();
	}
	
	public void getMatrices(){
		
		matrixA = new int[rowOfMatrixA][colOfMatrixA];
		matrixB = new int[rowOfMatrixB][colOfMatrixB];
			
		if((rowOfMatrixA == rowOfMatrixB) && (colOfMatrixA == colOfMatrixB)){
			
			System.out.println("\nEnter Elements of Matrix A:");
			LoopForGetElement:
			for(i=0; i<rowOfMatrixA; i++){
				for(j=0; j<colOfMatrixA; j++){
					try{
						matrixA[i][j] = s.nextInt();
					}catch(Exception e){
						System.out.println("\nEnter Only DIGITS.");
						flag = true;
						break LoopForGetElement;
					}
				}
			}
			if(flag == false){
				System.out.println("\nEnter Elements of Matrix B:");
				LoopForGetElement:
				for(i=0; i<rowOfMatrixB; i++){
					for(j=0; j<colOfMatrixB; j++){
						try{
							matrixB[i][j] = s.nextInt();
						}catch(Exception e){
							System.out.println("\nEnter Only DIGITS.");
							flag = true;
							break LoopForGetElement;
						}
					}
				}
				if(flag == false)
					displayMatrices();
			}		
		} else {
			System.out.println("\nNo. Rows and No. of Columns of Matrix A & B are Must be Equal.");
			System.out.println("Because Boolean Join of Matrices is Possible Only if No. of Rows and No. of Columns of Matrix A & B are Equal.");
		}
	}
	
	public void displayMatrices(){
		LoopForBooleanMatrix:
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				if((matrixA[i][j] == 0 || matrixA[i][j] == 1) && (matrixB[i][j] == 0 || matrixB[i][j] == 1)){
					counter=0; 
				} else{
					counter++;
				}
				if(counter > 0){
					System.out.println("\nEntered is not boolean Matrix because Element of Boolean Matrix Either 0 or 1.");
					System.out.println("Entered Matrix is not Boolean Matrix. So, We Can't Perform Boolean Join.");
					break LoopForBooleanMatrix;
				} 
			}
		}
		if(counter == 0) {
			System.out.print("\nMatrix A:\n");
			for(i=0; i<rowOfMatrixA; i++){
				for(j=0; j<colOfMatrixA; j++){
					System.out.print(matrixA[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.print("\nMatrix B:\n");
			for(i=0; i<rowOfMatrixB; i++){
				for(j=0; j<colOfMatrixB; j++){
					System.out.print(matrixB[i][j] + "\t");
				}
				System.out.println();
			}	
			booleanJoinOfMatrices();
		}
	}
	
	public void booleanJoinOfMatrices(){
		System.out.println("\nBoolean join of Matrices A & B:");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				
				if(matrixA[i][j] == 0){
					elementOfA = false;
				} else {
					elementOfA = true;
				}
				
				if(matrixB[i][j] == 0){
					elementOfB = false;
				} else {
					elementOfB = true;
				}
				
				if((elementOfA || elementOfB)){
					elementOfJoin = 1;
				} else {
					elementOfJoin = 0;
				}
				System.out.print(elementOfJoin + "\t");
			}
			System.out.println();
		}
	}
}

class BooleanMeetOfMatrices extends Matrix{
	
	int elementOfMeet;
	boolean elementOfA, elementOfB;
	
	public BooleanMeetOfMatrices(){
		super("BMM");
		if(flag == false)
			getMatrices();
	}
	
	public void getMatrices(){
		
		matrixA = new int[rowOfMatrixA][colOfMatrixA];
		matrixB = new int[rowOfMatrixB][colOfMatrixB];
			
		if((rowOfMatrixA == rowOfMatrixB) && (colOfMatrixA == colOfMatrixB)){
			
			System.out.println("\nEnter Elements of Matrix A:");
			LoopForGetElement:
			for(i=0; i<rowOfMatrixA; i++){
				for(j=0; j<colOfMatrixA; j++){
					try{
						matrixA[i][j] = s.nextInt();
					}catch(Exception e){
						System.out.println("\nEnter Only DIGITS.");
						flag = true;
						break LoopForGetElement;
					}
				}
			}
			if(flag == false){
				System.out.println("\nEnter Elements of Matrix B:");
				LoopForGetElement:
				for(i=0; i<rowOfMatrixB; i++){
					for(j=0; j<colOfMatrixB; j++){
						try{
							matrixB[i][j] = s.nextInt();
						}catch(Exception e){
							System.out.println("\nEnter Only DIGITS.");
							flag = true;
							break LoopForGetElement;
						}
					}
				}
				if(flag == false)
					displayMatrices();
			}		
		} else {
			System.out.println("\nNo. Rows and No. of Columns of Matrix A & B are Must be Equal.");
			System.out.println("Because Boolean Meet of Matrices is Possible Only if No. of Rows and No. of Columns of Matrix A & B are Equal.");
		}
	}
	
	public void displayMatrices(){
		LoopForBooleanMatrix:
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				if((matrixA[i][j] == 0 || matrixA[i][j] == 1) && (matrixB[i][j] == 0 || matrixB[i][j] == 1)){
					counter=0; 
				} else{
					counter++;
				}
				if(counter > 0){
					System.out.println("\nEntered is not boolean Matrix because Element of Boolean Matrix Either 0 or 1.");
					System.out.println("Entered Matrix is not Boolean Matrix. So, We Can't Perform Boolean Meet.");
					break LoopForBooleanMatrix;
				} 
			}
		}
		if(counter == 0) {
			System.out.print("\nMatrix A:\n");
			for(i=0; i<rowOfMatrixA; i++){
				for(j=0; j<colOfMatrixA; j++){
					System.out.print(matrixA[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.print("\nMatrix B:\n");
			for(i=0; i<rowOfMatrixB; i++){
				for(j=0; j<colOfMatrixB; j++){
					System.out.print(matrixB[i][j] + "\t");
				}
				System.out.println();
			}	
			booleanMeetOfMatrices();
		}
	}
	
	public void booleanMeetOfMatrices(){
		System.out.println("\nBoolean Meet of Matrices A & B:");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				
				if(matrixA[i][j] == 0){
					elementOfA = false;
				} else {
					elementOfA = true;
				}
				
				if(matrixB[i][j] == 0){
					elementOfB = false;
				} else {
					elementOfB = true;
				}
				
				if((elementOfA && elementOfB)){
					elementOfMeet = 1;
				} else {
					elementOfMeet = 0;
				}
				System.out.print(elementOfMeet + "\t");
			}
			System.out.println();
		}
	}
}

class BooleanProductOfMatrices extends Matrix{
	
	int elementOfProduct, r=0, c=0;
	boolean elementOfA, elementOfB, elementOfBoolProduct;
	int[][] mulBoolMatA_B;
	
	public BooleanProductOfMatrices(){
		super("BPM");
		if(flag == false)
			getMatrices();
	}
	
	public void getMatrices(){
		if((colOfMatrixA==rowOfMatrixB) || (colOfMatrixA==rowOfMatrixB)){
			
			matrixA = new int[rowOfMatrixA][colOfMatrixA];
			matrixB = new int[rowOfMatrixB][colOfMatrixB];
			mulBoolMatA_B = new int[rowOfMatrixA][colOfMatrixB];
			
			System.out.println("\nEnter Elements of Matrix A:");
			LoopForGetElement:
			for(i=0; i<rowOfMatrixA; i++){
				for(j=0; j<colOfMatrixA; j++){
					try{
						matrixA[i][j] = s.nextInt();
					}catch(Exception e){
						System.out.println("\nEnter Only DIGITS.");
						flag = true;
						break LoopForGetElement;
					}
				}
			}
			if(flag == false){
				System.out.println("\nEnter Elements of Matrix B:");
				LoopForGetElement:
				for(i=0; i<rowOfMatrixB; i++){
					for(j=0; j<colOfMatrixB; j++){
						try{
							matrixB[i][j] = s.nextInt();
						}catch(Exception e){
							System.out.println("\nEnter Only DIGITS.");
							flag = true;
							break LoopForGetElement;
						}
					}
				}
				if(flag == false)
					displayMatrices();
			}			
		} else {
			System.out.print("\nNo. of Columns of Matrix A & No. of Rows of Matrix B are Must be Equal.\n");
			System.out.println("Because Boolean product of Matrices is Possible Only if No. of Columns of Matrix A & Rows of Matrix B are must be Equal.");
		}
	}
	
	public void displayMatrices(){
		LoopForBooleanMatrix1:
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixA; j++){
				if((matrixA[i][j] == 0 || matrixA[i][j] == 1)){
					counter=0; 
				} else{
					counter++;
				}
				if(counter > 0){
					System.out.println("\nEntered Matrix A is not boolean Matrix because Element of Boolean Matrix Either 0 or 1.");
					System.out.println("Entered Matrix A is not Boolean Matrix. So, We Can't Perform Boolean Product.");
					break LoopForBooleanMatrix1;
				} 
			}
		}
		LoopForBooleanMatrix2:
		for(i=0; i<rowOfMatrixB; i++){
			for(j=0; j<colOfMatrixB; j++){
				if((matrixB[i][j] == 0 || matrixB[i][j] == 1)){
					counter=0; 
				} else{
					counter++;
				}
				if(counter > 0){
					System.out.println("\nEntered Matrix B is not boolean Matrix because Element of Boolean Matrix Either 0 or 1.");
					System.out.println("Entered Matrix B is not Boolean Matrix. So, We Can't Perform Boolean Product.");
					break LoopForBooleanMatrix2;
				} 
			}
		}
		if(counter == 0) {
			System.out.print("\nMatrix A:\n");
			for(i=0; i<rowOfMatrixA; i++){
				for(j=0; j<colOfMatrixA; j++){
					System.out.print(matrixA[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.print("\nMatrix B:\n");
			for(i=0; i<rowOfMatrixB; i++){
				for(j=0; j<colOfMatrixB; j++){
					System.out.print(matrixB[i][j] + "\t");
				}
				System.out.println();
			}	
			BooleanProductOfMatrices();
		}
	}
	
	public void BooleanProductOfMatrices(){
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixB; j++){
				for(k=0; k<colOfMatrixA; k++){
					if(i == 0 && k == 0){
						if(matrixA[i][k] == 0){
							elementOfA = false;
						} else {
							elementOfA = true;
						}
						
						if(matrixB[k][j] == 0){
							elementOfB = false;
						} else {
							elementOfB = true;
						}
						
						elementOfBoolProduct = (elementOfA && elementOfB);
						
						if(elementOfBoolProduct){
							elementOfProduct = 1;
						}else{
							elementOfProduct = 0;
						}
						
						mulBoolMatA_B[r][c] = elementOfProduct;
						
					} else {
						if(matrixA[i][k] == 0){
							elementOfA = false;
						} else {
							elementOfA = true;
						}
						
						if(matrixB[k][j] == 0){
							elementOfB = false;
						} else {
							elementOfB = true;
						}
						
						if(mulBoolMatA_B[r][c] == 0){
							elementOfBoolProduct = false;
						} else {
							elementOfBoolProduct = true;
						}
						
						elementOfBoolProduct = (elementOfBoolProduct || (elementOfA && elementOfB));
						
						if(elementOfBoolProduct){
							elementOfProduct = 1;
						}else{
							elementOfProduct = 0;
						}
						
						mulBoolMatA_B[r][c] = elementOfProduct;
					}
				}
				c++;
			}
			r++;
			c=0;
		}
		System.out.print("\nBoolean Product of Matrices A & B:\n");
		for(i=0; i<rowOfMatrixA; i++){
			for(j=0; j<colOfMatrixB; j++){
				System.out.print(mulBoolMatA_B[i][j] + "\t");
			}
			System.out.println();
		}
	}
}



class Union{
	
	int i, j, sizeOfSetA=0, sizeOfSetB=0, counter=0, p=0;
	boolean flag = false;
	
	//Declaration of set A & B
	String[] setA;
	String[] setB;
	String[] setAUB = new String[100];
	
	//declaration of Sacnner class objects for get input from user.
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);
	
	public Union(){
		System.out.println("\n ---------------------");
		System.out.println("| UNIOUN OF SET A & B |");
		System.out.println(" ---------------------");
		
		//get the size of set A
		System.out.print("\nEnter The Size Of Set A: ");
		try{
			sizeOfSetA = s1.nextInt();
		}catch(Exception e){
			System.out.print("\nEnter Only DIGITS.");
			flag = true;
		}
		
		if(flag == false){
			//initalization of set A
			setA = new String[sizeOfSetA];
			
			//get the size of set B
			System.out.print("Enter The Size Of Set B: ");
			try{
				sizeOfSetB = s1.nextInt();
			}catch(Exception e){
				System.out.print("\nEnter Only DIGITS.");
				flag = true;
			}			
			
			if(flag == false){
				//initalization of set B
				setB = new String[sizeOfSetB];
				getSets();
			}
		}
	}
	
	public void getSets(){
		//getting the Element of set A
		System.out.println("\nEnter The Elemnts of Set A: ");
		for(i=0; i<sizeOfSetA; i++){
			setA[i] = s2.nextLine();
		}
			
		//getting the Element of set B
		System.out.println("\nEnter The Elemnts of Set B: ");
		for(i=0; i<sizeOfSetB; i++){
			setB[i] = s2.nextLine();
		}
		displaySets();
	}
	public void displaySets(){
		//printing Set A
		System.out.print("\nSet A = {");
		for(i=0; i<sizeOfSetA; i++){
			if(i == sizeOfSetA-1)
				System.out.print(setA[i]);
			else 
				System.out.print(setA[i] + ", ");
		}
		System.out.println("}");
		//printing Set B
		System.out.print("Set B = {");
		for(i=0; i<sizeOfSetB; i++){
			if(i == sizeOfSetB-1)
				System.out.print(setB[i]);
			else 
				System.out.print(setB[i] + ", ");
		}
		System.out.println("}");
		AUB();
	}
	
	public void AUB(){
		for(i=0; i<sizeOfSetA; i++){
			setAUB[i] = setA[i];
			p++;
		}
		for(i=0; i<sizeOfSetB; i++){
			counter=0;
			for(j=0; j<sizeOfSetA; j++){
				if(setB[i].equals(setA[j])){
					counter++;
				}
			}
			if(counter == 0){
				setAUB[p] = setB[i];
				p++;
			}
		}
		DisplayAUB();
	}
	
	public void DisplayAUB(){
		System.out.print("\n\nUNIOUN Of Set A & B = {");
		for(i=0; i<p; i++){
			if(i == p-1)
				System.out.print(setAUB[i]);
			else 
				System.out.print(setAUB[i] + ", ");
		}
		System.out.println("}");
	}
}

class Intersection{
	
	int i, j, sizeOfSetA=0, sizeOfSetB=0, counter=0, p=0;
	boolean flag = false;
	
	//Declaration of set A & B
	String[] setA;
	String[] setB;
	String[] setAIB = new String[100];
	
	//declaration of Sacnner class objects for get input from user.
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);
	
	public Intersection(){
		System.out.println("\n ---------------------------");
		System.out.println("| INTERSECTION OF SET A & B |");
		System.out.println(" ---------------------------");
		
		//get the size of set A
		System.out.print("\nEnter The Size Of Set A: ");
		try{
			sizeOfSetA = s1.nextInt();
		}catch(Exception e){
			System.out.print("\nEnter Only DIGITS.");
			flag = true;
		}
		
		if(flag == false){
			//initalization of set A
			setA = new String[sizeOfSetA];
			
			//get the size of set B
			System.out.print("Enter The Size Of Set B: ");
			try{
				sizeOfSetB = s1.nextInt();
			}catch(Exception e){
				System.out.print("\nEnter Only DIGITS.");
				flag = true;
			}			
			
			if(flag == false){
				//initalization of set B
				setB = new String[sizeOfSetB];
				getSets();
			}
		}
	}
	
	public void getSets(){
		//getting the Element of set A
		System.out.println("\nEnter The Elemnts of Set A: ");
		for(i=0; i<sizeOfSetA; i++){
			setA[i] = s2.nextLine();
		}
			
		//getting the Element of set B
		System.out.println("\nEnter The Elemnts of Set B: ");
		for(i=0; i<sizeOfSetB; i++){
			setB[i] = s2.nextLine();
		}
		displaySets();
		AIB();
	}
	public void displaySets(){
		//printing Set A
		System.out.print("\nSet A = {");
		for(i=0; i<sizeOfSetA; i++){
			if(i == sizeOfSetA-1)
				System.out.print(setA[i]);
			else 
				System.out.print(setA[i] + ", ");
		}
		System.out.println("}");
		//printing Set B
		System.out.print("Set B = {");
		for(i=0; i<sizeOfSetB; i++){
			if(i == sizeOfSetB-1)
				System.out.print(setB[i]);
			else 
				System.out.print(setB[i] + ", ");
		}
		System.out.println("}");
	}
	
	public void AIB(){
		setAIB[0] = "null";
		for(i=0; i<sizeOfSetA; i++){
			counter=0;
			for(j=0; j<sizeOfSetB; j++){
				if(setA[i].equals(setB[j])){
					counter++;
				}
			}
			if(counter > 0){
				setAIB[p] = setA[i];
				p++;
			}
		}
		
		if(setAIB[0].equals("null")){
			System.out.println("\nINTERSECTION Of Set A & B = { }.\nSo, THIS IS DISJOINT OF SET");
		}else
			DisplayAIB();
	}
	
	public void DisplayAIB(){
		System.out.print("\nINTERSECTION Of Set A & B = {");
		for(i=0; i<p; i++){
			if(i == p-1)
				System.out.print(setAIB[i]);
			else 
				System.out.print(setAIB[i] + ", ");
		}
		System.out.println("}");
	}
}

class Complement{
	
	int i, j, sizeOfSetU=0, sizeOfSetA=0, counter=0, p=0;
	boolean flag = false;
	
	//Declaration of set U & A
	String[] setU;
	String[] setA;
	String[] ComplementOfA = new String[100];
	
	//declaration of Sacnner class objects for get input from user.
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);
	
	public Complement(){
		System.out.println("\n -------------------");
		System.out.println("| COMPLEMENT OF SET |");
		System.out.println(" -------------------");
		
		//get the size of set U
		System.out.print("\nEnter The Size Of Universal Set U: ");
		try{
			sizeOfSetU = s1.nextInt();
		}catch(Exception e){
			System.out.print("\nEnter Only DIGITS.");
			flag = true;
		}
		
		if(flag == false){
			//initalization of set U
			setU = new String[sizeOfSetU];
			
			//get the size of set A
			System.out.print("Enter The Size Of Set A: ");
			try{
				sizeOfSetA = s1.nextInt();
			}catch(Exception e){
				System.out.print("\nEnter Only DIGITS.");
				flag = true;
			}			
			
			if(flag == false){
				//initalization of set A
				setA = new String[sizeOfSetA];
				getSets();
			}
		}
	}
	
	public void getSets(){
		/*
		Chseck the size of Set U and A.
		If size of set A is greater than size of Set U then we can't perform Complement of Set A.
		*/
		if(sizeOfSetU < sizeOfSetA){
			System.out.println("\nSize of Set A is must be lower than Size of Set U."); 
			System.out.println("If size of set A is greater than size of Set U then we can't perform Complement of Set A.");
		} else {
			//getting the Element of set U
			System.out.println("\nEnter The Elemnts of Set U: ");
			for(i=0; i<sizeOfSetU; i++){
				setU[i] = s2.nextLine();
			}
			
			//getting the Element of set A
			System.out.println("\nEnter The Elemnts of Set A: ");
			for(i=0; i<sizeOfSetA; i++){
				setA[i] = s2.nextLine();
			}
			displaySets();
		}
	}
	
	public void displaySets(){
		//printing Set U
		System.out.print("\nUniversal Set U = {");
		for(i=0; i<sizeOfSetU; i++){
			if(i == sizeOfSetU-1)
				System.out.print(setU[i]);
			else 
				System.out.print(setU[i] + ", ");
		}
		System.out.println("}");
		//printing Set A
		System.out.print("Set A = {");
		for(i=0; i<sizeOfSetA; i++){
			if(i == sizeOfSetA-1)
				System.out.print(setA[i]);
			else 
				System.out.print(setA[i] + ", ");
		}
		System.out.println("}");
		
		LoopForCheckElementsOfSetAInSetU:
		for(i=0; i<sizeOfSetA; i++){
			for(j=0; j<sizeOfSetU; j++){
				if(setA[i].equals(setU[j])){
					counter++;
				}
			}
		}
		
		if(counter == sizeOfSetA){
			complementOfA();
		}else{
			System.out.println("\nElements of Set A are Must Be in Universal Set U.");
		}
	}
	
	public void complementOfA(){
		for(i=0; i<sizeOfSetU; i++){
			counter=0;
			for(j=0; j<sizeOfSetA; j++){
				if(setU[i].equals(setA[j])){
					counter++;
				}
			}
			if(counter == 0){
				ComplementOfA[p] = setU[i];
				p++;
			}
		}
		System.out.print("\nCoplement of Set A = {");
		for(i=0; i<p; i++){
			if(i == p-1)
				System.out.print(ComplementOfA[i]);
			else 
				System.out.print(ComplementOfA[i] + ", ");
		}
		System.out.println("}");
	}
}

class Subset{
	
	int sizeOfSetA=0, sizeOfSetX=0, counter=0;
	boolean flag = false;
	
	//Declaration of set A & X
	String[] setA;
	String[] setX;
	
	//declaration of Sacnner class objects for get input from user.
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);
	
	public Subset(){
		System.out.println("\n -------------------------------------------");
		System.out.println("| CHECK THE SET X IS SUBSET OF SET A OR NOT |");
		System.out.println(" -------------------------------------------");
		
		//get the size of set A
		System.out.print("\nEnter The Size Of Set A: ");
		try{
			sizeOfSetA = s1.nextInt();
		}catch(Exception e){
			System.out.print("\nEnter Only DIGITS.");
			flag = true;
		}
		
		if(flag == false){
			//initalization of set A
			setA = new String[sizeOfSetA];
			
			//get the size of set X
			System.out.print("Enter The Size Of Set X: ");
			try{
				sizeOfSetX = s1.nextInt();
			}catch(Exception e){
				System.out.print("\nEnter Only DIGITS.");
				flag = true;
			}			
			
			if(flag == false){
				//initalization of set X
				setX = new String[sizeOfSetX];
				getSets();
			}
		}
	}
	
	public void getSets(){
		/*
		Check the size of Set A and X.
		if size of set X is greater than size of Set A 			
		then the Set X is can not be a Subset of the Set A.
		*/
		if(sizeOfSetX > sizeOfSetA){
			System.out.println("\nSize of Set X is must be lower than Size of Set A."); 
			System.out.println("If size of set X is greater than size of Set A hen the Set X is can not be a Subset of the Set A.");
		} else {
			//getting the Element of set A
			System.out.println("\nEnter The Elemnts of Set A: ");
			for(int i=0; i<sizeOfSetA; i++){
				setA[i] = s2.nextLine();
			}
			
			//getting the Element of set X
			System.out.println("\nEnter The Elemnts of Set X: ");
			for(int i=0; i<sizeOfSetX; i++){
				setX[i] = s2.nextLine();
			}
			displaySets();
			checkSubsetOrNot();
		}
	}
	public void displaySets(){
		//printing Set A
		System.out.print("\nSet A = {");
		for(int i=0; i<sizeOfSetA; i++){
			if(i == sizeOfSetA-1)
				System.out.print(setA[i]);
			else 
				System.out.print(setA[i] + ", ");
		}
		System.out.println("}");
		//printing Set X
		System.out.print("Set X = {");
		for(int i=0; i<sizeOfSetX; i++){
			if(i == sizeOfSetX-1)
				System.out.print(setX[i]);
			else 
				System.out.print(setX[i] + ", ");
		}
		System.out.println("}");
	}
	public void checkSubsetOrNot(){
		for(int i=0; i<sizeOfSetX; i++){
			for(int j=0; j<sizeOfSetA; j++){
				if(setX[i].equals(setA[j])){
					counter++;
				}
			}
		}
		if(counter == sizeOfSetX)
			System.out.println("\nSet X is a Subset of Set A.");
		else
			System.out.println("\nSet X is not a Subset of Set A.");
	}
}

class Equals{
	
	int sizeOfSetA=0, sizeOfSetB=0, counter=0;
	boolean flag = false;
	
	//Declaration of set A & B
	String[] setA;
	String[] setB;
	
	//declaration of Sacnner class objects for get input from user.
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);
	
	public Equals(){
		System.out.println("\n --------------------------------------------");
		System.out.println("| CHECK THE BOTH SET A & B ARE EUQALS OR NOT |");
		System.out.println(" --------------------------------------------");
		
		//get the size of set A
		System.out.print("\nEnter The Size Of Set A: ");
		try{
			sizeOfSetA = s1.nextInt();
		}catch(Exception e){
			System.out.print("\nEnter Only DIGITS.");
			flag = true;
		}
		
		if(flag == false){
			//initalization of set A
			setA = new String[sizeOfSetA];
			
			//get the size of set B
			System.out.print("Enter The Size Of Set B: ");
			try{
				sizeOfSetB = s1.nextInt();
			}catch(Exception e){
				System.out.print("\nEnter Only DIGITS.");
				flag = true;
			}			
			
			if(flag == false){
				//initalization of set B
				setB = new String[sizeOfSetB];
				getSets();
			}
		}
	}
	
	public void getSets(){
		/*
		Chseck the size of Set A and B.
		If size of set A is greater/less than size of Set B then the Set B is can not be Equals to Set A.
		*/
		if(sizeOfSetB != sizeOfSetA){
			System.out.println("\nSize of Set A is must be Equals to Size of Set B."); 
			System.out.println("If size of set A is greater/less than size of Set B the Set B is can not be Equals to Set A.");
		} else {
			//getting the Element of set A
			System.out.println("\nEnter The Elemnts of Set A: ");
			for(int i=0; i<sizeOfSetA; i++){
				setA[i] = s2.nextLine();
			}
			
			//getting the Element of set B
			System.out.println("\nEnter The Elemnts of Set B: ");
			for(int i=0; i<sizeOfSetB; i++){
				setB[i] = s2.nextLine();
			}
			displaySets();
			checkEqualsOrNot();
		}
	}
	public void displaySets(){
		//printing Set A
		System.out.print("\nSet A = {");
		for(int i=0; i<sizeOfSetA; i++){
			if(i == sizeOfSetA-1)
				System.out.print(setA[i]);
			else 
				System.out.print(setA[i] + ", ");
		}
		System.out.println("}");
		//printing Set B
		System.out.print("Set B = {");
		for(int i=0; i<sizeOfSetB; i++){
			if(i == sizeOfSetB-1)
				System.out.print(setB[i]);
			else 
				System.out.print(setB[i] + ", ");
		}
		System.out.println("}");
	}
	public void checkEqualsOrNot(){
		for(int i=0; i<sizeOfSetA; i++){
			for(int j=0; j<sizeOfSetB; j++){
				if(setA[i].equals(setB[j])){
					counter++;
				}
			}
		}
		if(counter == sizeOfSetA)
			System.out.println("\nSet A & B Both are Equal Sets.");
		else
			System.out.println("\nSet A & B Both not are Equal Sets.");
	}
}

class Difference{
	
	int sizeOfSetA=0, sizeOfSetB=0, counter=0, p=0;
	boolean flag = false;
	
	//Declaration of set A & B
	String[] setA;
	String[] DifferenceSetA = new String[100] ;
	String[] setB;
	
	//declaration of Sacnner class objects for get input from user.
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);
	
	public Difference(){
		System.out.println("\n -------------------------------------------------------------------");
		System.out.println("| THE DIFFERENCE OF SET A & B (A-B)/(RELATIVE COMPLIMENT OF B IN A) |");
		System.out.println(" -------------------------------------------------------------------");
		
		//get the size of set A
		System.out.print("\nEnter The Size Of Set A: ");
		try{
			sizeOfSetA = s1.nextInt();
		}catch(Exception e){
			System.out.print("\nEnter Only DIGITS.");
			flag = true;
		}
		
		if(flag == false){
			//initalization of set A
			setA = new String[sizeOfSetA];
			
			//get the size of set B
			System.out.print("Enter The Size Of Set B: ");
			try{
				sizeOfSetB = s1.nextInt();
			}catch(Exception e){
				System.out.print("\nEnter Only DIGITS.");
				flag = true;
			}			
			
			if(flag == false){
				//initalization of set B
				setB = new String[sizeOfSetB];
				getSets();
			}
		}
	}
	
	public void getSets(){
		//getting the Element of set A
		System.out.println("\nEnter The Elemnts of Set A: ");
		for(int i=0; i<sizeOfSetA; i++){
			setA[i] = s2.nextLine();
		}
		
		//getting the Element of set B
		System.out.println("\nEnter The Elemnts of Set B: ");
		for(int i=0; i<sizeOfSetB; i++){
			setB[i] = s2.nextLine();
		}
		displaySets();
		checkDifference();
	}
	
	public void displaySets(){
		//printing Set A
		System.out.print("\nSet A = {");
		for(int i=0; i<sizeOfSetA; i++){
			if(i == sizeOfSetA-1)
				System.out.print(setA[i]);
			else 
				System.out.print(setA[i] + ", ");
		}
		System.out.print("}");
		//printing Set B
		System.out.print("\nSet B = {");
		for(int i=0; i<sizeOfSetB; i++){
			if(i == sizeOfSetB-1)
				System.out.print(setB[i]);
			else 
				System.out.print(setB[i] + ", ");
		}
		System.out.println("}");
	}
	
	public void checkDifference(){
		for(int i=0; i<sizeOfSetA; i++){
			counter=0;
			for(int j=0; j<sizeOfSetB; j++){
				if(setA[i].equals(setB[j])){
					counter++;
				}
			}
			if(counter == 0){
				DifferenceSetA[p]=setA[i];
				p++;
			}
		}
		
		//printing Set A After A-B
		System.out.print("\nAfter A-B Set A = {");
		for(int i=0; i<p; i++){
			if(i == p-1)
				System.out.print(DifferenceSetA[i]);
			else 
				System.out.print(DifferenceSetA[i] + ", ");
		}
		System.out.println("}");
	}
}

class SymmetricDifference{
	
	int i, j, sizeOfSetA=0, sizeOfSetB=0, counter=0, p1=0, p2=0, p3=0;
	boolean flag = false;
	
	//Declaration of set A & B
	String[] setA;
	String[] setB;
	String[] setAUB = new String[100];
	String[] setAIB = new String[100];
	String[] SymmetricDifferenceA_B = new String[100];
	
	//declaration of Sacnner class objects for get input from user.
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);
	
	public SymmetricDifference(){
		System.out.println("\n ---------------------------------------");
		System.out.println("| THE SYMMETRIC DIFFERENCE OF SET A & B |");
		System.out.println(" ---------------------------------------");
		
		//get the size of set A
		System.out.print("\nEnter The Size Of Set A: ");
		try{
			sizeOfSetA = s1.nextInt();
		}catch(Exception e){
			System.out.print("\nEnter Only DIGITS.");
			flag = true;
		}
		
		if(flag == false){
			//initalization of set A
			setA = new String[sizeOfSetA];
			
			//get the size of set B
			System.out.print("Enter The Size Of Set B: ");
			try{
				sizeOfSetB = s1.nextInt();
			}catch(Exception e){
				System.out.print("\nEnter Only DIGITS.");
				flag = true;
			}			
			
			if(flag == false){
				//initalization of set B
				setB = new String[sizeOfSetB];
				getSets();
			}
		}
	}
	
	public void getSets(){
		//getting the Element of set A
		System.out.println("\nEnter The Elemnts of Set A: ");
		for(i=0; i<sizeOfSetA; i++){
			setA[i] = s2.nextLine();
		}
		
		//getting the Element of set B
		System.out.println("\nEnter The Elemnts of Set B: ");
		for(i=0; i<sizeOfSetB; i++){
			setB[i] = s2.nextLine();
		}
		
		displaySets();
		AUB();
		AIB();
		DisplayAUB();
		DisplayAIB();
		checkSymmetricDifference();
	}
	
	public void displaySets(){
		//printing Set A
		System.out.print("\nSet A = {");
		for(i=0; i<sizeOfSetA; i++){
			if(i == sizeOfSetA-1)
				System.out.print(setA[i]);
			else 
				System.out.print(setA[i] + ", ");
		}
		System.out.print("}");
		//printing Set B
		System.out.print("\nSet B = {");
		for(i=0; i<sizeOfSetB; i++){
			if(i == sizeOfSetB-1)
				System.out.print(setB[i]);
			else 
				System.out.print(setB[i] + ", ");
		}
		System.out.println("}");
	}
	
	public void AUB(){
		for(i=0; i<sizeOfSetA; i++){
			setAUB[i] = setA[i];
			p1++;
		}
		for(i=0; i<sizeOfSetB; i++){
			counter=0;
			for(j=0; j<sizeOfSetA; j++){
				if(setB[i].equals(setA[j])){
					counter++;
				}
			}
			if(counter == 0){
				setAUB[p1] = setB[i];
				p1++;
			}
		}
	}
	public void DisplayAUB(){
		System.out.print("\nUNIOUN Of Set A & B = {");
		for(i=0; i<p1; i++){
			if(i == p1-1)
				System.out.print(setAUB[i]);
			else 
				System.out.print(setAUB[i] + ", ");
		}
		System.out.println("}");
	}
	
	public void AIB(){
		for(i=0; i<sizeOfSetA; i++){
			counter=0;
			for(j=0; j<sizeOfSetB; j++){
				if(setA[i].equals(setB[j])){
					counter++;
				}
			}
			if(counter > 0){
				setAIB[p2]=setA[i];
				p2++;
			}
		}
	}
	
	public void DisplayAIB(){
		System.out.print("\nINTERSECTION Of Set A & B = {");
		for(i=0; i<p2; i++){
			if(i == p2-1)
				System.out.print(setAIB[i]);
			else 
				System.out.print(setAIB[i] + ", ");
		}
		System.out.println("}");
	}
	
	public void checkSymmetricDifference(){
		for(i=0; i<p1; i++){
			counter=0;
			for(j=0; j<p2; j++){
				if(setAUB[i].equals(setAIB[j])){
					counter++;
				}
			}
			if(counter == 0){
				SymmetricDifferenceA_B[p3]=setAUB[i];
				p3++;
			}
		}
		
		//printing Set A After A-B
		System.out.print("\nSYMMETRIC DIFFERENCE OF SET A & B:\n{");
		for(i=0; i<p3; i++){
			if(i == p3-1)
				System.out.print(SymmetricDifferenceA_B[i]);
			else 
				System.out.print(SymmetricDifferenceA_B[i] + ", ");
		}
		System.out.println("}");
	}
}

class CartesianProduct{
	
	int i, j, sizeOfSetA=0, sizeOfSetB=0;
	boolean flag = false;
	
	//Declaration of set A & B
	String[] setA;
	String[] setB;
	
	//declaration of Sacnner class objects for get input from user.
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);
	
	public CartesianProduct(){
		System.out.println("\n ----------------------------------------");
		System.out.println("| CARTESION PRODUCT OF SET A & B/(A * B) |");
		System.out.println(" ---------------------------------------");
		
		//get the size of set A
		System.out.print("\nEnter The Size Of Set A: ");
		try{
			sizeOfSetA = s1.nextInt();
		}catch(Exception e){
			System.out.print("\nEnter Only DIGITS.");
			flag = true;
		}
		
		if(flag == false){
			//initalization of set A
			setA = new String[sizeOfSetA];
			
			//get the size of set B
			System.out.print("Enter The Size Of Set B: ");
			try{
				sizeOfSetB = s1.nextInt();
			}catch(Exception e){
				System.out.print("\nEnter Only DIGITS.");
				flag = true;
			}			
			
			if(flag == false){
				//initalization of set B
				setB = new String[sizeOfSetB];
				getSets();
			}
		}
	}
	
	public void getSets(){
		//getting the Element of set A
		System.out.println("\nEnter The Elemnts of Set A: ");
		for(i=0; i<sizeOfSetA; i++){
			setA[i] = s2.nextLine();
		}
			
		//getting the Element of set B
		System.out.println("\nEnter The Elemnts of Set B: ");
		for(i=0; i<sizeOfSetB; i++){
			setB[i] = s2.nextLine();
		}
		displaySets();
	}
	public void displaySets(){
		//printing Set A
		System.out.print("\nSet A = {");
		for(i=0; i<sizeOfSetA; i++){
			if(i == sizeOfSetA-1)
				System.out.print(setA[i]);
			else 
				System.out.print(setA[i] + ", ");
		}
		System.out.print("}");
		//printing Set B
		System.out.print("\nSet B = {");
		for(i=0; i<sizeOfSetB; i++){
			if(i == sizeOfSetB-1)
				System.out.print(setB[i]);
			else 
				System.out.print(setB[i] + ", ");
		}
		System.out.println("}");
		cartesianProduct();
	}
	public void cartesianProduct(){
		System.out.print("\nCARTESION PRODUCT OF SET A & B/(A*B):\n{");
		for(i=0; i<sizeOfSetA; i++){
			for(j=0; j<sizeOfSetB; j++){
				if(i == sizeOfSetA-1)
					if(j == sizeOfSetB-1)
						System.out.print("(" +setA[i]+ "," +setB[j]+ ")");
					else
						System.out.print("(" +setA[i]+ "," +setB[j]+ "), ");
				else
					System.out.print("(" +setA[i]+ "," +setB[j]+ "), ");
			}
		}
		System.out.print("}");
	}
}

class ReverseCartesianProduct{
	
	int i, j, sizeOfSetA=0, sizeOfSetB=0;
	boolean flag = false;
	
	//Declaration of set A & B
	String[] setA;
	String[] setB;
	
	//declaration of Sacnner class objects for get input from user.
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);
	
	public ReverseCartesianProduct(){
		System.out.println("\n ------------------------------------------------");
		System.out.println("| REVERSE CARTESION PRODUCT OF SET A & B/(B * A) |");
		System.out.println(" ------------------------------------------------");
		
		//get the size of set A
		System.out.print("\nEnter The Size Of Set A: ");
		try{
			sizeOfSetA = s1.nextInt();
		}catch(Exception e){
			System.out.print("\nEnter Only DIGITS.");
			flag = true;
		}
		
		if(flag == false){
			//initalization of set A
			setA = new String[sizeOfSetA];
			
			//get the size of set B
			System.out.print("Enter The Size Of Set B: ");
			try{
				sizeOfSetB = s1.nextInt();
			}catch(Exception e){
				System.out.print("\nEnter Only DIGITS.");
				flag = true;
			}			
			
			if(flag == false){
				//initalization of set B
				setB = new String[sizeOfSetB];
				getSets();
			}
		}
	}
	
	public void getSets(){
		//getting the Element of set A
		System.out.println("\nEnter The Elemnts of Set A: ");
		for(i=0; i<sizeOfSetA; i++){
			setA[i] = s2.nextLine();
		}
			
		//getting the Element of set B
		System.out.println("\nEnter The Elemnts of Set B: ");
		for(i=0; i<sizeOfSetB; i++){
			setB[i] = s2.nextLine();
		}
		displaySets();
	}
	public void displaySets(){
		//printing Set A
		System.out.print("\nSet A = {");
		for(i=0; i<sizeOfSetA; i++){
			if(i == sizeOfSetA-1)
				System.out.print(setA[i]);
			else 
				System.out.print(setA[i] + ", ");
		}
		System.out.print("}");
		//printing Set B
		System.out.print("\nSet B = {");
		for(i=0; i<sizeOfSetB; i++){
			if(i == sizeOfSetB-1)
				System.out.print(setB[i]);
			else 
				System.out.print(setB[i] + ", ");
		}
		System.out.println("}");
		reverseCartesianProduct();
	}
	public void reverseCartesianProduct(){
		System.out.print("\nREVERSE CARTESION PRODUCT OF SET A & B/(B * A):\n{");
		for(i=0; i<sizeOfSetB; i++){
			for(j=0; j<sizeOfSetA; j++){
				if(i == sizeOfSetB-1)
					if(j == sizeOfSetA-1)
						System.out.print("(" +setB[i]+ "," +setA[j]+ ")");
					else
						System.out.print("(" +setB[i]+ "," +setA[j]+ "), ");
				else
					System.out.print("(" +setB[i]+ "," +setA[j]+ "), ");
			}
		}
		System.out.print("}");
	}
}

class PowerSet{
	
	int i, j, sizeOfSetA=0;
	boolean flag = false;
	
	//Declaration of set A
	String[] setA;
	
	//declaration of Sacnner class objects for get input from user.
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);
	
	public PowerSet(){
		System.out.println("\n ----------------");
		System.out.println("| POWER SET/P(A) |");
		System.out.println(" ----------------");
		
		//get the size of set A
		System.out.print("\nEnter The Size Of Set A: ");
		try{
			sizeOfSetA = s1.nextInt();
		}catch(Exception e){
			System.out.print("\nEnter Only DIGITS.");
			flag = true;
		}
		
		if(flag == false){
			//initalization of set A
			setA = new String[sizeOfSetA];
			getSet();
		}
	}
	
	public void getSet(){
		//getting the Element of set A
		System.out.println("\nEnter The Elemnts of Set A: ");
		for(i=0; i<sizeOfSetA; i++){
			setA[i] = s2.nextLine();
		}	
		displaySet();
	}
	public void displaySet(){
		//printing Set A
		System.out.print("\nSet A = {");
		for(i=0; i<sizeOfSetA; i++){
			if(i == sizeOfSetA-1)
				System.out.print(setA[i]);
			else 
				System.out.print(setA[i] + ", ");
		}
		System.out.println("}");
		powerSet();
	}
	public void powerSet(){
		System.out.print("\nPOWER SET Of A/P(A) = {{ }, A, ");
		for(i=0; i<sizeOfSetA; i++){
			System.out.print("{" +setA[i]+ "}, ");
		}
		
		for(i=0; i<sizeOfSetA; i++){
			for(j=i+1; j<sizeOfSetA; j++){
				if(i == sizeOfSetA-2)
					if(j == sizeOfSetA-1)
						System.out.print("{" +setA[i]+ "," +setA[j]+ "}");
					else
						System.out.print("{" +setA[i]+ "," +setA[j]+ "}, ");
				else
					System.out.print("{" +setA[i]+ "," +setA[j]+ "}, ");
			}
		}
		System.out.print("}");
	}
}

class CardinalityOfSet{
	
	int i, counter=0;
	String element, endFlag = "/";
	
	//Declaration of set A
	String[] setA = new String[100];
	
	//declaration of Sacnner class objects for get input from user.
	Scanner s = new Scanner(System.in);
	
	public CardinalityOfSet(){
		System.out.println("\n ------------------------");
		System.out.println("| CARDINALITY OF SET/|A| |");
		System.out.println(" ------------------------");
	}
	
	public void getSet(){
		//getting the Element of set A
		System.out.println("\n ------------------------------------------------------------");
		System.out.println("| PLEASE ENTER FORWARD SHLASH(/) AFTER LAST ElEMENT OF SET A |");
		System.out.println(" ------------------------------------------------------------");
		System.out.println("\nEnter The Elemnts of Set A: ");
		infinteLoop:
		for(;;){
			element = s.nextLine();
			if(element.equals(endFlag)){
				break infinteLoop;
			} else{
				setA[counter] = element;
				counter++;
			}
		}	
		displaySet();
	}
	
	public void displaySet(){
		//printing Set A
		System.out.print("\nSet A = {");
		for(i=0; i<counter; i++){
			if(i == counter-1)
				System.out.print(setA[i]);
			else 
				System.out.print(setA[i] + ", ");
		}
		System.out.print("}");
		cardinalityOfSet();
	}
	
	public void cardinalityOfSet(){
		System.out.print("\n\nCARDINALITY OF SET A / |A| = " + counter);
	}
}

class SearchElement{
	
	int i, sizeOfSetA;
	String[] setA;
	String searchElement;
	boolean flag = false;
		
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);
	
	public SearchElement(){
		System.out.println("\n -------------------------");
		System.out.println("| SEARCH ELEMENT FROM SET |");
		System.out.println(" -------------------------");
		
		//get the size of set A
		System.out.print("\nEnter The Size Of Set A: ");
		try{
			sizeOfSetA = s1.nextInt();
		}catch(Exception e){
			System.out.print("\nEnter Only DIGITS.");
			flag = true;
		}
		
		if(flag == false){
			//initalization of set A
			setA = new String[sizeOfSetA];
			getSet();
		}
	}
	
	public void getSet(){
		//getting the Element of set A
		System.out.println("\nEnter The Elemnts of Set A: ");
		for(i=0; i<sizeOfSetA; i++){
			setA[i] = s2.nextLine();
		}
		displaySet();
		searchElement();
	}
	
	public void displaySet(){
		//printing Set A
		System.out.print("\nSet A = {");
		for(i=0; i<sizeOfSetA; i++){
			if(i == sizeOfSetA-1)
				System.out.print(setA[i]);
			else 
				System.out.print(setA[i] + ", ");
		}
		System.out.println("}");
	}
	void searchElement(){
		System.out.print("\nEnter Element to Search in Set: ");
		searchElement = s2.nextLine();
		
		/*boolean found = Arrays.stream(set).anyMatch(t->t.equals(searchElement));	
		if(found){
			System.out.println("\nEntered Element '" +searchElement+ "' is in Set.");
		} else {
			System.out.println("\nEntered Element is not in Set.");
		}*/
		
		for(int i=0; i<sizeOfSetA; i++){
			if(setA[i].equals(searchElement)){
				System.out.println("\nEntered Element '" +searchElement+ "' is in Set.");
			} else {
				System.out.println("\nEntered Element '" +searchElement+ "' is not in Set.");
			}
		}
	}
}



public class MSPoint{
	public static void main(String arg[]){
		
		String choice, con;
		
		Scanner s = new Scanner(System.in);
		
		LoopForMSPoint:
		for(;;){
			System.out.print("\n****************************************************");
			System.out.print("\n*                ---------------                   *");
			System.out.print("\n*               |  M. S. POINT  |                  *");
			System.out.print("\n*                ---------------                   *");
			System.out.print("\n*         -----------------------------            *");
			System.out.print("\n*        |  MATRIX & SET THEORY POINT  |           *");
			System.out.print("\n*         -----------------------------            *");
			System.out.print("\n****************************************************");
			System.out.println("\n\nChoices are:\n1. SET THEORY\n2. MATRIX\n\nPRESS 0 FOR EXIT.");
			System.out.print("\nEnter Your Choice: ");
			choice = s.nextLine();
			
			switch(choice){
				case "0":break LoopForMSPoint;
				
				case "1":LoopForSet:
						for(;;){
							System.out.print("\n****************************************************");
							System.out.print("\n*                  -----------                     *");
							System.out.print("\n*                 |    SET    |                    *");
							System.out.print("\n*                  -----------                     *");
							System.out.print("\n****************************************************");
							
							System.out.println("\n\nChoices are:\n1. SET THEORY\n2. SET OPERATIONS\n\nPRESS 0 FOR BACK.");
							System.out.print("\nEnter Your Choice: ");
							choice = s.nextLine();
						
							switch(choice){
								case "0":continue LoopForMSPoint;
								
								case "1":LoopForSetTheory:
										for(;;){
											System.out.print("\n****************************************************");
											System.out.print("\n*                ----------------                  *");
											System.out.print("\n*               |   SET THEORY   |                 *");
											System.out.print("\n*                ----------------                  *");
											System.out.print("\n****************************************************");
											
											System.out.println("\n\nChoices are:\n01. WHAT IS SET?\n02. UNION OF SETs\n03. INTERSECTION OF SETs & DISJOINT OF SET\n04. COMPLEMENT OF SET\n05. SUBSET OF A SET\n06. EQUALITY OF A SETs\n07. DIFFERENCE OF SETs\n08. SYMMETRIC DIFFERENCE OF A SETs\n09. CARTESION PRODUCT\n10. POWER SET\n11. CARDINALITY OF SET\n\nPRESS 0 FOR BACK.");
											System.out.print("\nEnter Your Choice: ");
											choice = s.nextLine();
						
											switch(choice){
												case "0":continue LoopForSet;
												
												case "1":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Set Theory Files\\What is a Set.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Set Theory Files\\What is a Set.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												case "2":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Union of Sets.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Union of Sets.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												case "3":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Intersection of Sets.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Intersection of Sets.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												case "4":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Complement of Set.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Complement of Set.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												case "5":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Subset of a Set.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Subset of a Set.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												case "6":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Equality of Sets.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Equality of Sets.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												case "7":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Difference of Sets.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Difference of Sets.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												case "8":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Symmetric Difference of Sets.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Symmetric Difference of Sets.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
												case "9":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Cartesian Product.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Cartesian Product.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												case "10":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Power Set.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Power Set.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												case "11":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Cardinality of a Set.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Set Theory Files\\Cardinality of a Set.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												default:System.out.print("\nWrong Choice.\n");
											}
										}
										
								case "2":LoopForSetOperations:
										for(;;){
											System.out.print("\n****************************************************");
											System.out.print("\n*               -------------------                *");
											System.out.print("\n*              |   SET OPERATION   |               *");
											System.out.print("\n*               -------------------                *");
											System.out.print("\n****************************************************");
											System.out.println("\n\nChoices are:\n01. UNION\n02. INTERSECTION OR DISJOINT\n03. COMPLEMENT\n04. SUBSET\n05. EQUAL\n06. DIFFERENCE\n07. SYMMETRIC DIFFERENCE\n08. CARTESION PRODUCT\n09. REVERSE CARTESION PRODUCT\n10. POWER SET\n11. CARDINALITY OF SET\n12. SEARCH ELEMENT\n\nPRESS 0 FOR BACK.");
											
											System.out.print("\nEnter Your Choice: ");
											choice = s.nextLine();
											
											switch(choice){
												case "0": continue LoopForSet;
												
												case "1":	do{
															Union union = new Union();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForSetOperations;
														
												case "2": do{
															Intersection intersection = new Intersection();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForSetOperations;
														
												case "3": do{
															Complement complement = new Complement();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForSetOperations;
														
												case "4": do{
															Subset subset = new Subset();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForSetOperations;
														
												case "5": do{
															Equals equals = new Equals();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForSetOperations;
														
												case "6": do{
															Difference difference = new Difference();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForSetOperations;
														
												case "7": do{
															SymmetricDifference symmetricDifference = new SymmetricDifference();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForSetOperations;
														
												case "8": do{
															CartesianProduct cartesianProduct = new CartesianProduct();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForSetOperations;
														
												case "9": do{
															ReverseCartesianProduct reverseCartesianProduct = new ReverseCartesianProduct();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForSetOperations;
														
												case "10":do{
															PowerSet powerSet = new PowerSet();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForSetOperations;
														
												case "11":do{
															CardinalityOfSet cardinalityOfSet = new CardinalityOfSet();
															cardinalityOfSet.getSet();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForSetOperations;
														
												case "12":do{
															SearchElement searchElement = new SearchElement();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForSetOperations;
														
												default:System.out.print("\nWrong Choice.\n"); 
											}
										}

								default:System.out.print("\nWrong Choice.\n"); 		
							}
						}
				
				case "2":LoopForMatrix:
						for(;;){
							System.out.print("\n****************************************************");
							System.out.print("\n*                  -----------                     *");
							System.out.print("\n*                 |   MATRIX  |                    *");
							System.out.print("\n*                  -----------                     *");
							System.out.print("\n****************************************************");
							
							System.out.println("\n\nChoices are:\n1. MATRIX THEORY\n2. MATRIX OPERATIONS\n\nPRESS 0 FOR BACK.");
							System.out.print("\nEnter Your Choice: ");
							choice = s.nextLine();
						
							switch(choice){
								case "0":continue LoopForMSPoint;
								
								case "1":LoopForMatrixTheory:
										for(;;){
											System.out.print("\n****************************************************");
											System.out.print("\n*                ---------------                   *");
											System.out.print("\n*               | MATRIX THEORY |                  *");
											System.out.print("\n*                ---------------                   *");
											System.out.print("\n****************************************************");
											
											System.out.println("\n\nChoices are:\n01. WHAT IS MATRIX?\n02. ADDITION OF MATRICES\n03. DIFFERENCE OF MATRICES\n04. MULTIPLICATION OF MATRICES & MULTIPLY MATRIX WITH CONSTANT NO.\n05. TRANSPOSE OF MATRIX\n06. SOME SPECIAL TYPE OF MATRIX\n07. SYMMETRIC MATRIX\n08. SPARSE MATRIX\n09. BOOLEAN MATRIX AND BOOLEAN JOIN & MEET\n10. DETERMINANT OF MATRIX\n11. INVERSE OF MATRIX\n\nPRESS 0 FOR BACK.");
											System.out.print("\nEnter Your Choice: ");
											choice = s.nextLine();
											
											switch(choice){
												case "0": continue LoopForMatrix;
												
												case "1":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Matrix Files\\What is Matrix.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Matrix Files\\What is Matrix.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												case "2":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Matrix Files\\Addition of Matrices.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Matrix Files\\Addition of Matrices.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												case "3":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Matrix Files\\Difference of Matrices.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Matrix Files\\Difference of Matrices.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												case "4":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Matrix Files\\Multiplication of Matrices.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Matrix Files\\Multiplication of Matrices.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												case "5":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Matrix Files\\Transpose of Matrix.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Matrix Files\\Transpose of Matrix.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												case "6":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Matrix Files\\Some Special types of Matrix.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Matrix Files\\Some Special types of Matrix.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												case "7":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Matrix Files\\Symmetric Matrix.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Matrix Files\\Symmetric Matrix.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												case "8":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Matrix Files\\Sparse Matrix.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Matrix Files\\Sparse Matrix.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
												case "9":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Matrix Files\\Boolean Matrix.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Matrix Files\\Boolean Matrix.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												case "10":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Matrix Files\\Determinant of a Matrix.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Matrix Files\\Determinant of a Matrix.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												case "11":try{
															if((new File("d:\\MCA\\JAVA\\mini project\\Matrix Files\\Inverse of a Matrix.pdf")).exists()){
																Process p = Runtime
																   .getRuntime()
																   .exec("rundll32 url.dll,FileProtocolHandler d:\\MCA\\JAVA\\mini project\\Matrix Files\\Inverse of a Matrix.pdf");
																p.waitFor();		
															}else{
																System.out.println("\nFile is not exists");
															}
															System.out.println("\nDone");
														}catch(Exception ex){
															ex.printStackTrace();
														}
														break;
														
												default:System.out.print("\nWrong Choice.\n");
											}
										}
										
								case "2":LoopForMatrixOperations:
										for(;;){
											System.out.print("\n****************************************************");
											System.out.print("\n*               --------------------               *");
											System.out.print("\n*              |  MATRIX OPERATION  |              *");
											System.out.print("\n*               --------------------               *");
											System.out.print("\n****************************************************"); 
											System.out.println("\n\nChoices are:\n01. ADDITION OF MATRICES\n02. DIFFERENCE OF MATRICES\n03. MULTIPLICATION OF MATRICES\n04. MATRICES MULTIPLICATION WITH NUMBER\n05. TRANSPOSE OF MATRIX\n06. UPPER TRIANGULAR MATRIX\n07. LOWER TRIANGULAR MATRIX\n08. DIAGONAL MATRIX\n09. IDENTITY MATRIX\n10. SYMMETRIC MATRIX\n11. SPARSE MATRIX\n12. BOOLEAN MATRIX\n13. BOOLEAN JOIN OF MATRICES\n14. BOOLEAN MEET OF MATRICES\n15. BOOLEAN PRODUCT OF MATRICES\n\nPRESS 0 FOR BACK.");
											
											System.out.print("\nEnter Your Choice: ");
											choice = s.nextLine();
											
											switch(choice){
												case "0":continue LoopForMatrix;
												
												case "1":do{
															AdditionOfMatrices additionOfMatrices = new AdditionOfMatrices();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForMatrixOperations;
														
												case "2":do{
															DifferenceOfMatrices differenceOfMatrices = new DifferenceOfMatrices();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForMatrixOperations;
														
												case "3":do{
															MultiplicationOfMatrices multiplicationOfMatrices = new MultiplicationOfMatrices();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForMatrixOperations;
														
												case "4":do{
															MatrixMultiplicationWithNumber matrixMultiplicationWithNumber = new MatrixMultiplicationWithNumber();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForMatrixOperations;
														
												case "5":do{
															TransposeOfMatrix transposeOfMatrix = new TransposeOfMatrix();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForMatrixOperations;
														
												case "6":do{
															UpperTriangularMatrix upperTriangularMatrix = new UpperTriangularMatrix();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForMatrixOperations;
														
												case "7":do{
															LowerTriangularMatrix lowerTriangularMatrix = new LowerTriangularMatrix();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForMatrixOperations;
														
												case "8":do{
															DiagonalMatrix diagonalMatrix = new DiagonalMatrix();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForMatrixOperations;
														
												case "9":do{
															IdentityMatrix identityMatrix = new IdentityMatrix();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForMatrixOperations;
														
												case "10":do{
															SymmetricMatrix symmetricMatrix = new SymmetricMatrix();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForMatrixOperations;
														
												case "11":do{
															SparseMatrix sparseMatrix = new SparseMatrix();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForMatrixOperations;
														
												case "12":do{
															BooleanMatrix booleanMatrix = new BooleanMatrix();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForMatrixOperations;
														
												case "13":do{
															BooleanJoinOfMatrices booleanJoinOfMatrices = new BooleanJoinOfMatrices();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForMatrixOperations;
														
												case "14":do{
															BooleanMeetOfMatrices booleanMeetOfMatrices = new BooleanMeetOfMatrices();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForMatrixOperations;
														
												case "15":do{
															BooleanProductOfMatrices booleanProductOfMatrices = new BooleanProductOfMatrices();
															System.out.print("\n\nDo you want to continue? y or n:");
															con = s.nextLine();
															if((con.equals("Y") || con.equals("y")) || (con.equals("N") || con.equals("n"))){
																
															}else{
																System.out.println("\n\n ------------------------------------");
																System.out.println("| Enter Only 1 Character y, Y, n, N. |");
																System.out.println(" ------------------------------------\n");
															}
														}while(con.equals("Y") || con.equals("y"));
														continue LoopForMatrixOperations;
														
												default:System.out.print("\nWrong Choice.\n"); 
											}
										}
										
								default:System.out.print("\nWrong Choice.\n"); 		
							}
						}
				
				default:System.out.print("\nWrong Choice.\n");
			}	
		}
	}
}

