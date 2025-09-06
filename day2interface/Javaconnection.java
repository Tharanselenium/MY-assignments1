package week3.day2interface;

public class Javaconnection implements Databaseconnection {

	private boolean isConnected = false;

    @Override
    public void connect() {
        // Simulate establishing a connection
        isConnected = true;
        System.out.println("Connected to the database.");
    }

    @Override
    public void disconnect() {
        // Simulate closing the connection
        if (isConnected) {
            isConnected = false;
            System.out.println("Disconnected from the database.");
        } else {
            System.out.println("No active connection to disconnect.");
        }
    }

    @Override
    public void executeUpdate(String query) {
        // Simulate executing an update query
        if (isConnected) {
            System.out.println("Executing update: " + query);
            // You could add logic here to simulate query execution
        } else {
            System.out.println("Cannot execute update. No active connection.");
        }
    }
    public static void main(String[] args) {
    	
    	    
    	        Javaconnection db = new Javaconnection();

    	        db.connect();
    	        db.executeUpdate("UPDATE users SET name = 'Atharan'");
    	        db.disconnect();
    	    }
    	
	}

    

	

