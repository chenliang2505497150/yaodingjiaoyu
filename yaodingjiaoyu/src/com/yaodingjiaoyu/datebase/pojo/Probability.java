package com.yaodingjiaoyu.datebase.pojo;
// Generated 2016-7-26 22:27:35 by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Probability generated by hbm2java
 */
@SuppressWarnings("serial")
public class Probability implements java.io.Serializable {

	private Integer PId;
	private String name;
	private Set<Examples> exampleses = new HashSet<Examples>(0);

	public Probability() {
	}

	public Probability(String name) {
		this.name = name;
	}

	public Probability(String name, Set<Examples> exampleses) {
		this.name = name;
		this.exampleses = exampleses;
	}

	public Integer getPId() {
		return this.PId;
	}

	public void setPId(Integer PId) {
		this.PId = PId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Examples> getExampleses() {
		return this.exampleses;
	}

	public void setExampleses(Set<Examples> exampleses) {
		this.exampleses = exampleses;
	}

}
