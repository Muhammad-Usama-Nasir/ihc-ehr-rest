package com.ihc.ehr.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihc.ehr.model.ORMGeneral;
import com.ihc.ehr.service.GeneralService;

@RestController
@RequestMapping("/Data")
public class GeneralController {

	@Autowired
	private GeneralService generalService;
	
	@PostMapping("/Data/new") // This line maps POST requests to /Data/new
    public ResponseEntity<String> createData(@RequestBody String requestData) {
        // Process the request data here (e.g., save it to a database)
        return ResponseEntity.ok("Data created successfully");
    }
	
	@PostMapping("/new")
	public ORMGeneral newData(@RequestBody ORMGeneral general) {
		return generalService.newData(general);
	}
	
	@GetMapping("/read")
	public List<ORMGeneral> readData(){
		return generalService.readData();
	}
}
