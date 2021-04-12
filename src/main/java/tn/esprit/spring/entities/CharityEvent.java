package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties
@Entity
@Table (name = "T_CHARITY_EVENT")
public class CharityEvent implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idCharityEvent ;
	private String titleCharityEvent ;
	private Date startDateCharityEvent ;
	@Temporal (TemporalType.DATE)
	private Date endDateCharityEvent ;
	private String locationCharityEvent ;
	private String participantsCharityEvent ;
	
	public CharityEvent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CharityEvent(int idCharityEvent, String titleCharityEvent, Date startDateCharityEvent,
			Date endDateCharityEvent, String locationCharityEvent, String participantsCharityEvent) {
		super();
		this.idCharityEvent = idCharityEvent;
		this.titleCharityEvent = titleCharityEvent;
		this.startDateCharityEvent = startDateCharityEvent;
		this.endDateCharityEvent = endDateCharityEvent;
		this.locationCharityEvent = locationCharityEvent;
		this.participantsCharityEvent = participantsCharityEvent;
	}

	public CharityEvent(int idCharityEvent, String titleCharityEvent, Date startDateCharityEvent,
			Date endDateCharityEvent, String locationCharityEvent, String participantsCharityEvent,
			tn.esprit.spring.entities.Administrator administrator, tn.esprit.spring.entities.Cagnotte cagnotte) {
		super();
		this.idCharityEvent = idCharityEvent;
		this.titleCharityEvent = titleCharityEvent;
		this.startDateCharityEvent = startDateCharityEvent;
		this.endDateCharityEvent = endDateCharityEvent;
		this.locationCharityEvent = locationCharityEvent;
		this.participantsCharityEvent = participantsCharityEvent;
		Administrator = administrator;
		Cagnotte = cagnotte;
	}

	//@JsonIgnore
	@ManyToOne
	Administrator Administrator; 
	
	@JsonIgnore
	@OneToOne
	private Cagnotte Cagnotte;
	
	
	public Date getEndDateCharityEvent() {
		return endDateCharityEvent;
	}
	public void setEndDateCharityEvent(Date endDateCharityEvent) {
		this.endDateCharityEvent = endDateCharityEvent;
	}
	public int getIdCharityEvent() {
		return idCharityEvent;
	}
	public void setIdCharityEvent(int idCharityEvent) {
		this.idCharityEvent = idCharityEvent;
	}
	public String getTitleCharityEvent() {
		return titleCharityEvent;
	}
	public void setTitleCharityEvent(String titleCharityEvent) {
		this.titleCharityEvent = titleCharityEvent;
	}
	public String getLocationCharityEvent() {
		return locationCharityEvent;
	}
	public void setLocationCharityEvent(String locationCharityEvent) {
		this.locationCharityEvent = locationCharityEvent;
	}
	public String getParticipantsCharityEvent() {
		return participantsCharityEvent;
	}
	public void setParticipantsCharityEvent(String participantsCharityEvent) {
		this.participantsCharityEvent = participantsCharityEvent;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Date getStartDateCharityEvent() {
		return startDateCharityEvent;
	}
	public void setStartDateCharityEvent(Date startDateCharityEvent) {
		this.startDateCharityEvent = startDateCharityEvent;
	}
	public Administrator getAdministrator() {
		return Administrator;
	}
	public void setAdministrator(Administrator administrator) {
		Administrator = administrator;
	}
	public Cagnotte getCagnotte() {
		return Cagnotte;
	}
	public void setCagnotte(Cagnotte cagnotte) {
		Cagnotte = cagnotte;
	}
		
}
