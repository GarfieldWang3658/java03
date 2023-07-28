public class FocreConvertDetail{
	public static void main(String[] args){
		//演示强制类型转换
		//强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
		//int X = (int)10*3.5+6*1.5;//数据类型应该是double，编译错误doubule=》int
		int x = (int)(10*3.5+6*1.5);//(int)44.0 -> 44

		System.out.println(x);//44

		char c1 = 100;
		int m =100;
		char c2 = m;//错误
		char c3 = (char)m;
		System.out.println(c3);//100对应的字符，ascII表输出100对应的字符为d；
		
			
		}



	}
}