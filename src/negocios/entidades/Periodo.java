package entidades;

import java.util.Date;

public class Periodo {
    private int idPeriodo;
    private String nome;
    private Date dataInicio;
    private Date dataConclusao;
    private int pontosNecessarios;

    public Periodo() {
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public int getPontosNecessarios() {
        return pontosNecessarios;
    }

    public void setPontosNecessarios(int pontosNecessarios) {
        this.pontosNecessarios = pontosNecessarios;
    }
}
