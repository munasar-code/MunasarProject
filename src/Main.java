import java.util.Scanner;  
//======================

//MUnasar Farhan Elmi
    //C1240306

//======================
public class Main {
    static String[] number={"614394528","613210617","617073967"};
    static double[] balances={500,300,400};

    static Scanner input=new Scanner(System.in);
    static int pin= 1;
    public static void Haraaga(){
        System.out.println("Haraaga xisaabta waa: $"+balances[0]);
    }
    public static void Shubasho(){
        System.out.println("Dooro\n1.gudaha\n2.dibada");
        int doorasho=input.nextInt();
        if (doorasho==1) {
            System.out.println("Dooro\n1.$0.5   30 daqiiqo\n2.$1     60 daqiiqo\n3.$2     6 saac\n4.$5     24 saac\n5.$15    Ku hadal bile");
            int option = input.nextInt();
            switch (option ) {
                case 1:
                    System.out.println("Waxaad $0.5 ugu shubte numberka "+number[0]+" oo udhiganta 30 daqiiqo u hadal gudaha ah\nHaraaga cusub waa "+(balances[0]-0.5));
                    balances[0]-=0.5;
                    break;
                case 2:
                    System.out.println("Waxaad $1 ugu shubte numberka "+number[0]+" oo udhiganta 60 daqiiqo ku hadal gudaha ah\nHaraaga cusub waa "+(balances[0]-1));
                    balances[0]-=1;
                   break;
                case 3:
                    System.out.println("Waxaad $2 ugu shubte numberka "+number[0]+" oo udhiganta  6 saac ku hadal gudaha ah\nHaraaga cusub waa "+(balances[0]-2));
                    balances[0]-=2;
                    break;
                case 4:
                    System.out.println("Waxaad $5 ugu shubte numberka "+number[0]+" oo udhiganta 24 saac ku hadal gudaha ah\nHaraaga cusub waa "+(balances[0]-5));
                    balances[0]-=5;
                    break;
                case 5:
                    System.out.println("Waxaad $15 ugu shubte numberka "+number[0]+" oo udhiganta ku hadal bile ah oo ku hadal gudaha ah\nHaraaga cusub waa "+(balances[0]-15));
                    balances[0]-=15;
                default:
                    System.out.println("Macsalaamo");
            }

        }
        else if (doorasho==2) {

            System.out.println("Dooro\n1.$0.5   30 daqiiqo\n2.$1     60 daqiiqo\n3.$2     6 saac\n4.$5     24 saac\n5.$15    Ku hadal bile");
            int option = input.nextInt();
            switch (option ) {
                case 1:
                    System.out.println("Waxaad $0.5 ugu shubte numberka "+number[0]+" oo udhiganta 30 daqiiqo ku hadal dibada ah\nHaraaga cusub waa "+(balances[0]-0.5));
                    balances[0]-=0.5;
                    break;
                case 2:
                    System.out.println("Waxaad $1 ugu shubte numberka "+number[0]+" oo udhiganta 60 daqiiqo ku hadal dibada ah\nHaraaga cusub waa "+(balances[0]-1));
                    balances[0]-=1;
                    break;
                case 3:
                    System.out.println("Waxaad $2 ugu shubte numberka "+number[0]+" oo udhiganta  6 saac ku hadal dibada ah\nHaraaga cusub waa "+(balances[0]-2));
                    balances[0]-=2;
                    break;
                case 4:
                    System.out.println("Waxaad $5 ugu shubte numberka "+number[0]+" oo udhiganta 24 saac ku hadal dibada ah\nHaraaga cusub waa "+(balances[0]-5));
                    balances[0]-=5;
                    break;
                case 5:
                    System.out.println("Waxaad $15 ugu shubte numberka "+number[0]+" oo udhiganta ku hadal bile ah oo ku hadal dibada ah\nHaraaga cusub waa "+(balances[0]-15));
                    balances[0]-=15;
                    break;
                    default:
                    System.out.println("Macsalaamo");
            }
        }
            else{
                System.out.println("Macasalaamo");
        }
    }


