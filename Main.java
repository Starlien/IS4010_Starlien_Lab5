import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
  Student student1 = new Student(); 

  student1.setName("Arnold Spielberg");    student1.setGPA(4.0);    
  student1.setMajor("Electrical Engineering");

  Student student2 = new Student(); 

  student2.setName("Evan Starling");    student2.setGPA(4.3);    
  student2.setMajor("Information Systems");

  student1.print();
  student2.print();
  ArrayList<Double> gpaList = new ArrayList<Double>();
  gpaList.add(student1.getGPA());
  gpaList.add(student2.getGPA());

  double gpaSum = 0;

  for (int j = 0 ; j < gpaList.size(); j++){
    gpaSum = gpaSum + gpaList.get(j);
  }
  System.out.println("The Average GPA is " + gpaSum/gpaList.size() );
  }
}