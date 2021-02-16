package interviewTest.DS;
public class MyLinkedList {

	ListNode head;
	ListNode tail;

	public void add(String v) {
		ListNode last = new ListNode();
		last.val = v;
		if (head == null) {
			head = last;
			tail = head;
		}

		else {
			tail.setNext(last);
			tail = last;
		}

	}

	public void delete(String val) {

		if (head.val.equals(val)) {
			head = head.next;
			return;
		}
		ListNode node = head;
		while (node.next != null) {
			
			if (node.getNext().getVal().equals(val)) {
				if (node.getNext().getNext() != null) {
					node.setNext(node.getNext().getNext());
				} else {
					node.setNext(null);
				}
				break;
			}
			node = node.next;
		}

	}
	
	public void insertAt(int pos, String val) {
		ListNode node = new ListNode();
		node.setVal(val);

		if (pos == 1) {
			node.setNext(head);
			head = node;
			return;
		}
		ListNode othr = head;
		ListNode tmp = head;
		while (pos > 1 ) {

			othr = tmp;
			if (tmp == null) {
				System.out.println("position out of range");
				return;
			}

			tmp = tmp.getNext();

			pos--;
		}
		
		othr.setNext(node);
		node.setNext(tmp);
	}

	public void printList() {
		ListNode node = head;
		while (node != null) {
			System.out.println(node.getVal());
			node = node.next;
		}
	}

	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.add("asfs");
		linkedList.add("dfg");
		linkedList.add("tyut");
		linkedList.add("rtyrty");
		linkedList.add("rtyr");
		linkedList.add("ryrty");
		linkedList.add("tyry");
		linkedList.add("rtyry");

		linkedList.printList();
		//linkedList.delete("dfg");
		linkedList.insertAt(5, "oiuy");
		System.out.println();
		linkedList.printList();
	}

	class ListNode {
		String val;
		ListNode next;

		public String getVal() {
			return val;
		}

		public void setVal(String val) {
			this.val = val;
		}

		public ListNode getNext() {
			return next;
		}

		public void setNext(ListNode next) {
			this.next = next;
		}

	}

}
