package hanumoka.example.springjwt.domain;

import lombok.*;
import org.springframework.web.context.annotation.ApplicationScope;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@ApplicationScope
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
}
