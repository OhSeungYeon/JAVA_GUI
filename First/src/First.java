import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class First {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("창이름");
		
		JPanel Panel = new JPanel(); //frame안에는 하나의 요소만 들어갈수 있어서 여러개의 아이들을 받고 싶어서 
		
		JLabel label1 = new JLabel("기본값");
		label1.setText("잘가"); //label에 기본값이라는 글씨를 중간에 잘가로 바꿔준다.
		
		JLabel label2 = new JLabel();
		label2.setText("가지마");
		
		Panel.add(label1);
		Panel.add(label2);
		frame.add(Panel);
		frame.pack(); //안에 label만큼 커지고 작아진다.
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X버튼을 누르면 프로그램도 같이 종료된다.(원래는 프로그램 종료가 같이 되지 않는다.)
		
	}

}
