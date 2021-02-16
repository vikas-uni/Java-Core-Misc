package treeTest;

import java.util.LinkedList;

public class ListSwap {

	static LinkedList list = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		ListSwap listSwap = new ListSwap();
		for(int i = 1 ; i <= 12 ; i++){
			list.add(i);
		}
		
		System.out.println(list);
		
		int k = 4;
		int index = 0;
		int pointer = 0;
		
		 
		while(index<list.size()){
			
			int last =  index + k -1;
			
			if (last>list.size())
				break;
			
			for (pointer = index; pointer < (k/2) + index; pointer++) {
				if(last==pointer)break;
				Integer tmp = (Integer) list.get(last);
				Integer t2 = (Integer) list.get(pointer);
				list.set(pointer, tmp);
				list.set(last, t2);
				last--;
				
			}
			index = index + k ;
		}
		
		System.out.println(list);
	}
}
