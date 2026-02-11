package shahana;
import java.util.Scanner;

public class symmetricMatrix {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n;
		boolean symmetric=true;
		System.out.print("Enter order of matrix:");
		n=sc.nextInt();
		int[][]A=new int[n][n];
		System.out.println("enter matrix elements:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				A[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(A[i][j]!=A[j][i]) {
					symmetric=false;
					break;
					
				}
			}

		}
		if(symmetric) {
			System.out.print("the matrix is symmetric");
		}else {
			System.out.print("the matrix is not symmetric");
		}
		sc.close();
	}
}
