import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmergencyRoom emergencyRoom = new EmergencyRoom();
        Scanner scanner = new Scanner(System.in);

        List<SecurityBreach> securityBreaches = new ArrayList<>();

        securityBreaches.add(new SecurityBreach("Critical Data Leak", 10));
        securityBreaches.add(new SecurityBreach("Unauthorized Access", 8));
        securityBreaches.add(new SecurityBreach("DDoS Attack", 6));
        securityBreaches.add(new SecurityBreach("Malware Infection", 4));
        securityBreaches.add(new SecurityBreach("Phishing Attempt", 2));

        Collections.sort(securityBreaches, (b1, b2) -> b2.getPriority() - b1.getPriority());

        System.out.println("Security Breach Priorities:");
        for (SecurityBreach breach : securityBreaches) {
            System.out.println("Security Breach: " + breach.getDescription() + " (Priority: " + breach.getPriority() + ")");
        }





        while (true) {
            System.out.println("Enter patient details (name, condition, priority), or type 'exit' to treat patients:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                emergencyRoom.treatPatients();
                break;
            }

            String[] patientInfo = input.split(",");
            if (patientInfo.length == 3) {
                String name = patientInfo[0].trim();
                String condition = patientInfo[1].trim();
                int priority = Integer.parseInt(patientInfo[2].trim());

                Patient patient = new Patient(name, condition, priority);
                emergencyRoom.admitPatient(patient);
            } else {
                System.out.println("Invalid input. Please enter name, condition, and priority.");
            }
        }
    }
}