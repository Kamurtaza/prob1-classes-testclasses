package prob1;

public class EmployeeUtilities {
	
	public double getTotalPay(Employee[] emps) {
		double totalPay = 0.0;
		for(int i =0; i < emps.length; i++) {
			totalPay += emps[i].getPay();
		}
		
		return totalPay;
	}
	public Employee getEmployeeWithMostHours(Employee[] emps) {
        Employee employeeHours = new Employee("name", 0.0);
        for(int i=0; i<emps.length; i++) {
            Employee e = emps[i];
            if(e.getTotalHours()>employeeHours.getTotalHours()) {
                employeeHours = e;
   
            }
        }
        return employeeHours;
    }
	public double[] getHoursArray(Employee[] emps) {
		double[]hoursArray = new double[emps.length];
        for(int i=0; i<emps.length; i++) {
            hoursArray[i] = emps[i].getTotalHours();


            }
        return hoursArray;
        }
    }