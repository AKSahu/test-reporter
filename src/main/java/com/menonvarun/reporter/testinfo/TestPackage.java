package com.menonvarun.reporter.testinfo;

import java.util.ArrayList;
import java.util.List;

public class TestPackage {
	
	private String name;
	private List<TestClass> classes = new ArrayList<TestClass>();
	private TestResult testResult = new TestResult();
	
	public TestPackage(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public List<TestClass> getClasses() {
		return classes;
	}
	
	public void addClass(TestClass testClass){
		this.classes.add(testClass);
		this.testResult.addResult(testClass.getTestResult());
	}
	
	public TestResult getTestResult() {
		return testResult;
	}
	
	public void setTestResult(TestResult testResult) {
		this.testResult = testResult;
	}

}
