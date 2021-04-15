import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		String ans="";
		int mid=n/2;
		ans+=s.charAt(mid);
		for(int i=mid+1;i<n;i++)
		  ans+=s.charAt(i);
	   for(int i=0;i<mid;i++)
	      ans+=s.charAt(i);
	   int space=n-1;
	   for(int i=0;i<n;i++)
	   {
	       for(int j=0;j<space;j++)
	         System.out.print(" ");
	       space--;
	       for(int k=0;k<i+1;k++)
	         System.out.print(ans.charAt(k));
	       System.out.println();
	   }
	}
}