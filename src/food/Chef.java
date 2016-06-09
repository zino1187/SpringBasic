package food;

public class Chef {
	private Pan pan;
	public void setPan(Pan pan) {
		this.pan = pan;
	}
	
	public void cook(){
		pan.make();
	}
}
