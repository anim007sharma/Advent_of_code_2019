import java.io.*;
import java.util.*;

class AOC_19_Day2
{
	public static void main(String []args) throws FileNotFoundException
	{
		File file = new File("C:\\Users\\a.ae.kumar.sharma\\Documents\\Java\\Input_Day2.txt");
		Scanner sc = new Scanner(file);
		String line;
		String[] lineVector = new String[1000];
		int[] arr = new int[1000];
		int cnt=0;
		while(sc.hasNextLine())
		{
			line=sc.nextLine();
			lineVector=line.split(",");
		}
		for(int i=0; i<lineVector.length; i++)
			arr[cnt++]=Integer.parseInt(lineVector[i]);
		arr[1]=12;
		arr[2]=2;
		for(int i=0; i<cnt; i=i+4)
		{
			if(arr[i]==1)
			{
				arr[arr[i+3]]=arr[arr[i+1]]+arr[arr[i+2]];
			}
			if(arr[i]==2)
			{
				arr[arr[i+3]]=arr[arr[i+1]]*arr[arr[i+2]];
			}
			if(arr[i]==99)
			{
				break;
			}
		}
		System.out.print(arr[0]);
	}
}