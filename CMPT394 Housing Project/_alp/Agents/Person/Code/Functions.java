double updateSavings()
{/*ALCODESTART::1763841831997*/
savings += income - expenditure;
if (savings < 0) homelessnessRisk += 0.1;
else {homelessnessrisk = 0;}
//savings += income - (income * spendRate) - housingCost;
/*ALCODEEND*/}

