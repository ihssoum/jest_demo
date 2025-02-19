package gi2.ensakh.qa_jest_demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity@Data
public class AppUser  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Task> tasks;

}
