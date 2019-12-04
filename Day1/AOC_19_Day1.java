import java.io.*;
import java.util.*;

class AOC_19_Day1
{
	public static void main(String []args) throws FileNotFoundException
	{
		File file = new File("C:\\Users\\a.ae.kumar.sharma\\Documents\\Java\\Input_Day1.txt");
		Scanner sc = new Scanner(file);
		int arr[] = new int[10000];
		int cnt=0;
		while(sc.hasNextLine())
		{
			arr[cnt++]=sc.nextInt();
		}
		int sum_of_fuels=0;
		for(int i=0; i<cnt; i++)
		{
			sum_of_fuels += (arr[i]/3 -2);
		}
		System.out.println(sum_of_fuels);
	}
}