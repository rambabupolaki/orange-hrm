package selenium.framework.services;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Properties;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.simple.JSONObject;

import selenium.framework.common.Reporting;


public class WebServiceAgent extends Reporting {
	
	Properties CONFIG ;
	
	public WebServiceAgent() throws IOException {
		CONFIG = new Properties();
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")
				+ "/config/config.properties");
		CONFIG.load(fs);
	}

	@SuppressWarnings("deprecation")
	private static CloseableHttpClient getCloseableHttpClient() {
		CloseableHttpClient httpClient = null;
		try {
			httpClient = HttpClients
					.custom()
					.setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE)
					.setSSLContext(
							new SSLContextBuilder().loadTrustMaterial(null,
									new TrustStrategy() {
										public boolean isTrusted(
												X509Certificate[] arg0,
												String arg1)
												throws CertificateException {
											return true;
										}
									}).build()).build();
		} catch (KeyManagementException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (KeyStoreException e) {
			e.printStackTrace();
		}
		return httpClient;
	}

	public HttpResponse sendPost(String uri, String token, JSONObject json)
			throws URISyntaxException, ClientProtocolException, IOException {

		HttpClient httpClient = getCloseableHttpClient();
		String endPoint = CONFIG.getProperty("serviceEndPoint");
		HttpPost request = new HttpPost();
		StringEntity params = new StringEntity(json.toString());
		request.addHeader("content-type", "application/json");
		if (token != null && token != "")
			request.addHeader("Authorization", "Bearer " + token);
		request.setURI(new URI(endPoint + uri));
		request.setEntity(params);
		return httpClient.execute(request);
	}

	public HttpResponse sendGet(String uri, String token) 
			throws URISyntaxException, ClientProtocolException, IOException  {

		HttpClient httpClient = getCloseableHttpClient();
		String endPoint = CONFIG.getProperty("serviceEndPoint");
		HttpGet request = new HttpGet();
		if (token != null && token != "")
			request.addHeader("Authorization", "Bearer " + token);
		request.setURI(new URI(endPoint + uri));
		return httpClient.execute(request);
	}

	public HttpResponse sendPut(String uri, String token, JSONObject json)
			throws IOException, URISyntaxException {

		HttpClient httpClient = getCloseableHttpClient();
		String endPoint = CONFIG.getProperty("serviceEndPoint");
		HttpPut request = new HttpPut();
		StringEntity params = new StringEntity(json.toString());
		request.addHeader("content-type", "application/json");
		if (token != null && token != "")
			request.addHeader("Authorization", "Bearer " + token);
		request.setURI(new URI(endPoint + uri));
		request.setEntity(params);
		return httpClient.execute(request);
	}

	public HttpResponse sendDelete(String uri, String token) throws IOException, URISyntaxException {

		HttpClient httpClient = getCloseableHttpClient();
		String endPoint = CONFIG.getProperty("serviceEndPoint");
		HttpDelete request = new HttpDelete();
		if (token != null && token != "")
			request.addHeader("Authorization", "Bearer " + token);
		request.setURI(new URI(endPoint + uri));
		return httpClient.execute(request);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	}

}
