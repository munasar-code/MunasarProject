import java.util.Scanner;
public class bixiBiil {
    static Scanner input=new Scanner(System.in);
    static int Biil=100;
    public static void main(String[] args){}
    public static void bixiBiil(){
        System.out.println("Dooro.\n1.Post paid\n2.Ku iibso");
        int options=input.nextInt();
        input.nextLine();
        if (options==1){
            System.out.println("1.Ogow biil\n2.Bixi biil\n3.Ka bixi biil");
            int postpaid=input.nextInt();
            input.nextLine();
            switch (postpaid){
                case 1:
                    System.out.println("Biilka ku yaalo wa "+Biil);
                    break;
                case 2:
                    System.out.println("Soogali numberka udireysid: ");
                    String num=input.nextLine();
                    if (num.equals(Main.number[1])){
                        System.out.println("Soogali lacagta: ");
                        int lacagQ=input.nextInt();
                        if (lacagQ>Main.balances[0])
                            System.out.println("Haraaga kuguma filno!");
                        else if (lacagQ<0) {
                            System.out.println("");
                        }
                        else {
                            Main.balances[0]-=lacagQ;
                            System.out.println("Waxa udirte lacagta biilka oo dhan $"+lacagQ+" numberka "+Main.number[1]);
                            System.out.println("Haraaga cusub waa $"+Main.balances[0]);
                        }
                    } else if (num.equals(Main.number[2])) {
                        System.out.println("Soogali lacagta: ");
                        int lacagQ=input.nextInt();
                        if (lacagQ>Main.balances[0])
                            System.out.println("Haraaga kuguma filno!");
                        else if (lacagQ<0) {
                            System.out.println("");
                        }
                        else {
                            Main.balances[0]-=lacagQ;
                            System.out.println("Waxa udirte lacagta biilka oo dhan $"+lacagQ+" numberka "+Main.number[2]);
                            System.out.println("Haraaga cusub waa $"+Main.balances[0]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Soogali numberka ka bixineysid: ");
                    String num1=input.nextLine();
                    System.out.println("Soogali numberka uwadid: ");
                    String num2=input.nextLine();
                    System.out.println("Soogali lacagta: ");
                    double price=input.nextDouble();
                    if (price>Main.balances[0])
                        System.out.println("Haraaga xisaabta kuguma filno");
                    else if (num1.equals(Main.number[1])&&num2.equals(Main.number[2])) {
                        Main.balances[0]-=price;
                        Main.balances[2]+=price;
                        System.out.println("Waxaad ka baxise biilka numberka "+num1+" Waxaadna uwareejise numberka "+num2+" lacag dhan $"+price);
                        System.out.println("Haraaga cusub waa $"+Main.balances[0]);
                    }
                    else if (num1.equals(Main.number[2])&&num2.equals(Main.number[1])) {
                        Main.balances[0]-=price;
                        Main.balances[1]+=price;
                        System.out.println("Waxaad ka baxise biilka numberka "+num2+" Waxaadna uwareejise numberka "+num1+" lacag dhan $"+price);
                        System.out.println("Haraaga cusub waa $"+Main.balances[0]);
                    }
                    else
                        System.out.println("Numberka ma jiro");
                    break;
            }
        } else if (options==2) {
            System.out.println("Fadlan Gali aqoonsiga ganacsiga: ");
            String aqonsi=input.nextLine();

            System.out.println("Fadlan sogali lacagta");
            int lacagQ=input.nextInt();
            if (lacagQ>Main.balances[0])
                System.out.println("Haraaga kuguma filno!");
            else if (lacagQ<0) {
                System.out.println("");
            }
            else {
                Main.balances[0]-=lacagQ;
                System.out.println("Waxa  udirte biilka numberka: "+aqonsi+" 1");
                System.out.println("Haraaga cusub waa "+Main.balances[0]);
            }
        }
    }
}