package patterns;

import java.util.Scanner;

public class NokiaPattern {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int a=1;
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				
				for(int j=1;j<=i;j++) {
					System.out.print(a++);
					if(i!=j)
						System.out.print("*");
				}
			}
			else {
				a=a+i-1;
				for(int j=1;j<=i;j++) {
					System.out.print(a--);
					if(j!=i)
						System.out.print("*");
				}
				a=a+i+1;
			}
			System.out.println();
		}

	}

}
