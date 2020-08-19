package com.microserviceproject.patalogyservice.resources;

import com.microserviceproject.patalogyservice.model.Disease;
import com.microserviceproject.patalogyservice.model.DiseasesList;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/patalogy")
public class PatalogyResource {

    List<Disease> diseases = Arrays.asList(
            new Disease("1", "Ashma", "Warm water wath"),
            new Disease("2", "Thyphoid", "Ampicilin capsule!")
    );

    @RequestMapping("/diseases")
    public ResponseEntity<DiseasesList> getDiseases() {
        DiseasesList diseasesList = new DiseasesList();
        diseasesList.setDiseases(diseases);
        return ResponseEntity.ok(diseasesList);
    }

    @RequestMapping("/disease/{Id}")
    public Disease getDiseaseById(@PathVariable("Id") String Id) {
        Disease d = diseases.stream()
                .filter(disease -> Id.equals(disease.getId()))
                .findAny()
                .orElse(null);

        return d;
    }

}
