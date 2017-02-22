public class LinkedList {
		public LinkedList() {}

		public LinkedList(Object item) {
				if(item != null) {
						current = end = start = new ListItem(item);
				}
		}

		public LinkedList(Object[] items) {
				if(items != null) {
						for(Object item: items) {
								addItem(item);
						}
						current = start;
				}	
		}

		public void addItem (Object item) {
				ListItem newEnd = new ListItem(item);
				if(start == null) {
						start = end = newEnd;
				} else {
						end.next = newEnd;
						newEnd.front = end;
						end = newEnd;
				}
		}
		
		public void addCurItem(Object item) {
				ListItem newCur =new ListItem(item);
				if(start == null) {
					start = end = current = newCur;
				} else if (current == start){
					start.next = newCur;
					newCur.front = start;
				} else if (current == end) {
					end.next = newCur;
					newCur.front = end;
				} else {
					newCur.front=current.front;
					newCur.next=current;
					current.front.next=newCur;
					current.front=newCur;
				} 
		}		
		
		public void delCurItem() {

			if(start == null) {
				start = end = current = null;
			} else if (current == start) {
				start = start.next;
				cur2 = current;
				current = start;
				cur2.next = null;
				start.front = null;
			} else if (current == end) {
				end = end.front;
				cur2 = current;
				current = end;
				end.next = null;
				cur2.next = null;
				cur2.front = null;
			} else if (current == null){
				return;
			} else {	
				current.front.next = current.next;
				current.next.front = current.front;
				cur2 = current;
				current = current.next;
				cur2.next = null;
				cur2.front = null;
			}
		}
		
		public Object getFirst() {
				current = start;
				return start == null ? null:start.item;
		}

		public Object getNext() {
				if(current != null) {
						current = current.next;
				}
				return current == null ? null:current.item;
		}
		
		public Object getEnd() {
			cur2 = end;
			return end == null ? null:end.item;
		}
		public Object getFront() {
			if(cur2 != null) {
				cur2 = cur2.front;
			}
			return cur2 == null ? null : cur2.item;
		}
		
		private ListItem start = null;
		private ListItem end = null;
		private ListItem current = null;
		private ListItem cur2 = null;
	
		private class ListItem {
				public ListItem(Object item) {
						this.item = item;
						next = null;
						front = null;
				}
				@Override
				public String toString() {
					return "ListItem "+ item;
				}
				ListItem next;
				ListItem front;
				Object item;
		}
}
