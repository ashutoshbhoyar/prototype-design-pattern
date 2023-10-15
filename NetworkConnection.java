package prototype_design_pattern;

public class NetworkConnection implements Cloneable {
	private String id;
	private String ImpornatntData;

	// imp data
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImpornatntData() {
		return ImpornatntData;
	}

	public void setImpornatntdata(String impornatntData) {
		ImpornatntData = impornatntData;
	}

	public void loadImortantData() {
		this.ImpornatntData = "very very imp data";
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "NetworkConnection [id=" + id + ", ImpornatntData=" + ImpornatntData + "]";
	}

}
