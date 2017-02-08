package core;

import java.io.*;
import org.apache.commons.io.FileUtils;


	public class Delete {

	       @SuppressWarnings({ "resource" })
	       public static void main(String[] args) throws IOException {
	              File f = new File("hw_9.txt");
	              File t = File.createTempFile("tmp", ".txt");
	              if (!f.exists()) {
	                     System.out.println("File is not exist");
	                     System.exit(1);}
	                               String line_to_delete = "01, Alex Moore, alex.moore@gmail.com".replaceAll("\r", "").replaceAll("\n", "");

	              BufferedWriter bw_tmp = new BufferedWriter(new FileWriter(t));
	              BufferedReader br = new BufferedReader(new FileReader(f));
	              String line;
	              while ((line = br.readLine()) != null) {
	                     if (line.trim().equalsIgnoreCase(line_to_delete.trim())) {continue;}
	                     bw_tmp.write(line);
	                     bw_tmp.newLine();
	              }
	              bw_tmp.close();
	              FileUtils.copyFile(t, f);                // Mac - t.renameTo(f);  
	              t.delete();
	       System.out.println("deleted"); }}

