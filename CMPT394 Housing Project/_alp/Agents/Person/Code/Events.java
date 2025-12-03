void monthlyUpdate()
{/*ALCODESTART::1763841832015*/
updateSavings();


/*ALCODEEND*/}

void homelessRiskCheck()
{/*ALCODESTART::1764019037969*/
if (homelessnessrisk > 0.2){
	this.housingSC.receiveMessage()
}
/*ALCODEEND*/}

