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
package tehtava1ja2;

import java.util.Scanner;

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
            System.out.println("\t\t\t6. Laske ");
            System.out.print("\n\n"); // tehdään tyhjiä rivejä
            select = Lue.merkki();
            switch (select) {
                case '1':
                    System.out.println("Anna alkion sisältö (merkkijono)");
                    data = new String(Lue.rivi());
                    s.push(data);
                    break;
                case '2':
                    ListItem item = s.pop();
                    if (item == null)
                        System.out.println("Pino on tyhjä");
                    else
                        System.out.println("Poistettu alkio: "+item.getmData());
                    break;
                case '3':
                    System.out.println(s);
                    break;
                case '4':
                    System.out.println("Lukumäärä = "+s.getmSize());
                    break;
                case '6':
                    
                    String ss = s.toString();
                    System.out.println("Oma tulostus " +laske(ss));
                    System.out.println("Testi1 2 3 * + 4 + =" + laske("1 2 3 * + 4 +"));
                    System.out.println("Testi 5 2 4 * + 7 - =" + laske ("5 2 4 * + 7 - "));
                    System.out.println("Testi 8 5 * 7 4 2 + * + = " + laske("8 5 * 7 4 2 + * +"));
                    break;
                case '5':
                    break;
                    
                
            }
        }
        while (select != '5');
    }
    
    public static String laske(String exp) {
	 	Stack s = new Stack ();
		Scanner tokens = new Scanner(exp);
		
		while (tokens.hasNext()) {
			if (tokens.hasNextInt()) {
                            
				s.push(tokens.next());
			} else {
				int num2 = Integer.valueOf(s.pop().getmData());
				int num1 = Integer.valueOf(s.pop().getmData());
				String op = tokens.next();
				
				if (op.equals("+")) {
                                    int a = num1 + num2;
                                    s.push(Integer.toString(a));
                                        
				} else if (op.equals("-")) {
                                    int a = num1 - num2;
                                    s.push(Integer.toString(a));
                                        
				} else if (op.equals("*")) {
                                    int a = num1 * num2;
                                    s.push(Integer.toString(a));
				} else {
                                    int a = num1 / num2;
                                    s.push(Integer.toString(a));
				}
			}
		}
		return s.pop().getmData();
    }
}


