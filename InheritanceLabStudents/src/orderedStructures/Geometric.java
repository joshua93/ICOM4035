package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 

	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}

	@Override
	public double nextValue() throws IllegalStateException {
		if(!super.firstValueExecuted())
			throw new IllegalStateException("You must first execute the firstValue command");
		current = current * commonFactor; 
		return current;
	}

	public String toString() {
		return "Geom("+(int)firstValue()+", "+(int)commonFactor+")";
	}

	public double getTerm(int n) throws IndexOutOfBoundsException { 

		return firstValue()*Math.pow(commonFactor, n-1);
	}

}
