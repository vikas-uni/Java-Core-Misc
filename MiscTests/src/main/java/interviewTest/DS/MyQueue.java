package interviewTest.DS;

public class MyQueue {
	QueueNode first;
	QueueNode last;
	
	public void push(String val){
		QueueNode node = new QueueNode(val);
		if(first == null){
			first = node;
			
			last = first;
			
		}else{
		last.next = node;
		 last = node;
		}
		
	}
	
	public String pop(){
		QueueNode node = first;
		if(first == null){
			return null;
		}
		
		if(first == last){
			last = null;
			first = null;
			return node.getVal();
		}
		
		
		first = first.next;
		return node.getVal();
	}
	
public static void main(String[] args) {
	MyQueue myQueue = new MyQueue();
	myQueue.push("qwe");
	myQueue.push("wer");
	myQueue.push("ert");
	myQueue.push("rty");
	myQueue.push("tyu");
	myQueue.push("yui");
	myQueue.push("uio");
	
	String tmp = myQueue.pop();
	
	while(tmp != null){
		System.out.println(tmp);
		tmp = myQueue.pop();
	}
	
}
	
}

class QueueNode{
	String val;
	QueueNode next;
	
	
	
	public QueueNode(String val) {
		super();
		this.val = val;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	public QueueNode getNext() {
		return next;
	}
	public void setNext(QueueNode next) {
		this.next = next;
	}
	 
	
}