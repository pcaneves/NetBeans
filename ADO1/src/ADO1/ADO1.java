package ADO1;

import java.util.Scanner;

public class ADO1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hAlarme, mAlarme, sAlarme, diaAlarme;

        System.out.print("Informe o dia que deseja o alarme (1-7): ");
        diaAlarme = input.nextInt();
        System.out.print("Informe a hora que deseja o alarme (hh): ");
        hAlarme = input.nextInt();
        System.out.print("Informe a minuto que deseja o alarme (mm): ");
        mAlarme = input.nextInt();
        System.out.print("Informe a hora que deseja o alarme (ss): ");
        sAlarme = input.nextInt();

        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59; m++) {
                for (int s = 0; s <= 59; s++) {
                    System.out.println(h + ":" + m + ":" + s);

                    if ((h == hAlarme) && (m == mAlarme) && (s == sAlarme)) {
                        switch (diaAlarme) {
                            case 1:
                                System.out.println("Segunda-feira - " + h + ":" + m + ":" + s);
                                break;
                            case 2:
                                System.out.println("Terça-feira - " + h + ":" + m + ":" + s);
                                break;
                            case 3:
                                System.out.println("Quarta-feira - " + h + ":" + m + ":" + s);
                                break;
                            case 4:
                                System.out.println("Quinta-feira - " + h + ":" + m + ":" + s);
                                break;
                            case 5:
                                System.out.println("Sexta-feira - " + h + ":" + m + ":" + s);
                                break;
                            case 6:
                                System.out.println("Sábado - " + h + ":" + m + ":" + s);
                                break;
                            case 7:
                                System.out.println("Domingo - " + h + ":" + m + ":" + s);
                                break;
                            default:
                                System.out.println("Dia Inexistente");
                        }
                        System.out.println("ALARME");
                        break;
                    }
                }
                if ((h == hAlarme) && (m == mAlarme)) {
                    break;
                }
            }
            if (h == hAlarme) {
                break;
            }

        }
    }

}
