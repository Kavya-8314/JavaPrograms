package com.inheritance.in;

class worker{
	void work() {
		System.out.println("Worker is working....");
	}
}
class Salesperson extends worker{
	void sale() {
		System.out.println("Salesperson is doing sales....");
	}
}
class Trainer extends worker
{
	void train() {
		System.out.println("Trainer is teaching....");
	}
}
public class Hierachical {
   public static void main(String[] args) {
	   Salesperson s=new Salesperson();
	   s.sale();
	   s.work();
	   Trainer t=new Trainer();
	   t.train();
	   t.work();
	
}
}
