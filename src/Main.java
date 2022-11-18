// 문제 : 아래와 같이 출력 되도록 해주세요.

class Main {
	public static void main(String[] args) {
		int 결과1 = Math.nToMSum(2, 3);
		System.out.println("결과1 : " + 결과1);
		// 출력 : 결과1 : 5

		int 결과2 = Math.nToMSum(5, 10);
		System.out.println("결과2 : " + 결과2);
		// 출력 : 결과2 : 45
	}
}

class Math {

	public static int nToMSum(int i, int j) {

		int sum = 0;

		while (i <= j) {

			sum += i;
			i++;
		}
		return sum;
	}
}