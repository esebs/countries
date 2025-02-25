package net.gbm.countries.infrastructure.outbound.example;

import jakarta.enterprise.context.RequestScoped;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import net.gbm.countries.application.interfaces.outbound.GetData;
import java.util.HashMap;
import java.util.Map;


@RequestScoped
@Slf4j
public class GetDataImpl implements GetData {
private static final Map<String, String> codeToCountry = new HashMap<>();
    private static final Map<String, String> countryToCode = new HashMap<>();

    static {
        codeToCountry.put("AF", "Afghanistan");
        codeToCountry.put("AL", "Albania");
        codeToCountry.put("DZ", "Algeria");
        codeToCountry.put("AS", "American Samoa");
        codeToCountry.put("AD", "Andorra");
        codeToCountry.put("AO", "Angola");
        codeToCountry.put("AG", "Antigua and Barbuda");
        codeToCountry.put("AR", "Argentina");
        codeToCountry.put("AM", "Armenia");
        codeToCountry.put("AU", "Australia");
        codeToCountry.put("AT", "Austria");
        codeToCountry.put("AZ", "Azerbaijan");
        codeToCountry.put("BS", "Bahamas");
        codeToCountry.put("BH", "Bahrain");
        codeToCountry.put("BD", "Bangladesh");
        codeToCountry.put("BB", "Barbados");
        codeToCountry.put("BY", "Belarus");
        codeToCountry.put("BE", "Belgium");
        codeToCountry.put("BZ", "Belize");
        codeToCountry.put("BJ", "Benin");
        codeToCountry.put("BT", "Bhutan");
        codeToCountry.put("BO", "Bolivia");
        codeToCountry.put("BA", "Bosnia and Herzegovina");
        codeToCountry.put("BW", "Botswana");
        codeToCountry.put("BR", "Brazil");
        codeToCountry.put("BN", "Brunei");
        codeToCountry.put("BG", "Bulgaria");
        codeToCountry.put("BF", "Burkina Faso");
        codeToCountry.put("BI", "Burundi");
        codeToCountry.put("KH", "Cambodia");
        codeToCountry.put("CM", "Cameroon");
        codeToCountry.put("CA", "Canada");
        codeToCountry.put("CV", "Cape Verde");
        codeToCountry.put("CF", "Central African Republic");
        codeToCountry.put("TD", "Chad");
        codeToCountry.put("CL", "Chile");
        codeToCountry.put("CN", "China");
        codeToCountry.put("CO", "Colombia");
        codeToCountry.put("KM", "Comoros");
        codeToCountry.put("CG", "Congo - Brazzaville");
        codeToCountry.put("CD", "Congo - Kinshasa");
        codeToCountry.put("CR", "Costa Rica");
        codeToCountry.put("HR", "Croatia");
        codeToCountry.put("CU", "Cuba");
        codeToCountry.put("CY", "Cyprus");
        codeToCountry.put("CZ", "Czech Republic");
        codeToCountry.put("DK", "Denmark");
        codeToCountry.put("DJ", "Djibouti");
        codeToCountry.put("DM", "Dominica");
        codeToCountry.put("DO", "Dominican Republic");
        codeToCountry.put("EC", "Ecuador");
        codeToCountry.put("EG", "Egypt");
        codeToCountry.put("SV", "El Salvador");
        codeToCountry.put("GQ", "Equatorial Guinea");
        codeToCountry.put("ER", "Eritrea");
        codeToCountry.put("EE", "Estonia");
        codeToCountry.put("ET", "Ethiopia");
        codeToCountry.put("FJ", "Fiji");
        codeToCountry.put("FI", "Finland");
        codeToCountry.put("FR", "France");
        codeToCountry.put("GA", "Gabon");
        codeToCountry.put("GM", "Gambia");
        codeToCountry.put("GE", "Georgia");
        codeToCountry.put("DE", "Germany");
        codeToCountry.put("GH", "Ghana");
        codeToCountry.put("GR", "Greece");
        codeToCountry.put("GT", "Guatemala");
        codeToCountry.put("GN", "Guinea");
        codeToCountry.put("GY", "Guyana");
        codeToCountry.put("HT", "Haiti");
        codeToCountry.put("HN", "Honduras");
        codeToCountry.put("HU", "Hungary");
        codeToCountry.put("IS", "Iceland");
        codeToCountry.put("IN", "India");
        
        for (Map.Entry<String, String> entry : codeToCountry.entrySet()) {
            countryToCode.put(entry.getValue(), entry.getKey());
        }
    }

    public String getCountryFromCode(String code) {
        return codeToCountry.getOrDefault(code.toUpperCase(), "Unknown Country");
    }

    public static String getCodeFromCountry(String country) {
        return countryToCode.getOrDefault(country, "Unknown Code");
    }
}
