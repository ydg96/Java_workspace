package ch13;

public class GateWay {
public static int zealotCount; 
	
	private int gateWayId; 
	private String name; 
	
	public GateWay(int id) {
		this.gateWayId  = id;
		name = "����Ʈ����";
	}
	// �޼��� ���� Ÿ������ ��ü�� ���� 
	// ������ �����ϱ� 
	// public ����Ÿ�� createUnit() {} 
	public Unit createUnit(int target) {
		// �Ű����� 1. ���� 
		// �Ű����� 2. ��� 
		// �Ű����� 3. ��ũ���÷� 
		zealotCount++; 
		System.out.println("������ ���� �մϴ�.");
		if(target == 1) {
			return new Zealot("����" + zealotCount); 
		} else if (target == 2) {
			return new Dragon("���");
		} else {
			return new DarkTempler("��ũ ���÷�");
		}
//		return new Zealot("����" + zealotCount);
	
}
}
