package com.jandag.batchprocessingdemo.util;

public class Constants {

    public Constants () {
        // Intentionally left blank
    }

    public static final String DELIMITER_COMMA = ",";
    public static final String CUSTOMER_HEADER_FIELDS = "id,firstName,lastName,email,gender,contactNo,country,dob";
    public static final String CUSTOMER_CSV_LOCATION = "src/main/resources/customers.csv";
    public static final String CUSTOMER_ITEM_READER = "customerCSVReader";
}
