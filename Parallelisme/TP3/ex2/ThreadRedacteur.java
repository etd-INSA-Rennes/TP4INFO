package ex2;

import java.util.Random;

public class ThreadRedacteur extends Thread {
    ObjPart o;

    public ThreadRedacteur(ObjPart obj) {
	o = obj;
    }

    public void faireAutreChose()
    {
	System.out.println(Thread.currentThread()+" : je fais autre chose");
	try {
	    Thread.sleep(1000);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    public void run(){
	while(true){
	    try {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10);
		System.out.println(Thread.currentThread()+" Tentative d'ecriture "+randomGenerator);
		o.ecrire(randomInt);
		Thread.sleep(2000);
	    } catch (AutreChoseException e) {
		this.faireAutreChose();
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
    }

}
