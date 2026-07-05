import java.util.Scanner;
public class Bank {
    static Scanner input = new Scanner(System.in);
    static int bankPin=1221;
    static double bankBalance = 100;
    public static void main() {

    }

    public static void bank() {

        System.out.println(" dooro:\n 1:haraaga xisaabta bankiga\n 2:lacag dhigasho\n 3:lacag qaadasho\n 4:Ka wareeji EVC PLUS\n 5:Ka wareeji accountiga" +
                "\n 6:hubi wareejin accountiga\n 7:Maareynta bankiga\n 8:ka bax");
        int check = input.nextInt();
        if (check == 1) {
            System.out.println("soogali pinka bankiga: ");
            int hubinPin = input.nextInt();
            if (hubinPin == bankPin) {
                System.out.println("Haraaga bankiga waa: $" + bankBalance);
            } else {
                System.out.println("incorrect pin");
            }
        } else if (check == 2) {
            System.out.print("Soogali lacagta: ");
            double lacagQ = input.nextDouble();
            System.out.println("soogali pinka bankiga: ");
            int hubinPin = input.nextInt();
            if (hubinPin == bankPin) {
                System.out.println("Ma hubta in aad dhigato $" + lacagQ + "\n 1=Haa\n 2:Maya");
                int dorid = input.nextInt();
                if (dorid == 1) {
                    if (lacagQ < 10) {
                        System.out.println("Xisaabtan lama ogolo");
                    } else if (lacagQ > Main.balances[0]) {
                        System.out.println("kuguma filno haraaga");
                    } else {
                        bankBalance += lacagQ;
                        Main.balances[0] -= lacagQ;
                        System.out.println("$" + lacagQ + " ayaad dhigate accountiga\nharaagu bankiga waa: $" + bankBalance);
                        System.out.println("haraagaaga evc waxa laga jare $" + lacagQ + " haraaga  waa: $" + Main.balances[0]);
                    }

                } else if (dorid == 2) {
                    System.out.println("Macsalaamo");
                }
            } else {
                System.out.println("incorrect pin");
            }
        } else if (check == 3) {
            System.out.print("Soogali lacagta: ");
            double lacagQ = input.nextDouble();
            System.out.println("Ma hubta in aad qaadato $" + lacagQ + "\n1=Haa\n2:Maya");
            int dorid = input.nextInt();
            if (dorid == 1) {
                System.out.println("soogali pinka bankiga: ");
                int hubinPin = input.nextInt();
                if (hubinPin == bankPin) {
                    if (lacagQ > bankBalance) {
                        System.out.println("kuguma filno haraaga");
                    } else if (lacagQ<10) {
                        System.out.println("Xisaabtan lama ogolo");
                    } else {
                        bankBalance-=lacagQ;
                        Main.balances[0]+=lacagQ;
                        System.out.println("$" + lacagQ + " ayaad ka qaadate accountiga\nharaagu waa: $" + bankBalance);
                        System.out.println("haraagaaga evc waxa lagu dare $" + lacagQ + "haraaga cusub waa $" + Main.balances[0]);

                    }
                } else if (dorid == 2) {
                    System.out.println("Macsalaamo");
                }
            } else {
                System.out.println("incorrect pin");
            }
        } else if (check == 4) {
            System.out.println("Soo gali lacagta: ");
            double lacagQ = input.nextDouble();
            if (lacagQ > Main.balances[0])
                System.out.println("Haraaga xisaabta kuma filno");
            else if (lacagQ < 10)
                System.out.println("$10 dollar ka yar ma qaadno");
            else {
                System.out.println("Ma hubta inaad uwareejiso $"+lacagQ+" Bankiga fadlan soogali pinka bankiga: ");
                int pincheck=input.nextInt();
                if (pincheck==bankPin) {
                    bankBalance += lacagQ;
                    Main.balances[0] -= lacagQ;
                    System.out.println("Waxa ku shubate accountiga $" + lacagQ);
                    System.out.println("Haraaga bankiga waa $" + bankBalance);
                    System.out.println("Haraaga EVC waa $" + Main.balances[0]);
                }else
            System.out.println("pinka qalad waaye");
            }
        } else if (check == 5) {
            System.out.println("Soo gali lacagta: ");
            double lacagQ = input.nextDouble();
            if (lacagQ > bankBalance)
                System.out.println("Haraaga xisaabta kuma filno");
            else if (lacagQ < 10)
                System.out.println("$10 dollar ka yar ma qaadno");
            else {
                System.out.println("Ma hubta inaad uwareejiso $"+lacagQ+" EVC gaada fadlan soogali pinka bankiga: ");
                int pincheck=input.nextInt();
                if (pincheck==bankPin){
                    bankBalance -= lacagQ;
                    Main.balances[0]+=lacagQ;
                    System.out.println("Waxa ku shubate EVC gaada $" + lacagQ);
                    System.out.println("Haraaga bankiga waa $" +bankBalance);
                    System.out.println("Haraaga EVC waa $"+Main.balances[0]);
                }else
                    System.out.println("pinka qalad waaye");
            }


        }else if (check==6){
            System.out.println("Your OTP is 2345");
            System.out.println("Soogali OTP ga: ");
            int otp=input.nextInt();
            if (otp==2345)
                System.out.println("Your OTP is correct");
            else
                System.out.println("Incorrect OTP");
        }
         else if(check==7){
        System.out.println("dooro:\n1: badal pinka \n2: badal luuqada");
        int badal = input.nextInt();
        if (badal == 1) {
            System.out.print("pinka hore so gali: ");
            int oldPin = input.nextInt();
            if (oldPin == bankPin) {
                System.out.print("pinka cusub sogali: ");
                int newPin = input.nextInt();
                System.out.println("waku guulesate pinka ina badasho");
                bankPin = newPin;
            } else {
                System.out.println("incorrect pin");
            }
        } else if (badal == 2) {
            System.out.println("dooro:\n1: English \n2: Carabi");
            int luqad = input.nextInt();
            if (luqad == 1) {
                System.out.println("Language is transfered into English");
            } else if (luqad == 2) {
                System.out.println("اللغة مترجمة إلى العربية");
            }

        }
    }
}
}