public class FolatDetail{
	public static void main(String[] args){
		float num2 = 1.1F;
		double num3 = 1.1;
		double num4 = 1.1F;//对的
		double num5 = .123;//等于0.123

		System.out.println(num5);

		System.out.println(5.12e2);//5.12*10的2次方
		System.out.println(5.12E-2);//0.0512

		double num9 = 2.1213456675443234;
		float num10=2.1213456675443234F;


		System.out.println(num9);
		System.out.println(num10);

		double num11 = 2.7;
		double num12 = 8.1 / 3;

		System.out.println(num11);
		System.out.println(num12);//接近2.7的小数，而不是2.7
		//当我们运算结果是小数的进行相等判断时要小心
		//应该是以两个数差值的绝对值，在某个精度范围类判断

		// if( num11 == num12 ){
		// 	System.out.println("相等");

		// }
		if(Math.abs(num11 - num12) < 0.001){

			System.out.println("差值非常小，到我的规定进度，认为相等...");
		}

		//正确写法
		//ctrl + / 多行注释，再次输入就可以取消注释
		//可以通过javaAPI来看

		System.out.println(Math.abs(num11 - num12));











	}

}