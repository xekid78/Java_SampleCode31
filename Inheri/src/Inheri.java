/**
 *
 * @author xekid78
 *
 */
class Box {
	public String myItem;

	public Box() {
		myItem = "新しいアイテム";
	}

	public void open() {
		System.out.println("宝箱を開いた。" + myItem + "を手に入れた。");
	}
}

class JewelryBox extends Box {
	public void look() {
		System.out.println("宝箱はキラキラと輝いている");
	}
}

public class Inheri {
	public static void main(String[] args) {
		Box box = new Box();
		box.open();

		JewelryBox jewelrybox = new JewelryBox();
		jewelrybox.look();
		jewelrybox.open();
	}
}
