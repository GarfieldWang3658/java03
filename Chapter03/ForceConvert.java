public class ForceConvert{
	public static void main(String[] args){
		int n1 = (int)1.9;
		//强制类型转换

		System.out.println("n1=" + n1);//造成精度损失

		// int j = 100;
		// byte b1 = (byte)j;

		// System.out.println(b1);

		int n2 = 2000;
		byte b1 = (byte)n2;

		System.out.println("b1=" + b1);//造成数据溢出


}
}