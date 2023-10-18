import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class randomStringGenerator extends JPanel implements ActionListener {

	private static final String alphabetPool = "abcdefghijklmnopqrstuvwxyz"+"0123456789"+"ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789";

	JLabel jlAlphabetIncludes, jlAlphabetPool0, jlAlphabetPool1, jlAlphabetPool2, jlLenght, jlString;
	JTextField jtLength, jtString;
	JButton jbGenerate;

	public randomStringGenerator() {

		jlAlphabetIncludes=new JLabel("Alphabet includes:");

		jlAlphabetPool0=new JLabel("abcdefghijklmnopqrstuvwxyz");
		jlAlphabetPool0.setForeground(Color.red);
		
		jlAlphabetPool1=new JLabel("0123456789");
		jlAlphabetPool1.setForeground(Color.magenta);
		
		jlAlphabetPool2=new JLabel("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		jlAlphabetPool2.setForeground(Color.blue);

		jlLenght=new JLabel("Enter the LENGTH of String:");

		jtLength=new JTextField(10);
		jtString=new JTextField(50);

		jbGenerate=new JButton("Generate String");
		jbGenerate.addActionListener(this);


		add(jlLenght); add(jtLength); add(jbGenerate); add(jtString);
		add(jlAlphabetIncludes); add(jlAlphabetPool0); add(jlAlphabetPool1); add(jlAlphabetPool2);
		this.setBackground(Color.LIGHT_GRAY);
	}

	public void actionPerformed(ActionEvent actEvent){
		int givenLength;
		givenLength=Integer.parseInt(jtLength.getText());
		StringBuilder sb=new StringBuilder(givenLength);
		for(int i=0; i<givenLength;i++) {
				int index = (int)(alphabetPool.length()*Math.random());
				sb.append(alphabetPool.charAt(index));
		}
		String generatedString=sb.toString();

		jtString.setText(generatedString);
	}

}