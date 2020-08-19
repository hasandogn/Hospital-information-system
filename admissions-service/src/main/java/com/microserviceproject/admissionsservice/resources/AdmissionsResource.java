package com.microserviceproject.admissionsservice.resources;

import com.microserviceproject.admissionsservice.model.DiseasesList;
import com.microserviceproject.admissionsservice.model.EmployeeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.microserviceproject.admissionsservice.model.Patient;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/admissions")
public class AdmissionsResource {

	@Autowired
	private RestTemplate restTemplate;


	List<Patient> patients = Arrays.asList(
			new Patient("1","Yavuz","Turkish"),
			new Patient("2","Oyku","Turkish"),
			new Patient("3","Ahmet","Turkish")
		);

	@RequestMapping("/diseases")
	public ResponseEntity<DiseasesList> getDiseases(){
		DiseasesList diseasesList = restTemplate.getForObject("http://patalogy-service/patalogy/diseases", DiseasesList.class);
		return ResponseEntity.ok(diseasesList);
	}

	@RequestMapping("/physicians")
	public  ResponseEntity<EmployeeList> getPhyscians(){
		EmployeeList employeeList = restTemplate.getForObject("http://hr-service/hr/employees", EmployeeList.class);
		return ResponseEntity.ok(employeeList);
	}

	@RequestMapping("/patients")
	public List<Patient> getPatients() {
		return patients;
	}
	
	@RequestMapping("/patients/{Id}")
	public Patient getPatientById(@PathVariable("Id") String Id) {
		Patient p = patients.stream()
				.filter(patient -> Id.equals(patient.getId()))
				.findAny()
				.orElse(null);
		return p;
	}
	
}
