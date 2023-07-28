public class AutoConvert{
	public static void main(String[] args){
		//自动类型转换细节
		//细节1、多种类型的数据混合运算时
		//系统首先就自动将所有数据内容转换成容量最大的那种数据类型，然后进行运算；
		int n1 = 10；

		// float d1 = n1 + 1.1; //错误n1 + 1.1 =>结果类型是double
		// //正确如下
		// double d1 = n1 + 1.1;//对
		float d1 = n1 + 1.1F;//n1（int整数精度<float浮点精度） + 1.1（类型为float） =>结果类型是float

		//细节2、当把精度大的数据类型赋值给精度（容量）小的数据类型时，
		//会报错，反之就会进行自动类型转换。

		// int n2 = 1.1；//错 精度 double > int
		
		//细节3、【byte】，【short】和【char】之间不会自动转换。
		//当把具体的数值赋给byte时，先判断数是否在byte范围内，如果是就可以。
		byte b1 = 10; //对，-128～127
		// int n2 = 1;//n2 是int类型，按照4个字节存放的，
		// byte b2 = n2;//b2 的存储空间只有1个字节，错误原因：如果按变量赋值，判断类型。

		// char c1 = b1; // 错误 【byte】不能自动转换成【char】


		//细节4、byte，short、char 三者可以计算，在计算时首先转换为int类型

		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		//short s2 = b2 + s1;//错 b2 + s1 =》int
		int s2 = b2 + s1;

		//byte b4 = b2 + b3;//b2 + b3 ==》 int

		//细节5 boolean 不参与转换

		boolean pass = true;
		//int num100 = pass;//boolean不参与类型的自动转换，

		//细节6 自动提升原则，表达式结果的类型自动提升为，操作数中最大的类型

		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 = 1.1;

		double num500 = b4 + s3 + num200 + num300;//double精度最高，















}
}