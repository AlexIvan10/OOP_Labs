public class Student implements Cloneable{
    String nume;
    int id;
    Masina masina;
    public Student(String nume, int id, Masina masina){
        this.nume = nume;
        this.id = id;
        this.masina = masina;
    }
    public Student clone(){
        try {
            Student copieStudent;
            copieStudent = (Student)super.clone();
            copieStudent.masina = masina.clone();
            //copieStudent.masina = new Masina(masina.marca, masina.culoare);
            return copieStudent;
        }
        catch(Exception e){
            System.out.println("Not cloneable");
            return null;
        }
    }
    public String toString(){
        return nume + " " + id + " " + masina;
    }
}
