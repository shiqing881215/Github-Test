import java.util.Stack;


public class ShenRuoHao {

	public static class Node {
		public String data;
		public Node left;
		public Node right;
		
		public Node (String s) {
			this.data = s;
		}
	}
	
	public boolean isNumber (String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean isOperator (String s) {
		return (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"));
	}
	
	// this method is used to print the whole equation
	public String printEquation (Node root) {
		if (root == null) {
			return "";
		}
		
		if (root.left != null && root.right != null) {
			if (isNumber(root.left.data) && isNumber(root.right.data)) {
				return "(" + root.left.data + root.data + root.right.data + ")";
			}
		}
		
		return "(" + printEquation(root.left) + root.data + printEquation(root.right) + ")";
	}
	
	public int operate(String operator, int val1, int val2) {
		switch(operator.toCharArray()[0]) {
		case '+' :
			return val1+val2;
		case '-' :
			return val1-val2;
		case '*' :
			return val1*val2;
		case '/' :
			return val1/val2;
		}
		
		return Integer.MIN_VALUE;
	}
	
	// this method is used to calculate the value
	public int getValue (String s) {
		Stack<Integer> numbers = new Stack<Integer>();
		Stack<String> operators = new Stack<String>();
		for (int i = 0; i < s.length(); i++) {
			if (isNumber(s.charAt(i)+"")) {
				numbers.add(Integer.parseInt(s.charAt(i)+""));
			} else if (isOperator(s.charAt(i)+"")) {
				operators.add(s.charAt(i)+"");
			} else if (s.charAt(i) == ')') {
				int val2 = numbers.pop();
				int val1 = numbers.pop();
				int value = operate(operators.pop(), val1, val2);
				numbers.add(value);
			}
		}
		
		return numbers.peek();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1 = new Node("+");
		Node node2 = new Node("*");
		Node node3 = new Node("/");
		Node node4 = new Node("+");
		Node node5 = new Node("-");
		Node node6 = new Node("*");
		Node node7 = new Node("/");
		Node node8 = new Node("3");
		Node node9 = new Node("5");
		Node node10 = new Node("4");
		Node node11 = new Node("1");
		Node node12 = new Node("2");
		Node node13 = new Node("6");
		Node node14 = new Node("8");
		Node node15 = new Node("2");
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node4.left = node8;
		node4.right = node9;
		node5.left = node10;
		node5.right = node11;
		node6.left = node12;
		node6.right = node13;
		node7.left = node14;
		node7.right = node15;
		
		ShenRuoHao s = new ShenRuoHao();
		System.out.println(s.printEquation(node1));
		System.out.println(s.getValue(s.printEquation(node1)));
	}

}
