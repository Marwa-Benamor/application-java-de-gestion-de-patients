package fr.bordeaux.isped.sitis.examinf201.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import fr.bordeaux.isped.sitis.examinf201.enums.BloodGroupEnum;
import fr.bordeaux.isped.sitis.examinf201.enums.GenderEnum;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatientDTO {
    //Attributes
    private String patientFirstName;
    private String patientLastName;
    private GenderEnum patientGender;
    private LocalDate patientBirthDate;
    private String patientBirthPlace;
    private String patientBloodGroup;

    //Constructor
    public PatientDTO() {
    }

    //Getters and setters
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

    public String getPatientBloodGroup() {
        return patientBloodGroup;
    }

    public void setPatientBloodGroup(BloodGroupEnum patientBloodGroup) {
        this.patientBloodGroup = String.valueOf(patientBloodGroup);
    }
}
