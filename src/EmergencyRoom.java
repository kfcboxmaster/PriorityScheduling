import java.util.ArrayList;
import java.util.List;

class EmergencyRoom {
    private List<Patient> patients = new ArrayList<>();

    public void admitPatient(Patient patient) {
        patients.add(patient);
    }

    public void treatPatients() {
        patients.sort((p1, p2) -> p1.getPriority() - p2.getPriority());

        System.out.println("Treating patients in order of priority:");
        for (Patient patient : patients) {
            System.out.println("Patient: " + patient.getName() + ", Condition: " + patient.getCondition());
        }
    }
}