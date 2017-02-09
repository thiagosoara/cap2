package br.unibratec.pmb.cap2.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import br.unibratec.pmb.cap2.model.Student;

/**
 * Created by thiago.sousa on 09/02/2017.
 */

public class StudentDAO extends SQLiteOpenHelper{
    public StudentDAO(Context context) {
        super(context, "cap2", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Students( id INTEGER PRIMARY KEY, name TEXT NOT NULL, email TEXT, age INTEGER, rate REAL);";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Students";
        db.execSQL(sql);
        onCreate(db);
    }


    public void save(Student student) {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues contentValues = new ContentValues();

        contentValues.put("name", student.getName());
        contentValues.put("email", student.getEmail());
        contentValues.put("age", student.getAge());
        contentValues.put("rate", student.getRate());

        db.insert("Students", null, contentValues);

    }

    public List<Student> getStudents() {
        String sql = "SELECT * FROM Students";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql, null);

        List<Student> students = new ArrayList<Student>();
        while (c.moveToNext()){
            Student student = new Student();
            student.setId(c.getLong(c.getColumnIndex("id")));
            student.setName(c.getString(c.getColumnIndex("name")));
            student.setEmail(c.getString(c.getColumnIndex("email")));
            student.setAge(c.getInt(c.getColumnIndex("age")));
            student.setRate(c.getFloat(c.getColumnIndex("rate")));
            students.add(student);
        }
        c.close();
        return students;
    }

    public void delete(Student student) {
        SQLiteDatabase db = getWritableDatabase();

        String [] params = {student.getId().toString()};
        db.delete("Students", "id = ?", params);
    }
}
