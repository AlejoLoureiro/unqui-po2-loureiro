package ar.edu.unq.po2.tp3.multioperador;

import java.util.ArrayList;

public class Multioperador {

		public int sumArray(ArrayList<Integer> xs) {
			int res = 0;
			for (int integer:xs) {
				res = integer + res;
			}
			return res;
		}

		public int subtArray(ArrayList<Integer> xs) {
			int res = 0;
			for (int integer:xs) {
				res = res - integer;
			}
			return res;
		}

		public int multArray(ArrayList<Integer> xs) {
			int res = 1;
			for (int integer:xs) {
				res = integer * res;
			}
			return res;
		}
		
}
