package exam14; // 문자열 안에 쓰는 \" \n \f \\

public class EscapeSequence {
	public static void main(String[] args) {
		System.out.print("프로그램 "); // 프린트는 출력을 스페이스까지 출력을 하고
		System.out.print("시작");      // 커서가 그 자리에서 다음 출력을 대기하고 있다
		// ln은 애를 출력하고 다음 라인에서 출력을 대기한다 (밑의 라인)
		
		System.out.println("친구가 어제 \"잘 다녀왔어?\"라고 물어서...");
		// 문자열안의 큰따옴표는 오류가 난다 
		// \" << 는 한 묶음이라 띄어쓰기를 해주면 안된다 (escape sequence 이스케이프 시퀀스)
		System.out.println("친구가 어제 \n잘 다녀왔어?\n라고 물어서...");
		// \n << 줄 바꿈을 해준다 (escape sequence)
		System.out.println("친구가 어제 \t잘 다녀왔어?\t라고 물어서...");
		// \t << 여백 탭키를 치면 일정 여백만큼의 공간이 생긴다 (스페이스바 4개의 띄어쓰기 = 탭키)
		System.out.println("C:\\workspaces\\java");
		// 자바는 \(역슬렉시)를 만나면 이스케이프 시퀀스라고 인식하기 때문에
		// \\ (역슬렉스를 두번을 연속해서) 사용하면 된다
		System.out.println("친구가 어제 '잘 다녀왔어?'라고 물어서...");
		// 큰 따옴표랑 작은 따옴표는 구별에 되기 때문에 그대로 넣어도 상관없다
		}
}
