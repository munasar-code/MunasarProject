//================

//Code runs in this file
//Main part
//run from here

//=================

public class Codes {
    static String[] codes={"*770#","*711#","*722#"};
    public static void main(String[] args) {
        while (true) {
            System.out.println("Dooro:\n1.EVC PLUS\n2.Ka bax");
            int dooro = Main.input.nextInt();
            Main.input.nextLine();
            if (dooro == 1) {
                System.out.println("Enter code: ");
                String code = Main.input.nextLine();
                if (code.equals(codes[0])) {
                    System.out.println("Enter pin: ");
                    int checkPin = Main.input.nextInt();
                    if (checkPin == Main.pin) {
                        System.out.println("Dooro\n1.Haraaga\n2.Kaarka hadalka\n3.Bixi Biil\n4.Uwareejin EVC PLUS\n5.Maareyn\n6.Warbixin kooban\n7.Bank\n8.Taaj\n9.Numberka");
                        int options = Main.input.nextInt();
                        if (options == 1)
                            Main.Haraaga();
                        else if (options == 2)
                            Main.Shubasho();
                        else if (options == 3)
                            bixiBiil.bixiBiil();
                        else if (options == 4)
                            Main.Uwareejin();
                        else if (options == 5)
                            Main.maareyn();
                        else if (options == 6)
                            Main.Warbixinkooban();
                        else if (options == 7)
                            Bank.bank();
                        else if (options == 8) {
                            Taaj.taaj();
                        } else if (options==9) {
                            System.out.println("Numberkaaga waa: " + Main.number[0]);
                        }
                    } else
                        System.out.println("Incorrect Pin");
                } else if (code.equals(codes[1])) {
                    System.out.println("Enter pin: ");
                    int checkPin = Main.input.nextInt();
                    if (checkPin == Main.pin) {
                        Main.Haraaga();
                    } else
                        System.out.println("Pinka wa qalad");
                } else if (code.equals(codes[2])) {
                    System.out.println("Enter pin: ");
                    int checkPin = Main.input.nextInt();
                    if (checkPin == Main.pin) {
                        Bank.bank();
                    } else
                        System.out.println("Pinka wa qalad");
                }
            } else{
                System.out.println("Ka baxid");
                break;
            }
        }
        System.out.println("Macsalaamo");
    }
}
