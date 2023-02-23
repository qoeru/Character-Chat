package com.example.characterchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyApp";

    public void startNewCharacterScreen(View view)
    {
        Intent intent = new Intent(this, NewCharacter.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView userPic = (ImageView) findViewById(R.id.UserPic);
        ImageView characterPic = (ImageView) findViewById(R.id.CharacterAvatar);
        //text
        TextView characterName = (TextView) findViewById(R.id.CharacterName);
        TextView characterMessage = (TextView) findViewById(R.id.CharacterMessage);
        EditText search = (EditText) findViewById(R.id.search);
        //buttons
        Button addNewCharacter = (Button) findViewById(R.id.newCharacterButton);
        ImageButton settingsButton = (ImageButton) findViewById(R.id.settingIcon);

//        View.OnClickListener listener = v -> Log.i(TAG, "Button clicked!");
//        addNewCharacter.setOnClickListener(listener);
    }

    //images


}

