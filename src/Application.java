
public class Application {

	public static void main(String[] args) {

		Bug bug1 = new Bug("B1", "BName", STATUS.NEW, BugType.SYNTAX ,"Line90" , Priority.HIGH);
		Developer d1 = new Developer("Ram", "89157393", "ram@gmail.com", 998456123);
		Tester t1 = new Tester("Raju", "Patil", "raju@gmail.com", 998765431);
		Manager m1 = new Manager("Shyam", "Narayan", "narayan@smail.com", 999999);
		Project p1 = new Project(d1.getdevName1(), d1.getdevID1(), t1.gettName1(), t1.gettID1(), ProjectType.WEB_DEVELOPMENT, bug1 );
		d1.setBugStatus(BugDevStatus.FIXED);

	}

}