package com.menonvarun.reporter.testinfo;

import java.util.ArrayList;
import java.util.List;

public class TestExecution {
	
	private String name;
	private List<TestSuite> suites = new ArrayList<TestSuite>();
	private TestResult testResult = new TestResult();
	
	public TestExecution(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public List<TestSuite> getSuites() {
		return suites;
	}
	
	public void addSuite(TestSuite suite){
		this.suites.add(suite);
		this.testResult.addResult(suite.getTestResult());
	}
	
	public TestResult getTestResult() {
		return testResult;
	}
	
	public void setTestResult(TestResult testResult) {
		this.testResult = testResult;
	}

}
