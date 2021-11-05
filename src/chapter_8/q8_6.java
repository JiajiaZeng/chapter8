package chapter_8;

import java.util.Scanner;

public class q8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int i,j;
		int m,n;
		m=3;
		n=3;
		double[][] a=new double[3][3];
		double[][] b=new double[3][3];
		double[][] c=new double[3][3];
		System.out.print("Enter matrix1: ");
		for (i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				a[i][j]=input.nextDouble();
			}
		}
		System.out.print("Enter matrix2: ");
		for (i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				b[i][j]=input.nextDouble();
			}
		}
		c=multiplyMatrix(a,b);
		System.out.println("The multiplication of the matrices is ");
		for (i=0;i<m;i++) {
			if(i==1) {
				for(j=0;j<n;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.print("  *  ");
				for(j=0;j<n;j++) {
					System.out.print(b[i][j]+" ");
				}
				System.out.print("  =  ");
				for(j=0;j<n;j++) {
					System.out.printf("%.1f ",c[i][j]);
				}					
				System.out.println();
			}else {
				for(j=0;j<n;j++) {
					System.out.print(a[i][j]+" ");
				}	
				System.out.print("     ");
				for(j=0;j<n;j++) {
					System.out.print(b[i][j]+" ");
				}	
				System.out.print("     ");
				for(j=0;j<n;j++) {
					System.out.printf("%.1f ",c[i][j]);
				}					
				System.out.println();
			}
		}
		input.close();
	}
	
	public static double[][] multiplyMatrix(double[][] a,double[][] b){
		int i,j;
		int m,n;
		m=3;
		n=3;
		double[][] c=new double[m][n];
		for(i=0;i<m;i++) {
			for(j=0,c[i][j]=0;j<n;j++) {
				c[i][j]=a[i][0]*b[0][j]+a[i][1]*b[1][j]+a[i][2]*b[2][j];
			}
		}
		return c;
	}

}
