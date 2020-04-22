package ar.edu.unq.po2.tp3.counter;

import java.util.ArrayList;

public class Counter {

		private ArrayList<Integer> list;
		
		public Counter(ArrayList<Integer> xs) {
			this.list = xs;
		}
		
		public void addNumber(int x) {
			this.list.add(x);
		}
		
		public int getEvenOcurrences() {
			int res = 0;
			for (int integer:this.list) {
				if (integer % 2 == 0) {
					res += 1;
				}
			}
			return res;
		}
		
		public int getOddOcurrences() {
			int res = 0;
			for (int integer:this.list) {
				if (integer % 2 != 0) {
					res += 1;
				}
			}
			return res;
		}

		public int getMultipleOcurrences(int x) {
			int res = 0;
			for (int integer:this.list) {
				if (integer % x == 0) {
					res += 1;
				}
			}
			return res;
		}



		
}
