import javax.swing.*;
import java.awt.*;

public class randomStringGeneratorExecution {

	public static void main(String args[]){
		JFrame jf=new JFrame("Random String Generator");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		randomStringGenerator add=new randomStringGenerator();
		jf.add(add);
		jf.pack();
		jf.setSize(1050,100);
		jf.setResizable(false);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = jf.getSize();
		jf.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

		jf.setVisible(true);
	}

}