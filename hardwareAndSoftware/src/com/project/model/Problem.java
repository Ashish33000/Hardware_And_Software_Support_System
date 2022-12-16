package com.project.model;

public class Problem {
	private int pid;
	private String problem;
	private String status;
	private int cid;
	public Problem() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Problem [pid=" + pid + ", problem=" + problem + ", status=" + status + ", cid=" + cid + "]";
	}
	public Problem(int pid, String problem, String status, int cid) {
		super();
		this.pid = pid;
		this.problem = problem;
		this.status = status;
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
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	

	

}
