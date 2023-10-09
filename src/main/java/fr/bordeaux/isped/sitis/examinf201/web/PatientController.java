package fr.bordeaux.isped.sitis.examinf201.web;

import fr.bordeaux.isped.sitis.examinf201.domain.PatientDomain;
import fr.bordeaux.isped.sitis.examinf201.dto.PatientDTO;
import fr.bordeaux.isped.sitis.examinf201.interfaces.IPatientCountGender;
import fr.bordeaux.isped.sitis.examinf201.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("api/patient")
    public ResponseEntity<PatientDomain> savePatient(@RequestBody PatientDTO patientDTO) {
        PatientDomain patientDomain = patientService.savePatient(patientDTO);
        return ResponseEntity.ok(patientDomain);
    }

    @GetMapping("api/patient/{id}")
    public ResponseEntity<PatientDomain> findPatientById(@PathVariable(name = "id") String patientId) {
        return patientService.findPatientById(patientId);
    }

    @GetMapping("api/patient/all")
    public Page<PatientDomain> getAllPatients(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size,
            @RequestParam(name = "sort", defaultValue = "patientId") String sort,
            @RequestParam(name = "direction", defaultValue = "asc") String direction) {
        Sort.Order sortOrder = new Sort.Order(Sort.Direction.fromString(direction), sort);
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortOrder));
        return patientService.getAllPatients(pageable);
    }


    @GetMapping("api/patient/count")
    public List<IPatientCountGender> countPatientByGender() {
        return patientService.countPatientByGender();
    }

}
