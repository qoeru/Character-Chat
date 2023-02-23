package com.example.characterchat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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

        View.OnClickListener listener = (View.OnClickListener) v -> {
            EditText newCharacterName = (EditText) findViewById(R.id.newCharacterName);
        }
    }



}