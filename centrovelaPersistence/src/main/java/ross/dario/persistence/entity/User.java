package ross.dario.persistence.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User extends AbstractEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private int cap;

	private String code;

	private LocalDate dateofbirth;

	private String domicilecity;

	private String domicilehousenumber;

	private String domicilestreetname;

	private String email;

	private String firstname;

	private String firstnameoftutor;

	private String lastname;

	private String lastnameoftutor;

	private String medicalvisit;

	private String note;

	private String password;

	private int phone;

	private String placeofbirth;

	private LocalDateTime regdate;

	private int role;

	private String type;

	public User() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCap() {
		return this.cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public LocalDate getDateofbirth() {
		return this.dateofbirth;
	}

	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getDomicilecity() {
		return this.domicilecity;
	}

	public void setDomicilecity(String domicilecity) {
		this.domicilecity = domicilecity;
	}

	public String getDomicilehousenumber() {
		return this.domicilehousenumber;
	}

	public void setDomicilehousenumber(String domicilehousenumber) {
		this.domicilehousenumber = domicilehousenumber;
	}

	public String getDomicilestreetname() {
		return this.domicilestreetname;
	}

	public void setDomicilestreetname(String domicilestreetname) {
		this.domicilestreetname = domicilestreetname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFirstnameoftutor() {
		return this.firstnameoftutor;
	}

	public void setFirstnameoftutor(String firstnameoftutor) {
		this.firstnameoftutor = firstnameoftutor;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLastnameoftutor() {
		return this.lastnameoftutor;
	}

	public void setLastnameoftutor(String lastnameoftutor) {
		this.lastnameoftutor = lastnameoftutor;
	}

	public String getMedicalvisit() {
		return this.medicalvisit;
	}

	public void setMedicalvisit(String medicalvisit) {
		this.medicalvisit = medicalvisit;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone() {
		return this.phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getPlaceofbirth() {
		return this.placeofbirth;
	}

	public void setPlaceofbirth(String placeofbirth) {
		this.placeofbirth = placeofbirth;
	}

	public LocalDateTime getRegdate() {
		return this.regdate;
	}

	public void setRegdate(LocalDateTime regdate) {
		this.regdate = regdate;
	}

	public int getRole() {
		return this.role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}