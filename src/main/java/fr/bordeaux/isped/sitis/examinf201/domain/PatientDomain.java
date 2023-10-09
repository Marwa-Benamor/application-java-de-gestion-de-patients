package fr.bordeaux.isped.sitis.examinf201.domain;


import fr.bordeaux.isped.sitis.examinf201.enums.BloodGroupEnum;
import fr.bordeaux.isped.sitis.examinf201.enums.GenderEnum;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tab_patient", schema = "exam_inf201")
public class PatientDomain {

    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Integer patientId;
    @Column(name = "patient_first_name")
    private String patientFirstName;
    @Column(name = "patient_last_name")
    private String patientLastName;
    @Enumerated(EnumType.STRING)
    @Column(name = "patient_gender")
    private GenderEnum patientGender;
    @Column(name = "patient_birth_date")
    private LocalDate patientBirthDate;
    @Column(name = "patient_birth_place")
    private String patientBirthPlace;
    @Enumerated(EnumType.STRING)
    @Column(name = "patient_blood_group")
    private BloodGroupEnum patientBloodGroup;


    //Constructor
    public PatientDomain() {
    }

    //Getters and Setters
    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public GenderEnum getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(GenderEnum patientGender) {
        this.patientGender = patientGender;
    }

    public LocalDate getPatientBirthDate() {
        return patientBirthDate;
    }

    public void setPatientBirthDate(LocalDate patientBirthDate) {
        this.patientBirthDate = patientBirthDate;
    }

    public String getPatientBirthPlace() {
        return patientBirthPlace;
    }

    public void setPatientBirthPlace(String patientBirthPlace) {
        this.patientBirthPlace = patientBirthPlace;
    }

    public BloodGroupEnum getPatientBloodGroup() {
        return patientBloodGroup;
    }

    public void setPatientBloodGroup(BloodGroupEnum patientBloodGroup) {
        this.patientBloodGroup = patientBloodGroup;
    }
}
