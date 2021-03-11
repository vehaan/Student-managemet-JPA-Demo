package com.cg;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="TProject")
public class Project {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int projectId;
    private String projectName;
    private String details;
   
    @ManyToMany(mappedBy = "projects",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Employee> employees;
    
    
    public Project(String projectName) {
		this.projectName = projectName;// TODO Auto-generated constructor stub
	}


	public int getProjectId() {
		return projectId;
	}


	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	public Set<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}


	@Override
    public String toString() {
        return "Project [projectId=" + projectId + ", projectName=" + projectName + ", details=" + details
                + ", employees=" + employees + "]";
    }
}