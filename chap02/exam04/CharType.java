/*
char
 */

package exam04;

public class CharType {
	public static void main(String[] args) {
		char alphabet, hangeul; // 변수를 선언한다
		int unicode;
		
		alphabet = 'A'; // 문자라는 걸 표시하기 위해 작은 따옴표를 넣어준다 
		unicode = alphabet; 
		
		System.out.println(alphabet);
		System.out.println(unicode);
		
		hangeul = '한';
		unicode = hangeul;
		
		System.out.println(hangeul);		
		System.out.println(unicode);
		
	}
}
