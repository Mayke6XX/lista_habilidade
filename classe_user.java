
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Usuario {


    private String nome;
    private String ranking;
    private int classe;
}
