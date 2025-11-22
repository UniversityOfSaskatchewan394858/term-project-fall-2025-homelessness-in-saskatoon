double updateSavings()
{/*ALCODESTART::1763841831997*/
savings += income - (income * spendRate) - housingCost;
if (savings < 0) homelessnessRisk += 0.1;

/*ALCODEEND*/}

