import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
public class MyForm implements ActionListener{

// הגדרת מחרוזות העוזורת לפונקציות הכפתורים שמייצרים את הטיפוסים ומכניסים אותם לרשימת אביהם    	
String MyPType="";	
String MyMType="";
String MyMSType="";

//הגדרת פריים
JFrame frame;

//כאן הגדרו את כל מרכיביי הפריים הקשורים למחלקת אדם(אבא)
JLabel PersonTitle=new JLabel("Choose Person Type");
String[] Gender={"M","F"};

JLabel PersonName=new JLabel("PersonName");
JLabel PersonGender=new JLabel("Gender");
JLabel PersinID=new JLabel("ID");
JLabel YearsExp=new JLabel("YearsExp-Manag");
JLabel GradesAvg=new JLabel("GradesAvg");
JLabel PutSallry=new JLabel("PutSallry");

JComboBox GenderCombo=new JComboBox(Gender);

JTextField PersonNameText=new JTextField();
JTextField PersinIDText=new JTextField();
JTextField rihotNameText=new JTextField();
JTextField PutSallryText=new JTextField();
JTextField YearsExpText=new JTextField();
JTextField GradesAvgText=new JTextField();

JButton WorkerButt= new JButton("Worker");
JButton ManagButt= new JButton("Manager");
JButton StudButt= new JButton("Student");
JButton AddPersonArray= new JButton("AddPersonArray");


//כאן הגדרו את כל מרכיביי הפריים הקשורים למחלקת מוסד(אבא)

JLabel MosadTitle=new JLabel("Choose MosadHinoh Type");
JButton SpicalMosadButt= new JButton("SpicalMosad");
JButton RegularMosadButt= new JButton("RegularMosad");
JButton NotFormalMosadButt= new JButton("NotFormalMosad");

JLabel MosadName=new JLabel("MosadName");
JTextField MosadNameText=new JTextField();
JLabel MosadNum=new JLabel("MosadNum");
JTextField MosadNumText=new JTextField();
JLabel teenOrg=new JLabel("teenOrganization");
JTextField teenOrgText=new JTextField();
JLabel totalclass=new JLabel("TotalClass");
JTextField totalclassText=new JTextField();
JLabel activity=new JLabel("Activity");
JTextField activityText=new JTextField();

JButton AddMosadArray= new JButton("AddMosadArray");

//כאן הגדרו את כל מרכיביי הפריים הקשורים למחלקת מסלול(אבא)

JLabel MaslolTitle=new JLabel("Choose Maslol Type");
JButton ElectrictyButt= new JButton("Electricty");
JButton SoftwareButt= new JButton("Software");


JLabel MaslolName=new JLabel("MaslolName");
JTextField MaslolNameText=new JTextField();
JLabel MaslolNum=new JLabel("MaslolNum");
JTextField MaslolNumText=new JTextField();
JLabel specializationE=new JLabel("specializationE");
JTextField specializationEText=new JTextField();
JLabel numberOfCourses=new JLabel("numberOfCourses");
JTextField numberOfCoursesText=new JTextField();
JButton AddMaslolArray= new JButton("AddMaslolArray");


//כאן מוגדרים מרכיבי הפריים בחלק השמאלי תחתון של הדף : כותורת,רשימות גלילה, כפתורים

JLabel ChoosePerson=new JLabel("ChoosePerson");
JLabel ChooseMosad=new JLabel("ChooseMosad");
JLabel ChooseMaslol=new JLabel("ChooseMaslol");

List ShowMosadlist = new List(4); 
List ShowPersonlist = new List(4);
List ShowMaslolList = new List(4);

JButton AddArraysDB=new JButton("AddArrays2DB");
JButton AddFromDB2Array=new JButton("AddFromDB2Array");
JButton SetMosadManager=new JButton("SetMosadManager");
JButton SetMosadWorker=new JButton("SetMosadWorker");
JButton SetMaslolStudent=new JButton("SetMaslolStudent");







//הגדרת מערכי\רשימות האבות

ArrayList<Person> PersonList = new ArrayList<Person> () ;
ArrayList<MosadHinoh> MosadList = new ArrayList<MosadHinoh> () ;
ArrayList<Maslol> MaslolList = new ArrayList<Maslol> () ;


// מחלקת הממשק 

public MyForm()
{
createMyWindow();
setLocation();
addComponents();
actionEventFunc();

}

//פונקציית בניית ויזאוליות לממשק

public void createMyWindow()
{
frame=new JFrame();


frame.setTitle("Mosad Mangment");
frame.setBounds(250,0,1200,750);
frame.getContentPane().setLayout(null);
frame.getContentPane().setBackground(Color.gray);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setResizable(true);
}


//פונקציית הממקמת את רכיבי  הממשק

public void setLocation()
{
//מיקומי מרכיבי הפריים הקשורים למחלקת אדם	
PersonTitle.setBounds(20,20,200,25);
WorkerButt.setBounds(20,50,80,25);	
ManagButt.setBounds(120,50,80,25);	
StudButt.setBounds(220,50,80,25);	

PersonName.setBounds(20,100,100,23);
PersonNameText.setBounds(180,100,100,23);
PersonGender.setBounds(20,150,100,23);
GenderCombo.setBounds(180,150,100,23);
PersinID.setBounds(20,200,100,23);
PersinIDText.setBounds(180,200,100,23);
PutSallry.setBounds(20,230,100,23);
PutSallryText.setBounds(180,230,100,23);
YearsExp.setBounds(20,260,100,23);
YearsExpText.setBounds(180,260,100,23);
GradesAvg.setBounds(20,290,100,23);
GradesAvgText.setBounds(180,290,100,23);


AddPersonArray.setBounds(50, 340, 180, 35);

//מיקומי מרכיבי הפריים הקשורים למחלקת מוסד	

MosadTitle.setBounds(400,20,200,25);
SpicalMosadButt.setBounds(400,50,120,25);	
RegularMosadButt.setBounds(520,50,120,25);	
NotFormalMosadButt.setBounds(640,50,120,25);

MosadName.setBounds(400,100,100,23);
MosadNameText.setBounds(560,100,100,23);	
MosadNum.setBounds(400,150,100,23);	
MosadNumText.setBounds(560,150,100,23);

teenOrg.setBounds(400,200,100,23);
teenOrgText.setBounds(560,200,100,23);	
totalclass.setBounds(400,200,100,23);	
totalclassText.setBounds(560,200,100,23);
activity.setBounds(400,200,100,23);	
activityText.setBounds(560,200,100,23);
AddMosadArray.setBounds(450, 340, 180, 35);


//מיקומי מרכיבי הפריים הקשורים למחלקת מסלול	

MaslolTitle.setBounds(850, 20, 200, 25);
ElectrictyButt.setBounds(850, 50, 110, 25);
SoftwareButt.setBounds(950, 50, 110, 25);
MaslolName.setBounds(850,100,100,23);	
MaslolNameText.setBounds(1000,100,100,23);
MaslolNum.setBounds(850,150,100,23);
MaslolNumText.setBounds(1000,150,100,23);	
specializationE.setBounds(850,200,100,23);	
specializationEText.setBounds(1000,200,100,23);
numberOfCourses.setBounds(850,200,100,23);	
numberOfCoursesText.setBounds(1000,200,100,23);
AddMaslolArray.setBounds(850,340,180,35);

//DBמיקום כפתור השולח ל

AddArraysDB.setBounds(490, 500, 180, 35);
AddFromDB2Array.setBounds(490, 600, 180, 35);

ChooseMosad.setBounds(50, 400, 160, 35);
ChoosePerson.setBounds(160, 400, 180, 35);
ChooseMaslol.setBounds(280, 400, 180, 35);


SetMosadManager.setBounds(20, 520, 145, 35);
SetMosadWorker.setBounds(185, 520, 140, 35);
SetMaslolStudent.setBounds(100, 600, 140, 35);


ShowMosadlist.setBounds(50, 450, 80, 35);
ShowPersonlist.setBounds(160, 450, 80, 35);
ShowMaslolList.setBounds(280, 450, 80, 35);

}

//הוספת מרכיבי 

public void addComponents()
{
frame.add(PersonTitle);
frame.add(WorkerButt);
frame.add(ManagButt);
frame.add(StudButt);
frame.add(PersonName);
frame.add(PersonGender);
frame.add(PersinID);
frame.add(PersonNameText);
frame.add(PersinIDText);
frame.add(GenderCombo);
frame.add(AddPersonArray);

frame.add(MosadTitle);
frame.add(SpicalMosadButt);
frame.add(RegularMosadButt);
frame.add(NotFormalMosadButt);
frame.add(MosadName);
frame.add(MosadNameText);
frame.add(MosadNum);
frame.add(MosadNumText);
frame.add(AddMosadArray);


frame.add(MaslolTitle);
frame.add(ElectrictyButt);
frame.add(SoftwareButt);
frame.add(MaslolName);
frame.add(MaslolNameText);
frame.add(MaslolNum);
frame.add(MaslolNumText);


frame.add(AddMaslolArray);

frame.add(AddArraysDB);
frame.add(AddFromDB2Array);
frame.add(SetMosadManager);
frame.add(SetMosadWorker);
frame.add(SetMaslolStudent);



frame.add(ShowMosadlist);
frame.add(ShowPersonlist);
frame.add(ShowMaslolList);

frame.add(ChooseMosad);
frame.add(ChoosePerson);
frame.add(ChooseMaslol);








}
public void actionEventFunc()
{

AddPersonArray.addActionListener(this);

WorkerButt.addActionListener(this);
ManagButt.addActionListener(this);
StudButt.addActionListener(this);

SpicalMosadButt.addActionListener(this);
RegularMosadButt.addActionListener(this);
NotFormalMosadButt.addActionListener(this);
AddMosadArray.addActionListener(this);
AddArraysDB.addActionListener(this);

ElectrictyButt.addActionListener(this);
SoftwareButt.addActionListener(this);
AddMaslolArray.addActionListener(this);


AddFromDB2Array.addActionListener(this);
SetMosadManager.addActionListener(this);
SetMaslolStudent.addActionListener(this);
SetMosadWorker.addActionListener(this);
}



//כל הפונקציות שהכפתורים מפעילים
@Override
public void actionPerformed(ActionEvent e) {
	
//הכפתורים הראשונים נועדו כדאי להוסיף  את המרכיבי ממשק לממשק על פי דרישה של המשתמש ובאותו העת להורדת המרכיבים הלא נחוצים למשתמש
// בנוסף הכפתורים מגדירים לנו את המחרוזת שמסמנת לנו איזה סוג טיפוס אנחנו הולכים לייצר ולהכניסו לרשימת האבא	

	//לחיצות כפתור של סוגי אדם

	if(e.getSource()==WorkerButt)
	{	
		MyPType="Worker";
		frame.add(PutSallry);
		frame.add(PutSallryText);
		frame.remove(YearsExp);
		frame.remove(YearsExpText);
		frame.remove(GradesAvg);
		frame.remove(GradesAvgText);
		frame.invalidate();
		frame.validate();
		frame.repaint(); 

	
	}
	
	if(e.getSource()==ManagButt) 	{	
		MyPType="Manager";
		frame.add(YearsExp);
		frame.add(YearsExpText);
		frame.remove(PutSallry);
		frame.remove(PutSallryText);
		frame.remove(GradesAvg);
		frame.remove(GradesAvgText);
		frame.invalidate();
		frame.validate();
		frame.repaint(); 

	}
	
	if(e.getSource()==StudButt) 	{	
		MyPType="Student";
		frame.add(GradesAvg);
		frame.add(GradesAvgText);
		frame.remove(YearsExp);
		frame.remove(YearsExpText);
		frame.remove(PutSallry);
		frame.remove(PutSallryText);
		frame.invalidate();
		frame.validate();
		frame.repaint(); 
	
	}
	
	//לחיצות כפתור של סוגי מוסד
	if(e.getSource()==SpicalMosadButt)
	{	
		MyMType="SpicalMosad";
		frame.add(activity);
		frame.add(activityText);
		frame.remove(teenOrg);
		frame.remove(teenOrgText);
		frame.remove(totalclass);
		frame.remove(totalclassText);
		frame.invalidate();
		frame.validate();
		frame.repaint(); 
	
	}
	
	if(e.getSource()==RegularMosadButt) 	{	
		MyMType="RegularMosad";
		frame.add(totalclass);
		frame.add(totalclassText);
		frame.remove(activity);
		frame.remove(activityText);
		frame.remove(teenOrg);
		frame.remove(teenOrgText);
		frame.invalidate();
		frame.validate();
		frame.repaint(); 

	}
	
	if(e.getSource()==NotFormalMosadButt) 	{	
		MyMType="NotFormalMosad";
		frame.add(teenOrg);
		frame.add(teenOrgText);
		frame.remove(totalclass);
		frame.remove(totalclassText);
		frame.remove(activity);
		frame.remove(activityText);
		frame.invalidate();
		frame.validate();
		frame.repaint(); 
		
	}

	//לחיצות כפתור של סוגי מסלול
	
	
	if(e.getSource()==ElectrictyButt) 	{	
		MyMSType="ElectrictyM";
		frame.add(specializationE);
		frame.add(specializationEText);
		frame.remove(numberOfCourses);
		frame.remove(numberOfCoursesText);
		frame.invalidate();
		frame.validate();
		frame.repaint(); 

	}
	
	if(e.getSource()==SoftwareButt) 	{	
		MyMSType="SoftwareM";
		frame.add(numberOfCourses);
		frame.add(numberOfCoursesText);
		frame.remove(specializationE);
		frame.remove(specializationEText);
		frame.invalidate();
		frame.validate();
		frame.repaint(); 
	
	}
	
	//הכפתורים הבאים נועדו לייצר את טיפוסי הילדים  ולהכניסם לרשימת אביהם
	// המפתח להכנסה שלנו הוא  מחרוזת הטיפוס שקיבלנו מאחד הכפתורים הקודמים
	//  את שמות הטיפוסים שלנו זה יעזור לנו בהמשך אם נרצה לממש קשרים דרך הממשק show בנוסף אנחנו מכניסים לרשימות 
	
	//  כפתור ליצירת טיפוס היורש מאדם והכנסתו לרשימה של אדם מקלט של הממשק
if(e.getSource()==AddPersonArray) {	
		
		if(MyPType=="Worker") {
			try {
			Worker w= new Worker(PersonNameText.getText(),Integer.parseInt(PersinIDText.getText()),GenderCombo.getSelectedItem().toString(),Integer.parseInt(PutSallryText.getText()));
			PersonList.add(w);
			ShowPersonlist.add(w.getName());
			System.out.println("you Created Person Instant Worker Type");
			}
			catch(Exception e1) {System.out.println("Input Error \n"+e1);}
		}
		
		if(MyPType=="Manager") {
			try {
			Manager m= new Manager(PersonNameText.getText(),Integer.parseInt(PersinIDText.getText()),GenderCombo.getSelectedItem().toString(),Integer.parseInt(YearsExpText.getText()));
			PersonList.add(m);
			ShowPersonlist.add(m.getName());
			System.out.println("you Created Person Instant Manager Type");
			}
            catch(Exception e1) {System.out.println("Input Error \n"+e1);}}
		
		if(MyPType=="Student") {
			try {
			Student s= new Student(PersonNameText.getText(),Integer.parseInt(PersinIDText.getText()),GenderCombo.getSelectedItem().toString(),Integer.parseInt(GradesAvgText.getText()));
			PersonList.add(s);
			ShowPersonlist.add(s.getName());
			System.out.println("you Created Person Instant Student Type");
			}
            catch(Exception e1) {System.out.println("Input Error \n"+e1);}
		}
	
		PersinIDText.setText("");
		PersonNameText.setText("");
		PutSallryText.setText("");
		YearsExpText.setText("");
		GradesAvgText.setText("");
 
		 for(int i=0;i<PersonList.size();i++) {
			 System.out.println( (PersonList.get(i)).toString());
		 }
		 
		 System.out.println("you Can add Any Instant");
		
	}

//  כפתור ליצירת טיפוס היורש ממוסד ולהכנסתו לרשימה של מוסד מקלט של הממשק

	
if(e.getSource()==AddMosadArray) {	
	   
		if(MyMType=="SpicalMosad") {
			 try {
			SpicalMosad s= new SpicalMosad(Integer.parseInt(MosadNumText.getText()),MosadNameText.getText(),activityText.getText());
			MosadList.add(s);
			ShowMosadlist.add(s.getName());
			System.out.println("you Created Mosad Instant SpicalMosad Type");
		}
		   catch(Exception e1) {System.out.println("Input Error \n"+e1);}
		}
		
		if(MyMType=="RegularMosad") {
			try {
			RegularMosad r= new RegularMosad(Integer.parseInt(MosadNumText.getText()),MosadNameText.getText(),Integer.parseInt(totalclassText.getText()));
			MosadList.add(r);
			ShowMosadlist.add(r.getName());
			System.out.println("you Created Mosad Instant RegularMosad Type");
		}
			 catch(Exception e1) {System.out.println("Input Error \n"+e1);}
		}
		if(MyMType=="NotFormalMosad") {
			try {
			NotFormalMosad nf= new NotFormalMosad(Integer.parseInt(MosadNumText.getText()),MosadNameText.getText(),teenOrgText.getText());
			MosadList.add(nf);
			ShowMosadlist.add(nf.getName());
			System.out.println("you Created Mosad Instant NotFormalMosad Type");
			}
			 catch(Exception e1) {System.out.println("Input Error \n"+e1);}		
		}
			
		MosadNumText.setText("");
		MosadNameText.setText("");
		activityText.setText("");
		totalclassText.setText("");
		teenOrgText.setText("");
	
		 for(int i=0;i<MosadList.size();i++) {
			 System.out.println(MosadList.get(i));

		 }
		 System.out.println("you Can add Any Instant");
	}

//כפתור ליצירת טיפוס היורש ממסלול ולהכנסתו לרשימה של מסלול מקלט של הממשק

if(e.getSource()==AddMaslolArray) {	
    
	
	if(MyMSType=="ElectrictyM") {
		try {
		ElectrictyM el = new ElectrictyM(Integer.parseInt(MaslolNumText.getText()),MaslolNameText.getText(),specializationEText.getText());
		MaslolList.add(el);	
		ShowMaslolList.add(el.getName());
		System.out.println("you Created Maslol Instant ElectrictyM Type");
	}
	 catch(Exception e1) {System.out.println("Input Error \n"+e1);}		
	}
	
	if(MyMSType=="SoftwareM") {
		try {
		SoftwareM sf= new SoftwareM(Integer.parseInt(MaslolNumText.getText()),MaslolNameText.getText(),Integer.parseInt(numberOfCoursesText.getText()));
		MaslolList.add(sf);	
		ShowMaslolList.add(sf.getName());
		System.out.println("you Created Maslol Instant SoftwareM Type");
	}
		 catch(Exception e1) {System.out.println("Input Error \n"+e1);}	
	
	
	}
	MaslolNameText.setText("");
	MaslolNumText.setText("");
	specializationEText.setText("");
	numberOfCoursesText.setText("");
	 
	 for(int i=0;i<MaslolList.size();i++) {
		 System.out.println(MaslolList.get(i));
	 }
	 System.out.println("you Can add Any Instant");
}




//כפתור להשמת מנהל למוסד
//עוברים בלולאות על מערך אדם  ומערך מוסד אם סומן שם המנהל ברשימת גלילה בממשק וסומן שם המוסד ברשימת גלילה ושני הסימונים תואמים לרשימות האדם והמוסד אז אנו נפעיל פונקציית סט פנימית של המנהל להשמת המוסד 
if(e.getSource()==SetMosadManager) {
	for(int i=0;i<PersonList.size();i++) 
	  if(ShowPersonlist.getSelectedItem()==PersonList.get(i).getName()) 
		  for(int j=0;j<MosadList.size();j++) 
			  if(ShowMosadlist.getSelectedItem()==MosadList.get(j).getName()) {
				  //יש טיפול בחריגה במידה ולא בחרנו מנהל ומוסד
				  try {
				  ((Manager)PersonList.get(i)).setMosad(MosadList.get(j));
					System.out.println( ((Manager)PersonList.get(i)));
					System.out.println( MosadList.get(j) );
					
				  }catch(Exception e1) {System.out.println("Error Selected, Please select Manager \n"+e1);}

                       }
                     }

//כפתור להשמת עובד למוסד

if(e.getSource()==SetMosadWorker) {
	for(int i=0;i<PersonList.size();i++) 
	  if(ShowPersonlist.getSelectedItem()==PersonList.get(i).getName()) 
		  for(int j=0;j<MosadList.size();j++) 
			  if(ShowMosadlist.getSelectedItem()==MosadList.get(j).getName()) {
				  //יש טיפול בחריגה במידה ולא בחרנו עובד ומוסד
				  try {
				  ((Worker)PersonList.get(i)).setMosad(MosadList.get(j));
					System.out.println( ((Worker)PersonList.get(i)));
					System.out.println( MosadList.get(j) );
					
				  }catch(Exception e1) {System.out.println("Error Selected, Please select Worker \n"+e1);}

                       }
                     }

if(e.getSource()==SetMaslolStudent) {
	for(int i=0;i<PersonList.size();i++) 
	  if(ShowPersonlist.getSelectedItem()==PersonList.get(i).getName()) 
		  for(int j=0;j<MaslolList.size();j++) 
			  if(ShowMaslolList.getSelectedItem()==MaslolList.get(j).getName()) {
				  //יש טיפול בחריגה במידה ולא בחרנו סטודנט ומסלול
				  try {
				  ((Student)PersonList.get(i)).setMaslo(MaslolList.get(j));
					System.out.println( ((Student)PersonList.get(i)));
					System.out.println( MaslolList.get(j) );
					
				  }catch(Exception e1) {System.out.println("Error Selected, Please select Student and Maslol \n"+e1);}

                       }
                     }








	

// DBכפתור הכנסת כל המערכים ל
// רצים בלולאות על שלושת מערכי האבות ומכניסים בהתאמה לטבלאות לפי סוג הטיפוס באמצעות  אינסטנס אופ

if(e.getSource()==AddArraysDB) {
	
try {
Connection conn = connClass.getConn();
String MyShalita="";

PreparedStatement preparedStmt;
for(int i=0;i<PersonList.size();i++) {
	if(PersonList.get(i) instanceof Worker) {
		MyShalita="insert into worker values(?,?,?,?)";
		preparedStmt=conn.prepareStatement(MyShalita);
		preparedStmt.setString(1, PersonList.get(i).getName());
		preparedStmt.setInt(2, PersonList.get(i).getId());
		preparedStmt.setString(3, PersonList.get(i).getGender());	
		preparedStmt.setInt(4, ((Worker)PersonList.get(i)).getSalary() );
		preparedStmt.execute();
		

	}
	
	if(PersonList.get(i) instanceof Manager) {
		MyShalita="insert into manager values(?,?,?,?)";
		preparedStmt=conn.prepareStatement(MyShalita);
		preparedStmt.setString(1, PersonList.get(i).getName());
		preparedStmt.setInt(2, PersonList.get(i).getId());
		preparedStmt.setString(3, PersonList.get(i).getGender());
		preparedStmt.setInt(4, ((Manager)PersonList.get(i)).getExpyears() ) ;
		preparedStmt.execute();
		

}
	
	if(PersonList.get(i) instanceof Student) {
		MyShalita="insert into student values(?,?,?,?)";
		preparedStmt=conn.prepareStatement(MyShalita);
		preparedStmt.setString(1, PersonList.get(i).getName());
		preparedStmt.setInt(2, PersonList.get(i).getId());
		preparedStmt.setString(3, PersonList.get(i).getGender());
		preparedStmt.setInt(4, ((Student)PersonList.get(i)).getAverage());
		preparedStmt.execute();
		

}

}



for(int i=0;i<MosadList.size();i++) {
	if(MosadList.get(i) instanceof RegularMosad) {
		MyShalita="insert into regularmosad values(?,?,?)";
		preparedStmt=conn.prepareStatement(MyShalita);
		preparedStmt.setInt(1, MosadList.get(i).getNum());
		preparedStmt.setString(2, MosadList.get(i).getName());
		preparedStmt.setInt(3,((RegularMosad) MosadList.get(i)).getTotalclass());	
		preparedStmt.execute();
	}
	
	if(MosadList.get(i) instanceof SpicalMosad) {
		MyShalita="insert into spicalmosad values(?,?,?)";
		preparedStmt=conn.prepareStatement(MyShalita);
		preparedStmt.setInt(1, MosadList.get(i).getNum());
		preparedStmt.setString(2, MosadList.get(i).getName());
		preparedStmt.setString(3,((SpicalMosad) MosadList.get(i)).getActivity());
		preparedStmt.execute();
}
	
	if(MosadList.get(i) instanceof NotFormalMosad) {
		MyShalita="insert into notformalmosad values(?,?,?)";
		preparedStmt=conn.prepareStatement(MyShalita);
		preparedStmt.setInt(1, MosadList.get(i).getNum());
		preparedStmt.setString(2, MosadList.get(i).getName());
		preparedStmt.setString(3,((NotFormalMosad) MosadList.get(i)).getTeenOrganization());
		preparedStmt.execute();
}
}

 for(int i=0;i<MaslolList.size();i++) {
	if(MaslolList.get(i) instanceof ElectrictyM) {
		MyShalita="insert into electrictym values(?,?,?)";
		preparedStmt=conn.prepareStatement(MyShalita);
		preparedStmt.setInt(1, MaslolList.get(i).getCode());
		preparedStmt.setString(2, MaslolList.get(i).getName());
		preparedStmt.setString(3,((ElectrictyM) MaslolList.get(i)).getSpecialization());	
		preparedStmt.execute();		
	}
	
	if(MaslolList.get(i) instanceof SoftwareM) {
		MyShalita="insert into softwarem values(?,?,?)";
		preparedStmt=conn.prepareStatement(MyShalita);
		preparedStmt.setInt(1, MaslolList.get(i).getCode());
		preparedStmt.setString(2, MaslolList.get(i).getName());
		preparedStmt.setInt(3,((SoftwareM) MaslolList.get(i)).getNumberOfCourses());	
		preparedStmt.execute();		
	}
 }

conn.close();

} catch (SQLException e1) {
e1.printStackTrace();
} catch (ClassNotFoundException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
}


//טבלה של סטודנטים לתוך רשימת אדם DB כפתור הכנסת 
if(e.getSource()==AddFromDB2Array)
{
	String query="SELECT * from student";
	try{
	Connection conn = connClass.getConn();
	Statement stmt;
	ResultSet rs;		
	stmt = conn.createStatement();
	rs = stmt.executeQuery(query);
	
	String StudName,StudGender;
	int StudID,StudAvg;
	
	while(rs.next())
	{
	StudName =rs.getString("name");
	StudID = rs.getInt("id");
	StudGender  = rs.getString("gender");
	StudAvg  = rs.getInt("average");
	Student s= new Student(StudName,StudID,StudGender,StudAvg);
	PersonList.add(s);
	
	 for(int i=0;i<PersonList.size();i++) {		 
		 System.out.println(PersonList.get(i));		 		 
	 }
	}

	rs.close();
	conn.close();
	}catch(Exception e2){
		System.out.println(e2);
		}
}
}

public static void main(String[] args)
{
new MyForm();

}
}

