package kadai_015;

public class Car_Chapter15 {
	// 1速から5速のギアを表す
	private int gear = 1;
	// ギアチェンジ後の速度を表す
	private int speed = 10;
	
	// ギアの値により速度を変える
	public void changeGear(int afterGear) {
		switch(afterGear) {
		case 1:
			speed = 10;
			break;
		case 2:
			speed = 20;
			break;
		case 3:
			speed = 30;
			break;
		case 4:
			speed = 40;
			break;
		case 5:
			speed = 50;
			break;
		default:
			speed = 10;
		}
		
		// ギアチェンジ後のギアを表示
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		
		// ギアの値を変更
		gear = afterGear;
	}
	
	// ギアチェンジ後の速度を表示する
	public void run() {
		// 	ギアチェンジ後の速度を表示
		System.out.println("速度は時速" + speed +  "kmです");
	}
}
