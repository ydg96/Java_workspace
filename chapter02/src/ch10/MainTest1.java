package ch10;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//����
		Zealot zealot1 = new Zealot("����1");
	//	zealot1.showInfo();
	//����
	    Marine marine1 = new Marine("����2");
	    Marine marine2 = new Marine("����1");
	 //   marine1.showInfo();
	//���۸�
	    Zergling zergling1 = new Zergling("���۸�1");
	  //  zergling1.showInfo();
		
	    ////////////////////////////////////��ü 3�� ����////////////////////
	    zealot1.attackMarine(marine1);
	    zealot1.attackMarine(marine1);
	    zealot1.attackMarine(marine1);
	    zealot1.attackMarine(marine1);
	    zealot1.attackMarine(marine1);
	    zealot1.attackMarine(marine1);
	    zealot1.attackMarine(marine1);
	    zealot1.attackMarine(marine1);
	    zealot1.attackMarine(marine1);
	    zealot1.attackMarine(marine1);
	    zealot1.attackMarine(marine1);
	    zealot1.attackMarine(marine1);
	    zealot1.attackMarine(marine1);
	    zealot1.attackMarine(marine1);
	    zealot1.attackMarine(marine1);
	    
	    System.out.println(marine2.getHp());
	    if(marine2.getHp() < 0) {
	    	marine2 =null;
	    }
	    
	  // marine1.showInfo();
	    zealot1.attackMarine(marine2);
	    marine2.showInfo();
	    
	    marine1.attackZealot(zealot1);
	    marine1.attackZealot(zealot1);
	    marine1.attackZealot(zealot1);
	    zealot1.showInfo();
	    
	    zergling1.attackZealot(zealot1);
	    zergling1.attackZealot(zealot1);
	    zergling1.attackZealot(zealot1);
	    zergling1.attackZealot(zealot1);
	    zergling1.attackZealot(zealot1);
	    zergling1.attackZealot(zealot1);
	    zergling1.attackZealot(zealot1);
	    zergling1.attackZealot(zealot1);
	    zergling1.attackZealot(zealot1);
	    zealot1.showInfo();
	    
	    zealot1.attackZergling(zergling1);
	    zealot1.attackZergling(zergling1);
	    zealot1.attackZergling(zergling1);
	    zealot1.attackZergling(zergling1);
	    zealot1.attackZergling(zergling1);
	    zealot1.attackZergling(zergling1);
	    zealot1.attackZergling(zergling1);
	    zealot1.attackZergling(zergling1);
	    zealot1.attackZergling(zergling1);
	    zealot1.attackZergling(zergling1);
	    zealot1.attackZergling(zergling1);
	    zealot1.attackZergling(zergling1);
	    zealot1.attackZergling(zergling1);
	    zergling1.showInfo();
	   }

}
