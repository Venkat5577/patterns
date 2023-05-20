package patterns;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the pattern");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i+1;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=n-i-1;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}


	}

}
