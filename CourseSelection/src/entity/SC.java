package entity;

public class SC implements IEntity{
	private String studentNo;
	private StringBuffer courseNo;
	private int grade;
	public String getStudentNo(){
		return studentNo;
	}
    public void setStudentNo(String studentNo){
    	this.studentNo=studentNo;
    	
    }
    public  StringBuffer getCourseNo(){
      // return courseNo;
    	return courseNo;
    }
    public int getGrade(){
    	return grade;
    }
    public void setGrade(int grade){
    	this.grade=grade;
    }
	public void setCourseNo(StringBuffer courseNo) {
		this.courseNo=courseNo;
		
	}
}
