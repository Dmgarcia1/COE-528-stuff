package finalpractice;

public class myBubble extends SortAlg {
	//for adapter create private instance of new outsider class since it can't be directly used 
	//(different class names and can't directly extend sortAlg)
	private BubbleSort bubble = new BubbleSort();
	@Override
	public void sort(int[] arr) {
		bubble.sortNow(arr,arr.length);

	}

}
