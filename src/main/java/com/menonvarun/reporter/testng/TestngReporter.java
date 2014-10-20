package com.menonvarun.reporter.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.menonvarun.reporter.TestReporter;
import com.menonvarun.reporter.testinfo.TestExecution;
import com.menonvarun.reporter.testinfo.TestSuite;


public class TestngReporter implements ITestListener {
	private TestExecution testExecution;
	private TestReporter testReporter = TestReporter.getInstance();
	
	public void onTestStart(ITestResult result) {
		createTestExecution(result.getTestContext());
		this.testExecution.getTestResult().setTotalTests(result.getTestContext().getAllTestMethods().length);
		//testReporter.testSuiteStarted(testSuite)
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	private void createTestExecution(ITestContext testContext){
		if(testExecution == null){
			String suiteName = testContext.getCurrentXmlTest().getSuite().getName();
			int totalTests = testContext.getAllTestMethods().length;
			this.testExecution = new TestExecution(suiteName);
			this.testExecution.getTestResult().setTotalTests(totalTests);
			this.testReporter.testExecutionStarted(this.testExecution);
		}		
	}
	
	private TestSuite getTestSuite(){
		TestSuite suite = null;
		
		return suite;
	}

}
