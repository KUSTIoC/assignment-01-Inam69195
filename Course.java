public class Course
{
    private final String course_Name;
    private   int course_code;
    private String program_Name;
    private String course_offered;

    public Course(String course_Name, int course_code, String program_Name, String course_offered) {
        this.course_Name = course_Name;
        this.course_code = course_code;
        this.program_Name = program_Name;
        this.course_offered = course_offered;
    }

   
    public void setProgram_Name(String program_Name) {
        this.program_Name = program_Name;
    }

    public void setCourse_offered(String course_offered) {
        this.course_offered = course_offered;
    }
	
	public void setCourse_code(int course_code)
	{
         this.course_code=course_code;
    }
	

    public String getCourse_Name() {
        return "Information and Tecnology";
    }

    public int getCourse_code() {
        return course_code;
    }

    public String getProgram_Name() {
        return program_Name;
    }

    public String getCourse_offered() {
        return course_offered;
    }

    @Override
    public String toString() {
        return "Course" + "\nCourse Name =" + getCourse_Name() + "\n Course Code =" + course_code + "\n Program Name =" + program_Name + "\n Course Offered =" + course_offered ;
    }

   
    
    
}