package com.example.characterchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class NewCharacter extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_character);

        //text

        EditText newCharacterGender = (EditText) findViewById(R.id.gender);
        EditText newCharacterBiography = (EditText) findViewById(R.id.biography);
        EditText newCharacterPersonality = (EditText) findViewById(R.id.personality);
        //buttons
        ImageButton uploadPic = (ImageButton) findViewById(R.id.uploadNewPic);

        Button saveNew = (Button) findViewById(R.id.save);

        View.OnClickListener listener = (View.OnClickListener) v -> {
            EditText newCharacterName = (EditText) findViewById(R.id.name);

            String newName = newCharacterName.getText().toString();
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("newCharacterName", newName);
            startActivity(intent);
        };

        saveNew.setOnClickListener(listener);


    }



}