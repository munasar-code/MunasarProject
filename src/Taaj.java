import java.util.Scanner;
public class Taaj {
    static Scanner input=new Scanner(System.in);
    public static void main() {
        taaj();
    }
    public static void taaj(){
        System.out.println("Dooro\n1.Gudaha\n2.Dibada\n3.Jooji Xawaalada\n4.Fur Xawaalada");
        int dooro=input.nextInt();
        input.nextLine();
        switch (dooro) {
            case 1:
                System.out.println("Soo gali numberka qaataha: ");
                String number=input.nextLine();
                System.out.println("Soogali lacagta: ");
                int lacagQ=input.nextInt();
                if (lacagQ<0) {
                    System.out.println("invalid");
                }
                else if (lacagQ>Main.balances[0])
                    System.out.println("Haraaga xisaabta kuguma filno");
                else{
                 if (number.equals(Main.number[1])) {
                     Main.balances[0]-=lacagQ;
                     Main.balances[1]+=lacagQ;
                     System.out.println("Waxa udirte $"+lacagQ+" numberka "+Main.number[1]);
                 } else if (number.equals(Main.number[2])) {
                     Main.balances[0]-=lacagQ;
                     Main.balances[2]+=lacagQ;
                     System.out.println("Waxa udirte $"+lacagQ+" numberka "+Main.number[2]);
                 }else
                     System.out.println("Invalid number.");
                }
            break;
            case 2:
                System.out.println("Soo gali numberka qaataha: ");
                number=input.nextLine();
                System.out.println("Soogali lacagta: ");
                lacagQ=input.nextInt();
                if (lacagQ<0) {
                    System.out.println("invalid");
                }
                else if (lacagQ>Main.balances[0])
                    System.out.println("Haraaga xisaabta kuguma filno");
                else{
                    if (number.equals(Main.number[1])) {
                        Main.balances[0]-=lacagQ;
                        Main.balances[1]+=lacagQ;
                        System.out.println("Waxa udirte $"+lacagQ+" numberka "+Main.number[1]);
                    } else if (number.equals(Main.number[2])) {
                        Main.balances[0]-=lacagQ;
                        Main.balances[2]+=lacagQ;
                        System.out.println("Waxa udirte $"+lacagQ+" numberka "+Main.number[2]);
                    }
                }
                break;
            case 3:
                System.out.println("Waxa iska xirte xawaalada Taaj");
                break;
            case 4:
                System.out.println("Waxa furate xawaalada taaj");
                break;
            default:
                System.out.println("Number saxan dooro.");
        }
    }
}