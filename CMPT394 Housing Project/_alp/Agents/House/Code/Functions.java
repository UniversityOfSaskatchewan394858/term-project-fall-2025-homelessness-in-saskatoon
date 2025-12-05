double updateValue()
{/*ALCODESTART::1763841706916*/
double maintenanceEffect = 0;
if (maintenanceLevel > 1){
   	maintenanceEffect = maintenanceLevel/100 * salePrice;
}
// Bigger houses are more valuable
double sizeEffect = sizeOfHouse * pricePerSquarefoot; // scales around 1.0 for average-sized homes

salePrice = sizeEffect - maintenanceEffect;
taxes = salePrice * 0.01;



/*ALCODEEND*/}

