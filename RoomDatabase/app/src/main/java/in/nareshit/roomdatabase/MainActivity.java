package in.nareshit.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText id,name,age;
    private TextView result;

    private StudentsDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        database = Room.databaseBuilder(getApplicationContext(),StudentsDatabase.class,"student")
                .allowMainThreadQueries()
                .build();
    }

    public void insertData(View view) {
        String n = name.getText().toString();
        int a = Integer.parseInt(age.getText().toString());
        Student s = new Student(n,a);
        database.studentsDAO().insertData(s);
        Toast.makeText(this, "Successfully inserted!", Toast.LENGTH_SHORT).show();
    }

    public void fetchData(View view) {
        List<Student> students = database.studentsDAO().getStudents();
        result.setText("");
        for(Student s : students){
            result.append(s.getName()+" "+s.getAge()+"\n\n");
        }
    }

    public void updateData(View view) {
    }

    public void deleteData(View view) {
    }

    // This method is used to connect the views
    private void initViews() {
        id = findViewById(R.id.student_id);
        name = findViewById(R.id.student_name);
        age = findViewById(R.id.student_age);
        result = findViewById(R.id.result);
    }
}