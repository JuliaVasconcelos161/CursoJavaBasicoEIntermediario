package com.loiane.cursojava.aula74;

public class Deadlock {

	public static void main(String[] args) {
		final String RECURSO1 = "Recurso1";
		final String RECURSO2 = "Recurso2";
		
		Thread t1 = new Thread() {
			public void run()
			{
				synchronized (RECURSO1)
				{
					System.out.println("Thread #1 : bloqueou recurso1");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Thread #1 : tentando acessar o recurso 2");
					
					synchronized (RECURSO2)
					{
						System.out.println("Thread #1 : bloqueou recurso2");
					}
						
					
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run()
			{
				synchronized (RECURSO2)
				{
					System.out.println("Thread #2 : bloqueou recurso2");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Thread #2 : tentando acessar o recurso1");
					
					synchronized (RECURSO1)
					{
						System.out.println("Thread #2 : bloqueou recurso1");
					}
						
					
				}
			}
		};
		
		t1.start();
		
		t2.start();
		

	}

}
