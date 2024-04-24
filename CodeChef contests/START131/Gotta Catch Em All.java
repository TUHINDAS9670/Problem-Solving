import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner (System.in);
		int t=sc.nextInt();
		int info[]=new int[3];
		
		
		while(t!=0){
		for(int i=0;i<3;i++){
		   info[i]=sc.nextInt();
		}    
		int l=info[0];
		int pokes[]=new int [l];
			for(int i=0;i<l;i++){
		   pokes[i]=sc.nextInt();
		}
		int sum=0;
		int gt=info[2]/info[1];
		
		for(int i=0;i<l;i++){
		   if (pokes[i]>gt){
		       sum=sum+info[2];
		   }
		   else{
		       sum=sum+(pokes[i]*info[1]);
		   }
		}
		
		System.out.println(sum);

		
		    t--;
		}

		
	

	}
}
