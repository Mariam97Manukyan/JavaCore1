package homeworks.medicalCenter.storage;

import homeworks.medicalCenter.model.Doctor;
import homeworks.medicalCenter.model.Patient;
import homeworks.medicalCenter.model.Person;
import homeworks.medicalCenter.model.Profession;
import homeworks.medicalCenter.util.DateUtil;

import java.util.Arrays;
import java.util.Date;


public class MedicalStorage {
    private static Person[] people = new Person[10];
    private int size = 0;

    public void add(Person person) {
        if (size == people.length) {

            extend();
        }
        people[size] = person;
        size++;
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = people[i];
            if (person instanceof Doctor && person.getId().equals(id)) {
                return (Doctor) person;
            }
        }
        return null;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Doctor) {
                System.out.println(people[i]);
            }

        }
    }

    public void printAllPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            Person person = people[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor)) {
                    System.out.println(patient);
                }
            }


        }

    }

    public void printTodaysPatients() {
        Date today = new Date();
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient) {
                Patient patient = (Patient) people[i];
                if (DateUtil.isSameDay(today, patient.getRegisterDate())) {
                    System.out.println(patient);
                }

            }

        }
    }

    public Person searchDoctorByProfession(Profession profession) {
        for (int i = 0; i < size; i++) {
            Person person = people[i];
            if (person instanceof Doctor && ((Doctor) person).getProfession().equals(profession)) {
                return person;
            }
        }
        return null;
    }

    public void deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = people[i];
            if (person instanceof Doctor && person.getId().equals(id)) {
                deleteByIndex(i);
            }
        }
    }

    public Patient getPatientById(String id) {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient && people[i].getId().equals(id)) {
                return (Patient) people[i];
            }
        }
        return null;
    }

    private void extend() {
        Person[] tmp = new Person[people.length + 10];
        System.arraycopy(people, 0, tmp, 0, people.length);
        people = tmp;
    }

    private void deleteByIndex(int i) {
        for (int j = i; j < size; j++) {
            people[j] = people[j + 1];

        }
        size--;
    }

    public boolean isDoctorAvailable(Doctor doctor, Date registerDate) {
        for (int i = 0; i < size; i++) {
            Person person = people[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor) && patient.getRegisterDate().equals(registerDate)) {

                }
            }
        }
        return true;

    }
}