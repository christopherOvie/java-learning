package pages;

public class FaceBook extends Base{

	
	public void login(String uid,String pwd) {
		System.out.println("code to login");
	}
	public static void main(String[] args) {
		FaceBook facebook = new FaceBook();
		facebook.setUp("chrome");
		facebook.openURL("https://www.facebook.com/");
		facebook.login("ccc", "gggggg");
	}

}
