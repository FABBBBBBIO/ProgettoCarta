public class App {
    public static void main(String[] args) throws Exception {
        Player p1= new Player("fabbio");
        Player p2= new Player("Meratti");
        Player p3= new Player("Lotti");
        

        p1.start();
        p2.start();
        p3.start();
        
        p1.join();
        p2.join();
        p3.join();
        
        if(p1.getCarta() > p2.getCarta() && p1.getCarta()>p3.getCarta()){
            System.out.println(p1.getNome() + " ha vinto");
        }
        if(p2.getCarta() > p1.getCarta() && p2.getCarta()>p3.getCarta()){
            System.out.println(p2.getNome() + " ha vinto");
        }
        if(p3.getCarta() > p2.getCarta() && p3.getCarta()>p1.getCarta()){
            System.out.println(p3.getNome() + " ha vinto");
        }
    }
}
