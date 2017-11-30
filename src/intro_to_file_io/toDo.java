package intro_to_file_io;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class toDo implements ActionListener{
	Frame frame = new Frame();
	Panel panel = new Panel();
	Button button1 = new Button("Add Task");
	Button button2 = new Button("Remove Task");
	Button button3 = new Button("Save");
	Button button4 = new Button("Load");
	ArrayList<String> list=new ArrayList <String>();
	public void makestuff() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}
public static void main(String[] args) {
	toDo t = new toDo();
	t.makestuff();

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == button1) {
		String userAnswer = JOptionPane.showInputDialog("Give me a task!");
		list.add(userAnswer);
	}
	else if(e.getSource() == button2) {
		String finalList = "";
		for(int i = 0; i<list.size(); i++) {
			finalList += i+ " " + list.get(i) + "\n";
		}
		String userAnswer2 = JOptionPane.showInputDialog(finalList + "\n" + "Type in the index of the task you want to delete.");
		int userAnswerInt = Integer.parseInt(userAnswer2);
		if(list.size()>userAnswerInt) {
			list.remove(userAnswerInt);
		}
	}
}
}
