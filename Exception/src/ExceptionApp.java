
public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10,20,30};
		try {
			System.out.println(2);
//			System.out.println(scores[3]);
			System.out.println(3);
			System.out.println(2/0);
			System.out.println(4);
		}catch(ArithmeticException e){
			System.out.println("계산이 잘못된 것 같아요.");
		}catch(Exception e){
			System.out.println("뭔가 이상합니다. 오류가 발생했습니다.");
		}
		System.out.println(5);
	}
}
