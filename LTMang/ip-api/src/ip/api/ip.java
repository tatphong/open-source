/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip.api;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class ip {
    @SerializedName("status")
@Expose
private String status;
@SerializedName("country")
@Expose
private String country;
@SerializedName("countryCode")
@Expose
private String countryCode;
@SerializedName("region")
@Expose
private String region;
@SerializedName("regionName")
@Expose
private String regionName;
@SerializedName("city")
@Expose
private String city;
@SerializedName("zip")
@Expose
private String zip;
@SerializedName("lat")
@Expose
private Float lat;
@SerializedName("lon")
@Expose
private Float lon;
@SerializedName("timezone")
@Expose
private String timezone;
@SerializedName("isp")
@Expose
private String isp;
@SerializedName("org")
@Expose
private String org;
@SerializedName("as")
@Expose
private String as;
@SerializedName("query")
@Expose
private String query;

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public String getCountry() {
return country;
}

public void setCountry(String country) {
this.country = country;
}

public String getCountryCode() {
return countryCode;
}

public void setCountryCode(String countryCode) {
this.countryCode = countryCode;
}

public String getRegion() {
return region;
}

public void setRegion(String region) {
this.region = region;
}

public String getRegionName() {
return regionName;
}

public void setRegionName(String regionName) {
this.regionName = regionName;
}

public String getCity() {
return city;
}

public void setCity(String city) {
this.city = city;
}

public String getZip() {
return zip;
}

public void setZip(String zip) {
this.zip = zip;
}

public Float getLat() {
return lat;
}

public void setLat(Float lat) {
this.lat = lat;
}

public Float getLon() {
return lon;
}

public void setLon(Float lon) {
this.lon = lon;
}

public String getTimezone() {
return timezone;
}

public void setTimezone(String timezone) {
this.timezone = timezone;
}

public String getIsp() {
return isp;
}

public void setIsp(String isp) {
this.isp = isp;
}

public String getOrg() {
return org;
}

public void setOrg(String org) {
this.org = org;
}

public String getAs() {
return as;
}

public void setAs(String as) {
this.as = as;
}

public String getQuery() {
return query;
}

public void setQuery(String query) {
this.query = query;
}

    @Override
    public String toString() {
        return "ip{" + "status=" + status + ", country=" + country + ", countryCode=" + countryCode + ", region=" + region + ", regionName=" + regionName + ", city=" + city + ", zip=" + zip + ", lat=" + lat + ", lon=" + lon + ", timezone=" + timezone + ", isp=" + isp + ", org=" + org + ", as=" + as + ", query=" + query + '}';
    }

}
