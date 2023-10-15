package prototype_design_pattern;

public class Main {
	public static void main(String[] args) {
		NetworkConnection connection = new NetworkConnection();
		connection.setId("111.222.3.1114");
		connection.loadImortantData();

		System.out.println(connection);

		// we want new object of network connection
		NetworkConnection connection2 = null;
		try {

			connection2 = (NetworkConnection) connection.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(connection2);

	}
}
