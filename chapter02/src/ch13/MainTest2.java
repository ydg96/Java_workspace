package ch13;

public class MainTest2 {

public static void main(String[] args) {
		
		GateWay gateWay = new GateWay(1);
		Unit unit1 =  gateWay.createUnit(1);
		Unit unit2 =  gateWay.createUnit(2);
		Unit unit3 =  gateWay.createUnit(3);
		//zealot1.attack(zealot3);
		System.out.println(GateWay.zealotCount);

	}



}
