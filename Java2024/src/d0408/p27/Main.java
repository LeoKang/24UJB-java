package d0408.p27;

import java.util.List;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		list.add(new Board("力格1", "郴侩1"));
		list.add(new Board("力格2222", "郴侩2222"));
		list.add(new Board("力格3", "郴侩3"));
		list.add(new Board("力格114", "郴侩114"));
		list.add(new Board("力格5", "郴侩5"));

		list.remove(2);
		list.remove(3);

		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content);
		}
	}
}
