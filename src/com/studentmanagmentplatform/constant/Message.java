
package com.studentmanagmentplatform.constant;

public class Message {

	public static final String GET_NAME_MESSAGE = "Enter the student name: ";
	public static final String GET_ID_MESSAGE = "Enter the student ID: ";

	public static final void showMenu() {
		System.out.println("===== Student Management System =====");
		System.out.println("1. Add Student");
		System.out.println("2. Show All Students");
		System.out.println("3. Search Student");
		System.out.println("4. Update Student");
		System.out.println("5. Delete Student");
		System.out.println("0. Exit");
	}

	public static final String THANK_MESSAGE = "Thank you for using my system :)";

	public static final String WRONG_CHOICE_MESSAGE = "You didn't choose correct choice , try again";

	// ================= MAIN LOGS =================

	public static final String MAIN_ENTER = "[ENTER] Main.main()";

	public static final String MAIN_EXIT = "[EXIT] Main.main()";

	public static final String MENU_DISPLAYED = "[INFO] Main - Menu displayed";

	public static final String USER_CHOICE_RECEIVED = "[INFO] Main - User choice received";

	// ================= SERVICE LOGS =================

	public static final String ADD_SERVICE_ENTER = "[ENTER] StudentService.addStudentService()";

	public static final String ADD_SERVICE_EXIT = "[EXIT] StudentService.addStudentService()";

	public static final String SHOW_SERVICE_ENTER = "[ENTER] StudentService.showAllStudentsService()";

	public static final String SHOW_SERVICE_EXIT = "[EXIT] StudentService.showAllStudentsService()";

	public static final String SEARCH_SERVICE_ENTER = "[ENTER] StudentService.serachService()";

	public static final String SEARCH_SERVICE_EXIT = "[EXIT] StudentService.serachService()";

	public static final String UPDATE_SERVICE_ENTER = "[ENTER] StudentService.updateService()";

	public static final String UPDATE_SERVICE_EXIT = "[EXIT] StudentService.updateService()";

	public static final String DELETE_SERVICE_ENTER = "[ENTER] StudentService.deleteService()";

	public static final String DELETE_SERVICE_EXIT = "[EXIT] StudentService.deleteService()";

	// ================= DAO LOGS =================

	public static final String DAO_ADD_ENTER = "[ENTER] DAO.addStudent()";

	public static final String DAO_ADD_EXIT = "[EXIT] DAO.addStudent()";

	public static final String DAO_DELETE_ENTER = "[ENTER] DAO.deleteStudent()";

	public static final String DAO_DELETE_EXIT = "[EXIT] DAO.deleteStudent()";

	public static final String DAO_SEARCH_ENTER = "[ENTER] DAO.serachStudent()";

	public static final String DAO_SEARCH_EXIT = "[EXIT] DAO.serachStudent()";

	public static final String DAO_GET_ALL_ENTER = "[ENTER] DAO.getAllStudents()";

	public static final String DAO_GET_ALL_EXIT = "[EXIT] DAO.getAllStudents()";

	public static final String DAO_UPDATE_ENTER = "[ENTER] DAO.updateStudent()";

	public static final String DAO_UPDATE_EXIT = "[EXIT] DAO.updateStudent()";

	// ================= OPERATION LOGS =================

	public static final String STUDENT_FOUND = "[INFO] Student found";

	public static final String STUDENT_NOT_FOUND = "[INFO] Student not found";

	public static final String STUDENT_ADDED = "[SUCCESS] Student added";

	public static final String STUDENT_DELETED = "[SUCCESS] Student deleted";

	public static final String STUDENT_UPDATED = "[SUCCESS] Student updated";

	public static final String VALIDATION_PASSED = "[INFO] Input validation passed";

	public static final String VALIDATION_FAILED = "[ERROR] Input validation failed";

	// ================= FILE LOGS =================

	public static final String FILE_READING = "[INFO] FileStudentDAO - Reading file";

	public static final String FILE_WRITING = "[INFO] FileStudentDAO - Writing to file";

	public static final String FILE_NOT_FOUND = "[INFO] FileStudentDAO - File not found";

	public static final String FILE_OPERATION_SUCCESS = "[SUCCESS] FileStudentDAO - File operation completed";

	public static final String FILE_OPERATION_FAILED = "[ERROR] FileStudentDAO - File operation failed";

	// ================= VALIDATOR LOGS =================

	public static final String VALIDATE_AGE_ENTER = "[ENTER] InputValidator.validateAge()";

	public static final String VALIDATE_AGE_EXIT = "[EXIT] InputValidator.validateAge()";

	public static final String VALIDATE_GRADE_ENTER = "[ENTER] InputValidator.validateGrade()";

	public static final String VALIDATE_GRADE_EXIT = "[EXIT] InputValidator.validateGrade()";

	public static final String VALIDATE_STRING_ENTER = "[ENTER] InputValidator.validateString()";

	public static final String VALIDATE_STRING_EXIT = "[EXIT] InputValidator.validateString()";

