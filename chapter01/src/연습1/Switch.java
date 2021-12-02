package 연습1;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String medal = "Gold";
				
	    switch(medal){
	    case "Gold":
	    	System.out.println("금메달 입니다.");
	    	break;
	    case "Silver":
	    	System.out.println("은메달 입니다.");
	    	break;
	    case "Beonze":
	    	System.out.println("동메달 입니다.");
	    	break;
	    default:
	    	System.out.println("메달이 없습니다.");
	    	break;
	    }
	}

}
