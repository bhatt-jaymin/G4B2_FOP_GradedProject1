package com.gl.GroupAssessment;
/**
*@param Tech department will contain 4 methods of return type String and will not accept any parameter
* i) departmentName ii) getTodaysWork iii) getWorkDeadline iv) getTechStackInformation
*@return departmentName will return “ Tech Department “
*@return getTodaysWork will return “ Complete coding of module 1”
*@return getWorkDeadline will return “ Complete by EOD “
*@return getTechStackInformation will return “core Java”
*/

/**
 * @param tech Department class must extend with Super Department class.
 */
public class TechDepartment extends SuperDepartment {

	/**
	 * @return departmentName it's return “ Tech Department “
	 */

	public String departmentName() {
		return "Tech Department";

	}

	/**
	 * @return getTodaysWork it's return “ Complete coding of module 1 “
	 */

	public String getTodaysWork() {
		return "Complete coding of module 1";

	}

	/**
	 * @return getWorkDeadline it's return “ Complete by EOD “
	 */

	public String getWorkDeadline() {
		return "Complete by EOD";

	}

	/**
	 * @return getTechStackInformation it's return “ Core Java“
	 */

	public String getTechStackInformation() {
		return " Core Java";

	}

}
