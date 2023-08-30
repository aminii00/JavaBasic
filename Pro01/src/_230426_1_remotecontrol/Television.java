package _230426_1_remotecontrol;

public class Television implements RemoteControl{

	private int volume;
	private boolean mute;
	
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
	    }else {
	    	this.volume = volume;
	    }
		
}
	public void getVolume() {
		System.out.println("���� TV ���� : " + volume);
	}
	
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Television ����ó�� �մϴ�.");
		}else {
			System.out.println("Television �������� �մϴ�.");
		}
	}
	
}
