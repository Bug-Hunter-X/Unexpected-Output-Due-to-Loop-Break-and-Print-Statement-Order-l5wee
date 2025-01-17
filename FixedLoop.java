public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i++);
            if (i == 5) {
                break; // Exit the loop when i equals 5
            }
             //Note that this print statement is moved above the break condition
            System.out.println("Still in the loop");
        }
    }
}