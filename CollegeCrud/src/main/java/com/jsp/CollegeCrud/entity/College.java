package com.jsp.CollegeCrud.entity;

import javax.persistence. *;

@Entity
public class College {
	@Id
	@GeneratedValue
	private int id ;
	private String name ;
	private String university ;
	private String loc ;
	private String deptCount ;
	
	public College() {
		
	}

	public College(String name, String university, String loc, String deptCount) {
		super();
		this.name = name;
		this.university = university;
		this.loc = loc;
		this.deptCount = deptCount;
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

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getDeptCount() {
		return deptCount;
	}

	public void setDeptCount(String deptCount) {
		this.deptCount = deptCount;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", university=" + university + ", loc=" + loc + ", deptCount="
				+ deptCount + "]";
	}
	
	
	

}
