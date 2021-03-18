
public class Project {
	private String devName;
	private String devId;
	private String testName;
	private String testId;
	private ProjectType projectType;
	private Bug bug;
	private Manager manager;

	public Project(String devName, String devId, String testName, String testId, ProjectType projectType, Bug bug, Manager manager) {
		this.devName = devName;
		this.devId = devId;
		this.testName = testName;
		this.testId = testId;
		this.projectType = projectType;

		this.setBug(bug);
		System.out.println("The project is assigned to:" + devName +"," + "The tester is :" + testName+ "," +"By Manager" );
		System.out.println("The status id set to  "+ STATUS.NEW);
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public String getDevId() {
		return devId;
	}
	public void setDevId(String devId) {
		this.devId = devId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public ProjectType getProjectType() {
		return projectType;
	}
	public void setProjectType(ProjectType projectType) {
		this.projectType = projectType;
	}
	public Bug getBug() {
		return bug;
	}
	public void setBug(Bug bug) {
		this.bug = bug;
	}


}