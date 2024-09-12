package com.orion.bird.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR (50)", nullable = false)
    private String name;

    @Column(columnDefinition = "VARCHAR (50)", nullable = false)
    private String passWord;

    public Users(String name, String passWord) {
        this.name = name;
        this.passWord = passWord;
    }
}
