package test;

public class tt {
	public int add(int a,int b)
	{
		return (a+b);
	};
	public int subtract(int a,int b)
	{
		return (a-b);
	};
	public int multiply(int a,int b)
	{
		return (a*b);
	};
	public int divide(int a,int b)
	{
		if(b==0)
		{
			System.out.print("��ĸ����Ϊ0");
			return 0;
		}
		else
		{

			return (a/b);
		}
	}
}
