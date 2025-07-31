import java.io.IOException;

public class MyExceptionGen {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter characters. Press Esc (ASCII 27) to exit.");

        while (true) {
            try {
                int ch = System.in.read();
                if (ch == -1 || ch == 27) { // EOF or Esc
                    System.out.println("\nExiting...");
                    break;
                }
                if (Character.isDigit(ch)) {
                    throw new NoNumberIsAllowedException();
                }
                System.out.print((char) ch);
            } catch (NoNumberIsAllowedException e) {
                System.out.print("*");  // replace digit with '*'
                // Continue reading
            }
        }
    }
}

class NoNumberIsAllowedException extends Exception {
    public NoNumberIsAllowedException() {
        super("NoNumberIsAllowed");
    }
}
