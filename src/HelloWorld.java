import javax.swing.*;
import java.util.Scanner;

/**
 * Created by BetweenBinaryCode on 05/06/2017.
 */
public class HelloWorld {

    public static void main(String[] args) {

        //System.out.println("Hola bienvenidos a BetweenBinaryCode ");
        Scanner sc = new Scanner(System.in);

        String z= sc.nextLine();

        System.out.println("La palabra introducida es :" + z);
        JOptionPane.showMessageDialog(null,z);
    }

}
