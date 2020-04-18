package NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Scanner scanner = new Scanner(System.in);

        String binaryValue;
        System.out.print("Input Binary :\t ");
        binaryValue = br.readLine();

//        InputOutputBinaryTest
        char[] binaryValueToChar = binaryValue.toCharArray();
        int binaryLength = 0;
        System.out.print("\nBinary\t\t\t : ");
        for (int i = 0; i < binaryValueToChar.length; i++){
            System.out.print(binaryValueToChar[i] + " ");
            binaryLength++;
        }
        System.out.println("\nJumlah Digit Pada Binary : " + binaryLength);

//        MainFunction
        int deret = 1;
        int sum = 0;
        for (int i = (binaryLength-1); i >= 0; i--){

            if (binaryValueToChar[i] == '1'){
                sum = sum + deret;
            }
            deret *= 2;
        }

        System.out.println("Bilangan Decimal\t : "+sum);

    }
}
