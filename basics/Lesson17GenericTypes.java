import java.lang.reflect.Array;
public class Lesson17GenericTypes {
	public static void main(String[] args) {
		// TreasureBox gems = new TreasureBox();
		// gems.addTreasure("17 Diamonds");
		// gems.addTreasure("38 Amethyst");
		// gems.printTreasure();


		TreasureBox<String> gems = new TreasureBox<>();
		gems.addTreasure("17 Diamonds");
		gems.addTreasure("38 Amethyst");
		gems.printTreasure();

		TreasureBox<Integer> money = new TreasureBox<>();
		money.addTreasure(9854);
		money.printTreasure();
	}

	// public static class TreasureBox {
	// 	String[] treasures = new String[100];
	// 	int index = 0;
	//
	// 	public void addTreasure(String treasure) {
	// 		this.treasures[this.index] = treasure;
	// 		this.index++;
	// 	}
	//
	// 	public void printTreasure() {
	// 		for (int i = 0; i < this.index; i++) {
	// 			System.out.println(this.treasures[i]);
	// 		}
	// 	}
	// }


	public static class TreasureBox<E> {
		E[] treasures = null;
		int index = 0;

		public void addTreasure(E treasure) {
			if (this.treasures == null) {
				this.treasures = (E[])Array.newInstance(treasure.getClass(), 100);
			}
			this.treasures[this.index] = treasure;
			this.index++;
		}

		public void printTreasure() {
			for (int i = 0; i < this.index; i++) {
				System.out.println(this.treasures[i]);
			}
		}
	}
}
