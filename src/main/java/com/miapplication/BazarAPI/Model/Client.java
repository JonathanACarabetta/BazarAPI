package com.miapplication.BazarAPI.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client {
    private Long id_client;
    private String name;
    private String lastName;
    private String dni;
    @OneToMany(mappedBy = "client")
    private List<Sell> sells;
    private boolean isDeleted;

}
