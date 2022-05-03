public class Player extends Thread{

    private String nome;
    private int carta;


    public Player(String nome){
        this.nome=nome;
        
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public int getCarta(){
        return this.carta;
    }

    @Override
    public void run(){
        System.out.println(nome+" ha iniziato a giocare");
        carta= (int)(10*Math.random())+1;
        System.out.println(nome+" ha pescato la carta: "+carta);
    }
}
