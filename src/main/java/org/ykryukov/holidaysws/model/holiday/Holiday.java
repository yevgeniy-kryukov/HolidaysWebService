package org.ykryukov.holidaysws.model.holiday;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "main", name = "holiday")
public class Holiday {
	@Id
	@Column(name = "hdate", unique = true, nullable = false)
	private Date hDate;
	
	public Holiday() {
		super();
	}
	
	public Holiday(Date hDate) {
		super();
		this.hDate = hDate;
	}

	public Date gethDate() {
		return hDate;
	}

	public void sethDate(Date hDate) {
		this.hDate = hDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Holiday other = (Holiday) obj;
		return Objects.equals(hDate, other.hDate);
	}
}