	public static final String VALIDATE_ID_ENTER = "[ENTER] InputValidator.isIdExits()";

	public static final String VALIDATE_ID_EXIT = "[EXIT] InputValidator.isIdExits()";

	// ================= INPUT HANDLER LOGS =================

	public static final String INPUT_HANDLER_ENTER = "[ENTER] InputHandler.InputHandler()";

	public static final String INPUT_HANDLER_EXIT = "[EXIT] InputHandler.InputHandler()";

	public static final String READ_STRING_ENTER = "[ENTER] InputHandler.readString()";

	public static final String READ_STRING_EXIT = "[EXIT] InputHandler.readString()";

	public static final String READ_AGE_ENTER = "[ENTER] InputHandler.readAge()";

	public static final String READ_AGE_EXIT = "[EXIT] InputHandler.readAge()";

	public static final String READ_GRADE_ENTER = "[ENTER] InputHandler.readGrade()";

	public static final String READ_GRADE_EXIT = "[EXIT] InputHandler.readGrade()";

	public static final String READ_CHOICE_ENTER = "[ENTER] InputHandler.readChioce()";

	public static final String READ_CHOICE_EXIT = "[EXIT] InputHandler.readChioce()";

	// ================= STUDENT MODEL LOGS =================

	public static final String STUDENT_CONSTRUCTOR_ENTER = "[ENTER] Student.Student()";

	public static final String STUDENT_CONSTRUCTOR_EXIT = "[EXIT] Student.Student()";

	public static final String STUDENT_SET_NAME_ENTER = "[ENTER] Student.setName()";

	public static final String STUDENT_SET_NAME_EXIT = "[EXIT] Student.setName()";

	public static final String STUDENT_SET_AGE_ENTER = "[ENTER] Student.setAge()";

	public static final String STUDENT_SET_AGE_EXIT = "[EXIT] Student.setAge()";

	public static final String STUDENT_SET_GRADE_ENTER = "[ENTER] Student.setGrade()";

	public static final String STUDENT_SET_GRADE_EXIT = "[EXIT] Student.setGrade()";

	public static final String STUDENT_GET_ID_ENTER = "[ENTER] Student.getNationalId()";

	public static final String STUDENT_GET_ID_EXIT = "[EXIT] Student.getNationalId()";

	public static final String STUDENT_GET_NAME_ENTER = "[ENTER] Student.getName()";

	public static final String STUDENT_GET_NAME_EXIT = "[EXIT] Student.getName()";

	public static final String STUDENT_GET_AGE_ENTER = "[ENTER] Student.getAge()";

	public static final String STUDENT_GET_AGE_EXIT = "[EXIT] Student.getAge()";

	public static final String STUDENT_GET_GRADE_ENTER = "[ENTER] Student.getGrade()";

	public static final String STUDENT_GET_GRADE_EXIT = "[EXIT] Student.getGrade()";

	public static final String STUDENT_IS_PASSED_ENTER = "[ENTER] Student.isPassed()";

	public static final String STUDENT_IS_PASSED_EXIT = "[EXIT] Student.isPassed()";

	public static final String STUDENT_HIS_GRADE_ENTER = "[ENTER] Student.hisGrade()";

	public static final String STUDENT_HIS_GRADE_EXIT = "[EXIT] Student.hisGrade()";

	public static final String STUDENT_SHOW_ENTER = "[ENTER] Student.show()";

	public static final String STUDENT_SHOW_EXIT = "[EXIT] Student.show()";

	// ================= SERVICE ADDITIONAL LOGS =================

	public static final String SERVICE_CONSTRUCTOR_ENTER = "[ENTER] StudentService.StudentService()";

	public static final String SERVICE_CONSTRUCTOR_EXIT = "[EXIT] StudentService.StudentService()";

	public static final String SERVICE_ADD_INFO = "[INFO] StudentService - Processing student addition";

	public static final String SERVICE_SHOW_INFO = "[INFO] StudentService - Retrieving all students";

	public static final String SERVICE_SEARCH_INFO = "[INFO] StudentService - Searching for student";

	public static final String SERVICE_UPDATE_INFO = "[INFO] StudentService - Processing student update";

	public static final String SERVICE_DELETE_INFO = "[INFO] StudentService - Processing student deletion";

	// ================= MAIN ADDITIONAL LOGS =================

	public static final String MAIN_ADD_SELECTED = "[INFO] Main - Add student selected";

	public static final String MAIN_SHOW_SELECTED = "[INFO] Main - Show all students selected";

	public static final String MAIN_SEARCH_SELECTED = "[INFO] Main - Search student selected";

	public static final String MAIN_UPDATE_SELECTED = "[INFO] Main - Update student selected";

	public static final String MAIN_DELETE_SELECTED = "[INFO] Main - Delete student selected";

	public static final String MAIN_EXIT_SELECTED = "[INFO] Main - Exit selected";

	public static final String MAIN_INVALID_CHOICE = "[WARN] Main - Invalid menu choice";
}
