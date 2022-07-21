package in.nareshit.contentresolverexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    String authorities = "content://in.nareshittechnologies.contentprovider";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.txt_view);

        // CREATE a CONTENT_URI
        Uri CONTENT_URI = Uri.parse(authorities);

        ContentValues values = new ContentValues();
        values.put("student_name","NEW DATA");
        values.put("student_age",26);

        getContentResolver().insert(CONTENT_URI,values);

        // With the help of CONTENT_URI, we can make a request to the other application
        // With the help of ContentResolver
        Cursor c = getContentResolver().query(CONTENT_URI, null, null, null,null,null);
        textView.setText("");
        if(c!=null){
            c.moveToFirst();
            do{
                int s_id = c.getInt(0);
                String s_n = c.getString(1);
                int s_a = c.getInt(2);
                textView.append(s_id+" "+s_n+" "+s_a+"\n");
            }while(c.moveToNext());
        }

    }
}