package ThreadsMat;

public class ThreadsCal extends Thread {
	
	private int vet[];
	private int total;
	
	public ThreadsCal(int vet[]) {
		this.vet=vet;
		this.total= 0;
	}

	public void run() {
		for(int t:vet) {
			total += t;
		}
		System.out.println(getId()+"#"+" Total é: "+this.total);
	}
	

}
