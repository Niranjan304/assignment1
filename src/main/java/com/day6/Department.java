package com.day6;

import java.util.Objects;

public class Department {
	String DepartmentName;
	String Location;
	Integer ID;
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	@Override
	public int hashCode() {
		return Objects.hash(DepartmentName, ID, Location);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(DepartmentName, other.DepartmentName) && Objects.equals(ID, other.ID)
				&& Objects.equals(Location, other.Location);
	}
	

}
