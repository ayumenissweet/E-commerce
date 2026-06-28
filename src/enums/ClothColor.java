package enums;

public enum ClothColor {
	
	BLUE(1), RED(2), WHITE(3), BLACK(4), GREEN(5), PINK(6), YELLOW(7), PURPLE(8);
	
	final int color;
		
	ClothColor(int color){
		
		this.color = color;
	}
	
	int getSize() {
		return this.color;
	}
}
