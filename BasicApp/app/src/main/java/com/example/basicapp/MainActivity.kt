package com.example.basicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txtInput = findViewById<View>(R.id.txtInput)
        var txtShow = findViewById<View>(R.id.txtShow)
    }

    fun onCheck(view: View) {
        var txt = txtInput.getText().toString()
        var palindrome = palindromeCheck(txt)

        if (palindrome) {
            txtShow.setText("Palindrome")
        } else {
            txtShow.setText("Bukan Palindrome")
        }
    }

    fun palindromeCheck(txt: String): Boolean {
        var result = true
        var plaintText = ""
        var reverseText = ""

        for (c in txt.toLowerCase()) {
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                plaintText += c
            }
        }

        var len = plaintText.length - 1
        while (len != -1) {
            reverseText += plaintText[len--]
        }

        if (plaintText != reverseText) {
            result = false
        }
        return result;
    }
}