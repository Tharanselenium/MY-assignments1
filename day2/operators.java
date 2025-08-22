package week1.day2;

public class operators {
	public static void main(String[] args) {
		//Arithmetic operators
		
	System.out.println(5+5);
	System.out.println(4/2);//division--->quotient
	System.out.println(11%2);//modulo--->remainder
	
	//assignment operators
	
	int a=5, b=10;
	a+=5;//a=a+5--->a=5+5=10
	System.out.println(a);
	b-=3;//b=b-3
	System.out.println(b);//7
	b*=2;//b=b*2---->7*2=14
	System.out.println(b);
	
	//comparison operators
	System.out.println(5==5);
	System.out.println(7>=5);
	
	//logical
	System.out.println((5==5)&&(6>7));//1*0--->0--->false
	System.out.println((8>7)&&(3<=4));
	System.out.println((1==2)||(6>8));//0+0=0--->false
	System.out.println((6>-8)&&(2==3)||(9>0));//1*0--->0+1--->1--->true
	//unary operators
	int c=5;
	System.out.println(++c);//6preincrement
	System.out.println(c++);//6(post increment)
	System.out.println(c);//7
	
	System.out.println(--c);//7-1--->6
	System.out.println(c--);
	System.out.println(c);

	}

}


