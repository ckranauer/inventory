package com.ckranauer.inventory.enums;

public enum Wood {

    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

    public String toString(){
        switch(this){
            case INDIAN_ROSEWOOD: return "Indian rosewood";
            case BRAZILIAN_ROSEWOOD: return "Brazilian rosewood";
            case MAHOGANY: return "Mahogany";
            case MAPLE: return "Maple";
            case COCOBOLO: return "Cocobolo";
            case CEDAR: return "Cedar";
            case ADIRONDACK: return "Adirondack";
            case ALDER: return "Alder";
            case SITKA: return "Sitka";
            default:  return "Unspecified";
        }
    }
}
