package chapter13;

import java.util.Objects;

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {   //name과 age 값이 같으면 동일한 hashCode를 리턴
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) { //name과 age 값이 같으면 true를 리턴
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

}
