package it.unical.inf.asd.app2.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeBean
{
	private String fullName;

	//@Autowired on properties
	@Autowired
//	@Qualifier("finance")
	private DepartmentBean departmentBean;


	/*  @Autowired on constructors
	@Autowired
	public EmployeeBean(DepartmentBean departmentBean)
	{
		this.departmentBean = departmentBean;
	}
	*/

	/* @Autowired on property setters
	@Autowired
	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}
	*/

	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}

	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}