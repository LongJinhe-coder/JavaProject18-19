package com.hqu.caculator;

public class Caculator {
	double jia(double a, double b) {
		double c;
		return c = a + b;
	}

	double jian(double a, double b) {
		double c;
		return c = a - b;
	}

	double cheng(double a, double b) {
		double c;
		return c = a * b;
	}

	double chu(double a, double b) {
		double c;
		return c = a / b;
	}

	double xiangFanShu(double a) {
		double c;
		return c = 0 - a;
	}

	double daoShu(double a) {
		double c;
		return c = 1 / a;
	}

	double jueDuiZhi(double a) {
		if (a >= 0)
			return a;
		else
			return 0 - a;
	}

	public double GiveMax(double a, double b) {
		if (a >= b) {
			return a;
		} else
			return b;
	}

	public double GiveMin(double a, double b) {
		if (a >= b) {
			return b;
		} else
			return a;
	}

	double getInt(double d) {
		double a;
		return a = (int) d / 1;
	}

	double getSqrt(double d) {
		double a;
		return a = Math.sqrt(d);
	}

	double getLog(double d) {
		double a;
		return a = Math.log10(d);
	}
}
