
public class AplicativoVoto{
    public static void main(String[] args){
        int idade;
        String voto;

        idade = 19;
        voto = "";
        if((idade >= 16 && idade < 18) || idade >= 70){
            voto = "Voto não obrigatório";
        }
        else if(idade >= 18 && idade < 70){
           voto = "Voto obrigatório";
        }
        System.out.println(voto);
    }
}

