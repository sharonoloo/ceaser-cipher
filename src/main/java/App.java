
import java.io.BufferedReader;
import java.io.Console;
import java.util.Scanner;

public class App {
    private String text;
    private int key;

    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to Caesar Cipher program!\n");
        System.out.println("Select your functionality:");
        System.out.println("1.Encoding\n2.Decoding\n");
        Scanner newScanner = new Scanner(System.in);
        int selection = newScanner.nextInt();

        //Encoding UI
        if(selection==1){
            System.out.println("Encoding");
            newScanner.nextLine();
            System.out.println("Input String Text: ");
            String text = newScanner.nextLine();
            Encode newEncryption = new Encode();

            System.out.println(" Enter encoding Key:");
            Integer key = Integer.parseInt(newScanner.nextLine());

            if(key < 1 || key > 25){
                System.out.println("The key must be between 1 and 25");
            } else{
                Encode encode = new Encode();
                String encoded = encode.encoding(text,key);
                System.out.println("Your encoded text is: ");
                System.out.println(encoded);

            }
        }
        // decoding UI
        else if(selection==2){
            System.out.println("Decoding");
            newScanner.nextLine();
            System.out.println("Input encoded text: ");
            String text = newScanner.nextLine();
            Decode newDecryption = new Decode();

            System.out.println(" Enter decoding key:");
            Integer key = Integer.parseInt(newScanner.nextLine());

            if(key < 1 || key > 25){
                System.out.println("The key must be between 1 and 25");
            } else{
                Decode decode = new Decode();
                String decoded = decode.decoding(text,key);
                System.out.println("Your decoded text is: ");
                System.out.println(decoded);

            }

        }

        //Invalid selection
        else{
            System.out.println("Invalid inputs!");
        }

    }

}
