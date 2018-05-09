package main;

import java.time.LocalDate;
import java.time.Period;

public class TrabajadorTime {
    
    private String nome;
    private LocalDate dataAlta;
    private LocalDate dataBaixa;
    
    // Constructor

    public TrabajadorTime(String nome, LocalDate dataAlta) {
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

    public LocalDate getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(LocalDate dataAlta) {
        this.dataAlta = dataAlta;
    }

    public LocalDate getDataBaixa() {
        return dataBaixa;
    }

    public void setDataBaixa(LocalDate dataBaixa) {
        this.dataBaixa = dataBaixa;
    }
    
    public String añosTrabajados() {
        
        Period periodo= Period.between(dataAlta, dataBaixa);
        return "Hay una diferencia de " + periodo.getYears() + " años," + periodo.getMonths() + " meses," + periodo.getDays() + " días.";
    }
    
    // ToString

    @Override public String toString() {
        return "Trabajador { " + "nome: " + nome + ", dataAlta: " + dataAlta + ", dataBaixa: " + dataBaixa + " }";
    }
}
