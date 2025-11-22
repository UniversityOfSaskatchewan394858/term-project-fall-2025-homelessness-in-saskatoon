void AgingOfHouse()
{/*ALCODESTART::1763841706934*/
age += 1.0/12;          // age increases monthly
maintenanceLevel -= 0.01; // degrade condition slowly
if (maintenanceLevel < 0.3) maintenanceLevel = 0.3;
updateValue();           // update price and taxes


/*ALCODEEND*/}

