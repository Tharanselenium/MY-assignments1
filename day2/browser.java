package week1.day2;

public class browser {
	public void launchBrowser(String browserName) {
        System.out.println(browserName + " browser is launched.");
    }

    public void closeBrowser(String browserName) {
        System.out.println(browserName + " browser is closed.");
    }

    public static void main(String[] args) {
        browser bro = new browser();
        bro.launchBrowser("Chrome");
        bro.closeBrowser("Chrome");
    }


}
