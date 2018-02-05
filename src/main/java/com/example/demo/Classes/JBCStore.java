package com.example.demo.Classes;

import com.example.demo.Classes.*;
import com.example.demo.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class JBCStore {



    // Identifing Variables

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String storename;

    @NotNull
    private String storeopen;

    @NotNull
    private String storeclose;

    @NotNull
    private String storemanager;

    private double cosmeticsum;

    private double cleaningsum;

    private double snacksum;

    public double getCosmeticsum() {
        return cosmeticsum;
    }

    public void setCosmeticsum(double cosmeticsum) {
        this.cosmeticsum = cosmeticsum;
    }

    public double getCleaningsum() {
        return cleaningsum;
    }

    public void setCleaningsum(double cleaningsum) {
        this.cleaningsum = cleaningsum;
    }

    public double getSnacksum() {
        return snacksum;
    }

    public void setSnacksum(double snacksum) {
        this.snacksum = snacksum;
    }

    // Identifing Getters and Setters
    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public String getStoreopen() {
        return storeopen;
    }

    public void setStoreopen(String storeopen) {
        this.storeopen = storeopen;
    }

    public String getStoreclose() {
        return storeclose;
    }

    public void setStoreclose(String storeclose) {
        this.storeclose = storeclose;
    }

    public String getStoremanager() {
        return storemanager;
    }

    public void setStoremanager(String storemanager) {
        this.storemanager = storemanager;
    }

    // Math Stuff
    private Double inventoryrevenue;
}
