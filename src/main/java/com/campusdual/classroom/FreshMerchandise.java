package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expirationDate; // propiedad de fecha de caducidad

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf,
                            int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }


    public Date getExpirationDate() {
        return expirationDate;
    }


    public String getFormattedDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);
    }


    @Override
    public String getSpecificData() {
        StringBuilder builder = new StringBuilder();

        builder.append("Localización: ").append(getLocation()).append("\n");
        builder.append("Caducidad: ").append(getFormattedDate(expirationDate));

        return builder.toString();
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }
}
