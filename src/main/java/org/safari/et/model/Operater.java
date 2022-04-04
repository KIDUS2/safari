package org.safari.et.model;
// Generated Apr 4, 2022 3:18:13 PM by Hibernate Tools 5.2.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Operater generated by hbm2java
 */
@Entity
@Table(name = "operater", schema = "public")
@XmlRootElement
public class Operater implements java.io.Serializable {

	private long id;
	private String type;

	public Operater() {
	}

	public Operater(long id) {
		this.id = id;
	}
	public Operater(long id, String type) {
		this.id = id;
		this.type = type;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "type")
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}