package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hobby {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	int yearsSince;
	
	public Hobby() {
		
	}

	public Hobby(String name, int yearsSince) {
		this.name = name;
		this.yearsSince = yearsSince;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsSince() {
		return yearsSince;
	}

	public void setYearsSince(int yearsSince) {
		this.yearsSince = yearsSince;
	}
	
	

}
