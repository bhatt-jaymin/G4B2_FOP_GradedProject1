package com.gl.GroupAssessment;

/**
* @param Admin department will contain 3 methods of return type String and will not accept any parameter
* i) departmentName ii) getTodaysWork iii) getWorkDeadline
*@return departmentName will return “ Admin Department “
*@return getTodaysWork will return “Complete your documents Submission”
*@return getWorkDeadline will return “ Complete by EOD “

*/

/**
 * @param Admin Department class must extend with Super Department class.
 */

public class AdminDepartment extends SuperDepartment {

	/**
	 * @return departmentName it's return “ Admin Department “
	 */

	public String departmentName() {
		return "Admin Department";

	}

	/**
	 * @return getTodaysWork it's return “ Complete your documents Submission”
	 */

	public String getTodaysWork() {
		return "Complete your documents submission";

	}

	/**
	 * @return getWorkDeadline will return “ Complete by EOD “
	 */

	public String getWorkDeadline() {
		return "Complete by EOD";

	}

}
