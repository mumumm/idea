package DataBaseTest.JDBCDemo.Dao;

public class Student {
    private Integer id;
    private String name;
    private String sex;
    private Double EnglishScore;
    private Double MathScore;
    private Double PEScore;
    private Double JavaScore;
    private Double CprogarmScore;
    private String Class;
    public Student() {
    }
    public Student(Integer id, String name, String sex, Double englishScore, Double mathScore, Double PEScore, Double javaScore, Double cprogarmScore, String aClass) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        EnglishScore = englishScore;
        MathScore = mathScore;
        this.PEScore = PEScore;
        JavaScore = javaScore;
        CprogarmScore = cprogarmScore;
        Class = aClass;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getEnglishScore() {
        return EnglishScore;
    }

    public void setEnglishScore(Double englishScore) {
        EnglishScore = englishScore;
    }

    public Double getMathScore() {
        return MathScore;
    }

    public void setMathScore(Double mathScore) {
        MathScore = mathScore;
    }

    public Double getPEScore() {
        return PEScore;
    }

    public void setPEScore(Double PEScore) {
        this.PEScore = PEScore;
    }

    public Double getJavaScore() {
        return JavaScore;
    }

    public void setJavaScore(Double javaScore) {
        JavaScore = javaScore;
    }

    public Double getCprogarmScore() {
        return CprogarmScore;
    }

    public void setCprogarmScore(Double cprogarmScore) {
        CprogarmScore = cprogarmScore;
    }
    public String getClassName() {
        return Class;
    }

    public void setClassName(String aClass) {
        Class = aClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", EnglishScore=" + EnglishScore +
                ", MathScore=" + MathScore +
                ", PEScore=" + PEScore +
                ", JavaScore=" + JavaScore +
                ", CprogarmScore=" + CprogarmScore +
                ", Class='" + Class + '\'' +
                '}';
    }
}
