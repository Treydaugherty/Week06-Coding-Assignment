package Week06CodingFinal;

public class Card {
	//Fields
	String name;
	String value;
	int rank;
	//Getters and Setters
	public int getRank() {
		return rank;
	}



	public void setRank(int rank) {
		this.rank = rank;
	}



	public Card(String value, String name, int rank){
		this.value = value;
		this.name = name;
		this.rank = rank;
	}





	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	//Method
	public void describe() {
		System.out.println(value + " of " + name);
	}
	
}
