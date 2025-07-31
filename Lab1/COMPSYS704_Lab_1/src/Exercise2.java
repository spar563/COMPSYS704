public class Exercise2 {
	public static void main(String[] args) {
		Fibonacci list1 = new Fibonacci(10);
		Fibonacci list2 = new Fibonacci(20);
		list1.printList();
		list2.printList();
	}
	static class Fibonacci {
		private int n;
		private int[] sequence;
		
		public Fibonacci(int n) {
			this.n = n;
			sequence = new int[n];
			generateSequence();
		}
		
		// Generate Fibonacci sequence
        private void generateSequence() {
            if (n >= 1) sequence[0] = 1;
            if (n >= 2) sequence[1] = 1;
            for (int i = 2; i < n; i++) {
                sequence[i] = sequence[i - 1] + sequence[i - 2];
            }
        }
        
		public void printList() {
			// TODO: Print the sequence
			for (int i = 0; i < n; i++) {
                System.out.print(sequence[i]);
                if (i < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
		}
	}
}
