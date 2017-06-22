import java.util.LinkedList;

public class Groups{

  public static boolean groupCheck(String grouping){
		if (grouping.length() % 2 > 0) {
			return false;
		}
		
		LinkedList<Character> symbolsStack = new LinkedList<>();
		for (int i = 0; i < grouping.length(); i++) {
			if (grouping.charAt(i) == '(' || grouping.charAt(i) == '{' || grouping.charAt(i) == '[') {
				symbolsStack.addLast(grouping.charAt(i));
			} else if (grouping.charAt(i) == ')' || grouping.charAt(i) == ']' || grouping.charAt(i) == '}') {
				switch (grouping.charAt(i)) {
				case ')':
					if (symbolsStack.getLast() != '(') {
						return false;
					}
					break;
				case '}':
					if (symbolsStack.getLast() != '{') {
						return false;
					}	
					break;
				case ']':
					if (symbolsStack.getLast() != '[') {
						return false;
					}		
					break;
				}
				symbolsStack.removeLast();
				
			}			
		}
		return symbolsStack.isEmpty();
	}  
}
