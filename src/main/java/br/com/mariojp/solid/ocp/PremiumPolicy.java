package br.com.mariojp.solid.ocp;

public class PremiumPolicy implements Discont {
	public double apply(double amount) {
		return amount * 0.90;
	}
}
