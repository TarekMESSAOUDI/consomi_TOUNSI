package tn.esprit.spring.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Subject;
import tn.esprit.spring.service.ISubjectService;

@RestController
public class SubjectRestController {
	
	@Autowired
	ISubjectService sS;
	
			// http://localhost:9090/SpringMVC/servlet/retrieve-all-subjects
			@GetMapping("/retrieve-all-subjects")
			@ResponseBody
			public List<Subject> getSubject() {
			List<Subject> list = sS.retrieveAllSubject();
			return list;
			}
			
			// http://localhost:9090/SpringMVC/servlet/retrieve-subject-by-id/{subject-id}
			@GetMapping("/retrieve-subject-by-id/{subject-id}")
			@ResponseBody
			public Optional<Subject> retrieveSubjectById(@PathVariable("subject-id") int subjectId) {
			return sS.retrieveSubjectById(subjectId);
			}

			// http://localhost:9090/SpringMVC/servlet/add-subject
			@PostMapping("/add-subject")
			@ResponseBody
			public Subject addSubject(@RequestBody Subject sub) {
				Subject subject = sS.addSubject(sub,1);
			return subject;
			}

			// http://localhost:9090/SpringMVC/servlet/delete-subject/{subject-id}
			@DeleteMapping("/delete-subject/{subject-id}")
			@ResponseBody
			public void deleteSubject(@PathVariable("subject-id") int subjectId) {
			sS.deleteSubject(subjectId);
			}
			
			// http://localhost:9090/SpringMVC/servlet/update-subject
			@PutMapping("/update-subject")
			@ResponseBody
			public Subject updateSubject(@RequestBody Subject sub) {
			return sS.updateSubject(sub);
			}

}
