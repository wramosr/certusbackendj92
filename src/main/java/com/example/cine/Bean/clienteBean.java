package com.example.cine.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="registrowilson")
public class clienteBean {

    @Id
    @GeneratedValue

   private Integer idregistrowilson;
   private String nombregistrowilson;
    private String apepatregistrowilson;
    private String apematregistrowilson;
    private String correoregistrowilson;
    private String paswregistrowilson;
    private String dniregistrowilson;
    private Date fechnacregistrowilson;
    private String celregistrowilson;
    private String depregistrowilson;
    private String provregistrowilson;
    private String disregistrowilson;
    private String estadoregistrowilson;

    public Integer getIdregistrowilson() {
        return idregistrowilson;
    }

    public void setIdregistrowilson(Integer idregistrowilson) {
        this.idregistrowilson = idregistrowilson;
    }

    public String getNombregistrowilson() {
        return nombregistrowilson;
    }

    public void setNombregistrowilson(String nombregistrowilson) {
        this.nombregistrowilson = nombregistrowilson;
    }

    public String getApepatregistrowilson() {
        return apepatregistrowilson;
    }

    public void setApepatregistrowilson(String apepatregistrowilson) {
        this.apepatregistrowilson = apepatregistrowilson;
    }

    public String getApematregistrowilson() {
        return apematregistrowilson;
    }

    public void setApematregistrowilson(String apematregistrowilson) {
        this.apematregistrowilson = apematregistrowilson;
    }

    public String getCorreoregistrowilson() {
        return correoregistrowilson;
    }

    public void setCorreoregistrowilson(String correoregistrowilson) {
        this.correoregistrowilson = correoregistrowilson;
    }

    public String getPaswregistrowilson() {
        return paswregistrowilson;
    }

    public void setPaswregistrowilson(String paswregistrowilson) {
        this.paswregistrowilson = paswregistrowilson;
    }

    public String getDniregistrowilson() {
        return dniregistrowilson;
    }

    public void setDniregistrowilson(String dniregistrowilson) {
        this.dniregistrowilson = dniregistrowilson;
    }

    public Date getFechnacregistrowilson() {
        return fechnacregistrowilson;
    }

    public void setFechnacregistrowilson(Date fechnacregistrowilson) {
        this.fechnacregistrowilson = fechnacregistrowilson;
    }

    public String getCelregistrowilson() {
        return celregistrowilson;
    }

    public void setCelregistrowilson(String celregistrowilson) {
        this.celregistrowilson = celregistrowilson;
    }

    public String getDepregistrowilson() {
        return depregistrowilson;
    }

    public void setDepregistrowilson(String depregistrowilson) {
        this.depregistrowilson = depregistrowilson;
    }

    public String getProvregistrowilson() {
        return provregistrowilson;
    }

    public void setProvregistrowilson(String provregistrowilson) {
        this.provregistrowilson = provregistrowilson;
    }

    public String getDisregistrowilson() {
        return disregistrowilson;
    }

    public void setDisregistrowilson(String disregistrowilson) {
        this.disregistrowilson = disregistrowilson;
    }

    public String getEstadoregistrowilson() {
        return estadoregistrowilson;
    }

    public void setEstadoregistrowilson(String estadoregistrowilson) {
        this.estadoregistrowilson = estadoregistrowilson;
    }
}
