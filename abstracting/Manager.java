package abstracting;

class Manager extends Employee {

	private int bonus;

	public void work() {
		System.out.println("������Ա��");
	}

	public int getBonus() {
		return this.bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
