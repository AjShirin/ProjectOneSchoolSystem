package RandomUserAPI;

import java.io.Serializable;

public class Info implements Serializable{
	private String seed;
	private int result;
	private int page;
	private String version;

	

	public String getSeed() {
		return seed;
	}



	public void setSeed(String seed) {
		this.seed = seed;
	}



	public int getResult() {
		return result;
	}



	public void setResult(int result) {
		this.result = result;
	}



	public int getPage() {
		return page;
	}



	public void setPage(int page) {
		this.page = page;
	}



	public String getVersion() {
		return version;
	}



	public void setVersion(String version) {
		this.version = version;
	}



	public static void main(String[] args) {
		

	}

}
