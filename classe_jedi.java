package br.com.sample.domain.orm;
 
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
 
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
 
    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
    private String status;
    private Integer ranking;
}