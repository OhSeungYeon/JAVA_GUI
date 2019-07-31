import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClickCounter {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("클릭 -> 카운터 증가");
		Dimension dim = new Dimension(500, 300);
		frame.setPreferredSize(dim);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		JLabel lbCounter = new JLabel("10");
		lbCounter.setHorizontalAlignment(JLabel.CENTER);
		JButton btCounter = new JButton("Click Counter");
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { //onClick
				//버튼이 눌리면 실행할 명령어를 쓰자
				//lbCounter에 있는 값을 읽자
				String oldStr = lbCounter.getText();
				//그 값에 1을 더하자
				// String -> int
				int newInt = Integer.parseInt(oldStr);
				// int ++
				newInt--;
				//lbCounter에 더한 값을 쓰자
				// int -> String
				String newStr = String.valueOf(newInt);
				lbCounter.setText(newStr);
			}
		};
		
		btCounter.addActionListener(al); //버튼이랑 버튼을 눌렀을 때의 동작을 연결하기
		
		panel.add(lbCounter);
		panel.add(btCounter);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
