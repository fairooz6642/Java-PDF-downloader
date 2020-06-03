package url;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		String link="..."; //Give the link from where the file is to be downloaded
		File out=new File("F:\\something.pdf"); //Write the directory where the downloaded file will be, remember to add the pdf extention
		new Thread(new Download(link, out)).start();

	}

}
