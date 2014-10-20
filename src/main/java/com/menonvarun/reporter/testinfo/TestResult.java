package com.menonvarun.reporter.testinfo;

public class TestResult {
	
	private boolean passed = false;
	private boolean skipped = false;
	private String resultMessage = "";
	private Throwable thrownException;
	
	private int totalPassed = 0;
	private int totalTests = 0;
	private int totalFailed = 0;
	private int totalSkipped = 0;
	
	public boolean isPassed() {
		if(!skipped)
			return passed;
		return false;
	}
	
	public boolean isSkipped(){
		return skipped;
	}
	
	public void setFailureMessage(String message){
		this.resultMessage = message;
	}
	
	public String getFailureMessage(){
		return this.resultMessage;
	}

	public Throwable getThrownException() {
		return thrownException;
	}

	public void setThrownException(Throwable thrownException) {
		this.thrownException = thrownException;
	}
	
	public int getTotalPassed() {
		return totalPassed;
	}

	public void setTotalPassed(int totalPassed) {
		this.totalPassed = totalPassed;
	}

	public int getTotalTests() {
		return totalTests;
	}
	
	public void setTotalSkipped(int totalSkipped) {
		this.totalSkipped = totalSkipped;
	}

	public int getTotalSkipped() {
		return totalTests;
	}

	public void setTotalTests(int totalTests) {
		this.totalTests = totalTests;
	}

	public int getTotalFailed() {
		return totalFailed;
	}

	public void setTotalFailed(int totalFailed) {
		this.totalFailed = totalFailed;
	}
	
	public void addResult(TestResult testResult) {
		this.totalTests = this.totalTests + testResult.getTotalTests();
		this.totalPassed = this.totalPassed + testResult.getTotalPassed();
		this.totalSkipped = this.totalSkipped + testResult.getTotalSkipped();
		this.totalFailed = this.totalFailed + testResult.getTotalFailed();
	}

}
