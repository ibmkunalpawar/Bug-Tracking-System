
public class Bug {
	private String bugname;
	private String bugID;
	private String bugLocation;
	private BugType bugtype;
	private STATUS status;
	private Priority priority;
	private String i;
	Bug bug = new Bug();
	public String getBugID() {
		return bugID;
	}
	public void setBugID(String bugID) {
		this.bugID = bugID;
	}
	public String getBugname() {
		return bugname;
	}
	public void setBugname(String bugname) {
		this.bugname = bugname;
	}
	public String getBugLocation() {
		return bugLocation;
	}
	public void setBugLocation(String bugLocation) {
		this.bugLocation = bugLocation;
	}
	public BugType getBugtype() {
		return bugtype;
	}
	public void setBugtype(BugType bugtype) {
		this.bugtype = bugtype;
	}
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}

}