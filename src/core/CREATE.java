package core;
import java.io.*;
public class Create {

	       public static void main(String[] args) throws IOException {
	              File f = new File("hw_99.txt");
	              String content1 = "01, Alex Moore, alex.moore@gmail.com";
	              String content2 = "02, Nikita Moore, nikita.moore@gmail.com";
	              String content3 = "03, Dmitry Nakhabtsev, dmitry.nakhabtsev@gmail.com";
	              String content4 = "04, James Gosling, james.gosling@gmail.com";

	              if (!f.exists()) {f.createNewFile();}
	              FileWriter fw = new FileWriter(f.getAbsoluteFile(), true);      // Append
	              BufferedWriter bw = new BufferedWriter(fw);
	              bw.write(content1); bw.newLine();
	              bw.write(content2); bw.newLine();
	              bw.write(content3); bw.newLine();
	              bw.write(content4); bw.newLine();
	              bw.close();
	       System.out.println("Done"); }}

