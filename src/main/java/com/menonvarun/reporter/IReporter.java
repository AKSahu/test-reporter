package com.menonvarun.reporter;

import com.menonvarun.reporter.testinfo.TestCase;
import com.menonvarun.reporter.testinfo.TestClass;
import com.menonvarun.reporter.testinfo.TestExecution;
import com.menonvarun.reporter.testinfo.TestSuite;

public interface IReporter {	
	public void initialize();
	public void testExecutionStarted(TestExecution testExecution);
	public void testSuiteStarted(TestSuite testSuite);
	public void testClassStarted(TestClass testClass);
	public void testCaseStarted(TestCase testCase);
	public void testCaseSkipped(TestCase testCase);
	public void testCaseFailed(TestCase testCase);
	public void testCaseEnded(TestCase testCase);
	public void testClassEnded(TestClass testClass);
	public void testSuiteEnded(TestSuite testSuite);
	public void testExecutionEnded(TestExecution testExecution);
	public void generateReport();
}
