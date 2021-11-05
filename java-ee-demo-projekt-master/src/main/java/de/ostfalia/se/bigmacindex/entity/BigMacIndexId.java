package de.ostfalia.se.bigmacindex.entity;

import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class BigMacIndexId  implements Serializable {

    LocalDate tstamp;

    String country_iso;

    public BigMacIndexId() {
        tstamp = LocalDate.now();
        country_iso = "NULL";
    }

    public BigMacIndexId(LocalDate tstamp, String country_iso) {
        this.tstamp = tstamp;
        this.country_iso = country_iso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BigMacIndexId that = (BigMacIndexId) o;
        return country_iso == that.country_iso && Objects.equals(tstamp, that.tstamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tstamp, country_iso);
    }
}
