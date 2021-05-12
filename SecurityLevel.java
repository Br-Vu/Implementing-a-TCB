package tcbImpementation;

public class SecurityLevel {

	private String[] keys = {"A00","B001","200D","300C"};

	
	/**
	 * Each method returns the privileges associated with the 
	 * particular key to allow menu to grant appropriate access.
	 * 
	 * @param key
	 * @return boolean
	 */
	
	public boolean newFile(String key){
		if(key.equals(keys[0])){
			return false;
		}
		else if(key.equals(keys[1])){
			return true;
		}
		else if(key.equals(keys[2])) {
			return true;
		}
		else {
			return true;
		}
	}
	
	public boolean openForRead(String key){
		if(key.equals(keys[0])){
			return true;
		}
		else if(key.equals(keys[1])){
			return true;
		}
		else if(key.equals(keys[2])) {
			return true;
		}
		else {
			return true;
		}
	}
	
	public boolean openForAppend(String key){
		if(key.equals(keys[0])){
			return false;
		}
		else if(key.equals(keys[1])){
			return false;
		}
		else if(key.equals(keys[2])) {
			return true;
		}
		else {
			return true;
		}
	}
	
	public boolean closeFile(String key){
		if(key.equals(keys[0])){
			return true;
		}
		else if(key.equals(keys[1])){
			return true;
		}
		else if(key.equals(keys[2])) {
			return true;
		}
		else {
			return true;
		}
	}
	
	
	public boolean deleteFile(String key){
		if(key.equals(keys[0])){
			return false;
		}
		else if(key.equals(keys[1])){
			return false;
		}
		else if(key.equals(keys[2])) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
}
