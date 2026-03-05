package co.sa.plcode;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import com.sa.db.DbUtilsCls;
import com.sa.recs.Register;

public class MyFrame extends JFrame {
	DbUtilsCls cls = new DbUtilsCls();

	public MyFrame() {
		Container cnt = getContentPane();
		JComboBox<String> box = null;
		Vector<String> vec = new Vector<String>();
		List<Register> li = cls.retRegs();
		li.parallelStream().forEach(n -> {
			vec.add(n.toString());
		});
//		li.stream().forEach(n -> {
//			vec.add(n.toString());
//		});
		box = new JComboBox<String>(vec);
		cnt.add(box);
	}
}
