package a210823;

import java.io.*;

public class PrintStreamEx {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		try {
			fos = new FileOutputStream("d:\\test\\printStream.txt");
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos, true);
			
			ps.println("����");
			ps.println(1234);
			ps.println(true);
			ps.println('a');
		}catch(IOException ie) {
			ie.printStackTrace();
		}finally {
			try {
				if(fos != null)
					fos.close();
				if(bos != null)
					bos.close();
				if(ps != null)
					ps.close();
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}
