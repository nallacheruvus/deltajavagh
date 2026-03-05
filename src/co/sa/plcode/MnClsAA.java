package co.sa.plcode;

import java.awt.FlowLayout;
import java.util.List;
import java.util.function.Consumer;

import com.sa.db.DbUtilsCls;
import com.sa.recs.MyView;
import com.sa.recs.Register;

public class MnClsAA {

	static DbUtilsCls cls = new DbUtilsCls();

	public static void main(String[] args) {
		List<Register> li = cls.retRegs();
		List<MyView> lia=cls.retList();
		MyFrame frame=new MyFrame();
		frame.setDefaultCloseOperation(2);
		frame.setVisible(true);
		frame.setSize(700, 700);
		frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
	}

	public static void methEight(List<MyView> lia) {
		//reduce the dimensions of collection flatmap
//		lia.stream()
//		   .flatMap(view -> java.util.stream.Stream.of(view.name(), view.email()))
//		   .forEach(System.out::println);
		lia.stream().map(n->n.name()+"\n"+n.email()).forEach(System.out::println);
	}

	public static void methSeven() {
		for (int i = 0; i < 10000000; i++) {
			System.out.println("Log("+i+")="+Math.log(i));
		}
	}

	public static void methTwo(List<MyView> lia) {
		lia.parallelStream().forEach(n->System.out.println(n));
	}

	public static void methOne(List<Register> li) {
		li.parallelStream().forEach(new Consumer<Register>() {
			@Override
			public void accept(Register t) {
				System.out.println(t);
			}
		});
		// li.stream().forEach(new Consumer<Register>() {
//			@Override
//			public void accept(Register t) {
//				System.out.println(t);
//			}
//		});
	}

}
