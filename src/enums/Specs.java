package enums;

public enum Specs {
	ASUS(0),AMD(1);
	
	final int cpu;
	
	Specs(int cpu){
		this.cpu = cpu;
	}
	
	int getCPU() {
		return this.cpu;
	}
}
