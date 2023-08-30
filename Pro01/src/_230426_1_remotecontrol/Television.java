package _230426_1_remotecontrol;

public class Television implements RemoteControl{

	private int volume;
	private boolean mute;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
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
		System.out.println("현재 TV 볼륨 : " + volume);
	}
	
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Television 무음처리 합니다.");
		}else {
			System.out.println("Television 무음해제 합니다.");
		}
	}
	
}
