package finalpractice;

public class SortContext {
	
	private SortAlg alg = new myMerge();
	
	
	public SortContext() {
		
	}
	
	public SortAlg getAlg() {
		return alg;
	}
	
	public void setAlg(SortAlg alg) {
		this.alg = alg;
	}
	
	public void sort(int[] A) {
		alg.sort(A);
	}
}
