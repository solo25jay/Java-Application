import java.util.Scanner;

public class EncryptDecrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Encryption
        System.out.print("Enter a 4-digit integer to encrypt: ");
        int number = input.nextInt();

        int d1 = (number / 1000) % 10;
        int d2 = (number / 100) % 10;
        int d3 = (number / 10) % 10;
        int d4 = number % 10;

        d1 = (d1 + 7) % 10;
        d2 = (d2 + 7) % 10;
        d3 = (d3 + 7) % 10;
        d4 = (d4 + 7) % 10;

        int encrypted = d3 * 1000 + d4 * 100 + d1 * 10 + d2;
        System.out.println("Encrypted number: " + encrypted);

        // Decryption
        System.out.print("Enter a 4-digit integer to decrypt: ");
        int enc = input.nextInt();

        int e1 = (enc / 1000) % 10;
        int e2 = (enc / 100) % 10;
        int e3 = (enc / 10) % 10;
        int e4 = enc % 10;

        int dec1 = (e3 + 10 - 7) % 10;
        int dec2 = (e4 + 10 - 7) % 10;
        int dec3 = (e1 + 10 - 7) % 10;
        int dec4 = (e2 + 10 - 7) % 10;

        int decrypted = dec1 * 1000 + dec2 * 100 + dec3 * 10 + dec4;
        System.out.println("Decrypted number: " + decrypted);

        input.close();
    }
}
