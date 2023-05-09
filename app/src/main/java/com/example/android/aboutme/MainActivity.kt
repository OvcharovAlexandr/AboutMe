package com.example.android.aboutme

import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import com.example.android.aboutme.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil


class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickname(it)
        }
        /*binding.doneButton.setOnClickListener {
            addNickname(it)
        }*/
    }

    private fun addNickname(view: View) {
        /*binding.apply{
            nicknameText.text = nicknameEdit.text
            invalidateAll()
            nicknameEdit.visibility = View.GONE
            view.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE
        }*/

        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknameTextView = findViewById<EditText>(R.id.nickname_edit)

        nicknameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE
    }

    val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
    //imm.hideSoftInputFromWindow(view.windowToken, 0)
}

