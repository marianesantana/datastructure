package lists;

public class LinkedList {

	private Cell first = null;
	private Cell last = null;
	private int totalElements = 0;

	@Override
	public String toString() {
		if(this.totalElements == 0) {
			return "[ ]";
		}

		Cell actual = first;
		StringBuilder builder = new StringBuilder("[");

		for( int i = 0; i < totalElements; i++) {
			builder.append(actual.getElement());
			builder.append(",");

			actual = actual.getNext();

		}
		builder.append("]");
		return builder.toString();
	}

	public void addBeginning(Object element) {
		Cell newer = new Cell(element, first);
		this.first = newer;

		if(this.totalElements == 0) {
			this.last = this.first;
		}

		this.totalElements++;

	}
	public void add(Object element) {

		if(this.totalElements == 0) {
			addBeginning(element);

		} else {	
			Cell newer = new Cell(element, null);
			this.last.setNext(newer);
			this.last = newer;
			this.totalElements++;
		}

	}
	
	public boolean validPosition(int position) {
		return position >= 0 && position < this.totalElements;
	}
	
	
	public void add(int position, Object element) {
		if(position == 0) {
			addBeginning(element);
			
		} else if (position == this.totalElements){
			add(element);
			
		} else {
			Cell previous = this.takenPosition(position - 1);
			Cell newer = new Cell(element, previous.getNext());
			previous.setNext(newer);
			this.totalElements++;
		}
		

	}
	
	private Cell takenPosition(int position) {
		if(!validPosition(position)) {
			throw new IllegalArgumentException("unexisting position");
		}
		
		Cell actual = first;
		
		for(int i = 0; i < position; i++) {
			actual = actual.getNext();
		}
		return actual;

	}
	
	public Object takeElement(int position) {
		return this.takenPosition(position).getElement();
	}
	
	public void removeBeginning(int posicao) {
		if(this.totalElements == 0) {
			throw new IllegalArgumentException("empty list");
		}
		
		this.first = this.first.getNext();
		this.totalElements--;
		
		if(this.totalElements == 0) {
			this.last = null;
		}

	}
	
	public void remove(int posicao) {

	}
	public int length() {
		return this.totalElements;
	}

	public boolean contains(Object obj) {
		return false;
	}

}
