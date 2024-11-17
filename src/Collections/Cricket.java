
package Collections;
import java.util.ArrayList;
class Assignment4 {
    public static void main(String[] args){
        ArrayList<Cricket> players=new ArrayList<Cricket>();
        players.add(new Cricket(101,"dhoni",31,"csk"));
        players.add(new Cricket(102,"viratkohli",28,"rcb"));
        players.add(new Cricket(103,"rahul",22,"csk"));
        players.add(new Cricket(104,"rashid khan",25,"kkr"));
        players.add(new Cricket(105,"raina",21,"csk"));
        players.add(new Cricket(106,"andreRussel",35,"kkr"));
        players.add(new Cricket(107,"ratan",28,"hyd"));
        players.add(new Cricket(108,"kb",30,"hyd"));
        //***2-no.or players in the colletins*****
        System.out.println("no.of players n a collection="+players.size());
      //_____3--search for ratan  
         System.out.println(players.contains(new Cricket(107,"ratan",28,"hyd")));
         //__________4--Age<30_____________
         for(Cricket player:players){
             if(player.getCage()<30){
                System.out.println(player); 
             }
         }
         //____________5--update details---____________
         for(Cricket player:players){
             if(player.getCid()==101){
                 player.setCname("ms dhoni");
                 player.setCage(33);
             }
         }
         System.out.println("update details"+players);
         //___________6--Remove highest age____________
         Cricket highAge=players.get(0);
         for(Cricket player:players){
             if(player.getCage()>highAge.getCage()){
                 highAge=player;
             
                 if(player.getCage()==highAge.getCage()){
                     players.remove(player);
                     break;
                 }
             }}
         System.out.println("high age player:"+highAge);
         System.out.println("remove highest age players"+players);
         //____________7--lowest age player___________
          Cricket lowAge=players.get(0);
         for(Cricket player:players){
             if(player.getCage()<lowAge.getCage()){
                 lowAge=player;
             }
         }
         System.out.println("low age player"+lowAge);
         
         //____8---csk players new team___________
         ArrayList<Cricket> cskplys=new ArrayList<Cricket>();
         for(Cricket player:players){
             if(player.getCteam().equals("csk")){
                 cskplys.add(player);
             }
         }
         System.out.println("csk players new team");
         System.out.println(cskplys);
         
         //______9-Store all player names into new list____________
         ArrayList<String>playnm=new ArrayList<String>();
         for(Cricket player:players){
             playnm.add(player.getCname());
             
         }
         System.out.println("player names:"+playnm);
         
         //______10--count no.of teams presenet in collections___________
          ArrayList<Cricket> uniqTeams=new ArrayList<Cricket>();
          int count=0;
           for(Cricket player:players){
               if(!uniqTeams.contains(player.getCteam())){
                   uniqTeams.add(player);
                   count++;
               }
           }
           System.out.println(uniqTeams);
           System.out.println("no.of teams="+count);
           
           
         
    }
    
}
 public class Cricket{
    int cid;
    String cname;
    int cage;
    String cteam;
    Cricket(int cid,String cname,int cage,String cteam){
        this.cid=cid;
        this.cname=cname;
        this.cage=cage;
        this.cteam=cteam;
        
    }
    public String toString(){
    return "cricket [id="+cid+",name="+cname+", age="+cage+"team="+cteam+"]";
}
    public void setCid(int cid){
        this.cid=cid;
    }
    public  int getCid(){
        return cid;
    }
     public void setCname( String cname){
        this.cname=cname;
    }
    public  String getCname(){
        return cname;
    }
     public void setCage(int cage){
        this.cage=cage;
    }
    public int getCage(){
        return cage;
    }
     public void setCteam(String cteam){
        this.cteam=cteam;
    }
    public String getCteam(){
        return cteam;
    }
    
}

