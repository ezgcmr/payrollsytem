import java.util.*;

public class Department {
	 private String departmentID;
	 private String departmentName;
	 private Manager departmentManager;
	 private ArrayList<Employee>listOfEmployees;

	public Department(String departmentID, String departmentName,
			Manager departmentManager, ArrayList<Employee> listOfEmployee) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.departmentManager = departmentManager;
		this.listOfEmployees = listOfEmployee;
	}

	public Department(String departmentID, String departmentName) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
	}

	public String getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Manager getDepartmentManager() {
		return departmentManager;
	}

	public void setDepartmentManager(Manager departmentManager) {
		this.departmentManager = departmentManager;
	}

	public ArrayList<Employee> getListOfEmployees() {
		return listOfEmployees;
	}

	public void setListOfEmployees(ArrayList<Employee> listOfEmployee) {
		this.listOfEmployees = listOfEmployee;
	}

	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName="
				+ departmentName + ", departmentManager=" + departmentManager
				+ ", listOfEmployee=" + listOfEmployees + "]";
	}
	  
}
