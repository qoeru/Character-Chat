package com.example.characterchat;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;



public class NewCharacter extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_character);

        Bundle args = getIntent().getExtras();

        //text

        EditText newCharacterGender = (EditText) findViewById(R.id.gender);
        EditText newCharacterBiography = (EditText) findViewById(R.id.biography);
        EditText newCharacterPersonality = (EditText) findViewById(R.id.personality);
        EditText newCharacterName = (EditText) findViewById(R.id.name);

        String oldName = args.getString("characterName");

        newCharacterName.setHint(oldName);
        //buttons
        ImageButton uploadPic = (ImageButton) findViewById(R.id.uploadNewPic);

        Button saveNew = (Button) findViewById(R.id.save);

        View.OnClickListener listener = v -> {
            String newName = newCharacterName.getText().toString();
            Intent intent = new Intent();
            intent.putExtra("characterName", newName);
            setResult(RESULT_OK, intent);
            finish();
        };

        saveNew.setOnClickListener(listener);


    }



}