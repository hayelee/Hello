package practice.bank;

	public class Bank {
		/**
		 * 은행의 고객 목록
		 */
		private Customer[] customers;
		/**
		 * 은행의 고객 수
		 */
		private int numberOfCustomers;
		// 필드의 값을 초기화 할때 생성자를 많이 사용
		public Bank() {
			customers = new Customer[10];
		}
		public void addCustomer(Customer customer) {
			customers[numberOfCustomers++] = customer;
		}
		public Customer[] getCustomers() {
			return customers;
		}
		public int getNumberOfCustomers() {
			return numberOfCustomers;
		}
		/**
		 * 배열의 index번째 고객(Customer) 객체를 반환
		 * @param index 고객 인덱스 번호
		 * @return index번째 고객 객체를 반환
		 */
		public Customer getCustomer(int index) {
			return customers[index];
		}
	}
