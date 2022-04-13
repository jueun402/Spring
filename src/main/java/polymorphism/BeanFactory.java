package polymorphism;

public class BeanFactory {
	public Object getBean(String beanname){
		
		if(beanname.equals("SS")) {
			
			return new ssTV(); 
			
		}
		else if(beanname.equals("LG")) {
			
			return new lgTV();
		}
		return null;
	}
}
