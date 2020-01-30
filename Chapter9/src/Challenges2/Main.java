package Challenges2;

public class Main {

	public static void main(String[] args) {
		MiniVan miniVan2 = new MiniVan("XXXXXX", 145f, 10);
		System.out.println(miniVan2 + " speed is " + miniVan2.getMaximalSpeed());
		
		TucTuc tuctuc = new TucTuc("YYYYYYY", 45f, 3);
		System.out.println(tuctuc + " speed is " + tuctuc.getMaximalSpeed());
	
		BatMobile batman = new BatMobile("ZZZZZZZ", 75f, false);
		System.out.println(batman + " speed is " + batman.getMaximalSpeed());
	}

}
