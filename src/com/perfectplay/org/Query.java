package com.perfectplay.org;

abstract class Query {
	protected static int count = 0;
	private static String host = "http://prod.api.pvp.net";
	
	/*
	 * Generates a URL to get a summoner's mastery pages
	 */
	protected static String generateMasteryURL(long summonerId){
		return host + "/api/lol/" + JLoL.region + "/v1.1/summoner/" + summonerId+ "/masteries?api_key=" + JLoL.api_key;
	}
	
	/*
	 * Generates a URL to get a summoner's rune pages
	 */
	protected static String generateRuneURL(long summonerId){
		return host + "/api/lol/" + JLoL.region + "/v1.1/summoner/" + summonerId+ "/runes?api_key=" + JLoL.api_key;
	}
	
	/*
	 * Generates a URL to get a summoner by ID
	 */
	protected static String generateSummonerIdURL(long summonerId){
		return host + "/api/lol/" + JLoL.region + "/v1.1/summoner/" + summonerId+ "?api_key=" + JLoL.api_key;
	}
	
	/*
	 * Generates a URL to get names of summoners by ID
	 */
	protected static String generateSummonerIdsURL(long[] summonerIds){
		String temp = "";
		for(int i = 0; i < summonerIds.length; i++){
			temp += summonerIds[i] +",";
		}
		temp = temp.substring(0, temp.length() - 1);
		return host + "/api/lol/" + JLoL.region + "/v1.1/summoner/" + temp + "/name?api_key=" + JLoL.api_key;
	}
	
	/*
	 * Generates a URL to get a summoner by name
	 */
	protected static String generateSummonerNameURL(String name){
		return host + "/api/lol/" + JLoL.region + "/v1.1/summoner/by-name/" + name.replaceAll("\\s+","") + "?api_key=" + JLoL.api_key;
	}
	
	/*
	 * Generates a URL to get champions
	 */
	protected static String generateChampionURL(){
		return host + "/api/lol/" + JLoL.region + "/v1.1/champion?api_key=" + JLoL.api_key;
	}
	
	/*
	 * Generates a URL to get game info
	 */
	protected static String generateGameURL(long id){
		return host + "/api/lol/" + JLoL.region + "/v1.1/game/by-summoner/" + id + "/recent?api_key=" + JLoL.api_key;
	}
	
	/*
	 * Generates a URL to get League info
	 */
	protected static String generateLeagueURL(long id){
		return host + "/api/" + JLoL.region + "/v2.1/league/by-summoner/" + id + "?api_key=" + JLoL.api_key;
	}

	
	
}
