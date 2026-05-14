public class Student {
    private String Stid;
    private String Stname;
    private String StCourseCode;
    private Double StCGPA;
    private Boolean supportSec;
    private String sessionStatus;
    private String interventionProgress;

    public Student(String Stid, String Stname, String StCourseCode, Double StCGPA) {
        this.Stid = Stid;
        this.Stname = Stname;
        this.StCourseCode = StCourseCode;
        this.StCGPA = StCGPA;
        this.supportSec = determineSupportNeeded();
        if (this.supportSec) {
            this.sessionStatus = "Pending Scheduling";
            this.interventionProgress = "0% - Identified";
        } else {
            this.sessionStatus = "Not Required";
            this.interventionProgress = "N/A";
        }
    }
    public String getStid() { return Stid; }
    public String getStname() { return Stname; }
    public String getStCourseCode() { return StCourseCode; }
    public Double getStCGPA() { return StCGPA; }
    public Boolean isSupportSec() { return supportSec; }
    public String getSessionStatus() { return sessionStatus; }
    public String getInterventionProgress() { return interventionProgress; }
    public void setSessionStatus(String status) {
        this.sessionStatus = status;
    }

    public void setInterventionProgress(String progress) {
        this.interventionProgress = progress;
    }
    private Boolean determineSupportNeeded() {
        return this.StCGPA < 2.0;
    }

    public String toString() {
        return "-----------------------------\n" +
                "Student ID:     " + Stid + "\n" +
                "Student Name:   " + Stname + "\n" +
                "Course Code:    " + StCourseCode + "\n" +
                "CGPA:           " + StCGPA + "\n" +
                "Support Needed: " + supportSec + "\n" +
                "Session Status: " + sessionStatus + "\n" +
                "Progress:       " + interventionProgress + "\n" +
                "-----------------------------";
    }
}