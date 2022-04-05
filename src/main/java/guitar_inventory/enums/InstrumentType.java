package guitar_inventory.enums;

public enum InstrumentType {

    GUITAR, MANDOLIN, BANJO, DOBRO, FIDDLE, BASS;

   public String toString(){
       switch(this){
           case GUITAR: return "Guitar";
           case BANJO: return "Banjo";
           case DOBRO: return "Dobro";
           case FIDDLE: return "Fiddle";
           case BASS: return "Bass";
           case MANDOLIN: return "Mandolin";
           default:     return "Unspecified";
       }
   }
}
