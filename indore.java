class indore {
	public static void main(String[] args) {
		int arr[];
		int m;
		System.out.println("Enter the size of array");
		m =sc.nextInt();
		arr[] = new int[m];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of array with size: "+m);
		for(int i=0; i<arr.length; i++) {
			  arr[i] = sc.nextInt();
		}
		system.out.println("value of array");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}