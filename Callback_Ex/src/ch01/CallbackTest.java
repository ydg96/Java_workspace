package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

interface CallbackBtnAction{
	public abstract void clickedAddBtn();
	public void cilckedMinusBtn();
	//매개변수로 값 전달(기본 데이터 타입,object)
	public void passValue(int value);
	
	
	
}



//콜백받는 객체:CallbackBtnAction 인터페이스를 구현해서 메서드를 사용 한다.
class MainActivity extends JFrame implements CallbackBtnAction{
	int count;
	JLabel label;
	
	public MainActivity() {
		count = 0;
		label =new JLabel(count + "");
		setSize(300,300);
		setLayout(new FlowLayout());
		add(label);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void clickedAddBtn() {

		System.out.println("+ 버튼 콜백 받았습니다.");
		count ++;
		label.setText(count + "");
		
	}

	@Override
	public void cilckedMinusBtn() {

		System.out.println("- 버튼 콜백 받았습니다.");
		count --;
		label.setText(count + "");
		
	}

	@Override
	public void passValue(int value) {
		// TODO Auto-generated method stub
		System.out.println("매개 변수로 값 전달 받음" + value);
	}


	}


//콜리 (호출자): 콜백 받는 객체에 주소값을 알고 있어야 어떠한 동작을 실행되었다고 알릴수 있다.
class SubActivity extends JFrame implements ActionListener{
	JButton btnAdd;
	JButton bynMinus;
	JButton btnPassValue;
	
	CallbackBtnAction callbackBtnAction;
	
	public SubActivity(CallbackBtnAction callbackBtnAction) {
		this.callbackBtnAction = callbackBtnAction;
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btnAdd = new JButton("더하기 버튼");
		bynMinus = new JButton("뺴기 버튼");
		btnPassValue = new JButton("값 전달하기");
		
		
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		
		add(btnAdd);
		add(bynMinus);
		add(btnPassValue);
		
		btnAdd.addActionListener(this);
		bynMinus.addActionListener(this);
		btnPassValue.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		JButton targetBtn =(JButton)e.getSource();
		if(targetBtn.getText().equals(btnAdd.getText())) {
		//	System.out.println("더하기 버튼이 클릭 되었습니다.");
			//우리가 정의한 메서드 호출
			this.callbackBtnAction.clickedAddBtn();
		}else if(targetBtn.getText().equals(bynMinus.getText())) {
			this.callbackBtnAction.cilckedMinusBtn();
		}else {
			this.callbackBtnAction.passValue(400);
		}
			
		}
		
	}





public class CallbackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainActivity mainActivity =	new MainActivity();
		
		new SubActivity(mainActivity);
		
}
}