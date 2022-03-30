package exam06;

public class InstanceArray {
	public static void main(String[] args) {
		String[] strArr = new String[3];
		
		strArr[0] = "홍길동"; //new String("홍길동");
		strArr[1] = "이순신"; 
		strArr[2] = "세종대왕";
		// strArr[3] = "안중근"; 그냥 있을때는 오류가 안나지만 실행을 해야 에러가 난다, 꼼꼼히 체크하기
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
}
