package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val data = intent.extras
        val name = data!!.getString("name")
        val grade = data.getString("grade")
        tv_name.text = name
        tv_score.text = "Your Score is ${grade.toString()} out of 10"

        btn_finish.setOnClickListener {
            val back = Intent(this,MainActivity::class.java)
            startActivity(back)
            finish()
        }

    }
}