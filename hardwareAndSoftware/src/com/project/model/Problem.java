package com.project.model;

public class Problem {
	private int pid;
	private String problem;
	private String status;
	private String ename;
	private int cid;
	public Problem() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Problem [pid=" + pid + ", problem=" + problem + ", status=" + status + ", ename=" + ename + ", cid="
				+ cid + "]";
	}
	public Problem(int pid, String problem, String status, String ename, int cid) {
		super();
		this.pid = pid;
		this.problem = problem;
		this.status = status;
		this.ename = ename;
		this.cid = cid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	

	

	

}
