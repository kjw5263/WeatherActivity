package com.example.weatheractivity;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    String url = "{\n" +
            "  \"response\": {\n" +
            "    \"header\": {\n" +
            "      \"resultCode\": \"00\",\n" +
            "      \"resultMsg\": \"NORMAL_SERVICE\"\n" +
            "    },\n" +
            "    \"body\": {\n" +
            "      \"dataType\": \"JSON\",\n" +
            "      \"items\": {\n" +
            "        \"item\": [\n" +
            "          {\n" +
            "            \"baseDate\": \"20200916\",\n" +
            "            \"baseTime\": \"0630\",\n" +
            "            \"category\": \"LGT\",\n" +
            "            \"fcstDate\": \"20200916\",\n" +
            "            \"fcstTime\": \"0700\",\n" +
            "            \"fcstValue\": \"0\",\n" +
            "            \"nx\": 55,\n" +
            "            \"ny\": 127\n" +
            "          },\n" +
            "          {\n" +
            "            \"baseDate\": \"20200916\",\n" +
            "            \"baseTime\": \"0630\",\n" +
            "            \"category\": \"LGT\",\n" +
            "            \"fcstDate\": \"20200916\",\n" +
            "            \"fcstTime\": \"0800\",\n" +
            "            \"fcstValue\": \"0\",\n" +
            "            \"nx\": 55,\n" +
            "            \"ny\": 127\n" +
            "          },\n" +
            "          {\n" +
            "            \"baseDate\": \"20200916\",\n" +
            "            \"baseTime\": \"0630\",\n" +
            "            \"category\": \"LGT\",\n" +
            "            \"fcstDate\": \"20200916\",\n" +
            "            \"fcstTime\": \"0900\",\n" +
            "            \"fcstValue\": \"0\",\n" +
            "            \"nx\": 55,\n" +
            "            \"ny\": 127\n" +
            "          },\n" +
            "          {\n" +
            "            \"baseDate\": \"20200916\",\n" +
            "            \"baseTime\": \"0630\",\n" +
            "            \"category\": \"LGT\",\n" +
            "            \"fcstDate\": \"20200916\",\n" +
            "            \"fcstTime\": \"1000\",\n" +
            "            \"fcstValue\": \"0\",\n" +
            "            \"nx\": 55,\n" +
            "            \"ny\": 127\n" +
            "          },\n" +
            "          {\n" +
            "            \"baseDate\": \"20200916\",\n" +
            "            \"baseTime\": \"0630\",\n" +
            "            \"category\": \"LGT\",\n" +
            "            \"fcstDate\": \"20200916\",\n" +
            "            \"fcstTime\": \"1100\",\n" +
            "            \"fcstValue\": \"0\",\n" +
            "            \"nx\": 55,\n" +
            "            \"ny\": 127\n" +
            "          },\n" +
            "          {\n" +
            "            \"baseDate\": \"20200916\",\n" +
            "            \"baseTime\": \"0630\",\n" +
            "            \"category\": \"LGT\",\n" +
            "            \"fcstDate\": \"20200916\",\n" +
            "            \"fcstTime\": \"1200\",\n" +
            "            \"fcstValue\": \"0\",\n" +
            "            \"nx\": 55,\n" +
            "            \"ny\": 127\n" +
            "          },\n" +
            "          {\n" +
            "            \"baseDate\": \"20200916\",\n" +
            "            \"baseTime\": \"0630\",\n" +
            "            \"category\": \"PTY\",\n" +
            "            \"fcstDate\": \"20200916\",\n" +
            "            \"fcstTime\": \"0700\",\n" +
            "            \"fcstValue\": \"0\",\n" +
            "            \"nx\": 55,\n" +
            "            \"ny\": 127\n" +
            "          },\n" +
            "          {\n" +
            "            \"baseDate\": \"20200916\",\n" +
            "            \"baseTime\": \"0630\",\n" +
            "            \"category\": \"PTY\",\n" +
            "            \"fcstDate\": \"20200916\",\n" +
            "            \"fcstTime\": \"0800\",\n" +
            "            \"fcstValue\": \"1\",\n" +
            "            \"nx\": 55,\n" +
            "            \"ny\": 127\n" +
            "          },\n" +
            "          {\n" +
            "            \"baseDate\": \"20200916\",\n" +
            "            \"baseTime\": \"0630\",\n" +
            "            \"category\": \"PTY\",\n" +
            "            \"fcstDate\": \"20200916\",\n" +
            "            \"fcstTime\": \"0900\",\n" +
            "            \"fcstValue\": \"1\",\n" +
            "            \"nx\": 55,\n" +
            "            \"ny\": 127\n" +
            "          },\n" +
            "          {\n" +
            "            \"baseDate\": \"20200916\",\n" +
            "            \"baseTime\": \"0630\",\n" +
            "            \"category\": \"PTY\",\n" +
            "            \"fcstDate\": \"20200916\",\n" +
            "            \"fcstTime\": \"1000\",\n" +
            "            \"fcstValue\": \"5\",\n" +
            "            \"nx\": 55,\n" +
            "            \"ny\": 127\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      \"pageNo\": 1,\n" +
            "      \"numOfRows\": 10,\n" +
            "      \"totalCount\": 60\n" +
            "    }\n" +
            "  }\n" +
            "}";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("kjw_message",url);

        Gson gson = new Gson();
        Sung sung = gson.fromJson(url, Sung.class);
        String aaa = sung.getResponse().getHeader().getResultMsg();

        Gson gson1 = new Gson();
        Sung sung1 = gson1.fromJson(url, Sung.class);
        String bbb = sung.getResponse().getHeader().getResultMsg();
        String str = sung1.getResponse().getBody().getItems().getItem().get(1).getBaseDate();
        Log.d("ttt", bbb);
        Log.d("ttt", str);

//        try {
//            JSONObject obj = new JSONObject(url);
//            String str = obj.getString("result");
//            obj.get("result");
//            JSONObject obj2 = new JSONObject(str);
//            Log.v("kjw_result", str);
//
//            String str2 = obj2.getString("message");
//            Log.v("kjw_result", str2);
//
//        } catch (JSONException e) {
//            Log.v("kjw_eee", e.toString());
//        }


    }
}