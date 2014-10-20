package com.menonvarun.reporter.testinfo;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
	
	private String name;
	private List<TestCase> testCases = new ArrayList<TestCase>();
	private TestResult testResult = new TestResult();
	
	public TestClass(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public List<TestCase> getTestCases() {
		return testCases;
	}
	
	public void addTestCase(TestCase testCase){
		this.testCases.add(testCase);
		this.testResult.addResult(testCase.getTestResult());
	}
	
	public TestResult getTestResult() {
		return testResult;
	}
	
	public void setTestResult(TestResult testResult) {
		this.testResult = testResult;
	}

}
