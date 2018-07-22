import java.io.File;

public class createfolder {
	public static void main(String[] args) {
		File f1= new File("D://RSCW-21");
		if (f1.mkdirs()){
			System.out.println("file is created");
		}else {
			System.out.println("file is not created");
		}
	if (f1.exists()){
		System.out.println("folder exisits");
	}else{
		System.out.println("folder doesnot exist");
	}
	if (f1.delete()){
		System.out.println("file is deleted");
	}
	}
	

}
