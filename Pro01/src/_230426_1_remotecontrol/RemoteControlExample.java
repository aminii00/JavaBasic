package _230426_1_remotecontrol;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		/*RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(-11);
		rc.getVolume();
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(11);
		rc.getVolume();
		
		RemoteControl.changeBattery(); // 생성자x , static메서드는 클래스명.메서드로 호출 가능*/
		
		System.out.println("--------------------------");
		SmartTelevision smartTv = new SmartTelevision();
		smartTv.turnOn();
		smartTv.turnOff();
		smartTv.setVolume(16);
		smartTv.getVolume();
		smartTv.search("Java");
		System.out.println("--------------------------");
		
		RemoteControl rb = new RemoteControl() {
			public void turnOn() {
				System.out.println("turnOn");
			}
			public void turnOff() {
				System.out.println("turnOff");
			}
			public void setVolume(int volume) {
				System.out.println("setVolume");
			}
			public void getVolume() {
				System.out.println("getVolume");
			}
		};
		
		rb.turnOn();
		rb.turnOff();
		rb.setVolume(50);
		rb.getVolume();
		
		System.out.println("--------------------------");
		
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(-11);
		rc.getVolume();
		rc.setMute(true);
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(11);
		rc.getVolume();
		rc.setMute(false);
		
	}
}