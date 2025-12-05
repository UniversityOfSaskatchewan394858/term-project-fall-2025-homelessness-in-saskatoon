void evaluateMarket()
{/*ALCODESTART::1762284202594*/
for (House house : get_Main().market.housesForSale){
	if (totalBudgetOfGroup > house.sizeOfHouse*pricePerSqft){
		
		totalBudgetOfGroup -= house.sizeOfHouse*pricePerSqft;
		houseConstruction.take(new House(1500,
		pricePerSqft * 1.1 * 0.05, 
		pricePerSqft * 1.1));
	}
}
/*ALCODEEND*/}

