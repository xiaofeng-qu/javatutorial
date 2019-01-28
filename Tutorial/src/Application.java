
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte myByte = (byte) ((byte)Math.pow(2, 7) - 1); // 1 byte -128 to 127
		short myShort = (short) (Math.pow(2, 15) - 1); // 2 bytes -32768 to 32767
        int myNumber = (int) (Math.pow(2, 31) - 1); // 4 bytes -2,147,483,648 to 2,147,483, 647 
        long myLong = (long) (Math.pow(2, 63) - 1); // 8 bytes - 2^63 to (2^63 - 1)
        
        float myFloat = 3.14f; // 4 bytes 6~7 significant number
        double myDouble = 3.14159265; // 8 bytes 15 significant number
        
        char myChar = 'a'; // 2 bytes
        
        boolean myBoolean = true;
        
        String myGreeting = "Hello" + ", " + "world!";
        
        System.out.println("A byte " + myByte + ".");
        System.out.println("A short " + myShort + ".");
        System.out.println("An int " + myNumber + ".");
        System.out.println("A long " + myLong + ".");
        System.out.println("A float " + myFloat + ".");
        System.out.println("A double " + myDouble + ".");
        System.out.println("A char " + myChar + ".");
        System.out.println("A boolean " + myBoolean + ".");
        System.out.println("A string " + myGreeting + ".");
	}

}
