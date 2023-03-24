package com.example.characterchat;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyApp";

    ActivityResultLauncher<Intent> editLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if(result.getResultCode() != RESULT_OK){
                    return;
                }
                TextView characterName = (TextView) findViewById(R.id.CharacterName);
                characterName.setText(result.getData().getExtras().get("characterName").toString());
            }
    );

    public void startNewCharacterScreen(View view)
    {
        Intent intent = new Intent(this, NewCharacter.class);
        TextView characterName = (TextView) findViewById(R.id.CharacterName);
        intent.putExtra("characterName", characterName.getText().toString());
        editLauncher.launch(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView userPic = (ImageView) findViewById(R.id.UserPic);
        userPic.setImageResource(R.drawable.user);

        TextView characterMessage = (TextView) findViewById(R.id.CharacterMessage);
        characterMessage.setText("Hello World!");

        Button addNewCharacter = (Button) findViewById(R.id.newCharacterButton);
        addNewCharacter.setText("+");

        ImageView characterPic = (ImageView) findViewById(R.id.CharacterAvatar);


        EditText search = (EditText) findViewById(R.id.search);
        //buttons

        ImageButton settingsButton = (ImageButton) findViewById(R.id.settingIcon);

        TextView characterName = (TextView) findViewById(R.id.CharacterName);
        Bundle arguments = getIntent().getExtras();

        if(arguments != null)
        {
            String newCharacterName = arguments.getString("characterName");
            characterName.setText(newCharacterName);
        }

        View.OnClickListener listener = this::startNewCharacterScreen;

        addNewCharacter.setOnClickListener(listener);

    }

}

