package Ip-Cutter;

public class Main {
public static void main(String [] arga)
{
	Cutt c=new Cutt("163.121.12.30");
	
	int[] ip=c.cut();
	
	for(int i=0;i<ip.length;i++)
	{
		System.out.println(ip[i]);
		
	}

	
			
	
	
}
}
