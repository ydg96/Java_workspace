package ch10;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//질럿
		Zealot zealot1 = new Zealot("질럿1");
	//	zealot1.showInfo();
	//마린
	    Marine marine1 = new Marine("마린2");
	    Marine marine2 = new Marine("마린1");
	 //   marine1.showInfo();
	//저글링
	    Zergling zergling1 = new Zergling("저글링1");
	  //  zergling1.showInfo();
		
	    ////////////////////////////////////객체 3개 생성////////////////////
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
