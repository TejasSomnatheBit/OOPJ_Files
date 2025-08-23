class Car{

       private String modelName;
       private	double price;
       private long chasisNo;

	public void setModelName(String modelName){
		this.modelName = modelName;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public void setChasisNo(long chasisNo){
		this.chasisNo = chasisNo;
	}

	public double getChasisNo(){
		return this.chasisNo;
	}

	public double getPrice(){
		return this.price;
	}

	public String getModelName(){
	       return this.modelName;
	}

	public void display(){

		System.out.println("Model Name is :"+this.getModelName());
		System.out.println("Model price is :"+this.getPrice());
		System.out.println("Model Chesis number is :"+this.getChasisNo());
	}
	
}

class Test {
	public static void main(String[] args){
	

		Car BMW = new Car();
		BMW.setModelName("BMW M5");
		BMW.setPrice(3400000);		
		BMW.setChasisNo(123456789);
		
		BMW.display();

		Car BMW2 = new Car();
		BMW2.setModelName("BMW M3");
		BMW2.setPrice(4300000);		
		BMW2.setChasisNo(987654321);
		
		BMW2.display();
		
		}
}