import java.util.Scanner;

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
        
        int initValue = 0;
        while(initValue < 10) {
        	System.out.println("The number is now " + initValue++);
        }
        
        for(int i = 0; i < 10; i++) {
        	System.out.println("Loop " + ++i);
        }
        
        int grade = 91;
        if (grade > 90) {
        	System.out.println("You've done a good job!");
        }
        else if (grade >= 60) {
        	System.out.println("You've passed the quiz.");
        } else {
        	System.out.println("Don't worry. You will do a better job next time.");
        }
        
		Scanner input = new Scanner(System.in);
        double PI; 
        System.out.print("Please input a the PI value: ");
        PI = input.nextDouble();
        System.out.println("PI is " + PI + ".");
	}

}
