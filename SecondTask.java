import javax.swing.*;
import java.awt.*;

class SecondTask extends JFrame
{
	JLabel label;
	String str;
	JFrame f = new JFrame();
	String[] splt;
	StringBuilder sr = new StringBuilder();

	SecondTask()
	{
		setSize(350,350);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		label = new JLabel("Thank You..! Your Second Task Complete here...!");
		add(label);

		str=JOptionPane.showInputDialog("Enter Your String");
		String[] ansString = str.split("\\.");

		for(int i=0;i < ansString.length;i++)
		{
			splt = ansString[i].split(" ");
			for(int j= splt.length-3; j > 0; j--)
			{
				sr.append(" "+splt[j]);
            		}
            		for(int g = 3; g < splt.length; g++)
            		{   
                    		sr.append(" "+splt[g]);
            		}
			sr.append(".");
		}
		JOptionPane.showMessageDialog(f,sr);	
		//JOptionPane.showMessageDialog(f,str);
		
		
		setVisible(true);
	}

	public static void main(String args[])
	{
		new SecondTask();
	}
}

//This is a coding test. I like java so much. This is my day. 
//a is This coding test. java like I so much. is This my day. 