/*how to create HashSet program in java*/

package problem_solving_question;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CreateHashSet {
    int id_no;
    String name, address, email;
    double attendends_percent;
    public CreateHashSet(int id_no, String name, String address, String email, double attendends_percent){
        this.id_no = id_no;
        this.name = name;
        this.address = address;
        this.email = email;
        this.attendends_percent = attendends_percent;
    }
    public static void main(String[] args) {

        CreateHashSet chs1 = new CreateHashSet(101, "Sayed", "Chattogram", "sayedckb@gmail.com", 52.6);
        CreateHashSet chs2 = new CreateHashSet(102, "Shakouat", "Chawakbazar", "sayedckb61@gmail.com", 61.6);
        CreateHashSet chs3 = new CreateHashSet(103, "Hossen", "BohadarHut", "shakouathossensayed@gmail.com", 52.6);
        CreateHashSet chs4 = new CreateHashSet(104, "Sakhawat", "Pahartoli", "hossen1@gmail.com", 90.6);
        CreateHashSet chs5 = new CreateHashSet(105, "Hossain", "GolzarMor", "sakhawat12@gmail.com",9.5);
        HashSet<CreateHashSet> hs = new HashSet<CreateHashSet>();
        hs.add(chs1);
        hs.add(chs2);
        hs.add(chs3);
        hs.add(chs4);
        hs.add(chs5);
        Iterator itr = hs.iterator();
        for(CreateHashSet sh: hs )
            System.out.println("Student Id: "+sh.id_no+"\n"+
            "Student Address: "+sh.address+"\n"
            +"Student Name: "+sh.name+"\n"
            +"Student Email: "+sh.email+"\n"
            +"Stuent Attendends Persent: "+sh.attendends_percent+"\n");
    }
}