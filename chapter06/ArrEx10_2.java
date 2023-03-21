package chapter06;

public class ArrEx10_2 {

	public static void main(String[] args) {
		int [][] matrix4 = {
				{1,2},
				{3,4},
				{5,6}
		};
		
//		System.out.println(matrix.length);
//		System.out.println(matrix[0].length);
		
		System.out.println("[네번째]");
		for (int i=0; i<matrix4.length; i++) {
			for (int j=0; j<matrix4[i].length; j++) {
				System.out.print(matrix4[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("[다번째]");
		int [][] matrix5 = {
				{1,2,3},
				{4,5,6},
		};

		for (int i=0; i<matrix5.length; i++) {
			for (int j=0; j<matrix5[i].length; j++) {
				System.out.print(matrix5[i][j]+" ");
			}
			System.out.println();
		}


	}

}
