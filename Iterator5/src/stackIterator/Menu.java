/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackIterator;




public class Menu {


    public static void main(String[] args) {

        printMenu();

    }


    private static void printMenu() {
        char select;
        Stack s = new Stack(); 
        String data; 
        do {

            System.out.println("\n\t\t\t1. Alkion lisääminen.");
            System.out.println("\t\t\t2. Alkion poistaminen.");
            System.out.println("\t\t\t3. Pinon sisältö.");
            System.out.println("\t\t\t4. Alkioiden lukumäärä.");
            System.out.println("\t\t\t5. Pinon sisältö iteraattorilla selattuna.");
            System.out.println("\t\t\t6. lopetus ");
            System.out.print("\n\n"); 
            select = Lue.merkki();
            switch (select) {
                case '1':
                    System.out.println("Anna alkion sisältö (merkkijono)");
                    data = new String(Lue.rivi());
                    s.push(data);
                    break;
                case '2':
                    String poistettu = s.pop();
                    if (s.amount() == 0) {
                        System.out.println("Pino on tyhjä");
                    } else {
                        System.out.println("Poistettu alkio: " + poistettu );
                    }
                    break;
                case '3':
                    s.printItems();
                    break;
                case '4':
                    System.out.println("Lukumäärä = " + s.amount());
                    break;
                case '5':
                    StackIterator itr = s.iterator();
                    while (itr.hasNext()) {
                        System.out.println(itr.next());
                    }
                    break;
                case '6':
                    break;
            }
        } while (select != '6');
    }

}
