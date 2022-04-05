package guitar_inventory;

import guitar_inventory.enums.Builder;
import guitar_inventory.enums.InstrumentType;
import guitar_inventory.enums.Type;
import guitar_inventory.enums.Wood;
import guitar_inventory.instrument.Instrument;
import guitar_inventory.instrument.InstrumentSpec;
import guitar_inventory.inventory.Inventory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class InventoryAppTest {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Map properties = new HashMap();
        properties.put("builder", Builder.GIBSON);
        properties.put("backWood", Wood.MAPLE);
        InstrumentSpec clientSpec = new InstrumentSpec(properties);

        List<Instrument> matchingInstruments = inventory.search(clientSpec);
        if(!matchingInstruments.isEmpty()){
            System.out.println("You might like these instruments:");
            matchingInstruments.stream().forEach(
                    instrument -> {
                        InstrumentSpec spec = instrument.getSpec();
                        System.out.println("We have a " + spec.getProperty("instrumentType")+
                                "with the following properties:");
                        for(Iterator j = spec.getProperties().keySet().iterator(); j.hasNext(); ){
                            String propertyName = (String)j.next();
                            if(propertyName.equals("instrumentType"))
                                continue;
                            System.out.println("    " + propertyName + ": "+ spec.getProperty(propertyName));
                        }
                        System.out.println(" You can have this "+ spec.getProperty("instrumentType")+ " for $" +
                                instrument.getPrice()+ "\n---");
                    });
        }else{
            System.out.println("Sorry, we have nothing for you.");
        }

    }

    private static void initializeInventory(Inventory inventory){
        Map properties = new HashMap();
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.GIBSON);
        properties.put("model", "CJ");
        properties.put("type", Type.ACOUSTIC);
        properties.put("numStrings", 6);
        properties.put("topWood", Wood.INDIAN_ROSEWOOD);
        properties.put("backWood", Wood.MAPLE);
        inventory.addInstrument("11277", 3999.95, new InstrumentSpec(properties));

    }
}
