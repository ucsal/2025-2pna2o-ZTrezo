package br.com.mariojp.solid.ocp;

public class PartnerPolicy implements Discont {
	public double apply(double amount) {
		return amount * 0.88;
	}

}
