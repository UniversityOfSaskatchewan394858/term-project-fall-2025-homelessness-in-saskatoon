void evaluateMarket()
{/*ALCODESTART::1762284202594*/
houseSizes.clear();
for (House house : get_Main().market.housesForSale){
	houseSizes.add((int)house.sizeOfHouse);
}

int s = 800;

while (s<2500){
	if (!houseSizes.contains(s)){
		totalBudgetOfGroup -= s*pricePerSqft;
		houseConstruction.take(new House(pricePerSqft*1.1*0.05, pricePerSqft*1.1, s));
	}
	s+=50;
}

/*ALCODEEND*/}

