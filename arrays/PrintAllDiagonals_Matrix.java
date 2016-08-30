package arrays;

public class PrintAllDiagonals_Matrix {

	public static void main(String[] args) {
		
		int[][] a = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		printAllDiagonals(a);
	}
	
	public static void printAllDiagonals(int[][] a){
		
		int row=0;
		int col;
		
		while(row <= a.length-1){
			int rowTemp = row;
			col = 0;
			
			while(rowTemp >=0){
				System.out.print(" "+a[rowTemp][col]);
				rowTemp--;
				col++;
			}
			System.out.println(" ");
			row++;
		}
		
		
		col = 1;
			
		while(col < a.length){
			int colTemp = col;
			row = a.length-1;
			
			while(colTemp < a.length){
				System.out.print(" "+a[row][colTemp]);
				row--;
				colTemp++;
			}
			System.out.println("");
			col++;
		}
	}
}
