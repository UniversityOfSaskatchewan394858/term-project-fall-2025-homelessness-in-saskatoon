double updateValue()
{/*ALCODESTART::1763841706916*/
void updateValue() {
    double depreciation = 0.005 * age;
    double maintenanceEffect = (maintenanceLevel - 0.5) * 0.1;

    // Bigger houses are more valuable
    double sizeEffect = sizeOfHouse / 100.0; // scales around 1.0 for average-sized homes

    currentPrice = lastPrice * (1 - depreciation + maintenanceEffect) * sizeEffect;
    taxes = currentPrice * 0.01;
}


/*ALCODEEND*/}

