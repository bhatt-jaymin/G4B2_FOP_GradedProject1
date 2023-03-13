package com.gl.GroupAssessment;

/**
 * <h1>Add Super Department class will be the superclass and all other
 * departments must extend it</h1>
 * @param unused return arguments
 * @param Super department will contain 4 methods of return type String and will
 *              not accept any parameter i) departmentName ii) getTodaysWork
 *              iii) getWorkDeadline iv) isTodayAHoliday the output on the
 *              screen.
 *              <p>
 *              <b>Note:</b>
 * @return departmentName will return “ Super Department “ 
 * @return getTodaysWork will return “ No Work as of now” 
 * @return getWorkDeadline will return “ Nil “
 * @return isTodayAHoliday will return “ Today is not a holiday”
 */

public class SuperDepartment {

	/**
	 * @return departmentName it's return “ Super Department “
	 */

	public String departmentName() {

		return "Super Department";
	}

	/**
	 * @return getTodaysWork it's return “ No Work as of now"
	 */

	public String getTodaysWork() {

		return "No Work as of now";

	}

	/**
	 * @return getWorkDeadline it's return “ Nil"
	 */

	public String getWorkDeadline() {

		return "Nil";

	}

	/**
	 * @return isTodayAHoliday it's return “ Today is not a Holiday"
	 */

	public String isTodayAHoliday() {

		return "Today is not a Holiday";

	}

}
