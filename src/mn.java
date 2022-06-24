import java.util.Arrays;

public class mn {

	
//Testttttt
	//בדיקות בדיקות בדיקות
	//בדיקות בדיקות בדיקות

	//דף בדיקות הרצה תוך כדי עבודה על הפרוייקט
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Manager manger= new Manager("shlomi",305246332,"M",5);
		Worker worker= new Worker("ahron",2222222,"M",5000);
		Worker worker2= new Worker("maron",111,"M",1000);

		Worker wor[]= new Worker[2];

		MosadHinoh mosad=new MosadHinoh(33,"ofakim");
		/*
        worker.setMosad(mosad);
        
        System.out.println(worker);
        
        System.out.println(mosad);
        System.out.println("-----");
        */
        Student stud = new Student("yaronm",3052,"M",90);
        
        ElectrictyM masl = new ElectrictyM(44,"ma","tihnon");
        
        stud.setMaslo(masl);
        System.out.println(stud);

        

        
        

		

		
		
		
		
		/*
		worker.setMosad(mosad);		
		Worker work[]=worker.getMosad().getWorke();
		System.out.println( work[0]);
		*/
		
	}

}
