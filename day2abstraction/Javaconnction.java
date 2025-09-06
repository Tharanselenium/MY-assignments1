package week3.day2abstraction;

public class Javaconnction extends MySqlconnection {

	@Override
	public void connect() {
		System.out.println("the sys is connected");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeUpdate(String query) {
		System.out.println(query);
		
	}

	@Override
	public void executeQuery(String query) {
		
	}
	 public static void main(String[] args) {
	        Javaconnction db = new Javaconnction();

	        db.connect();
	        db.executeUpdate("UPDATE users SET name = 'tharan");
	        db.executeQuery("SELECT * FROM users");
	        db.disconnect();
	    }


	

}
