void monthlyUpdate()
{/*ALCODESTART::1763841832015*/
updateSavings();


/*ALCODEEND*/}

void homelessRiskCheck()
{/*ALCODESTART::1764019037969*/
if (homelessnessRisk > 0.2){
	this.housingSC.receiveMessage(loseHouse);
	this.housingSC.receiveMessage(kickedOutOfRent);
}
/*ALCODEEND*/}

void evaluateMarket()
{/*ALCODESTART::1764972723677*/
if (this.housingSC.isStateActive(housingSC_state.Homeless) && !this.inMarket){
	int x = uniform_discr(0, 1);
	if (x == 1){
		this.marketStatus = "buying";
		this.budget = savings*0.5;
		this.requestedSize = uniform(800, 2500);
		this.requestedMaintenanceLevel = uniform(0,100);
		this.inMarket = true;
		get_Main().market.enterMarket.take(this);
	}
	else{
		this.marketStatus = "renting";
		this.budget = this.savings *0.1;
		this.inMarket = true;
		get_Main().market.enterMarket.take(this);
	}
}
/*ALCODEEND*/}

