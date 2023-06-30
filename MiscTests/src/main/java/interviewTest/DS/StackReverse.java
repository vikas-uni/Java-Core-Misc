package interviewTest.DS;

import interviewTest.DS.MyStack.StackNode;
//still need modification
public class StackReverse {
	static MyStack myStack = new MyStack();
	public static void main(String[] args) {
		
		
		for(char ch = 'K' ; ch >= 'A' ; --ch){
			myStack.push(""+ch);
		}
		myStack.printStack();
		/*myStack.printStack();
		
		StackNode prev,curr,next = null ;
		prev = curr = myStack.top;
		System.out.println("after reverse....");
		
		while(curr.nextNode != null){			
			next = curr.nextNode;
			curr.nextNode = next.nextNode;
			next.nextNode = prev;
			prev = next;
		}
		myStack.top = prev;
		myStack.printStack();*/
		
		usingRecursion(myStack);
		System.out.println("-----------------------");
		myStack.printStack();
		
	}
	
	static void insertElement(MyStack myStack,String val){
		
		if(myStack.peek() == null){
			myStack.push(val);
			return;
		}
		String tmp = myStack.pop();
		
		System.out.println("got: val-"+val+"   tmp-"+tmp);
		insertElement(myStack, val);
		System.out.println("after insert,got: val-"+val+"   tmp-"+tmp);
		myStack.push(tmp);
		
	}
	
	static void usingRecursion(MyStack myStack){
		if(myStack.peek() == null){
			return;
		}
		
		String val = myStack.pop();
		System.out.println("popped:  "+val);
		usingRecursion(myStack);
		
		System.out.println("after return: "+val);
		insertElement(myStack, val);
	}
	
}
