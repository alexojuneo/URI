import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays; 


/**
 * DESCRIÇÃO: 
 * Alguém deixou o quadro de medalhas das olimpíadas fora de ordem. 
 * Seu programa deve colocá-lo na ordem correta. A ordem dos países no quadro de medalhas é dada pelo número de medalhas de ouro. 
 * Se há empate em medalhas de ouro, a nação que tiver mais medalhas de prata fica a frente. 
 * Havendo empate em medalhas de ouro e prata, fica mais bem colocado o país com mais medalhas de bronze. 
 * Se dois ou mais países empatarem nos três tipos de medalhas, seu programa deve mostrá-los em ordem alfabética.
 *
 * ENTRADA:
 * A entrada é dada pelo número de países participantes N (0 ≤ N ≤ 500) seguido pela lista dos países, com suas medalhas:
 * de ouro O (0 <= O <= 10000),
 * prata P (0 <= P <= 10000) e 
 * bronze B (0 <= B <= 10000).
 * 
 * 
 * SAÍDA:
 * A saída deve ser a lista de países, com suas medalhas de ouro, prata e bronze, na ordem correta do quadro de medalhas, 
 * com as nações mais premiadas aparecendo primeiro.
 * 
 */

public class Main{

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        int num_paises_participantes = 0;
        num_paises_participantes = sc.nextInt();

        String nome_pais = "";

        int qntd_medalhas_ouro = 0;
        int qntd_medalhas_prata = 0;
        int qntd_medalhas_bronze = 0;

        int soma_todas_medalhas = 0;
        int total_qntd_medalhas = 0;

        List paises = new ArrayList();

        for(int i = 1; i <= num_paises_participantes; i++){

            nome_pais = sc.next();
            qntd_medalhas_ouro = sc.nextInt();
            qntd_medalhas_prata = sc.nextInt();
            qntd_medalhas_bronze = sc.nextInt();

            Pais pais_objeto = new Pais();

            pais_objeto.setNomePais(nome_pais);
            pais_objeto.setQntdMedalhasOuro(QntdMedalhasOuro);
            pais_objeto.setQntdMedalhasPrata(QntdMedalhasPrata);
            pais_objeto.setQntdMedalhasBronze(QntdMedalhasBronze);

            paises.add(pais);

            soma_todas_medalhas = qntd_medalhas_ouro + qntd_medalhas_prata + qntd_medalhas_bronze;

            System.out.println(total_qntd_medalhas);
        }

        sc.close();
    }
}

public class Pais{

    private String nome_pais;
    private int qntd_medalhas_ouro;
    private int qntd_medalhas_prata;
    private int qntd_medalhas_bronze;

    public Pais(){}

    public String getNomePais(){
        return nome_pais;
    }
    public void setNomePais(String NomePais){
        this.nome_pais = NomePais;
    }

    public int getQntdMedalhasOuro(){
        return qntd_medalhas_ouro;
    }
    public void setQntdMedalhasOuro(int QntdMedalhasOuro){
        this.qntd_medalhas_ouro = QntdMedalhasOuro;
    }

    public int getQntdMedalhasPrata(){
        return qntd_medalhas_prata;
    }
    public void setQntdMedalhasPrata(int QntdMedalhasPrata){
        this.qntd_medalhas_prata = QntdMedalhasPrata;
    }

    public int getQntdMedalhasBronze(){
        return qntd_medalhas_bronze;
    }
    public void setQntdMedalhasBronze(int QntdMedalhasBronze){
        this.qntd_medalhas_bronze = QntdMedalhasBronze;
    }
}
