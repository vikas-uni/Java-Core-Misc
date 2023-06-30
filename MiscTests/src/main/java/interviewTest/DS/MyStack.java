package interviewTest.DS;

public class MyStack {
	StackNode top;
	
	
	public void push(String val){
		StackNode stackNode = new StackNode();
		stackNode.setVal(val);
		if(top == null){
			top = stackNode;
		}
		else{
			stackNode.setNextNode(top);
			top = stackNode;
		}
	}
	
	public String pop() {
		String val = null;
		if(top != null){
			val = top.getVal();
			top = top.getNextNode();
		}
		
		return val;
		
	}

	public String peek() {
		String val = null;
		if(top != null){
			val = top.getVal();
		}
		
		return val;
		
	}
	
	public void printStack(){
		StackNode temp = top;
		while(temp != null){
			System.out.println(temp.getVal());
			temp = temp.getNextNode();
		}
	}
	
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		myStack.push("ret");
		myStack.push("rtyrt");
		myStack.push("retry");
		myStack.push("fgret");
		myStack.push("rdfghet");
		myStack.push("rexcbt");
		myStack.push("weret");
		myStack.push("rehjft");
		
		
		
		myStack.printStack();
		
		System.out.println("\t"+myStack.pop());
		System.out.println("\t"+myStack.pop());
		System.out.println("\t"+myStack.peek());
		
		myStack.printStack();
		
	}
	
	class StackNode{
		String val;
		StackNode nextNode;
		public String getVal() {
			return val;
		}
		public void setVal(String val) {
			this.val = val;
		}
		public StackNode getNextNode() {
			return nextNode;
		}
		public void setNextNode(StackNode nextNode) {
			this.nextNode = nextNode;
		}
		
		
	}
}
