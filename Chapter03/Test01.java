public class Test01{
	public static void main(String[] args){
	short s = 12;//对
	//s = s - 9;//错，数据类型应该转换为int
	int x = s - 9;
	byte b = 10;//对
	//b = b + 11;//错 数据类型应该为int
	b = (byte)(b + 11);//对，强制转换
	
	char c = 'a';//对
	int i = 16;//对
	float d = .314F;//对
	double result = c + i +d;//对 float-》double 自动转换

	byte e = 16;//ok
	short f =14;//ok
	//short t = s + e;//错，byte、short 运算时数据类型应该为int
	int t = f + e;

	System.out.println(x);
	System.out.println(result);
	System.out.println(t);



	}
}