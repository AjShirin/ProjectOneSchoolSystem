package RandomUserAPI;

import java.io.Serializable;

public class Timezone implements Serializable{
	private String offset;
	private String description;

	

	public String getOffset() {
		return offset;
	}



	public void setOffset(String offset) {
		this.offset = offset;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public static void main(String[] args) {
		

	}

}
