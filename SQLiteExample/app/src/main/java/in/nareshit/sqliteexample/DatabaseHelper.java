package in.nareshit.sqliteexample;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    Context context;
    // CREATING STATIC CONSTANTS FOR DATABASE_NAME, DATABASE_VERSION and also the TABLE_NAME, TABLE_ROWS
    public static final String DATABASE_NAME = "pavan.db";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME = "students_data";
    public static final String COL_0 = "student_id";
    public static final String COL_1 = "student_name";
    public static final String COL_2 = "student_age";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    // This method is used to create the tables in the database
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_TABLE = "CREATE table "+TABLE_NAME+"("+COL_0+" INTEGER PRIMARY KEY AUTOINCREMENT, "+COL_1+" TEXT,"+COL_2+" INTEGER);";
        sqLiteDatabase.execSQL(CREATE_TABLE);
        Toast.makeText(context, "TABLE CREATED SUCCESSFULLY!", Toast.LENGTH_SHORT).show();

    }

    // this method is useful to upgrade the database tables
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE "+TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    // Helper method to insert data
    public void insertDatatoDB(ContentValues contentValues){
        SQLiteDatabase db = getWritableDatabase();

        db.insert(TABLE_NAME,null,contentValues);

    }

    // This is the helper method to fetch the data out of the database
    public Cursor getData(){
        SQLiteDatabase db = getReadableDatabase();
        return db.rawQuery("SELECT * FROM "+TABLE_NAME, null);
    }
    
    // this is helper method for update
    public void updateData(ContentValues values, int id){
        SQLiteDatabase db = this.getWritableDatabase();
        db.update(TABLE_NAME,values,COL_0+"="+id,null);

    }
    
    // This is the helper method for delete
    public void delete(int id){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM "+TABLE_NAME+" where "+COL_0+"="+id);

    }
}
