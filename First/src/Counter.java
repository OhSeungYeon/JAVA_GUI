import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Counter {

	public static void main(String[] args) {

		JFrame frame = new JFrame("창이름");
		Dimension dim = new Dimension(500, 300); // 창 크기 지정
		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
		double windowsWidth = res.getWidth();
		double windowsHeight = res.getHeight();
		frame.setPreferredSize(dim);
		//frame.setLocation((1920-500)/2, (1080-300)/2); // 창이 뜨는 위치 지정(가운데로 지정)  => 이렇게 하면 컴퓨터마다의 해상도마다 가운데 지정의 문제가 있음 
		frame.setLocation(((int)windowsWidth-500)/2, ((int)windowsHeight-300)/2); // 위에 문제를 해결해줌

		JPanel panel = new JPanel();
		JLabel lbId = new JLabel("아이디");
		//JTextField tfId = new JTextField("ID를 입력해주세요"); // 기본값의 길이만큼 텍스트창의 길이도 정해진다.
		JTextField tfId = new JTextField(10);
		JLabel lbPassword = new JLabel("비밀번호");
		JTextField tfPassword = new JTextField(10);
		JLabel lbGender = new JLabel("성별 : "); 
		JRadioButton rbFemale = new JRadioButton("여자");
		JRadioButton rbMale = new JRadioButton("남자");
		ButtonGroup bg = new ButtonGroup(); // Raddio박스는 그룹으로 묶어주기 
		bg.add(rbFemale);
		bg.add(rbMale);
		
		JLabel lbMeal = new JLabel("식사 : ");
		JCheckBox cbChicken = new JCheckBox("치킨");
		JCheckBox cbPizza = new JCheckBox("피자");
		JLabel lbEdu = new JLabel("학력 : ");
		String[] edu = {"초졸", "중졸"};
		JComboBox<String> cxEdu = new JComboBox<>(edu);
		cxEdu.addItem("고졸"); // 중간에 리스트 추가해주기
		JButton bts = new JButton("알미~");
		
		panel.add(lbId);
		panel.add(tfId);
		panel.add(lbPassword);
		panel.add(tfPassword);
		panel.add(lbGender);
		panel.add(rbFemale);
		panel.add(rbMale);
		panel.add(lbMeal);
		panel.add(cbChicken);
		panel.add(cbPizza);
		panel.add(lbEdu);
		panel.add(cxEdu);
		panel.add(bts);
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
