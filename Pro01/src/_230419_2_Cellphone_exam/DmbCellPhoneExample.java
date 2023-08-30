package _230419_2_Cellphone_exam;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		DmbCellPhone dmbcellphone = new DmbCellPhone("자바폰" , "검정" , 10);
		
		System.out.println("모델 : " + dmbcellphone.model);
		System.out.println("색상 : " + dmbcellphone.color);
		System.out.println("채널 : " + dmbcellphone.channel);
		
		dmbcellphone.powerOn();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("여보세요");
		dmbcellphone.receiveVoice("안녕하세요! 저는 홍길동 인데요");
		dmbcellphone.sendVoice("아 ~ 예 반갑습니다.");
		dmbcellphone.hangUp();
		
		dmbcellphone.turnOnDnb();
		dmbcellphone.changeChannelDmb(12);
		dmbcellphone.turnOffDmb();
	}

}