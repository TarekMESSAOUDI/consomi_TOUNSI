package tn.esprit.spring.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import tn.esprit.spring.entities.Subject;
import tn.esprit.spring.repository.CommentRepository;
import tn.esprit.spring.repository.ISubjectRepository;
import tn.esprit.spring.service.ISubjectService;

@Controller
public class SubjectRestController {
	
	@Autowired
	ISubjectService sS;
	
	@Autowired
	ISubjectRepository sR;
	
	@Autowired 
	CommentRepository cR;
	
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

			// http://localhost:9090/SpringMVC/servlet/retrieve-subject-by-title/{subject-title}
			@GetMapping("/retrieve-subject-by-title/{subject-title}")
			@ResponseBody
			public List<Subject> retrieveSubjectByTitle(@PathVariable("subject-title") String titleSubject) {
			return sS.retrieveSubjectByTitle(titleSubject);
			}
			
			// http://localhost:9090/SpringMVC/servlet/retrieve-subject-by-starsgreater/{subject-stars}
			@GetMapping("/retrieve-subject-by-starsgreater/{subject-stars}")
			@ResponseBody
			public List<Subject> retrieveSubjectByStars(@PathVariable("subject-stars") float starsNumberSubject) {
			return sS.retrieveSubjectByStars(starsNumberSubject);
			}
			
			// http://localhost:9090/SpringMVC/servlet/retrieve-moy-stars-subject
			@GetMapping("/retrieve-moy-by-stars-subject")
			@ResponseBody
			public float retrieveMoyStarsSubject() {
			return sR.retrievemoySubjectByStars();
			}
			
			// http://localhost:9090/SpringMVC/servlet/retrieve-max-stars-subject
			@GetMapping("/retrieve-max-stars-subject")
			@ResponseBody
			public float retrieveMaxStarsSubject() {
			return sR.retrievemaxSubjectByStars();
			}
			
			// http://localhost:9090/SpringMVC/servlet/retrieve-max-stars-subject
			@GetMapping("/retrieve-min-stars-subject")
			@ResponseBody
			public float retrieveMinStarsSubject() {
			return sR.retrieveminSubjectByStars();
			}
			
			// http://localhost:9090/SpringMVC/servlet/retrieve-subject-by-starsless/{subject-starsless}
			@GetMapping("/retrieve-subject-by-starsless/{subject-starsless}")
			@ResponseBody
			public List<Subject> retrieveSubjectByStarsless(@PathVariable("subject-starsless") float starsNumberSubject) {
			return sS.retrieveSubjectByStarsless(starsNumberSubject);
			}
			
			// http://localhost:9090/SpringMVC/servlet/add-subject
			@PostMapping("/add-subject")
			@ResponseBody
			public String addSubject(@RequestBody Subject sub) {
			return sS.addSubject(sub);
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
			
			// http://localhost:9090/SpringMVC/servlet/retreive-subject-order-by-stars
			@GetMapping("/retreive-subject-order-by-stars")
			@ResponseBody
			public List<Subject> retrievesuborderbystars(){
				return sR.retrievesuborderbystars();
			}
			
			/*// http://localhost:9090/SpringMVC/servlet/retreive-titlesubject-like-sup100
			@GetMapping("/retreive-titlesubject-like-sup100")
			@ResponseBody
			public List<Long> getlikeNumberCommentBySubjectId(){
				return sR.getTitleSubjectlikesup100();
				
			}*/

}
