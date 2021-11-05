package chapter_8;

import java.util.Scanner;

public class q8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        int[][] workTime=new int[8][7];//个员工每天工作时间
        int i,j;
        int m,n;//m为员工个数，n为一周工作天数
        m=8;
        n=6;
        int temp;
        int[] totalTime=new int[8];//个员工一周工作总时间
        System.out.print("请依次输入每个员工周日到周五的工作时间：");
        for (i=0;i<m;i++) {
        	totalTime[i]=0;
        	for (j=0;j<n;j++) {
        		workTime[i][j]=input.nextInt();
        		totalTime[i]+=workTime[i][j];
        	}
        }
        //调试代码块
        /*System.out.println(workTime[7][5]);
        for(i=0;i<m;i++) {
            System.out.println(totalTime[i]);
        }*/
        
        int[] totalTime1=new int[8];
        for(i=0;i<m;i++) {
        	totalTime1[i]=totalTime[i];
        }
        for(i=0;i<m-1;i++) {
        	boolean flag=true;
        	for(j=0;j<m-i-1;j++) {
        		if(totalTime[j]<totalTime[j+1]) {
        			temp=totalTime[j];
        			totalTime[j]=totalTime[j+1];
        			totalTime[j+1]=temp;
        			flag=false;
        		}
        	}
        	if(flag) {
        		break;
        	}
        }
        for(i=0;i<m;i++) {
        	for(j=0;j<m;j++) {
        		if(totalTime1[j]==totalTime[i]) {
                	System.out.println("Employee"+j+":"+totalTime[i]);
                	totalTime1[j]=-1;
        		}
        	}
        }
        input.close();
	}

}