    public static void maareyn(){
        System.out.println("dooro:\n1: badal pinka \n2: badal luuqada");
        int badal=input.nextInt();
        if(badal==1){
            System.out.print("pinka hore so gali: ");
            int oldPin=input.nextInt();
            if(oldPin==pin){
                System.out.print("pinka cusub sogali: ");
                int newPin=input.nextInt();
                System.out.println("waku guulesate pinka ina badasho");
                pin=newPin;
            }
        } else if (badal==2) {
            System.out.println("dooro:\n1: English \n2: Carabi");
            int luqad = input.nextInt();
            if (luqad == 1) {
                System.out.println("Language is transfered into English");
            } else if (luqad == 2) {
                System.out.println("اللغة مترجمة إلى العربية");
            }
        }
    }



    public static void Uwareejin(){
        System.out.println("Numberka u wadid sogali: ");
        input.nextLine();
        String check=input.nextLine();
        if (check.equals(number[1])) {
            System.out.println("Lacagta soogali: ");
            int price = input.nextInt();
            System.out.println("Ma hubta inaad $"+price+" udirto numberka "+number[1]+"\n1.Haa\n2.Maya");
            int option=input.nextInt();
            if (option==1) {
                if (price>balances[0]) {
                    System.out.println("Haraaga xisaabtaada kuma filno");
                }else {
                    System.out.println("Waxaad u dirte $" + price + " numberka " + number[1]);
                    balances[0] -= price;
                    balances[1] += price;
                    System.out.println("Haraagada cusub waa: " + balances[0]);
                }
            }else
                System.out.println("Macsalaamo");
        }
        else if (check.equals(number[2])){
            System.out.println("Lacagta soogali: ");
            int price = input.nextInt();
            System.out.println("Ma hubta inaad $"+price+" udirto numberka "+number[2]+"\n1.Haa\n2.Maya");
            int option=input.nextInt();
            if (option==1) {
                if (price>balances[0])
                    System.out.println("Haraaga xisaabta kuguma filno");
                else {
                System.out.println("Waxaad u dirte $" + price + " numberka " + number[2]);
                balances[0] -= price;
                balances[2] += price;
                System.out.println("Haraagada cusub waa: " + balances[0]);
                }
            }
            else
                System.out.println("Macsalaamo");
        }
        else
            System.out.println("Incorrect number");
    }

    public static void Warbixinkooban() {
        System.out.println("Dooro.\n1.Last Action\n2.Uwareejintii udambeese\n3.Email Me My Activity ");
        int options = input.nextInt();
        if (options == 1)
            System.out.println("Waxaad $1 udirte numberka " + number[1] + " Taariikhda 20/6/2026 saacada 8:37am");
        else if (options == 2) {
            System.out.println("Dooro.\n1.Udirte\n2.Ka heshe");
            int options2 = input.nextInt();
            input.nextLine();
            if (options2 == 1) {
                System.out.println("Soogali numberka: ");
                String check = input.nextLine();
                if (check.equals(number[1]))
                    System.out.println("Waxaad $1 udirte numberka " + number[1] + " Taariikhda 20/6/2026 saacada 8:37am");
                else if (check.equals(number[2])) {
                    System.out.println("Waxaad $3 udirte numberka " + number[2] + " Taariikhda 17/6/2026 saacada 8:30pm");
                }
            } else if (options2 == 2) {
                System.out.println("Soogali numberka: ");
                String check = input.nextLine();
                if (check.equals(number[1]))
                    System.out.println("Waxaad $3 ka heshe numberka " + number[1] + " Taariikhda 10/6/2026 saacada 3:57am");
                else if (check.equals(number[2]))
                    System.out.println("Waxaad $10 ka heshe numberka " + number[2] + " Taariikhda 6/6/2026 saacada 2:12pm");
            }

        } else if (options==3) {
            System.out.println("Waxaad $1 udirte numberka " + number[1] + " Taariikhda 20/6/2026 saacada 8:37am");
            System.out.println("Waxaad $3 udirte numberka " + number[2] + " Taariikhda 17/6/2026 saacada 8:30pm");
            System.out.println("Waxaad $3 ka heshe numberka " + number[1] + " Taariikhda 10/6/2026 saacada 3:57am");
            System.out.println("Waxaad $10 ka heshe numberka " + number[2] + " Taariikhda 6/6/2026 saacada 2:12pm");
        }
    }
}
