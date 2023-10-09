package fr.bordeaux.isped.sitis.examinf201.service;

import fr.bordeaux.isped.sitis.examinf201.domain.PatientDomain;
import fr.bordeaux.isped.sitis.examinf201.enums.BloodGroupEnum;
import fr.bordeaux.isped.sitis.examinf201.dto.PatientDTO;
import fr.bordeaux.isped.sitis.examinf201.interfaces.IPatientCountGender;
import fr.bordeaux.isped.sitis.examinf201.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    //Attribute
    @Autowired
    PatientRepository patientRepository;

    //Methods
    public PatientDomain savePatient(PatientDTO patientDTO) {
        PatientDomain patientDomain = new PatientDomain();
        patientDomain.setPatientFirstName(patientDTO.getPatientFirstName());
        patientDomain.setPatientLastName(patientDTO.getPatientLastName());
        patientDomain.setPatientGender(patientDTO.getPatientGender());
        patientDomain.setPatientBirthDate(patientDTO.getPatientBirthDate());
        patientDomain.setPatientBirthPlace(patientDTO.getPatientBirthPlace());
        patientDomain.setPatientBloodGroup(BloodGroupEnum.valueOf(patientDTO.getPatientBloodGroup()));

        return patientRepository.save(patientDomain);
    }

    public ResponseEntity<PatientDomain> findPatientById(String patientId) {
        Optional<PatientDomain> patientOptional = patientRepository.findById(patientId);

        if (patientOptional.isPresent()) {
            return ResponseEntity.ok(patientOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    public Page<PatientDomain> getAllPatients(Pageable pageable) {
        return patientRepository.findAll(pageable);
    }

    public List<IPatientCountGender> countPatientByGender(){
        List<IPatientCountGender> patientCountByGender = patientRepository.countPatientByGender();
        return patientCountByGender;
    }




}








