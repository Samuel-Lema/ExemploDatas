package main;

import java.sql.Time;
import java.util.Date;

public class TrabajadorDate {
    
    private String nome;
    private Date dataAlta;
    private Date dataBaixa;
    
    // Constructor

    public TrabajadorDate(String nome, Date dataAlta) {
        this.nome = nome;
        this.dataAlta = dataAlta;
    }
    
    // Metodos de Acceso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }

    public Date getDataBaixa() {
        return dataBaixa;
    }

    public void setDataBaixa(Date dataBaixa) {
        this.dataBaixa = dataBaixa;
    }
    
    public int añosTrabajados() {
        
        return (dataBaixa.getYear() + 1900) - (dataAlta.getYear() + 1900);
    }
    
    // ToString

    @Override public String toString() {
        return "Trabajador { " + "nome: " + nome + ", dataAlta: " + dataAlta + ", dataBaixa: " + dataBaixa + " }";
    }
    
    
}
