
public class Progressao {
    public static void main(String[] args){
        int prog;
        prog = 0;
        for(int i = 0; i < 101; i++){
            prog = prog + i;
        }
        if(prog == 5050){
            System.out.println("Sim, o jovem estava correto!");
        }
        
    }
}
