package exam11;

class Personal{
	private String name;
	private String perNum;
	
	Personal(String name, String perNum){
		this.name = name;
		this.perNum = perNum;
	}
	
	public String getPerNum() {
		return perNum; // 사본의 정보 가져오기
	}
	
	public String getName() {
		return name; // 사본의 정보 가져오기
	}
}


//class PersonalStorageThirdparty extends PersonalStorage { 
class PersonalStorageThirdparty implements PersonalStorage { 
	Personal[] personArr; // 연속적으로 이 자료형에 메모리를 할당할때 [배열] 선언
	int indexPerInfo; // 엔덱스
	
	PersonalStorageThirdparty(int num){
		personArr = new Personal[num]; // 전달받은 크기만큼의 메모리를 지정해준다 
		indexPerInfo = 0;
	}
	
	@Override
	public void addPersonalInfo(String name, String perNum) {
		personArr[indexPerInfo++] = new Personal(name, perNum); // 인덱스 값을 하나씩 높이면서 저장해준다
		System.out.println("데이터 저장 완료.");
	}

	@Override
	public String searchName(String perNum) {
		for(int i = 0; i < indexPerInfo; i++) {
			if(perNum.compareTo(personArr[i].getPerNum()) == 0) {
				return personArr[i].getName();
			}
		}
		return null;
	}

}
