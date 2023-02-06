package org;

public class student {

	// field

	private String name;
	private int chi;
	private int eng;
	private int math;
	private int sum;
	private double ave;

	// constructors

	public student(String name, int chi, int eng, int math) {
		super();
		if (chi >= 0 && eng >= 0 && math >= 0) {
			this.name = name;
			this.chi = chi;
			this.eng = eng;
			this.math = math;
			sum = chi + eng + math;
			ave = sum / 3.;
		}

	}

	// get set

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChi() {
		return chi;
	}

	public void setChi(int chi) {
		this.chi = chi;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public double getAve() {
		return ave;
	}

	// method

}
