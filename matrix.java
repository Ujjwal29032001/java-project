class matrix {
	public static void main(string[] args) {
	 int m,n,p,q;
	 Scanner sc=Scanner(System.in);
	 System.out.println("Enter matrix 1 size m*n");
	 m= n
	 System.out.println("Enter matrix 2 size p*q");
	 p= q 
	 int a [] [] =int [m] [n];
	 int b [] [] = int [p] [q];
	 System.out.println("Enter elements of matrix 1");
	      for(i=1; i<m; i++) {
	          for(j=1; j<n; j++) {
	          a[i] [j] = sc.nextInt();
	          }
	      }
	      system.out.println("Enter elements of matrix 2");
	          for(i=0; i<p; p++) {
	             for(j=0; i<q; q++) {
	             b[i] [j] = sc.nextInt();
	             }
	          }
	          System.out.println("matrix 1:");
	             for(int i=0; i<p; i++) {
	                  for (int j=0; j<q; j++) {
	                    System.out.println(a[i] [j] +"");
	                  }
	                  System.out.println(" ");
	             }
	             System.out.println("matrix 2:");
	             for(int i=0; i<p; i++) {
	               for(int j=0; j<q; j++) {
	                   System.out.println(b[i] [j] +" ");
	               }
	               System.out.println(" ");
	             }


	}
}