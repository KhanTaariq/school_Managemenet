package za.ac.cput.factory;
import za.ac.cput.domain.City;
import za.ac.cput.helper.Helper;

public class CityFactory {

    public static City createCity(String cityID, String cityName,String countryId, String countryName){



        za.ac.cput.helper.Helper.checkStringPara("cityID", cityID);
        Helper.checkStringPara("cityName", cityName);
        Country country=CountryFactory.createCountry(countryId,countryName);
        return  new City.Builder().setId(cityID).setName(cityName).setCountry(country).build();


    }
}

