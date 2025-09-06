package week3.day2singleinheritance;

public class Logindata extends TestData{
	public void enterusername() {
		System.out.println("the name is tharan");
		
		
	}public void passowrd() {
		System.out.println("the paswoerd is 123");
		
		
	}
	public static void main(String[] args) {
		Logindata L1=new Logindata();
		L1.enterusername();
		L1.enterusername();
		L1.entercredentials();
		L1.navigatetohomepage();
	}

}
