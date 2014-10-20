package com.menonvarun.reporter.testinfo;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
	private String name;
	private List<TestPackage> packages = new ArrayList<TestPackage>();
	private TestResult testResult = new TestResult();
	
	public TestSuite(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public List<TestPackage> getClasses() {
		return packages;
	}
	
	public void addPackage(TestPackage testPackage){
		this.packages.add(testPackage);
		this.testResult.addResult(testPackage.getTestResult());
	}
	
	public TestResult getTestResult() {
		return testResult;
	}
	
	public void setTestResult(TestResult testResult) {
		this.testResult = testResult;
	}

}
