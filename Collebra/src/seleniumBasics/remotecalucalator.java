package seleniumBasics;

public class remotecalucalator implements calucalator {

	public int add(int... arr) {
		int sum=0;
		for(int a: arr) {
			sum= sum+a;
		}
		return sum;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
