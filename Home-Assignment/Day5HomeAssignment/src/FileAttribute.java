import java.io.File;

public class FileAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file=new File("F:\\Io\\temp\\demo.txt");
		System.out.println("Name: "+file.getName());
		System.out.println("Path: "+file.getPath());
		System.out.println("AbsPath: "+file.getAbsolutePath());
		System.out.println("canRead: "+file.canRead());
		System.out.println("CanWrite: "+file.canWrite());
		System.out.println("Exists: "+file.exists());
		System.out.println("Parent: "+file.getParent());
		System.out.println("isDirectory: "+file.isDirectory());
		System.out.println("LastModify: "+file.lastModified());
		
		
	}

}
