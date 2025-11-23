void evaluateMarket()
{/*ALCODESTART::1762284202594*/
for (House house : get_Main().market.housesForSale){
	if (house.sizeOfHouse*pricePerSqft < house.sizeOfHouse*get_Main().market.salePricePerMaintenanceSize
	 && totalBudgetOfGroup > house.sizeOfHouse*pricePerSqft){
		
		totalBudgetOfGroup -= house.sizeOfHouse*pricePerSqft;
		houseConstruction.take(new House(0.0, house.sizeOfHouse,
		house.sizeOfHouse*get_Main().market.salePricePerMaintenanceSize, 
		house.sizeOfHouse*get_Main().market.salePricePerMaintenanceSize*0.1));
	}
}
/*ALCODEEND*/}

