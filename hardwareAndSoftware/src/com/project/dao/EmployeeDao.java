package com.project.dao;

import com.project.exception.EmployeeException;
import com.project.exception.ProblemException;
import com.project.model.Employee;
import com.project.model.Problem;

public interface EmployeeDao {
	public String registerEmployee(Employee employee) throws EmployeeException;
	public Employee loginEmployee(String username,String password)throws EmployeeException;
	public Problem registerProblem(Problem problem) throws ProblemException;
	public String ststusOfProblemByProblemId(int cid) throws ProblemException;
	public Problem seeAllProblem() throws ProblemException;
	public String changeEmployeePassword(String password) throws ProblemException;
	
	
	
	
	
	

}
