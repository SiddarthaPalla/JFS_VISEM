import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

class Passport{
    int passportNo;
    String nationality;
    Passport(int passportNo,String nationality){
        this.passportNo=passportNo;
        this.nationality=nationality;
    }
}
class Person{
    int id;
    String name;
    Passport pass;
    Person(int id,String name,Passport p){
        this.id=id;
        this.name=name;
        this.pass=p;
    }
}

public class OnetoOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Passport p;
        Person m[];
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        m=new Person[n];
        for(int i=0;i<n;i++){
            p=new Passport(1000+i,"Indian");
            System.out.println("Enter the id of person: ");
            int id=sc.nextInt();
            System.out.println("Enter the name of the person: ");
            String name=sc.next();
            m[i]=new Person(id, name, p);
        }
        System.out.println("Enter id (0 to "+(n-1)+") : ");
        int k;
        k=sc.nextInt();
        System.out.println("Name : "+m[k].name);
        System.out.println("id : "+m[k].pass.passportNo);
        System.out.println("Nationality : "+m[k].pass.nationality);
        sc.close();

        // System.out.println("Hello");
        // Passport p =new Passport(987654,"Krishna");
        // Person m=new Person(1, "Krishna", p);
        // System.out.println(m.pass.passportNo);
        // System.out.println(m.pass.nationality);
    }
}
