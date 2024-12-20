public class Research_Associate extends Employee {
	private String fieldOfStudy;

	public Research_Associate(int ssn, String name, String email, String fieldOfStudy) {
		super(ssn, name, email);
		this.fieldOfStudy = fieldOfStudy;
	}

	public String getFieldOfStudy() {
		return fieldOfStudy;
	}

	public void setFieldOfStudy (String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}
}