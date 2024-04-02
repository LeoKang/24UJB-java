package d0401.p47;

public class PhoneExample {
	public static void main(String[] args) {
		Phone phone = new Phone("È«±æµ¿");

		Phone phone2 = new SmartPhone("ÀÓ²©Á¤");
		phone2.turnOn();
		phone2.turnOff();

		SmartPhone phone3 = new SmartPhone("È«±æµ¿");
		phone3.turnOn();
		phone3.internetSearch();
		phone3.turnOff();
	}
}
