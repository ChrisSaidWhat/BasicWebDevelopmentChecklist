package model;

/**
 * @author christophersaid - csaid
 * CIS175 - Spring 2024
 * Feb 7, 2024
 */
public class ChecklistLogic {
	
	//	instance variables
	
	private boolean htmlStatus;
	private boolean cssStatus;
	private boolean seeResources;
	
	//	constructors
	
	public ChecklistLogic(String htmlStatus, String cssStatus) {
		this.htmlStatus = determineCheckboxState(htmlStatus);
		this.cssStatus = determineCheckboxState(cssStatus);
	}
	
	public ChecklistLogic(String seeResources) {
		this.seeResources = determineCheckboxState(seeResources);
	}
	
	//	getters and setters

	public boolean getHtmlStatus() {
		return htmlStatus;
	}

	public boolean getCssStatus() {
		return cssStatus;
	}

	public boolean getSeeResources() {
		return seeResources;
	}
	
	//	helper methods
	
	public boolean determineCheckboxState(String input) {
		boolean checkboxState;
		
		if(input != null && (input.equals("yes") || input.equals("complete"))) {
			checkboxState = true;
		}
		else {
			checkboxState = false;
		}
		
		return checkboxState;
	}
	
	public String redirectionManager(boolean htmlIn, boolean cssIn) {
		String redirectionPath;
		
		if(htmlIn == true && cssIn == true) {
			redirectionPath = "/totalCompletionResult.jsp";
		}
		else if((htmlIn == true && cssIn == false) || (htmlIn == false && cssIn == true)) {
			redirectionPath = "/halfCompletionResult.jsp";
		}
		else {
			redirectionPath = "/noCompletionResult.jsp";
		}
		
		return redirectionPath;
	}
	
	public String redirectionManager(boolean seeResourcesIn) {
		String redirectionPath;
		
		if(seeResourcesIn == true) {
			redirectionPath = "/resources.jsp";
		}
		else {
			redirectionPath = "/input.jsp";
		}
		
		return redirectionPath;
	}
	
	public String correspondingMessageAssignment(boolean htmlIn, boolean cssIn) {
		String messageToDisplay;
		
		if(htmlIn == true && cssIn == true) {
			messageToDisplay = "Congratulations! You're One Page Closer To Victory!";
		}
		else if(htmlIn == true && cssIn == false || htmlIn == false && cssIn == true) {
			messageToDisplay = "Woah - Oh! You're Half Way There!";
		}
		else {
			messageToDisplay = "Code On! Dream On!";
		}
		
		return messageToDisplay;
		
	}

}
