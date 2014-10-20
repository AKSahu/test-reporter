package com.menonvarun.reporter;

import java.util.ArrayList;
import java.util.List;

import com.menonvarun.reporter.testinfo.TestCase;
import com.menonvarun.reporter.testinfo.TestClass;
import com.menonvarun.reporter.testinfo.TestExecution;
import com.menonvarun.reporter.testinfo.TestSuite;

public class TestReporter implements IReporter {
	
	private List<IReporter> reporters = new ArrayList<IReporter>();
	private static TestReporter INSTANCE;
	private TestReporter(){
		
	}
	
	public static TestReporter getInstance(){
		if(INSTANCE == null)
			INSTANCE = new TestReporter();
		return INSTANCE;
	}
	
	public void addReporter(IReporter reporter){
		reporters.add(reporter);
	}

	public void initialize() {
		for(IReporter reporter : reporters){
			reporter.initialize();
		}		
	}

	public void testExecutionStarted(TestExecution testExecution) {
		for(IReporter reporter : reporters){
			reporter.testExecutionStarted(testExecution);
		}		
	}

	public void testSuiteStarted(TestSuite testSuite) {
		for(IReporter reporter : reporters){
			reporter.testSuiteStarted(testSuite);
		}
	}

	public void testClassStarted(TestClass testClass) {
		for(IReporter reporter : reporters){
			reporter.testClassStarted(testClass);
		}
	}

	public void testCaseStarted(TestCase testCase) {
		for(IReporter reporter : reporters){
			reporter.testCaseStarted(testCase);
		}
	}

	public void testCaseSkipped(TestCase testCase) {
		for(IReporter reporter : reporters){
			reporter.testCaseSkipped(testCase);
		}
	}

	public void testCaseFailed(TestCase testCase) {
		for(IReporter reporter : reporters){
			reporter.testCaseFailed(testCase);
		}
	}

	public void testCaseEnded(TestCase testCase) {
		for(IReporter reporter : reporters){
			reporter.testCaseEnded(testCase);
		}
	}

	public void testClassEnded(TestClass testClass) {
		for(IReporter reporter : reporters){
			reporter.testClassEnded(testClass);
		}
	}

	public void testSuiteEnded(TestSuite testSuite) {
		for(IReporter reporter : reporters){
			reporter.testSuiteEnded(testSuite);
		}
	}

	public void testExecutionEnded(TestExecution testExecution) {
		for(IReporter reporter : reporters){
			reporter.testExecutionEnded(testExecution);
		}
	}

	public void generateReport() {
		for(IReporter reporter : reporters){
			reporter.generateReport();
		}
	}	
}
