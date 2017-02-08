package core;
import java.io.*;

	public class Read {
	       @SuppressWarnings("resource")
	       public static void main(String[] args) throws FileNotFoundException, IOException {
	              File f = new File("hw_9.txt");
	              if (!f.exists()) {
	                     System.out.println("File is not exist");
	                     System.exit(1); }
	              String line_to_find = "01";
	              BufferedReader br = new BufferedReader(new FileReader(f));
	              String line;
	              while ((line = br.readLine()) != null)
	                     if (line.trim().contains(line_to_find.trim())) {
	            System.out.println(line); }}}

