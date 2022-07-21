package in.nareshit.sqliteexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText id,name,age;
    private TextView result;
    private DatabaseHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        // Initialize the dbhelper object
        dbHelper = new DatabaseHelper(this);

    }

    // Insert
    public void insertData(View view) {
        String n = name.getText().toString();
        int a = Integer.parseInt(age.getText().toString());
        // Create ContentValues(...) object
        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.COL_1, n);
        values.put(DatabaseHelper.COL_2, a);
        dbHelper.insertDatatoDB(values);
        Toast.makeText(this, "INSERTION IS SUCCESSFUL", Toast.LENGTH_SHORT).show();
    }

    // READ
    public void fetchData(View view) {
       result.setText("");
        Cursor c = dbHelper.getData();
        if(c!=null){
            c.moveToFirst();
            do{
                int s_id = c.getInt(0);
                String s_n = c.getString(1);
                int s_a = c.getInt(2);
                result.append(s_id+" "+s_n+" "+s_a+"\n");
            }while(c.moveToNext());
        }
    }

    // UPDATE
    public void updateData(View view) {
        int s_id = Integer.parseInt(id.getText().toString());
        String n = name.getText().toString();
       String aaa = age.getText().toString();
       int age2 = 0;
       if(!aaa.equalsIgnoreCase("")){
           age2 = Integer.parseInt(aaa);
       }
        // Create ContentValues(...) object
        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.COL_1, n);
        values.put(DatabaseHelper.COL_2, age2);
        dbHelper.updateData(values,s_id);
        Toast.makeText(this, "DATA is updated", Toast.LENGTH_SHORT).show();
    }

    // DELETE
    public void deleteData(View view) {
        int s_id = Integer.parseInt(id.getText().toString());
        dbHelper.delete(s_id);
        Toast.makeText(this, "Data is removed", Toast.LENGTH_SHORT).show();
    }

    // This method is used to connect the views
    private void initViews() {
        id = findViewById(R.id.student_id);
        name = findViewById(R.id.student_name);
        age = findViewById(R.id.student_age);
        result = findViewById(R.id.result);
    }
}

// TODO 1: Create a DatabaseHelper class that extends to SQLiteOpenHelper
// TODO 2: Override onCreate() and onUpgrade() methods of SQLiteOpenHelper
// TODO 3: create a constructor matching the super class
// TODO 4: Create students_data table in the onCreate(...) method of DatabaseHelper
// TODO 5: create ContentValues object and insert data
//  TODO 6: Fetch data
//  TODO 7: update data
//  TODO 8" Delete Data