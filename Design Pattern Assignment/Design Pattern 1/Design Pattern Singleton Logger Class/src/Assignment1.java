import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
class LoggerClass {
	public volatile static LoggerClass obj;
	public Logger logger;
	public String name;
	private LoggerClass(Logger logger,String name) {
		this.logger = logger;
		this.name = name;}
	public static LoggerClass getInstance(String name){
		if(obj == null){
			synchronized(LoggerClass.class){
				if(obj == null){
					obj = new LoggerClass( Logger.getLogger(Logger.GLOBAL_LOGGER_NAME),name);}}}
		return obj;}}
public class Assignment1 {
	public static void main(String[] args) {
		List<Integer> NumList1 = new ArrayList<Integer>();
		NumList1.add(-1);NumList1.add(2);NumList1.add(10);NumList1.add(-19);NumList1.add(230);
		List<Integer> NumList2 = new ArrayList<Integer>();
		NumList2.add(-31);NumList2.add(27);NumList2.add(10);NumList2.add(9);NumList2.add(-83);		
		Comparator<Integer> cmp = new Comparator<Integer>() {
			public int compare(Integer t1, Integer t2) {if(t1 < 0 && t2 < 0) {return ((Integer)Math.abs(t1)).compareTo(((Integer)Math.abs(t2)));}return t1.compareTo(t2);}};
		try {
			NumList1.sort(cmp);
			LoggerClass Log1 = LoggerClass.getInstance("Logger Object 1");
		    Log1.logger.log(Level.INFO,"Sorting Done for NumList1!" + NumList1.toString() + " Logged by object = " + Log1.name);  
		    NumList2.sort(cmp);
			LoggerClass Log2 = LoggerClass.getInstance("Logger Object 2");
		    Log2.logger.log(Level.INFO,"Sorting Done for NumList2!" + NumList2.toString() + " Logged by object = " + Log2.name);
		}catch(Exception e){
			LoggerClass Log1 = LoggerClass.getInstance("Pranav");
		    Log1.logger.log(Level.INFO,e.getMessage());   
			LoggerClass Log2 = LoggerClass.getInstance("");
		    Log2.logger.log(Level.INFO,e.getMessage());
		}}}
