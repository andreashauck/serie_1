package de.ostfalia.se.bigmacindex.entity;


import javax.persistence.*;
import java.time.LocalDate;


@NamedQuery(name = "bmi.getAll", query = "select bmi from BigMacIndex bmi")
@NamedQuery(name = "bmi.getCountrys", query = "select  distinct bmi.country_iso from BigMacIndex bmi ")
@NamedQuery(name = "bmi.country.values", query = "select distinct bmi from BigMacIndex bmi where bmi.country_iso LIKE CONCAT(:country_iso,'%') order by bmi.country_iso,bmi.tstamp DESC")

@Entity
@IdClass(BigMacIndexId.class)
public class BigMacIndex {

    @Id
    LocalDate tstamp;
    @Id
    String country_iso;


    @Column
    String currency_code;

    @Column
    String name;

    @Column
    double local_price;

    @Column
    double dollar_ex;

    @Column
    double dollar_price ;

    @Column
    double USD_raw ;

    @Column
    double EUR_raw ;

    @Column
    double GBP_raw ;

    @Column
    double JPY_raw ;

    @Column
    double CNY_raw ;

    @Column
    Double GDP_dollar ;

    @Column
    Double adj_price ;

    @Column
    Double USD_adjusted ;

    @Column
    Double EUR_adjusted ;

    @Column
    Double GBP_adjusted ;

    @Column
    Double JPY_adjusted ;

    @Column
    Double CNY_adjusted ;

    public LocalDate getTstamp() {
        return tstamp;
    }

    public void setTstamp(LocalDate tstamp) {
        this.tstamp = tstamp;
    }

    public String getCountry_iso() {
        return country_iso;
    }

    public void setCountry_iso(String country_iso) {
        this.country_iso = country_iso;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLocal_price() {
        return local_price;
    }

    public void setLocal_price(double local_price) {
        this.local_price = local_price;
    }

    public double getDollar_ex() {
        return dollar_ex;
    }

    public void setDollar_ex(double dollar_ex) {
        this.dollar_ex = dollar_ex;
    }

    public double getDollar_price() {
        return dollar_price;
    }

    public void setDollar_price(double dollar_price) {
        this.dollar_price = dollar_price;
    }

    public double getUSD_raw() {
        return USD_raw;
    }

    public void setUSD_raw(double USD_raw) {
        this.USD_raw = USD_raw;
    }

    public double getEUR_raw() {
        return EUR_raw;
    }

    public void setEUR_raw(double EUR_raw) {
        this.EUR_raw = EUR_raw;
    }

    public double getGBP_raw() {
        return GBP_raw;
    }

    public void setGBP_raw(double GBP_raw) {
        this.GBP_raw = GBP_raw;
    }

    public double getJPY_raw() {
        return JPY_raw;
    }

    public void setJPY_raw(double JPY_raw) {
        this.JPY_raw = JPY_raw;
    }

    public double getCNY_raw() {
        return CNY_raw;
    }

    public void setCNY_raw(double CNY_raw) {
        this.CNY_raw = CNY_raw;
    }

    public Double getGDP_dollar() {
        return GDP_dollar;
    }

    public void setGDP_dollar(Double GDP_dollar) {
        this.GDP_dollar = GDP_dollar;
    }

    public Double getAdj_price() {
        return adj_price;
    }

    public void setAdj_price(Double adj_price) {
        this.adj_price = adj_price;
    }

    public Double getUSD_adjusted() {
        return USD_adjusted;
    }

    public void setUSD_adjusted(Double USD_adjusted) {
        this.USD_adjusted = USD_adjusted;
    }

    public Double getEUR_adjusted() {
        return EUR_adjusted;
    }

    public void setEUR_adjusted(Double EUR_adjusted) {
        this.EUR_adjusted = EUR_adjusted;
    }

    public Double getGBP_adjusted() {
        return GBP_adjusted;
    }

    public void setGBP_adjusted(Double GBP_adjusted) {
        this.GBP_adjusted = GBP_adjusted;
    }

    public Double getJPY_adjusted() {
        return JPY_adjusted;
    }

    public void setJPY_adjusted(Double JPY_adjusted) {
        this.JPY_adjusted = JPY_adjusted;
    }

    public Double getCNY_adjusted() {
        return CNY_adjusted;
    }

    public void setCNY_adjusted(Double CNY_adjusted) {
        this.CNY_adjusted = CNY_adjusted;
    }
}
