package de.challenge.tshirt.WebApp.dto;

public class ClientDto {
    String clientId;
    String firstName;
    String lastName;
    String myAddress;
    String myEmail;
    String size;
    String color;

    public ClientDto(String clientId, String firstName, String lastName, String myAddress, String myEmail, String size, String color) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.myAddress = myAddress;
        this.myEmail = myEmail;
        this.size = size;
        this.color = color;
    }


}
