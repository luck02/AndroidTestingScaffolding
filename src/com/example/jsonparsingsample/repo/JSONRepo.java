package com.example.jsonparsingsample.repo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.json.JSONException;
import org.json.JSONObject;

import com.example.jsonparsingexample.test.R;
import com.example.jsonparsingexample.test.R.raw;

import android.content.Context;
import android.util.Log;

public class JSONRepo {
		public static JSONObject getObject(Context context)  {
			JSONObject jsonObject = null;
					
			InputStream inputStream = context.getResources().openRawResource(R.raw.data);
			
			String jsonData = convertStreamToString(inputStream);
			
			
			try {
				jsonObject = new JSONObject(jsonData);
			} catch (JSONException e) {
				Log.e("TestJSONREpo", "JSON Exception:", e);
			}
			
			return jsonObject;
		}
		
		public static String convertStreamToString(java.io.InputStream is) {
		    //java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
		    //return s.hasNext() ? s.next() : "";
		    StringBuilder sb = new StringBuilder();
		    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		    String line = "";
			try {
				line = reader.readLine();
				while (line != null) {
			    	sb.append(line);
					line = reader.readLine();
			    }
			} catch (IOException e) {
				e.printStackTrace();
			}
		    
		    return sb.toString();
		    
		}
	}