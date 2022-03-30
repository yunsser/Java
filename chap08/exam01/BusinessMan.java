package exam01;

class BusinessMan extends Friend { // 회사원 친구
	private String company; // 회사 이름
	private String deparment; // 소속 부서
	private String businessNum; // 사번
	
	BusinessMan(String name, String birth, String address, String email, String company, String deparment, String businessNum) {
		super(name, birth, address, email);
		this.company = company;
		this.deparment = deparment;
		this.businessNum = businessNum;
}

	public void displayBusinessManInfo() {
		displayFriendInfo(); // 부모에게 정의 되어있는 메서드를 통해서 데이터에 접근한다
		System.out.println("회사이름: " + company);
		System.out.println("소속부서: " + deparment);
		System.out.println("사    번: " + businessNum);
	}
}