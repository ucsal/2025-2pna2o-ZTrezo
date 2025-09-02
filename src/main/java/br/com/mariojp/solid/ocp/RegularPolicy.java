package br.com.mariojp.solid.ocp;

public class RegularPolicy implements Discont{
	public double apply(double amount) {
		return amount * 0.95;
	}
	

}
