package homeworks.medicalCenter.util;

import homeworks.medicalCenter.model.Doctor;
import homeworks.medicalCenter.model.Patient;
import homeworks.medicalCenter.model.Person;
import homeworks.medicalCenter.model.Profession;
import homeworks.medicalCenter.storage.MedicalStorage;
import homeworks.medicalCenter.util.Commands;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo implements Commands {
    static Scanner scanner = new Scanner(System.in);
    private static MedicalStorage medicalStorage = new MedicalStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorDataById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TODAY_PATIENTS:
                    medicalStorage.printTodaysPatients();
                    break;

            }
        }
    }

    private static void printAllPatientsByDoctor() {
        medicalStorage.printDoctors();
        System.out.println("Please choose doctor ID:");
        String id = scanner.nextLine();

        Doctor doctorById = medicalStorage.getDoctorById((id));

        if (doctorById != null) {
            medicalStorage.printAllPatientsByDoctor(doctorById);
        } else {
            System.out.println("Doctor with " + id + " does not exists!");
        }
    }

    private static void addPatient() {
        medicalStorage.printDoctors();
        System.out.println("Please choose doctor ID:");
        String id = scanner.nextLine();

        Doctor doctorById = medicalStorage.getDoctorById((id));

        if (doctorById != null) {
            System.out.println("Please input name,surname,id,phoneNumber,registerDate(26-02-2023 14:00)");
            String patientDataStr = scanner.nextLine();
            String[] patientData = patientDataStr.split(",");
            try {
                Date registerDate = DateUtil.stringToDateTime(patientData[4]);
                if (medicalStorage.isDoctorAvailable(doctorById, registerDate)) {
                    Patient patient = new Patient();
                    patient.setName(patientData[0]);
                    patient.setSurname(patientData[1]);
                    patient.setId(patientData[2]);
                    patient.setPhoneNumber(patientData[3]);
                    patient.setDoctor(doctorById);
                    patient.setRegisterDate(registerDate);
                    medicalStorage.add(patient);
                    System.out.println("Patient registered!");
                } else {
                    System.out.println("Doctor is unavailable in that time,please choose another date!");

                }
            } catch (ParseException e) {
                System.out.println("Incorrect date time format, please try again!");
            }


        } else {
            System.out.println("Doctor with " + id + " does not exists!");
        }
    }

    private static void addDoctor() {
        System.out.println("Please input name,surname,id,phoneNumber, email");
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        Profession[] professions = Profession.values();
        String id = doctorData[2];
        Doctor doctorById = medicalStorage.getDoctorById(id);

        if (doctorById == null) {
            Doctor doctor = new Doctor();
            doctor.setName(doctorData[0]);
            doctor.setSurname(doctorData[1]);
            doctor.setId(id);
            doctor.setPhoneNumber(doctorData[3]);
            doctor.setEmail(doctorData[4]);

            System.out.println("Please choose from professions:");
            for (Profession profession : professions) {
                System.out.println(profession);
            }
            String strProfession = scanner.nextLine();
            doctor.profession = Profession.valueOf(strProfession);
            doctor.setProfession(strProfession);
            medicalStorage.add(doctor);
            System.out.println("Doctor was added!");
        } else {
            System.out.println("Doctor with " + id + " ID already exists");
        }


    }

    private static void searchDoctorByProfession() {
        Profession[] professions = Profession.values();
        System.out.println("Please choose from professions:");
        for (Profession profession : professions) {
            System.out.println(profession);
        }
        String strProfession = scanner.nextLine();
        Person person = medicalStorage.searchDoctorByProfession(Profession.valueOf(strProfession));
        if (person == null) {
            System.out.println("Doctor with " + strProfession + " is does not exists");
        } else {
            System.out.println(person);
        }
    }

    private static void deleteDoctorById() {
        medicalStorage.printDoctors();
        System.out.println("Enter the ID of the doctor you want to delete:");
        String id = scanner.nextLine();
        Doctor doctorById = medicalStorage.getDoctorById(id);
        if (doctorById != null) {
            medicalStorage.deleteDoctorById(id);
        } else {
            System.out.println("Doctor with ID " + id + " not found.");
        }
    }

    private static void changeDoctorDataById() {
        medicalStorage.printDoctors();
        System.out.println("Please choose doctor ID:");
        String id = scanner.nextLine();

        Doctor doctorById = medicalStorage.getDoctorById((id));

        if (doctorById != null) {
            System.out.println("Please input name,surname,phoneNumber, email");
            String doctorDataStr = scanner.nextLine();
            String[] doctorData = doctorDataStr.split(",");
            Profession[] professions = Profession.values();
            System.out.println("Please choose from professions:");
            for (Profession profession : professions) {
                System.out.println(profession);
            }
            String strProfession = scanner.nextLine();
            strProfession = String.valueOf(Profession.valueOf(strProfession));
            doctorById.setName(doctorData[0]);
            doctorById.setSurname(doctorData[1]);
            doctorById.setPhoneNumber(doctorData[2]);
            doctorById.setEmail(doctorData[3]);
            doctorById.setProfession(strProfession);
            System.out.println("Doctor changed!");
        } else {
            System.out.println("doctor with " + id + " does not exists!");

        }

    }
}