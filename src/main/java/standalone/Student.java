package standalone;

import java.util.List;
import java.util.Map;

public class Student {
	private List<String> name;
	private Map<String, Integer> studentBook;

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public Map<String, Integer> getStudentBook() {
		return studentBook;
	}

	public void setStudentBook(Map<String, Integer> studentBook) {
		this.studentBook = studentBook;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", studentBook=" + studentBook + "]";
	}

}
