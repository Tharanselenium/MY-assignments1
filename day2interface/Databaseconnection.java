package week3.day2interface;

public interface Databaseconnection {
	
	    void connect();
	    void disconnect();
	    void executeUpdate(String query);
	}

