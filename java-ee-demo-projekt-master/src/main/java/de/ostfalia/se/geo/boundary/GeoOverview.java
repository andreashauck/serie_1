package de.ostfalia.se.geo.boundary;

import de.ostfalia.se.geo.control.CityService;
import de.ostfalia.se.geo.control.CountryService;
import de.ostfalia.se.geo.entity.City;
import de.ostfalia.se.geo.entity.Country;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class GeoOverview {

    @Inject
    private CountryService cos;

    @Inject
    private CityService cis;

    public List<Country> getCountries() {
        return cos.getAll();
    }

    public List<City> getCitys() {
        return cis.getAll();
    }

}
