package com.menonvarun.reporter.testinfo;

public class TestCase {
	
	private String name;
	private TestResult testResult = new TestResult();
	
	public TestCase(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public TestResult getTestResult() {
		return testResult;
	}
	
	public void setTestResult(TestResult testResult) {
		this.testResult = testResult;
	}

}
