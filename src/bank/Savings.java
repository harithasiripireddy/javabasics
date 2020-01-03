package bank;

public class Savings extends BaseAccount {
	private static final double minbalance = 10000;

	public Savings(String name, String phum, String accnum, double balance) {
		super(name, phum, accnum, balance);
	}

	// @override
	public double withdraw(double amount) {
		if (amount >= 0) {
			if (validate()) {
				if (this.balance >= amount) {
					System.out.println(" withdrawing");
					this.balance = balance - amount;
					System.out.println("please collect your cash");
					if (this.balance < minbalance) {
						this.balance = balance - 100;
					}
					return amount;

				} else {
					System.out.println("insufficient balance");
				
				}
			}
			}else {
				System.out.println("invalid amount");
			}
			return 0;
		}
	}

