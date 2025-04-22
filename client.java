package finalpractice;

public class client {

	public static void main(String[] args) {
		SortContext sortStrategy = new SortContext();
		int [] arr = {4,5,7,3};
		
		sortStrategy.setAlg(new myMerge());
		sortStrategy.sort(arr);
		
		sortStrategy.setAlg(new myHeap());
		sortStrategy.sort(arr);
		
		sortStrategy.setAlg(new myBubble());
		sortStrategy.sort(arr);
	}

}
