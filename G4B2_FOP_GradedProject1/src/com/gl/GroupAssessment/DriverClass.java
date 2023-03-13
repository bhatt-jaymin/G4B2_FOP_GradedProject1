package com.gl.GroupAssessment;
/**
*@param This is the main method which makes use to create objects of HrDepartment, TechDepartment,AdminDepartment
*@param Each department will display all its functionalities.
*@param Each department will display whether today is a holiday or not with the help of the Super 
Department. (SuperDepartment will act as a super class for all the departments)
* @author  Anupama Voruganti,megharaj,Hari Gopi Krishna,Jaimin Bhatt,Roushan kumar
* @version 1.0
* @since   2023-03-13
*/

public class DriverClass {
	public static void main(String args[]) {
		AdminDepartment admindepartment = new AdminDepartment(); // create Admin Department object to admindepartment
																	// reference

		// Display Admin Department All functionalities.

		System.out.println(" Welcome to " + admindepartment.departmentName());
		System.out.println(admindepartment.getTodaysWork());
		System.out.println(admindepartment.getWorkDeadline());
		System.out.println(admindepartment.isTodayAHoliday() + "\n");

		HrDepartment hrdepartment = new HrDepartment(); // create Hr Department object to hrDepartment reference

		// Display Hr Department All functionalities.

		System.out.println(" Welcome to " + hrdepartment.departmentName());
		System.out.println(hrdepartment.doActivity());
		System.out.println(hrdepartment.getTodaysWork());
		System.out.println(hrdepartment.getWorkDeadline());
		System.out.println(hrdepartment.isTodayAHoliday() + "\n");

		TechDepartment techdepartment = new TechDepartment(); // create Tech Department object to hrDepartment reference

		// Display Tech Department All functionalities.

		System.out.println(" Welcome to " + techdepartment.departmentName());
		System.out.println(techdepartment.getTodaysWork());
		System.out.println(techdepartment.getWorkDeadline());
		System.out.println(techdepartment.getTechStackInformation());
		System.out.println(techdepartment.isTodayAHoliday() + "\n");

	}

}
