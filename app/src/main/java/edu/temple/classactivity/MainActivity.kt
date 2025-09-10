package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val myButton = findViewById<button>(R.id.clickMeButton)
        val textTextView = findViewById<TextView>(R.id.messageTextView)
        val editText = findViewById<EditText>(R.id.editTextText)

        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            val name = editText.text.toString()

            if (name.isNotEmpty()) {
                textTextView.text = "Hello $name! Welcome"
                editText.setText("")
            } else {
                textTextView.text = "Please enter your name"
            }
        }
    }
}