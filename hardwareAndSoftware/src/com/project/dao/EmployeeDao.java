
package com.project.dao;

import java.util.List;

import com.project.exception.EmployeeException;
import com.project.exception.ProblemException;
import com.project.model.Employee;
import com.project.model.Problem;

public interface EmployeeDao {
	public String registerEmployee(Employee employee) throws EmployeeException;
	public Employee loginEmployee(String username,String password)throws EmployeeException;
	public String registerProblem(Problem problem) throws ProblemException;
	public Problem statusOfProblemByProblemId(int pid) throws ProblemException;
	public List<Problem> seeAllProblem() throws ProblemException;
	public String changeEmployeePassword(String username,String password) throws Exception;
	
	
	
	
	
	

}
