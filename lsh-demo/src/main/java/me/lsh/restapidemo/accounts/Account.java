package me.lsh.restapidemo.accounts;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter @Setter @EqualsAndHashCode(of="id")
@Builder @NoArgsConstructor @AllArgsConstructor
public class Account {

    @Id @GeneratedValue
    private Integer id;
    private String email;
    private String password;
    @ElementCollection(fetch=FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<AccountRole> roles;
}
