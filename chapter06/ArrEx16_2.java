package chapter06;

public class ArrEx16_2 {

	public static void main(String[] args) {
		
		int [][] matrix4 = {
				{1,2},
				{3,4},
				{5,6}
		};
		
		System.out.println("[Before]");
		for (int i=0; i<matrix4.length; i++) {
			for (int j=0; j<matrix4[i].length; j++) {
				System.out.print(matrix4[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("[After]");
		for (int[] rowElements: matrix4) {
			for (int eachColumnElement: rowElements) {
				System.out.print(eachColumnElement+" ");
			}
			System.out.println();
		}
		
	}

}
