package intro_to_file_io;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class toDo implements ActionListener {
	Frame frame = new Frame();
	Panel panel = new Panel();
	Button button1 = new Button("Add Task");
	Button button2 = new Button("Remove Task");
	Button button3 = new Button("Save");
	Button button4 = new Button("Load");
	ArrayList<String> list = new ArrayList<String>();

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

	public void load() {

		try {
			BufferedReader b = new BufferedReader(new FileReader("src/intro_to_file_io/encrypt.txt"));
			String line = b.readLine();
			while (line != null) {
				list.add(line);
				line = b.readLine();
			}
			b.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		toDo t = new toDo();
		t.makestuff();
		t.load();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			String userAnswer = JOptionPane.showInputDialog("Give me a task!");
			list.add(userAnswer);
		} else if (e.getSource() == button2) {
			String finalList = "";
			for (int i = 0; i < list.size(); i++) {
				finalList += i + " " + list.get(i) + "\n";
			}
			String userAnswer2 = JOptionPane
					.showInputDialog(finalList + "\n" + "Type in the index of the task you want to delete.");
			int userAnswerInt = Integer.parseInt(userAnswer2);
			if (list.size() > userAnswerInt) {
				list.remove(userAnswerInt);
			}
		} else if (e.getSource() == button3) {
			String finalList2 = "";
			for (int i = 0; i < list.size(); i++) {
				finalList2 += list.get(i) + "\n";
			}
			try {
				FileWriter w = new FileWriter("src/intro_to_file_io/encrypt.txt");
				w.write(finalList2);
				w.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (e.getSource() == button4) {
			String verylongstring = "";
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/encrypt.txt"));
				String line = br.readLine();
				while (line != null) {
					verylongstring = verylongstring + line + "\n";
					line = br.readLine();
				}
				System.out.println(verylongstring);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}
}
