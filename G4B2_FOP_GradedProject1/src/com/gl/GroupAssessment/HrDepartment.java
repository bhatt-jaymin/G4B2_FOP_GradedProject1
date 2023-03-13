package com.gl.GroupAssessment;

/**
* @param HR department will contain 4 methods of return type String and will not accept any parameter
* i) departmentName ii) getTodaysWork iii) getWorkDeadline iv) doActivity
*@return departmentName will return “ Hr Department “
*@return getTodaysWork will return “ Fill today’s timesheet and mark your attendance”
*@return getWorkDeadline will return “ Complete by EOD “
@return doActivity “team Lunch”

*/

/**
 * @param HR Department class must extend with Super Department class.
 */

public class HrDepartment extends SuperDepartment {

	/**
	 * @return departmentName it's return “ HR Department “
	 */

	public String departmentName() {
		return "HR Department";

	}

	/**
	 * @return getTodaysWork it's return “ Fill today’s timesheet and mark your
	 *         attendance”
	 */
	public String getTodaysWork() {

		return "Fill today’s timesheet and mark your attendance";

	}

	/**
	 * @return getWorkDeadline it's return “ Complete by EOD “
	 */
	public String getWorkDeadline() {

		return "Complete by EOD";

	}

	/**
	 * @return doActivity it's return “ team Lunch “
	 */
	public String doActivity() {

		return "team Lunch";

	}

}
