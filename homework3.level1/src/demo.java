import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<Rooms> tms=new ArrayList();
        tms.add(new Rooms(231,"yaoyao",201821283,18,"man"));
        tms.add(new Rooms(231,"wenwen",202313,18,"man"));
        tms.add(new Rooms(231,"ruirui",123813,18,"man"));
        tms.add(new Rooms(231,"nanan",231413,18,"man"));
        tms.add(new Rooms(211,"yuyu",2313314,18,"woman"));
        for(Rooms x:tms) {
            System.out.println(x.getClas()+" "+x.getName()+" "+x.getNum()+" "+x.getAge()+" "+x.getSex());
        }
        System.out.println();
        Iterator it=tms.iterator();
        while(it.hasNext()){
            Rooms x=(Rooms) it.next();
            System.out.println(x.getClas()+" "+x.getName()+" "+x.getNum()+" "+x.getAge()+" "+x.getSex());
        } System.out.println();
        for(int i=0;i<tms.size();i++){
            System.out.println(tms.get(i).getClas()+" "+tms.get(i).getName()+" "+tms.get(i).getNum()+" "+tms.get(i).getAge()+" "+tms.get(i).getSex());
        }
        System.out.println();
        tms.forEach(out->System.out.println(out.getClas()+" "+out.getName()+" "+out.getNum()+" "+out.getAge()+" "+out.getSex()));
    }
}