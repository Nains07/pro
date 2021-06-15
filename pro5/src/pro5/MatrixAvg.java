package pro5;

class MatrixAvg {

	public static void main(String[] args) {
		int sum=0;
		int [] a= {1,2,3,4,5};
		for(int i=0;i<5;i++) {
			 sum =sum+a[i];
		}
		float avg= sum/5;
		System.out.println("avg :"+avg);
	}

}
