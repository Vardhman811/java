package p1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class files {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File direc= new File("Mr");
		direc.mkdir();
		File direcd= new File("Mr\\\\VJ\\\\is\\best\\e.txt");
		//direcd.mkdirs();
		direcd.createNewFile();
		File dir= new File("Mr\\\\VJ\\\\is\\best\\a.txt");
		
		try (BufferedWriter bw =new BufferedWriter(new FileWriter(dir,true))){
			bw.write("Mr");
			bw.newLine();
			bw.write("Vj");
			bw.newLine();
			bw.write("Is");
			bw.newLine();
			bw.write("Great");
			bw.newLine();
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		String line;
		BufferedReader br=new BufferedReader(new FileReader(dir));
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		}

}
