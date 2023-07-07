
public class integerExample {

	public static void main(String[] args) {
		int max = 0b01111111_11111111_11111111_11111111;
		int min = 0b10000000_00000000_00000000_00000000;
		
		System.out.println("max=" + max);
        System.out.println("min=" + min);
        
        max = max + 1;
        System.out.println("max=" + max);
        
	}

}
