package com.bankapplication.model;

import com.fasterxml.jackson.annotation.JsonValue;


public enum AccountTypeEnum {
    Chequing("Chequing"), Savings("Savings"), Business("Business");

    private String type;

    AccountTypeEnum(String type){
        this.type=type;
    }

    @JsonValue
    public String getType() {
        return type;
    }

}
