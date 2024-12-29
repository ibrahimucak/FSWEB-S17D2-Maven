package com.workintech.s17d2.dto;

import com.workintech.s17d2.model.Developer;

/* bunu ayrı tutmamızın sebebi yeni bir obje oluşturalım ki ayrıca bir message
    veya status isterse orda kafamız karışmasın o objede dönemez cunku ve fazladan data döndürürsün yani sen 1 sayısını istiyosun
    diye controllerde döndürürsen 50 tane data önüne gelir banka için bir problem bu.
    hem de burdan controllere import ettin kafan rahat etti.
    */
public class DeveloperResponse {
private Developer developer;
private int status;
private String message;

    public DeveloperResponse(Developer developer, int status, String message) {
        this.developer = developer;
        this.status = status;
        this.message = message;
    }


    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
