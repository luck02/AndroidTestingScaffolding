package com.example.jsonparsingexample.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.json.JSONException;
import org.json.JSONObject;

import com.example.jsonparsingsample.repo.JSONRepo;

import android.test.ActivityTestCase;
import android.test.AndroidTestCase;
import android.util.Log;

public class tests extends ActivityTestCase {
	public void testSanityCheck() {
		assert(true);
	}
	
	public void testJSONRepo() {
		

		JSONObject jsonObject = JSONRepo.getObject(getInstrumentation().getContext());
		
		assertNotNull(jsonObject);
	}
	
	/*
	 * 
	 * The data in the file 'data.json' has been loaded into a JSONObject named 'jsonData'. 
	 * Using 'data.json' as your guide, create String variables named 'name', 'publisher', 
	 * and 'language' and set them to the appropriate values from 'data.json' using the 'jsonData' object.
	 * 
	 */
	public void testOutputJSONParse() {
		JSONObject jsonData = JSONRepo.getObject(getInstrumentation().getContext());
		
		
	}
	
	
}
