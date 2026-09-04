/*Create a class test, make instance variable [int x], 
method [void show ()] and also put main method inside that 
class and use the instance variable and method from main*/
class test {
	int x = 10;

	void show() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		test obj = new test();
		obj.show();
	}
}