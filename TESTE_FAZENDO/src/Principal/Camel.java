package Principal;

import Interfaces.Rideable;

public class Camel implements Rideable{
	int weight = 2; 
	public String getGait() {
		return " mph, lope"; 
	}
	void go(int speed) {
		++speed; weight++; 
		int walkrate = speed * weight; 
		System.out.print(walkrate + getGait());

	}
	public static void main(String[] args) {
		Camel obj = new Camel();
		obj.go(8);
	}
}
