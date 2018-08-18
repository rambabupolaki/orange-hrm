package selenium.framework.services;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import lm.rcx.pojo.EnumPojo;
import lm.rcx.pojo.LocationPojo;
import lm.rcx.pojo.MemberPojo;
import lm.rcx.pojo.Products_Pojo;
import lm.rcx.pojo.ProgramsPojo;
import lm.rcx.pojo.PursePoliciesPojo;
import lm.rcx.pojo.ReferenceDataDMApojo;
import lm.rcx.pojo.ReferenceData_Segments_Pojo;
import lm.rcx.pojo.RewardPolicyPojo;
import lm.rcx.pojo.Rules_Pojo;
import lm.rcx.pojo.TierPoliciesPojo;
import lm.rcx.pojo.UsersPojo;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class RcxApiMethods extends WebServiceAgent {
	static String token;
	static ProgramsPojo programsPojo;
	static MemberPojo memberPojo;
	static Products_Pojo productsPojo;
	static RewardPolicyPojo rewardPojo;
	
	public RcxApiMethods() throws IOException {
		super();
	}

	@SuppressWarnings("unchecked")
	private String login() throws Exception{
		JSONObject json = new JSONObject();
		json.put("username", CONFIG.getProperty("username"));
		json.put("password", CONFIG.getProperty("password"));
		String uri = "/api/v1/login";
		HttpResponse response =  sendPost(uri, null, json);
		JSONObject obj = (JSONObject) new JSONParser().parse(EntityUtils.toString(response.getEntity(), "UTF-8"));
		return obj.get("token").toString();
	}
	
	@SuppressWarnings("unchecked")
	public ProgramsPojo runcreateProgram(ProgramsPojo program) throws Exception{
		token = login();
		JSONObject json = new JSONObject();
		json.put("desc", program.getDescription());
		json.put("name", program.getProgramName());
		String uri = "/api/v1/programs";
		HttpResponse response =  sendPost(uri, token, json);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("Status Code :"+statusCode);
		if(statusCode==201){
			System.out.println("Passed: Program created successfully");
			reportInfo("Create program Web Service Ran Successfully.");
		}else
			System.out.println("Failed: Program Creation Failed");
		Map<String,Object> programData = new HashMap<String, Object>();
		JSONObject obj = (JSONObject) new JSONParser().parse(EntityUtils.toString(response.getEntity(), "UTF-8"));
		/*Set<String> keySet =obj.keySet(); 
		 for (String key : keySet) { 
			 Object value =obj.get(key); 
			 programData.put(key.toString(), value);
			 System.out.printf("%s=%s (%s)\n", key,value, value.getClass() .getSimpleName()); 
			 }*/
		program.setProgramId(obj.get("_id").toString());
		return program;
	}
	
	@SuppressWarnings("unchecked")
	public MemberPojo runCreateMemberWebService(MemberPojo memberPojo) throws Exception {
		token = login();
		JSONObject json = new JSONObject();
		json.put("program", memberPojo.getProgram());
		json.put("enrollDate", memberPojo.getEnrollDate());
		json.put("enrollChannel", memberPojo.getEnrollChannel());
		json.put("enrollSource", memberPojo.getEnrollSource());
		json.put("dob", memberPojo.getDateOfBirth());
		json.put("type", memberPojo.getMemberType());
		json.put("firstName", memberPojo.getFirstName());
		json.put("lastName", memberPojo.getLastName());
		json.put("acquisitionDate", memberPojo.getAcquisitionDate());
		json.put("acquisitionChannel", memberPojo.getAcquisitionChannel());
		json.put("address", memberPojo.getAddress());
		json.put("city", memberPojo.getCity());
		json.put("state", memberPojo.getState());
		json.put("country", memberPojo.getCountry());
		json.put("email", memberPojo.getEmail());
		json.put("cellPhone", memberPojo.getPhoneNumber());
		json.put("zipCode", memberPojo.getZipCode());
		String uri = "/api/v1/members";
		HttpResponse response =  sendPost(uri, token, json);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("Status Code :"+statusCode);
		if(statusCode==201){
			System.out.println("Passed: Member created successfully");
			reportInfo("Member Creation Web Service Ran Successfully.");
		}else
			System.out.println("Failed: Member Creation Failed");
				
		JSONObject obj = (JSONObject) new JSONParser().parse(EntityUtils.toString(response.getEntity(), "UTF-8"));
		/*Map<String,Object> memberDetails = new HashMap<String, Object>();
		Set<String> keySet =obj.keySet(); 
		 for (String key : keySet) { 
			 Object value =obj.get(key); 
			 memberDetails.put(key.toString(), value);
			 System.out.printf("%s=%s (%s)\n", key,value, value.getClass() .getSimpleName()); 
			 }*/
		 memberPojo.setMemberId(obj.get("_id").toString());
		 memberPojo.setCreatedAt(obj.get("createdAt").toString());
		return memberPojo;
	}
	
	
	@SuppressWarnings("unchecked")
	public boolean rungetAllPrograms() throws Exception{
		token = login();
		String uri = "/api/v1/programs";
		HttpResponse response =  sendGet(uri, token);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("Status Code :"+statusCode);
		if(statusCode==200){
			System.out.println("Passed: All programs are retrieved successfully");
			reportInfo("Get all Programs Web Service Ran Successfully.");
		}else
			System.out.println("Failed: All programs are not retrieved");
		JSONArray obj = (JSONArray) new JSONParser().parse(EntityUtils.toString(response.getEntity(), "UTF-8"));
		for(int i=0;i<obj.size();i++){
            System.out.println("array is " + obj.get(i).toString());
        }
		 if(obj.size()>0)
			 return true;
		 return false;	 
	}
	
	public ReferenceDataDMApojo runcreateDMAWebService(ReferenceDataDMApojo dmaPojo) throws Exception{
		token = login();
		JSONObject json = new JSONObject();
		json.put("desc", dmaPojo.getDMADescription());
		json.put("name", dmaPojo.getDMAName());
		String uri = "/api/v1/dmas";
		HttpResponse response =  sendPost(uri, token, json);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("Status Code :"+statusCode);
		if(statusCode==201){
			System.out.println("Passed: DMA created successfully");
			reportInfo("Create DMA Web Service Ran Successfully.");
		}else
			System.out.println("Failed: DMA Creation Failed");
		Map<String,Object> dmaData = new HashMap<String, Object>();
		JSONObject obj = (JSONObject) new JSONParser().parse(EntityUtils.toString(response.getEntity(), "UTF-8"));
		/*Set<String> keySet =obj.keySet(); 
		 for (String key : keySet) { 
			 Object value =obj.get(key); 
			 dmaData.put(key.toString(), value);
			 System.out.printf("%s=%s (%s)\n", key,value, value.getClass() .getSimpleName()); 
			 }*/
		dmaPojo.setDMAId(obj.get("_id").toString());
		return dmaPojo;
	}
	@SuppressWarnings("unchecked")
	public LocationPojo runcreateLocationWebService(LocationPojo locationPojo) throws Exception{
		token = login();
		JSONObject json = new JSONObject();
		json.put("zipCode", locationPojo.getzipCode());
		json.put("state", locationPojo.getstate());
		json.put("desc", locationPojo.getdescription());
		json.put("name", locationPojo.getName());
		json.put("country", locationPojo.getcountry());
		json.put("timeZone", locationPojo.getTimeZone());
		json.put("city", locationPojo.getcity());
		json.put("number", locationPojo.getNumber());
		String uri = "/api/v1/locations/";
		HttpResponse response =  sendPost(uri, token, json);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("Status Code :"+statusCode);
		if(statusCode==201){
			System.out.println("Passed: Location created successfully");
			reportInfo("Create/Add location Web Service Ran Successfully.");
		}else
			System.out.println("Failed: Location Creation Failed");
		JSONObject obj = (JSONObject) new JSONParser().parse(EntityUtils.toString(response.getEntity(), "UTF-8"));
		/*Map<String,Object> locationData = new HashMap<String, Object>();
		Set<String> keySet =obj.keySet(); 
		 for (String key : keySet) { 
			 Object value =obj.get(key); 
			 locationData.put(key.toString(), value);
			 System.out.printf("%s=%s (%s)\n", key,value, value.getClass() .getSimpleName()); 
			 }*/
		 locationPojo.setLocationId(obj.get("_id").toString());
		return locationPojo;
	}
	
	@SuppressWarnings("unchecked")
	public ReferenceData_Segments_Pojo runcreateSegmentWebService(ReferenceData_Segments_Pojo segmentPojo) throws Exception{
		token = login();
		JSONObject json = new JSONObject();
		json.put("desc", segmentPojo.getDescription());
		json.put("name", segmentPojo.getSegmentName());
		String uri = "/api/v1/segments/";
		HttpResponse response =  sendPost(uri, token, json);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("Status Code :"+statusCode);
		if(statusCode==201){
			System.out.println("Passed: Segment created successfully");
			reportInfo("Create/Add Segment Web Service Ran Successfully.");
		}else
			System.out.println("Failed: Segment Creation Failed");
		JSONObject obj = (JSONObject) new JSONParser().parse(EntityUtils.toString(response.getEntity(), "UTF-8"));
		/*Map<String,Object> locationData = new HashMap<String, Object>();
		Set<String> keySet =obj.keySet(); 
		 for (String key : keySet) { 
			 Object value =obj.get(key); 
			 locationData.put(key.toString(), value);
			 System.out.printf("%s=%s (%s)\n", key,value, value.getClass() .getSimpleName()); 
			 }*/
		segmentPojo.setSegmentId(obj.get("_id").toString());
		return segmentPojo;
	}
	@SuppressWarnings("unchecked")
	public EnumPojo runcreateEnumWebService(EnumPojo enumPojo) throws Exception {
		token = login();
		JSONObject json = new JSONObject();
	
		json.put("type", enumPojo.getType());
		json.put("value", enumPojo.getValue());
		json.put("label", enumPojo.getLabel());
		json.put("lang", "en");
		json.put("displayType", "user");
	
		String uri = "/api/v1/enums/";
		HttpResponse response =  sendPost(uri, token, json);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("Status Code :"+statusCode);
		if(statusCode==201){
			System.out.println("Passed: Enum created successfully");
			reportInfo("Create/Add Enum Web Service Ran Successfully.");
		}else
			System.out.println("Failed: Enum Creation Failed");
				
		JSONObject obj = (JSONObject) new JSONParser().parse(EntityUtils.toString(response.getEntity(), "UTF-8"));
		/*Map<String,Object> memberDetails = new HashMap<String, Object>();
		Set<String> keySet =obj.keySet(); 
		 for (String key : keySet) { 
			 Object value =obj.get(key); 
			 memberDetails.put(key.toString(), value);
			 System.out.printf("%s=%s (%s)\n", key,value, value.getClass() .getSimpleName()); 
			 }*/
		return enumPojo;
	}
	@SuppressWarnings("unchecked")
	public TierPoliciesPojo runcreateTierPolicyWebService(TierPoliciesPojo tierPojo) throws Exception {
		token = login();
		
		JSONObject levelJson = new JSONObject();
		levelJson.put("name", tierPojo.getLevelName());
		
		JSONObject json = new JSONObject();
		json.put("levels", levelJson);
		json.put("program", tierPojo.getProgramId());
		json.put("name", tierPojo.getName());
		
		String uri = "/api/v1/tierpolicies/";
		HttpResponse response =  sendPost(uri, token, json);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("Status Code :"+statusCode);
		if(statusCode==201){
			System.out.println("Passed: Tier policy created successfully");
			reportInfo("Create/Add Tier policy Web Service Ran Successfully.");
		}else
			System.out.println("Failed: Tier policy Creation Failed");
		JSONObject obj = (JSONObject) new JSONParser().parse(EntityUtils.toString(response.getEntity(), "UTF-8"));
		/*Map<String,Object> memberDetails = new HashMap<String, Object>();
		Set<String> keySet =obj.keySet(); 
		 for (String key : keySet) { 
			 Object value =obj.get(key); 
			 memberDetails.put(key.toString(), value);
			 System.out.printf("%s=%s (%s)\n", key,value, value.getClass() .getSimpleName()); 
			 }*/
		return tierPojo;
	}
	@SuppressWarnings("unchecked")
	public PursePoliciesPojo runcreatePursePolicyWebService(PursePoliciesPojo pursePoliciesPojo) throws Exception {
		token = login();
		
		JSONObject json = new JSONObject();
		json.put("desc", pursePoliciesPojo.getdescription());
		json.put("program", pursePoliciesPojo.getProgramId());
		json.put("name", pursePoliciesPojo.getName());
		
		String uri = "/api/v1/pursepolicies/";
		HttpResponse response =  sendPost(uri, token, json);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("Status Code :"+statusCode);
		if(statusCode==201){
			System.out.println("Passed: Purse policy created successfully");
			reportInfo("Create/Add Purse policy Web Service Ran Successfully.");
		}else
			System.out.println("Failed: Purse policy Creation Failed");
		JSONObject obj = (JSONObject) new JSONParser().parse(EntityUtils.toString(response.getEntity(), "UTF-8"));
		/*Map<String,Object> memberDetails = new HashMap<String, Object>();
		Set<String> keySet =obj.keySet(); 
		 for (String key : keySet) { 
			 Object value =obj.get(key); 
			 memberDetails.put(key.toString(), value);
			 System.out.printf("%s=%s (%s)\n", key,value, value.getClass() .getSimpleName()); 
			 }*/
		return pursePoliciesPojo;
	}
	@SuppressWarnings("unchecked")
	public String rungetAllOrgs() throws Exception{
		
		token = login();
		String uri = "/api/v1/orgs/";
		HttpResponse response =  sendGet(uri, token);
		int statusCode = response.getStatusLine().getStatusCode();
		if(statusCode==200)
			System.out.println();
		else
			System.out.println();
		//System.out.println("Status Code :"+statusCode);
		JSONArray obj = (JSONArray) new JSONParser().parse(EntityUtils.toString(response.getEntity(), "UTF-8"));
		System.out.println(obj);
		JSONObject jobj = new JSONObject();
		for (int i = 0; i<obj.size(); i++) {
		    Object json = obj.get(i);
		    jobj = (JSONObject) json;
		   // System.out.println("in for loop"+jobj.get("_id").toString());
		   
		}
		return jobj.get("_id").toString().trim();
	

	}
	@SuppressWarnings("unchecked")
	public UsersPojo runcreateUsersWebService(UsersPojo usersPojo)
			throws Exception {
		token = login();
		JSONObject json = new JSONObject();
		json.put("org", usersPojo.getOrgId());
		json.put("login", usersPojo.getName());
		json.put("email", usersPojo.getEmail());
		json.put("blocked", usersPojo.getBlocked());
		json.put("tokenExpirationTime", usersPojo.getTokenExpiresInMinute());
		
		String uri = "/api/v1/users/";
		HttpResponse response = sendPost(uri, token, json);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("Status Code :" + statusCode);
		if (statusCode == 201){
			System.out.println("PASSED: User created successfully");
			reportInfo("Create/Add User Web Service Ran Successfully.");
	}else
			System.out.println("FAILED: User Creation Failed");

		JSONObject obj = (JSONObject) new JSONParser().parse(EntityUtils
				.toString(response.getEntity(), "UTF-8"));
		/*
		 * Map<String,Object> memberDetails = new HashMap<String, Object>();
		 * Set<String> keySet =obj.keySet(); for (String key : keySet) { Object
		 * value =obj.get(key); memberDetails.put(key.toString(), value);
		 * System.out.printf("%s=%s (%s)\n", key,value, value.getClass()
		 * .getSimpleName()); }
		 */
		usersPojo.setUserId(obj.get("_id").toString());
		return usersPojo;
	}
	@SuppressWarnings("unchecked")
	public Rules_Pojo runCreateAddRulesWebService(Rules_Pojo rulesPojo)
			throws Exception {
		token = login();
		JSONObject json = new JSONObject();
		json.put("name", rulesPojo.getRuleName());
		json.put("desc", rulesPojo.getDescription());
		json.put("program", rulesPojo.getProgramId());
		json.put("effectiveFrom", rulesPojo.getEffectiveFrom());
		json.put("org", rulesPojo.getOrgId());
		
		String uri = "/api/v1/rules/";
		HttpResponse response = sendPost(uri, token, json);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("Status Code :" + statusCode);
		if (statusCode == 201){
			System.out.println("PASSED: Rule created successfully");
			reportInfo("Create/Add Rule Web Service Ran Successfully.");
	}else
			System.out.println("FAILED: Rule Creation Failed");

		JSONObject obj = (JSONObject) new JSONParser().parse(EntityUtils.toString(response.getEntity(), "UTF-8"));
		 Map<String,Object> memberDetails = new HashMap<String, Object>();
		 Set<String> keySet =obj.keySet(); 
		 for (String key : keySet) { 
			 Object value =obj.get(key); memberDetails.put(key.toString(), value);
			 System.out.printf("%s=%s (%s)\n", key,value, value.getClass().getSimpleName()); }
		 
		return rulesPojo;
	}
	
	@SuppressWarnings("unchecked")
	public Products_Pojo runcreateProductsWebService(Products_Pojo productsPojo)
			throws Exception {
		token = login();
		JSONObject json = new JSONObject();
		json.put("name", productsPojo.getName());
		json.put("sku", productsPojo.getskuname());
		json.put("org", new RcxApiMethods().rungetAllOrgs());

		String uri = "/api/v1/products/";
		HttpResponse response = sendPost(uri, token, json);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("Status Code :" + statusCode);
		if (statusCode == 201){
			System.out.println("PASSED: Products created successfully");
		reportInfo("Create/Add Products Web Service Ran Successfully.");
}else
		System.out.println("FAILED: Products Creation Failed");
		JSONObject obj = (JSONObject) new JSONParser().parse(EntityUtils
				.toString(response.getEntity(), "UTF-8"));
		/*
		 * Map<String,Object> memberDetails = new HashMap<String, Object>();
		 * Set<String> keySet =obj.keySet(); for (String key : keySet) { Object
		 * value =obj.get(key); memberDetails.put(key.toString(), value);
		 * System.out.printf("%s=%s (%s)\n", key,value, value.getClass()
		 * .getSimpleName()); }
		 */
		return productsPojo;
	}

	@SuppressWarnings("unchecked")
	public RewardPolicyPojo runcreateRewardPolicyWebService(
			RewardPolicyPojo rewardPojo) throws Exception {
		token = login();
		JSONObject json = new JSONObject();
		json.put("name", rewardPojo.getName());
		json.put("program", rewardPojo.getProgramId());
		json.put("org", new RcxApiMethods().rungetAllOrgs());
		String uri = "/api/v1/rewardpolicies/";
		HttpResponse response = sendPost(uri, token, json);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("Status Code :" + statusCode);
		if (statusCode == 201) {
			System.out.println("Passed: Reward policy created successfully");
			reportInfo("Create Reward policy Web Service Ran Successfully.");
		} else
			System.out.println("Failed: Reward policy Creation Failed");
		JSONObject obj = (JSONObject) new JSONParser().parse(EntityUtils
				.toString(response.getEntity(), "UTF-8"));
		/*
		 * Map<String,Object> memberDetails = new HashMap<String, Object>();
		 * Set<String> keySet =obj.keySet(); for (String key : keySet) { Object
		 * value =obj.get(key); memberDetails.put(key.toString(), value);
		 * System.out.printf("%s=%s (%s)\n", key,value, value.getClass()
		 * .getSimpleName()); }
		 */
		return rewardPojo;
	}
	
	@SuppressWarnings("unchecked")
	public Rules_Pojo runCreateRuleFolderWebService(Rules_Pojo rulesPojo)
			throws Exception {
		token = login();
		JSONObject json = new JSONObject();
		json.put("name", rulesPojo.getRuleFolderName());
		json.put("program", rulesPojo.getProgramId());
		json.put("org", rulesPojo.getOrgId());
		
		String uri = "/api/v1/rulefolders/";
		HttpResponse response = sendPost(uri, token, json);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("Status Code :" + statusCode);
		if (statusCode == 201){
			System.out.println("PASSED: Rule Folder created successfully");
			reportInfo("Create/Add Rule Folder Web Service Ran Successfully.");
	}else
			System.out.println("FAILED: Rule Folder Creation Failed");

		JSONObject obj = (JSONObject) new JSONParser().parse(EntityUtils.toString(response.getEntity(), "UTF-8"));
		 Map<String,Object> memberDetails = new HashMap<String, Object>();
		 Set<String> keySet =obj.keySet(); 
		 for (String key : keySet) { 
			 Object value =obj.get(key); memberDetails.put(key.toString(), value);
			 System.out.printf("%s=%s (%s)\n", key,value, value.getClass().getSimpleName()); }
		 
		return rulesPojo;
	}
	
	@SuppressWarnings("unchecked")
	public MemberPojo runAddLoyaltyIdWebService(MemberPojo memberPojo)
			throws Exception {
		token = login();
		JSONObject json = new JSONObject();
		json.put("name", memberPojo.getLoyaltyIdName());
		json.put("loyaltyId", memberPojo.getLoyaltyIdCode());
		json.put("memberId", memberPojo.getMemberId());
		json.put("org", memberPojo.getOrgID());
		
		String uri = "/api/v1/loyaltyids/";
		HttpResponse response = sendPost(uri, token, json);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("Status Code :" + statusCode);
		if (statusCode == 201){
			System.out.println("PASSED: LoyaltyID added successfully");
			reportInfo("Create/Add LoyaltyID Web Service Ran Successfully.");
	}else
			System.out.println("FAILED: LoyaltyID Creation Failed");

		JSONObject obj = (JSONObject) new JSONParser().parse(EntityUtils.toString(response.getEntity(), "UTF-8"));
		 Map<String,Object> memberDetails = new HashMap<String, Object>();
		 Set<String> keySet =obj.keySet(); 
		 for (String key : keySet) { 
			 Object value =obj.get(key); memberDetails.put(key.toString(), value);
			 System.out.printf("%s=%s (%s)\n", key,value, value.getClass().getSimpleName()); }
		 
		return memberPojo;
	}
	
	@SuppressWarnings("unchecked")
	public String rungetAllProducts() throws Exception{
		token = login();
		String uri = "/api/v1/products";
		HttpResponse response =  sendGet(uri, token);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("Status Code :"+statusCode);
		if(statusCode==200){
			System.out.println("Passed: All products are retrieved successfully");
			reportInfo("Get all products Web Service Ran Successfully.");
		}else
			System.out.println("Failed: All products are not retrieved");
		JSONArray obj = (JSONArray) new JSONParser().parse(EntityUtils.toString(response.getEntity(), "UTF-8"));
		System.out.println(obj);
		JSONObject jobj = new JSONObject();
		for (int i = 0; i<obj.size(); i++) {
		    Object json = obj.get(i);
		    jobj = (JSONObject) json;
		   // System.out.println("in for loop"+jobj.get("_id").toString());
		   
		}
		return jobj.get("name").toString().trim();
	
	}
	public static void main(String[] args) {
		try {
			Rules_Pojo rulesPojo = new Rules_Pojo();
			new RcxApiMethods().runCreateAddRulesWebService(rulesPojo);
			/*PursePoliciesPojo pursePojo = new PursePoliciesPojo();
			pursePojo = new RcxApiMethods().createPursePolicyWebService(pursePojo);*/
			/*TierPoliciesPojo  tierPoliciesPojo= new TierPoliciesPojo();
			tierPoliciesPojo = new RcxApiMethods().createTierPolicyWebService(tierPoliciesPojo);*/
			/*ReferenceDataDMApojo dmaPojo = new ReferenceDataDMApojo();
			dmaPojo = new RcxApiMethods().createDMAWebService(dmaPojo);
			ReferenceData_Segments_Pojo segmentPojo = new ReferenceData_Segments_Pojo();
			segmentPojo = new RcxApiMethods().createSegmentWebService(segmentPojo);*/
			/*LocationPojo locationPojo = new LocationPojo();
			locationPojo = new RcxApiMethods().createLocationWebService(locationPojo);*/
			//String flag = new RcxApiMethods().rungetAllProducts();
			//System.out.println(flag);
			/*programsPojo = new ProgramsPojo();
			memberPojo = new MemberPojo();
			programsPojo = new RcxApiMethods().createProgram(programsPojo);
			memberPojo.setProgram(programsPojo.getPrograId());
			memberPojo = new RcxApiMethods().memberCreation(memberPojo);*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
