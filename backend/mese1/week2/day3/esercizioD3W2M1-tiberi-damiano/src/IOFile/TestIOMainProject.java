package IOFile;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class TestIOMainProject {
	
	static File file = new File("dirFile/test.txt");

	public static void main(String[] args) {
		
		try {
			scriviFile("Test di scrittura su file");
			String testoDaFile = leggiFile();
			System.out.println(" Testo del File: " + testoDaFile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	
	public static void scriviFile(String testo) throws IOException {
		FileUtils.writeStringToFile(file, testo, "UTF-8");
		System.out.println("Scrittura completata su file");
	}
	
	public static String leggiFile() throws IOException {
		String txtFile = FileUtils.readFileToString(file, "UTF-8");
		return txtFile;
	}
	
	public static void cancellaFile() {
		FileUtils.deleteQuietly(file);
	}
	
	public static void cancellaDir() throws IOException {
		FileUtils.deleteDirectory(file);
	}
	
	public static void generaFile() {
		File file = new File("dirFile/test.txt");
	}

}
