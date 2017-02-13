package week5;

public class NbyN {

	public static void main(String[] args) {
		int[][] m = nbyn(10);
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print( m[i][j] + " " );
			}
			System.out.println();
		}

	}
	
	public static int[][] nbyn(int N) {
		int[][] mat = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			mat[i][i] = i;
		}
		
		return mat;
	}

}
