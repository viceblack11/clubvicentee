package com.vicente.clubvicentee;

public class User {
    private String name;
    private String phone;
    private String document;

    public User() {
    }

    public User(Integer id, String name, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.documento= documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre ;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setName(String telefono) {
        this.telefono = telefono;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
