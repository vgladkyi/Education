package Practice.telephone;



import java.util.Scanner;

public class MainTelephone {
    public static void main(String[] args) {
        double [] calc = new double[4];
        calc[0]=30;
        calc[1]=2;
        calc[2]=3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skolko minut vi ispolzovali v etom mesyace?: ");
        calc[3] = scanner.nextInt();

        double difference = calc[3] - calc[0];
        double inlimit = calc[0] * calc [1];
        double overlimit = calc[0] * calc [1] + difference*calc[2];

              if (calc[3]>calc[0]){
            System.out.println("Vi privisili limite na  " + difference + " minut, po etomu plata sostavit "+overlimit+" grn.");
              } else {
                    System.out.println("Plata sostavit " + inlimit+ " grn, soglasno vashego tarifa");
              }



        }

}
