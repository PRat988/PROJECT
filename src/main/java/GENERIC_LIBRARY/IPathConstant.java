package GENERIC_LIBRARY;
public interface IPathConstant {
	
	// why we stored this path inside Interface , 
	//because the variables inside interface are public static final , 
	//so these variables are not able to reinitialized(not able to change)
	
	String photoPath =".\\photo\\";
    String propertyfilepath =".\\src\\test\\resources\\Data.properties";

}
