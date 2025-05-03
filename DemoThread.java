class NewThread implements Runnable{
	Thread t;
	NewThread(){
	    t = new Thread(this,"Demo Thread");
	    System.out.println("Child Thread" +t);
	}


	public void run(){
        try{
             for(int i=5;i>0;i--){
                 System.out.println("Child Thread: "+i);
                 Thread.sleep(100); 
             }
        }catch(InterruptedException e){
            System.out.println("Child Thread Interrupted"); 
        }
    System.out.println("Child Thread is exceuted");     
	}
}
class DemoThread{
	public static void main(String[] args) {
	    NewThread nt = new NewThread();
	    nt.t.start();

	    try{
	         for(int i=5;i>0;i--){
	            System.out.println("main Thread: "+i); 
	         }
	         Thread.sleep(1500);
	    }catch(InterruptedException e){
	         System.out.println("Main Thread Interrupted");
	    }
	    System.out.println("main Thread is executed");
	}
}