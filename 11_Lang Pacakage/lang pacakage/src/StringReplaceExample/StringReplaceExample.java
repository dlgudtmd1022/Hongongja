package StringReplaceExample;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어, 자바는 풍부한 Api를 지원";
		String newStr = oldStr.replace("자바", "java");
		System.out.println(oldStr);
		System.out.println(newStr);

	}

}
