package in.nareshit.roomdatabase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentsDAO {

    @Insert
    void insertData(Student student);

    @Query("Select * from students_data")
    List<Student> getStudents();

}
