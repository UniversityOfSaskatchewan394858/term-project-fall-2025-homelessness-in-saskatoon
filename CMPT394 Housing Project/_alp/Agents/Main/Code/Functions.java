double dataGather()
{/*ALCODESTART::1764801568385*/
housesOwned = 0;
housesRented = 0;
homeless = 0;
owned = 0;
renting = 0;
externalServices = 0;
for (Person p : personPopulation){
	housesOwned += p.housesOwned.size();
	if (p.houseRent != null){
		housesRented += 1;
	}
	if(p.housingSC == housingSC_state.Homeless){
		homeless += 1;
	}
	else if(p.housingSC == housingSC_state.Renting){
		renting += 1;
	}
	
	else if(p.housingSC == housingSC_state.Owning){
		owned += 1;
	}
	
	else if(p.housingSC == housingSC_state.ExternalSupport){
		externalServices += 1;
	}
}
/*ALCODEEND*/}

