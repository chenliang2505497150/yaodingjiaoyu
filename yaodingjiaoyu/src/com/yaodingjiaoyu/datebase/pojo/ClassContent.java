package com.yaodingjiaoyu.datebase.pojo;
// Generated 2016-7-26 22:27:35 by Hibernate Tools 3.5.0.Final

import java.util.Date;

/**
 * ClassContent generated by hbm2java
 */
@SuppressWarnings("serial")
public class ClassContent implements java.io.Serializable {

	private Integer PId;
	private Job job;
	private Student student;
	private Stuff stuff;
	private Campus campus;
	private Date insertTime;
	private String contents;

	public ClassContent() {
	}

	public ClassContent(Job job, Student student, Stuff stuff, Campus campus, Date insertTime, String contents) {
		this.job = job;
		this.student = student;
		this.stuff = stuff;
		this.campus = campus;
		this.insertTime = insertTime;
		this.contents = contents;
	}

	public Integer getPId() {
		return this.PId;
	}

	public void setPId(Integer PId) {
		this.PId = PId;
	}

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Stuff getStuff() {
		return this.stuff;
	}

	public void setStuff(Stuff stuff) {
		this.stuff = stuff;
	}

	public Campus getCampus() {
		return this.campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}

	public Date getInsertTime() {
		return this.insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

}