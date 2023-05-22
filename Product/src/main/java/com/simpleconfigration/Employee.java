package com.simpleconfigration;

public class Employee {
        private String empName;
        private int empId;
       
		public Employee(String empName, int empId) {
			super();
			this.empName = empName;
			this.empId = empId;
		}
        public void employeeDetails() {
        	System.out.println("Employee Id:"+empId);
        	System.out.println("Employee Name:"+empName);
            
        }
}
