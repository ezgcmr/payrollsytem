import java.util.*;

public class PayrollSystem_Phase1 {

	public static void main(String[] args) {
		
		System.out.println("/*********************************************************************/");
        System.out.println("/*                  TESTING THE Employee CLASS                       */");
        System.out.println("/*********************************************************************/");
        
        System.out.println("Creating an Employee object using the first constructor...");
        Employee employee_1 = new Employee("a", "Janet", "Hernan", "04/19/1987", "08/06/2013", 20.5, 27000.75, new ArrayList<Paycheck>());
        
        System.out.println("\nCalling some of the get methods in the Employee class...");
        System.out.println( String.format("%-27s%s", "Employee ID:", employee_1.getEmployeeID()) );
        System.out.println( String.format("%-27s%s", "First Name:", employee_1.getFirstName()) );
        System.out.println( String.format("%-27s%s", "Last Name:", employee_1.getLastName()) );
        System.out.println( String.format("%-27s%s", "Date of Birth:", employee_1.getDateOfBirth()) );
        
        System.out.println("\nCalling some of the set methods in the Employee class...");
        employee_1.setEmployeeID("1");
        employee_1.setFirstName("Janette");
        employee_1.setLastName("Hernandez");
        employee_1.setDateOfBirth("04/20/1987");
        
        System.out.println("\nDisplaying the state of the first Employee object (the values in its instance variables)...");
        System.out.println(employee_1.toString());
       
        
        System.out.println("\nCreating an Employee object using the second constructor...");
        Employee employee_2 = new Employee("2", "Paul", "Wilkinson" , "12/18/1976", "07/07/2014");
        
        System.out.println("\nCalling some of the get methods in the Employee class...");
        System.out.println( String.format("%-27s%s", "Date Hired:", employee_2.getDateHired()) );
        System.out.println( String.format("%-27s%s", "Accrued Vacation Hours:", employee_2.getAccruedVacationHours()) );
        System.out.println( String.format("%-27s%s", "Amount Paid Year to Date:", PayrollUtility.convertToCurrencyStringLeftAligned(employee_2.getYearToDate())) );
        System.out.println( String.format("%-27s%s", "Paychecks Received:", employee_2.getListOfPaychecks()) );
        
        // create two Paycheck objects and add them to an ArrayList
        Paycheck paulsPaycheck_1 = new Paycheck("2", "07/08/2014", "07/11/2014", "07/18/2014", 800.0, 120.0, 0.0, 680.00);
        Paycheck paulsPaycheck_2 = new Paycheck("2", "07/14/2014", "07/18/2014", "07/25/2014", 1000.0, 200.0, 0.0, 800.00);
        ArrayList<Paycheck> paulsPaychecks = new ArrayList<>();
        paulsPaychecks.add(paulsPaycheck_1);
        paulsPaychecks.add(paulsPaycheck_2);
        
        System.out.println("\nCalling some of the set methods in the Employee class...");
        employee_2.setDateHired("07/08/2014");
        employee_2.setAccruedVacationHours(10.0);
        employee_2.setYearToDate(10200.55);
        employee_2.setListOfPaychecks(paulsPaychecks);
        
        System.out.println("\nDisplaying the state of this object (the values in its instance variables)...");
        System.out.println(employee_2.toString());
        
        
        System.out.println("\n*********************************************************************");
        System.out.println("*               TESTING THE HourlyEmployee CLASS                    *");
        System.out.println("*********************************************************************");
        
        System.out.println("\nCreating an HourlyEmployee object using the first constructor...");
        
        // create two Paycheck objects and add them to an ArrayList
        Paycheck rosasPaycheck_1 = new Paycheck("3", "09/01/2014", "09/05/2014", "09/12/2014", 700.0, 105.0, 0.0, 595.00);
        Paycheck rosasPaycheck_2 = new Paycheck("3", "09/08/2014", "09/12/2014", "09/19/2014", 700.0, 105.0, 0.0, 595.00);
        ArrayList<Paycheck> rosasPaychecks = new ArrayList<>();
        rosasPaychecks.add(rosasPaycheck_1);
        rosasPaychecks.add(rosasPaycheck_2);
        HourlyEmployee employee_3 = new HourlyEmployee("3", "Rosa", "Ramirez", "11/07/1988", "08/25/2014", 0, 1400.0, rosasPaychecks, 10.0, 30.0);
    
        System.out.println("\nCalling some of the set methods in the HourlyEmployee class...");
        employee_3.setFirstName("Rosita");
        employee_3.setHourlyRate(20.0);
        employee_3.setPeriodHours(35.0);
        
        System.out.println("\nDisplaying the state of this object (the values in its instance variables)...");
        System.out.println(employee_3.toString());
        
        
        System.out.println("\nCreating an HourlyEmployee object using the second constructor...");
        HourlyEmployee employee_4 = new HourlyEmployee("4", "Beatrice", "Colton", "06/24/1976", "08/22/2014", 22.0, 40.0);
        
        // create two Paycheck objects and add them to an ArrayList
        Paycheck beatricesPaycheck_1 = new Paycheck("4", "09/01/2014", "09/05/2014", "09/12/2014", 880.0, 132.0, 0.0, 748.00);
        Paycheck beatricesPaycheck_2 = new Paycheck("4", "09/08/2014", "09/12/2014", "09/19/2014", 880.0, 132.0, 0.0, 748.00);
        ArrayList<Paycheck> beatricesPaychecks = new ArrayList<>();
        beatricesPaychecks.add(beatricesPaycheck_1);
        beatricesPaychecks.add(beatricesPaycheck_2);
        
        System.out.println("\nCalling some of the set methods in the HourlyEmployee class...");
        employee_4.setYearToDate(1760.0);
        employee_4.setListOfPaychecks(beatricesPaychecks);
        
        System.out.println("\nDisplaying the state of this object (the values in its instance variables)...");
        System.out.println(employee_4.toString());
        
        
        System.out.println("\n*********************************************************************");
        System.out.println("*              TESTING THE SalariedEmployee CLASS                   *");
        System.out.println("*********************************************************************");
        
        // create one Paycheck object and add it to an ArrayList
        Paycheck stevensPaycheck = new Paycheck("5", "09/08/2014", "09/12/2014", "09/19/2014", 961.54, 192.30, 0.0, 769.24);
        ArrayList<Paycheck> stevensPaychecks = new ArrayList<>();
        stevensPaychecks.add(stevensPaycheck);
        
        System.out.println("\nCreating a SalariedEmployee object using the first constructor...");
        SalariedEmployee employee_5 = new SalariedEmployee("5", "Steven", "Estevez", "11/26/1983","09/08/2014", 3.0, 961.54, stevensPaychecks, 0.0);
        
        System.out.println("\nCalling some of the set methods in the SalariedEmployee class...");
        employee_5.setAnnualSalary(50000.0);
        
        System.out.println("\nDisplaying the state of this object (the values in its instance variables)...");
        System.out.println(employee_5.toString());
        
        
        System.out.println("\nCreating a SalariedEmployee object using the second constructor...");
        SalariedEmployee employee_6 = new SalariedEmployee("6", "Roberto", "Barnes", "09/22/1977","09/15/2014", 0.0);
        employee_6.setAnnualSalary(48000.0);
        
        System.out.println("\nDisplaying the state of this object (the values in its instance variables)...");
        System.out.println(employee_6.toString());
        
        
        System.out.println("\n*********************************************************************");
        System.out.println("*                   TESTING THE Manager CLASS                       *");
        System.out.println("*********************************************************************");
        
        // create one Paycheck object and add it to an ArrayList
        Paycheck michaelsPaycheck = new Paycheck("7", "09/08/2014", "09/12/2014", "09/19/2014", 1288.45, 257.70, 80.0, 1110.75);
        ArrayList<Paycheck> michaelsPaychecks = new ArrayList<>();
        michaelsPaychecks.add(michaelsPaycheck);
        
        System.out.println("\nCreating a Manager object using the first constructor...");
        Manager manager_1 = new Manager("7", "Michael", "Perez", "03/02/1985", "08/01/2014", 3, 1288.45, michaelsPaychecks, 67000, 10);
        
        System.out.println("\nCalling some of the set methods in the Manager class...");
        manager_1.setWeeklyBonus(100.0);
        
        System.out.println("\nDisplaying the state of this object (the values in its instance variables)...");
        System.out.println(manager_1.toString());
        
        
        // create one Paycheck object and add it to an ArrayList
        Paycheck luisasPaycheck = new Paycheck("8", "09/08/2014", "09/12/2014", "09/19/2014", 1250.0, 250.0, 72.0, 1072.0);
        ArrayList<Paycheck> luisasPaychecks = new ArrayList<>();
        luisasPaychecks.add(luisasPaycheck);
        
        System.out.println("\nCreating a Manager object using the second constructor...");
        Manager manager_2 = new Manager("8", "Luisa", "Lopez","03/02/1985", "08/08/2014", 65000.0, 0.0);
        
        System.out.println("\nDisplaying the state of this object (the values in its instance variables)...");
        System.out.println(manager_2.toString());
        
        System.out.println("\nCalling some of the set methods in the Manager class...");
        manager_2.setAccruedVacationHours(3.0);
        manager_2.setYearToDate(1250.0);
        manager_2.setListOfPaychecks(luisasPaychecks);
        manager_2.setWeeklyBonus(90.0);
        
        System.out.println("\nDisplaying the state of this object (the values in its instance variables)...");
        System.out.println(manager_2.toString());
        
       
        System.out.println("\n*********************************************************************");
        System.out.println("*                 TESTING THE Department CLASS                      *");
        System.out.println("*********************************************************************");
        
        // create an ArrayList of Employees
        ArrayList<Employee> dept1Employees = new ArrayList<>();
        dept1Employees.add(employee_3);
        dept1Employees.add(employee_5);
        
        System.out.println("\nCreating a Department object using the first constructor...");
        Department dept_1 = new Department("1", "Human Resources", manager_1, dept1Employees);
        
        System.out.println("\nCalling some of the get methods in the Department class...");
        System.out.println( String.format("%-27s%s", "Department ID", dept_1.getDepartmentID()) );
        System.out.println( String.format("%-27s%s", "Department Name:", dept_1.getDepartmentName()) );
        System.out.println("------------------------------------------------------------------");
        System.out.println("Department Manager:\n" + dept_1.getDepartmentManager());
        System.out.println("------------------------------------------------------------------");
        System.out.println("List of Employees:\n" + dept_1.getListOfEmployees());
        System.out.println("-----------------------------------------------------------------");
        
        System.out.println("\nDisplaying the state of the first department object (the values in its instance variables)...");
        System.out.println(dept_1.toString());
        
        
        // create another ArrayList of Employees
        ArrayList<Employee> dept2Employees = new ArrayList<>();
        dept2Employees.add(employee_4);
        dept2Employees.add(employee_6);
        
        System.out.println("\nCreating a Department object using the second constructor...");
        Department dept_2 = new Department("2", "Sales and Marketing");
        
        System.out.println("\nCalling some of the set methods in the Department class...");
        dept_2.setDepartmentManager(manager_2);
        dept_2.setListOfEmployees(dept2Employees);
        
        System.out.println("\nDisplaying the state of the second department object (the values in its instance variables)...");
        System.out.println(dept_2.toString());
        
  /*      
        System.out.println("\n*********************************************************************");
        System.out.println("*                   TESTING THE Company CLASS                       *");
        System.out.println("*********************************************************************");
        
        System.out.println("\nCreating a Company object...");
        Company company = new Company("", null);
        
        // create an ArrayList of Departments
        ArrayList<Department> departments = new ArrayList<>();
        departments.add(dept_1);
        departments.add(dept_2);
        
        System.out.println("\nCalling some of the set methods in the Company class...");
        company.setCompanyName("Our Company");
        company.setDepartmentList(departments);
        
        // generate payroll for the 09/15/2014 to 09/19/2014 pay period
        System.out.println("Payroll for pay period 09/15/2014 to 09/19/2014");
        System.out.println( company.generatePayroll("09/15/2014", "09/19/2014", "09/26/2014") );
              
        System.out.println("\nDisplaying the state of the company object...");
        System.out.println(company.toString());
        */
    }

}
