/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: </p>
 *
 * <p>Company: Stadia</p>
 *
 * @author JPK
 * @version 1.0
 */
package linkedlist;

public class Menu {
    //main alkaa-----------------------------------------------------------------------------
    public static void main(String[] args) {

        printMenu();

    }
    //main loppuu --------------------------------------------------------------------------
//printMenu alkaa------------------------------------------------------------------
    private static void printMenu() {
        char select;
        Stack s = new Stack(); // pino-olio
        String data; // Pinon data-kenttä
        do {

            System.out.println("\n\t\t\t1. Alkion lisääminen.");
            System.out.println("\t\t\t2. Alkion poistaminen.");
            System.out.println("\t\t\t3. Pinon sisältö.");
            System.out.println("\t\t\t4. Alkioiden lukumäärä.");
            System.out.println("\t\t\t5. lopetus ");
            System.out.print("\n\n"); // tehdään tyhjiä rivejä
            select = Lue.merkki();
            switch (select) {
                case '1':
                    System.out.println("Anna alkion sisältö (merkkijono)");
                    data = new String(Lue.rivi());
                    s.push(data);
                    break;
                case '2':
                    String palautus = s.pop();
                    if (palautus == null)
                        System.out.println("Pino on tyhjä");
                    else
                        System.out.println("Poistettu alkio: "+palautus);
                    break;
                case '3':
                    System.out.println(s);
                    break;
                case '4':
                    System.out.println("Lukumäärä = "+s.getSize());
                    break;
                case '5':
                    break;
            }
        }
        while (select != '5');
    }
//printMenu loppuu ----------------------------------------------------------------
}
