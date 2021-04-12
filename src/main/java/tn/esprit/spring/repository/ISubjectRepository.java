package tn.esprit.spring.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entities.Subject;

public interface ISubjectRepository extends CrudRepository <Subject, Integer>{
	
	List<Subject> findByTitleSubject(String titleSubject);
	
	List<Subject> findByStarsNumberSubjectGreaterThan(float starsNumberSubject);
	
	List<Subject> findByStarsNumberSubjectLessThan(float starsNumberSubject);

	@Query("SELECT AVG(s.starsNumberSubject) from Subject s")
	float retrievemoySubjectByStars();

	@Query("SELECT MAX(s.starsNumberSubject) from Subject s")
	float retrievemaxSubjectByStars();

	@Query("SELECT MIN(s.starsNumberSubject) from Subject s")
	float retrieveminSubjectByStars();

	@Query("SELECT s FROM Subject s ORDER BY s.starsNumberSubject DESC")
	List<Subject> retrievesuborderbystars();
	
	/*@Query("SELECT "
			+ "DISTINCT c.idComment FROM Comment c "
			+ "join c.Subject s"
			+ "where s.starsNumberSubject > 3")
    public List<Long> getTitleSubjectlikesup100();*/
	
	boolean existsByTitleSubject(String titleSubject);
}