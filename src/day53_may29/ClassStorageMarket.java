package day53_may29;

public class ClassStorageMarket {

	public static void main(String[] args) {

		CloudStorage cl = new CloudStorage(50, 2, "mustafa", "mustafa123");
		GoogleDrive gl = new GoogleDrive(50, 3, "Sungur", "1234", true);
		
		System.out.println(cl);
		System.out.println(gl);
		
		CloudStorage.changeRegion("USA");
		GoogleDrive.changeRegion("Canada");
		
		System.out.println(GoogleDrive.region);
		System.out.println(CloudStorage.region);
	}

}
