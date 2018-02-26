package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 

	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}

	@Override
	public double nextValue() throws IllegalStateException {
		if(!super.firstValueExecuted())
			throw new IllegalStateException("You must first execute the firstValue command");
		current = current + commonDifference; 
		return current;
	}

	public String toString() {
		return "Arith("+(int)firstValue()+", "+(int)commonDifference+")";
	}

	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException { 


		return firstValue() + commonDifference*(n-1);
	}

}
