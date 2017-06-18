/**
 * Created by Michael M on 30/05/2017.
 */
public class Semantic {

    private String[] tokens;
    private String token;
    private int cont = 0;
    private int tempNum;
    private int D_X = 0;
    private int D_Y = 0;


    public Semantic(String tokens[]){

        this.tokens = tokens;
        token = tokens[0];
        comando();

    }

    public void advance()  {

        try {
            Thread.sleep (2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      //  System.out.println(D_X+","+D_Y);
        if(cont >= 16){

            //System.out.println(D_X+","+D_Y);
            System.exit(0);

            //verifica se é número
        }else {
            token = tokens[cont];
            comando();
            // basico();

        }

    }

    public void consume(String token) {

        if(!token.isEmpty()){

            //itera o índice que aponta p/ unidade do vetor de comandos
         cont++;

                advance();

        }
    }

    public void comando(){

        switch (token){


            case "ENTAO": consume("ENTAO"); comando();
               // System.out.println("teste");
            break;

            case "APOS":  consume("APOS"); comando();
               // System.out.println("teste");

            break;

            default: basico();

        }
    }

    public void basico(){

        switch (token){

            case "FRENTE":

                cont++;

                D_Y += Integer.parseInt(tokens[cont]);
                System.out.println("Andou "+tokens[cont]+" passos para frente   --> "+D_X+","+D_Y);
                consume("FRENTE");

                break;

            case "ESQUERDA":
                cont++;

                D_X -= Integer.parseInt(tokens[cont]);
                System.out.println("Andou "+tokens[cont]+" passos para esquerda   --> "+D_X+","+D_Y);
                consume("ESQUERDA");

                break;

            case "DIREITA":
                cont++;

                D_X += Integer.parseInt(tokens[cont]);
                System.out.println("Andou "+tokens[cont]+" passos para direita   --> "+D_X+","+D_Y);
                consume("DIREITA");

                break;

            case "TRAS":
                cont++;

                D_Y -= Integer.parseInt(tokens[cont]);
                System.out.println("Andou "+tokens[cont]+" passos para trás   --> "+D_X+","+D_Y);
                consume("TRAS");

                break;

            default: break;
        }
    }
}
