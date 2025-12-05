double updateSavings()
{/*ALCODESTART::1763841831997*/
double housesCost = 0;
for (House h : housesOwned){
	housesCost += h.mortgagePayment;
}
if (houseRent != null){
	housesCost += houseRent.rentPrice;
}
expenditure = otherExpenditure + housesCost;
savings += income - expenditure;
if (savings < 0) homelessnessRisk += 0.1;
else {homelessnessRisk = 0;}
/*ALCODEEND*/}

