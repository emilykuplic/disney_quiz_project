package com.example.android.disneyquiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the submit to see results button is clicked.
     */
    public void submitQuiz(View view) {
        boolean oliverAndCompany = ((RadioButton) findViewById(R.id.radio_olive_and_company)).isChecked();
        Log.v("MainActivity", "Oliver and Company?" + oliverAndCompany);

        boolean littleMermaid = ((RadioButton) findViewById(R.id.radio_1989)).isChecked();
        Log.v("MainActivity", "Little Mermaid Year?" + oliverAndCompany);

        CheckBox bambiCheckBox = (CheckBox) findViewById(R.id.bambi_checkbox);
        boolean selectedBambi = bambiCheckBox.isChecked();
        Log.v("MainActivity", "Bambi " + selectedBambi);

        CheckBox thumperCheckBox = (CheckBox) findViewById(R.id.thumper_checkbox);
        boolean selectedThumper = bambiCheckBox.isChecked();
        Log.v("MainActivity", "Thumper " + selectedThumper);

        CheckBox flowerCheckBox = (CheckBox) findViewById(R.id.flower_checkbox);
        boolean selectedFlower = bambiCheckBox.isChecked();
        Log.v("MainActivity", "Flower " + selectedFlower);

        EditText nameInput = (EditText) findViewById(R.id.name_input);
        String frozenName = nameInput.getText().toString();
        Log.v("MainActivity", "Edit text field " + frozenName);

        calculateScore(oliverAndCompany, littleMermaid, frozenName, selectedBambi, selectedThumper, selectedFlower);
    }


    /**
     * Calculates quiz score
     */
    private int calculateScore(boolean oliverAndCompany, boolean littleMermaid, String frozenAnswer, boolean selectedBambi,
                               boolean selectedThumper, boolean selectedFlower) {
//
        if (oliverAndCompany) {
            score = score + 1;
        }
        if (littleMermaid) {
            score = score + 1;
        }
        if (frozenAnswer.equalsIgnoreCase("Olaf")) {
            score = score + 1;
        }
        if (selectedBambi) {
            score = score + 1;
        }
        if (selectedThumper) {
            score = score + 1;
        }
        if (selectedFlower) {
            score = score + 1;
        }
        Log.d("MyActivity", "calculateScore() returned: " + score);
        Toast.makeText(this, "Your score is " + score + " out of 6", Toast.LENGTH_LONG).show();
        return score;
    }


}




