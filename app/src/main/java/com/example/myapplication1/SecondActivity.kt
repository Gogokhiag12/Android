package com.example.myapplication1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val receivedEmail: EditText = findViewById(R.id.receivedEmailEditText)
        val receivedRecipientEmail: EditText = findViewById(R.id.receivedRecipientEditText)
        val receivedMessage: EditText = findViewById(R.id.receivedMessageEditText)
        val clearButton : Button = findViewById(R.id.clearButton)

        val email  = intent.getStringExtra("EmailValue")
        val recipientEmail = intent.getStringExtra("RecipientValue")
        val message = intent.getStringExtra("MessageValue")

        receivedEmail.setText("From: " + email)
        receivedRecipientEmail.setText("To: " + recipientEmail)
        receivedMessage.setText(message)

        clearButton.setOnClickListener {
            receivedEmail.setText("")
            receivedRecipientEmail.setText("")
            receivedMessage.setText("")
        }
    }


}