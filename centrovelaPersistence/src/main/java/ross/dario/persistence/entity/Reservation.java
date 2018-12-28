package ross.dario.persistence.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the reservations database table.
 * 
 */
@Entity
@Table(name="reservations")
@NamedQuery(name="Reservation.findAll", query="SELECT r FROM Reservation r")
public class Reservation extends AbstractEntity{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private java.math.BigInteger courseid;

	private LocalDate endtime;

	private String level;

	private String paymentstatus;

	private LocalDate starttime;

	private String type;

	private java.math.BigInteger userid;

	public Reservation() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public java.math.BigInteger getCourseid() {
		return this.courseid;
	}

	public void setCourseid(java.math.BigInteger courseid) {
		this.courseid = courseid;
	}

	public LocalDate getEndtime() {
		return this.endtime;
	}

	public void setEndtime(LocalDate endtime) {
		this.endtime = endtime;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getPaymentstatus() {
		return this.paymentstatus;
	}

	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}

	public LocalDate getStarttime() {
		return this.starttime;
	}

	public void setStarttime(LocalDate starttime) {
		this.starttime = starttime;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public java.math.BigInteger getUserid() {
		return this.userid;
	}

	public void setUserid(java.math.BigInteger userid) {
		this.userid = userid;
	}

}