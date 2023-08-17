public class Student
{//comment for github testing
    String name;
    String advJGrade;
    int laptopNum;
    double totalGpa;
    boolean playsDND;
    //instance variables

    public Student(String name, String advJGrade, int laptopNum, double totalGpa, boolean playsDND)
    {//start constructor
        this.name = name;
        this.advJGrade = advJGrade;
        this.laptopNum = laptopNum;
        this.totalGpa = totalGpa;
        this.playsDND = playsDND;
    }//end constructor

    @Override
    public String toString() {
        return "Student... " +
                "name='" + name + '\'' +
                ", advJGrade='" + advJGrade + '\'' +
                ", laptopNum=" + laptopNum +
                ", totalGpa=" + totalGpa +
                ", playsDND=" + playsDND;
    }

    public String getName() {
        return name;
    }

    public String getAdvJGrade() {
        return advJGrade;
    }

    public int getLaptopNum() {
        return laptopNum;
    }

    public double getTotalGpa() {
        return totalGpa;
    }

    public boolean isPlaysDND() {
        return playsDND;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdvJGrade(String advJGrade) {
        this.advJGrade = advJGrade;
    }

    public void setLaptopNum(int laptopNum) {
        this.laptopNum = laptopNum;
    }

    public void setTotalGpa(double totalGpa) {
        this.totalGpa = totalGpa;
    }

    public void setPlaysDND(boolean playsDND) {
        this.playsDND = playsDND;
    }
}
