package a210810;

import java.awt.*;

public class TextFieldEx {
	public static void main(String[] args) {
		Frame f = new Frame("Textfield test");
		Panel p = new Panel();
		
		TextField tf1 = new TextField("ID �Է�", 12);
		TextField tf2 = new TextField("PW �Է�", 10);
		
		tf1.selectAll();
		tf2.selectAll();
		
		tf2.setEchoChar('*');
		
		p.add(tf1);
		p.add(tf2);
		
		f.add(p);
		
		f.setSize(300, 100);
		f.setVisible(true);
	}
}
