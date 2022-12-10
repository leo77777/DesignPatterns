package fr.leo.dp.Mediator_1;
import javax.swing.JButton;

public class MyJButton extends JButton implements Cloneable {

	private static final long serialVersionUID = -6241822587832464827L;

	public MyJButton() {
		this.setSize(30,20);
		this.setText("           ");
	}
	
	public MyJButton cloner() {
		MyJButton temp = null;
		try {
			temp =  (MyJButton) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return temp;
	}
}
