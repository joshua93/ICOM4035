package classes;

public class SymmetricStringAnalyzer {
	private String s; 
	public SymmetricStringAnalyzer(String s) {
		this.s = s; 
	}

	/**
	 * Determines if the string s is symmetric
	 * @return true if it is; false, otherwise. 
	 */
	public boolean isValidContent() {
		// ADD MISSING CODE
		SLLStack<Character> stack = new SLLStack<Character>();
		if(s.length() %2 != 0)
			return false;
		for (int i=0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLetter (c))
				if (Character.isUpperCase (c))
					stack.push(c);
				else if (stack.isEmpty())//letter, not uppercase
					return false;
				else {
					char t = stack.pop();
					if (t == Character.toUpperCase (c) )
						if(stack.isEmpty() || i >= s.length()-1)
							return true;
						else { } //Do nothing
					else 
						return false;
				}
			else
				return false;
		}
		return true;
	}






	public String toString() { 
		return s; 
	}

	public String parenthesizedExpression() throws StringIsNotSymmetricException {
		// ADD MISSING CODE
		if(!isValidContent())
			throw new StringIsNotSymmetricException("The string is not a valid symmetric string.");
		String parString = "";
		for (int i=0; i < s.length(); i++) {
			char c = s.charAt(i); 
			if (Character.isUpperCase (c))
				parString = parString.concat("<"+ c+" ");
			else //letter, not uppercase
				parString = parString.concat(c+"> ");
			

		}
		return parString;
	}
}

