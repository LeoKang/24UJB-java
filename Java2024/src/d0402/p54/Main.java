package d0402.p54;

public class Main {
	public static void main(String[] args) {
//		RemoteControl rc2 = new RemoteControl() {};
		RemoteControl rc2 = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("RemoteControl - turnOn()");				
			}

			@Override
			public void turnOff() {
				System.out.println("RemoteControl - turnOff()");
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		};
		rc2.turnOn();
		rc2.turnOff();
		
//		RemoteControl rc;
//		rc = new Television();
//		rc.turnOn();
//		rc.turnOff();
//
//		rc = new Audio();
//		rc.turnOn();
//		rc.turnOff();
	}
}
