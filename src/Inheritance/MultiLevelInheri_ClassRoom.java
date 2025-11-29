package Inheritance;

public class MultiLevelInheri_ClassRoom extends MultiLevelInheri_DeptName
{
 int ClassRoom=14;
 
 void meeting()
 {
	 System.out.println("CS Batch Meeting is conducted in Room 14");
 }
 
 public static void main(String[] args) 
 {
	 MultiLevelInheri_ClassRoom mc=new MultiLevelInheri_ClassRoom();
	 System.out.println(mc.CollegeName);
	 System.out.println(mc.DeptName);
	 System.out.println(mc.ClassRoom);
	 mc.Exam();
	 mc.games();
	 mc.meeting();
}
}
