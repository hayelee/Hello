package chapter11;

import java.util.Objects;

//VO(Value Object) : 데이터를 저장하는 객체
//DTO(Data Transfer Object) : 데이터를 전달하는 객체
//Bean => 자바 커피 원두(bean) => 데이터를 저장하는 객체를 표현
//Item, Model 등과 같은 접미사를 붙이기도 함
//Lombok 
//Kotlin 언어 : jetBrain (intellij를 만든 회사)
public class Member0 {
	private String name;
	private int id;

	public Member0(String name, int id) { // 필드초기화위해
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() { // private니까 getter setter
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override              //hashCode가 같아야
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override              //equals를 비교할 수 있음
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member0)) {
			return false;
		}
		Member0 other = (Member0) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		//apache 재단 => commons 접두어가 붙은 라이브러리
		return "Member [name=" + name + ", id=" + id + "]";
	}
}
