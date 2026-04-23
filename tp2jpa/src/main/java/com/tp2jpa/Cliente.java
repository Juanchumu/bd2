package com.tp2jpa;

import javax.persistence.*;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

    @Id
    private int id;
	@Column(name = "DSCR")
    private String descr;

    public Cliente() {}

    public Cliente(int id, String descr) {
        this.id = id;
        this.descr = descr;
    }

    public int getId() { return id; }
    public String getDescr() { return descr; }
}
