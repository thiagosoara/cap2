package br.unibratec.pmb.cap2.helpers;

import android.util.Log;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RatingBar;

import br.unibratec.pmb.cap2.FormStudentActivity;
import br.unibratec.pmb.cap2.R;
import br.unibratec.pmb.cap2.model.Student;

/**
 * Created by thiago.sousa on 01/02/2017.
 */

public class FormStudentHelper {

    private EditText nameField;
    private EditText emailField;
    private NumberPicker ageField;
    private RatingBar rateField;

    public FormStudentHelper(FormStudentActivity activity) {
        nameField = (EditText) activity.findViewById(R.id.et_student_name);
        emailField = (EditText) activity.findViewById(R.id.et_student_email);
        ageField = (NumberPicker) activity.findViewById(R.id.np_student_age);
        rateField = (RatingBar) activity.findViewById(R.id.rb_student_rate);

    }

    public Student getStudent() {
        Student student = new Student();
        student.setName(nameField.getText().toString());
        student.setEmail(emailField.getText().toString());
        student.setAge(ageField.getMaxValue());
        student.setRate(rateField.getProgress());
        return student;
    }

}
