package de.ostfalia.se.bigmacindex.boundary;


import de.ostfalia.se.bigmacindex.control.BigMacService;
import de.ostfalia.se.bigmacindex.entity.BigMacIndex;
import de.ostfalia.se.geo.entity.Country;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class BigMacOverview {

    @Inject
    BigMacService bms;

    String search;


    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public List<BigMacIndex> getBmis() {
        return bms.getAll();
    }

    public List<String> getCountrys(){
        return bms.getCountrys();

    }

    public List<BigMacIndex> getCountryValues(String country_iso){
        return bms.getCountryValues(country_iso);
    }
}
