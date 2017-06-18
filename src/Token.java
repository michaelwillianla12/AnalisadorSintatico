import java.util.ArrayList;

/**
 * Created by Michael M on 30/05/2017.
 */
public class Token {

    Semantic s;

    private String comandos[] = {"FRENTE","10","ENTAO","ESQUERDA",
            "20","DIREITA","30","APOS","ESQUERDA","20","FRENTE",
            "70","DIREITA","100","TRAS","20"};

    public void getToken() {

            s = new Semantic(comandos);

    }
}
