package zeszyt;

public class Tablica2D {
	public static void main(String[] args) {
		
		int [][] matrix = {
				{1, 2, 3, 4},
				{5, 6},
				{7, 8, 9}
		};
		
		System.out.println(matrix [1][1]);
		System.out.println(matrix [2]);
		//System.out.println(matrix [1][2);

		for(int row=0; row<matrix.length; row++){
			for(int col=0; col<matrix[row].length; col++){
				System.out.print(matrix[row][col]);
			}
			System.out.println();
		}
	}
}
