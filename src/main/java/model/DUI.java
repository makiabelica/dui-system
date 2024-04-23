package model;

import javax.persistence.*;

@Entity
@Table(name = "dui")
public class DUI {
    public int getIdDui() {
        return idDui;
    }

    public void setIdDui(int idDui) {
        this.idDui = idDui;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idDui")
    private int idDui;
    //relacion bidireccionar y que se puede acceder a User
    @OneToOne(mappedBy = "dui")
    private User user;
}
