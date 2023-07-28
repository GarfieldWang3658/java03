public class CharDetail{
	public static void main(String[] args){
		char c1 = 97;
		//在java中，char的本质是一个整数，在默认输出时，是unicode码对应的字符
		//要输出对应的数字，可以（int）字符


		System.out.println(c1);

		char c2 = 'a';//输出‘a’对应的数字
		System.out.println((int)c2);

		char c3 = '韩';
		System.out.println((int)c3);//38889

		char c4 = 38889;
		System.out.println(c4);//韩

		System.out.println('a'+ 10 );//107

		//char 是可以运算的
		char c5 = 'b' + 1 ;//99
		System.out.println((int)c5);//99
		System.out.println(c5);//99对应的字符-》编码表 ASCII（规定好的）==c









	}



}