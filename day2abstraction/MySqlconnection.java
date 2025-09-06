package week3.day2abstraction;

public abstract class MySqlconnection implements Databaseconnection{
	 @Override
	    public abstract void connect();

	    @Override
	    public abstract void disconnect();

	    @Override
	    public abstract void executeUpdate(String query);

	    // New abstract method specific to MySQL-style querying
	    public abstract void executeQuery(String query);
	    
	   
	    	
			
		}
	


	


