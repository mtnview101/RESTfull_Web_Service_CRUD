package core;
import java.io.*;

	public class Read_all {

	       @SuppressWarnings("resource")
	       public static void main(String[] args) throws FileNotFoundException, IOException {
	              File f = new File("hw_9.txt");
	              if (!f.exists()) {
	                     System.out.println("File is not exist");
	                     System.exit(1);}
	              BufferedReader br = new BufferedReader(new FileReader(f));
	              String line;
	              while ((line = br.readLine()) != null)
	       System.out.println(line); }}

