package sec01.exam05;
//hashCode()와 equals()메소드의 재정의
public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name=name;
		this.age=age;
		
		
	}

	@Override
	public int hashCode() {//name과 age값이 같으면 동일한 hashCode()를 리턴
		// TODO Auto-generated method stub
		return name.hashCode()+age;//String hashCode()이용
	}

	@Override
	public boolean equals(Object obj) {//name과 age값이 같으면 true를 리턴
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name)&&(member.age==age);
		}else {
			return false;
		}
	}
}
