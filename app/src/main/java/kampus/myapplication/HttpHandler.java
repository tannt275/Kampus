package kampus.myapplication;

import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.Charset;

public class HttpHandler {
    private static final String TAG = HttpHandler.class.getSimpleName();

    public HttpHandler() {
    }

    public String makeServiceCall(URL reqUrl) {
        String response = "";
        if (reqUrl == null) {
            return  response;
        }
        try {
            HttpURLConnection conn = (HttpURLConnection) reqUrl.openConnection();
            conn.setRequestMethod("GET");
            conn.setReadTimeout(10000);
            conn.setConnectTimeout(15000);
            conn.connect();

            if (conn.getResponseCode() == 200) {
                // read the response
                InputStream in = new BufferedInputStream(conn.getInputStream());
                response = convertStreamToString(in);
            }

        }  catch (ProtocolException e) {
            Log.e(TAG, "ProtocolException: " + e.getMessage());
        } catch (IOException e) {
            Log.e(TAG, "IOException: " + e.getMessage());
        } catch (Exception e) {
            Log.e(TAG, "Exception: " + e.getMessage());
        }
        return response;
    }

    private String convertStreamToString(InputStream is) {
        StringBuilder sb = new StringBuilder();
        if (is != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(is, Charset.forName("UTF-8"));
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line;
            try {
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append('\n');
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.toString();
    }
}
