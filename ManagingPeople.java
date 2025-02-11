package m2p1_tugasno1;
public class ManagingPeople {
    public static void main(String[] args) {
        person p1 = new person("Arial", 37);
        person p2 = new person("joseph", 17);
        p1.setAge(31);
        
        if(p1.getAge()== p2.getAge()){
            System.out.println(p1.getName() + " Memiliki umur yang sama dengan " + p2.getName());
        }else{
            System.out.println(p1.getName() + " Tidak seumuran dengan " + p2.getName());
        }
        
    }
    
}
