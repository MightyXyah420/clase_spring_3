package com.example1.demo1.dto;

import com.example1.demo1.model.Nota;

public class NotaDto {
    private String titulo;
    private String contenido;
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }
    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public Nota getNota(){
        Nota n = new Nota();
        n.setTitulo(this.titulo);
        n.setContenido(this.contenido);
        return n;
    }
}
