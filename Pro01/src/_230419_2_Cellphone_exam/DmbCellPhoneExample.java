package _230419_2_Cellphone_exam;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		DmbCellPhone dmbcellphone = new DmbCellPhone("�ڹ���" , "����" , 10);
		
		System.out.println("�� : " + dmbcellphone.model);
		System.out.println("���� : " + dmbcellphone.color);
		System.out.println("ä�� : " + dmbcellphone.channel);
		
		dmbcellphone.powerOn();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("��������");
		dmbcellphone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿 �ε���");
		dmbcellphone.sendVoice("�� ~ �� �ݰ����ϴ�.");
		dmbcellphone.hangUp();
		
		dmbcellphone.turnOnDnb();
		dmbcellphone.changeChannelDmb(12);
		dmbcellphone.turnOffDmb();
	}

}