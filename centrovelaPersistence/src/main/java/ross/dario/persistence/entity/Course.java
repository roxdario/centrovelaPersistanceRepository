package ross.dario.persistence.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the courses database table.
 * 
 */
@Entity
@Table(name="courses")
@NamedQuery(name="Course.findAll", query="SELECT c FROM Course c")
public class Course extends AbstractEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private int avaiableplaces;

	private String description;

	private String duration;

	private LocalDate endtime;

	private String level;

	private int price;

	private LocalDate starttime;

	private int totalplaces;

	private String type;

	public Course() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAvaiableplaces() {
		return this.avaiableplaces;
	}

	public void setAvaiableplaces(int avaiableplaces) {
		this.avaiableplaces = avaiableplaces;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
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

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDate getStarttime() {
		return this.starttime;
	}

	public void setStarttime(LocalDate starttime) {
		this.starttime = starttime;
	}

	public int getTotalplaces() {
		return this.totalplaces;
	}

	public void setTotalplaces(int totalplaces) {
		this.totalplaces = totalplaces;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}