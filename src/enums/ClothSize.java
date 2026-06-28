package enums;

public enum ClothSize {
	
	XS(1), S(2), M(3), L(4), XL(5), XXL(6);
	
	final int size;
		
	ClothSize(int size){
		
		this.size = size;
	}
	
	int getSize() {
		return this.size;
	}
}
