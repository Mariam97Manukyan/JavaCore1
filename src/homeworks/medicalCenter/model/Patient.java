package homeworks.medicalCenter.model;

import homeworks.medicalCenter.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Patient extends Person {

    private Date registerDate;
    private Doctor doctor;


    public Patient(String name, String surname, String id, String phoneNumber, Date registerDate, Doctor doctor) {
        super(name, surname, id, phoneNumber);
        this.registerDate = registerDate;
        this.doctor = doctor;
    }

    public Patient() {
    }


    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Patient patient = (Patient) o;

        if (!Objects.equals(registerDate, patient.registerDate))
            return false;
        return Objects.equals(doctor, patient.doctor);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        result = 31 * result + (doctor != null ? doctor.hashCode() : 0);
        return result;
    }

    @Override


    public String toString() {
        return "Patient{" +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", id='" + super.getId() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", registerDate=" + DateUtil.dateTimeToString(registerDate) +

                '}';
    }
}
