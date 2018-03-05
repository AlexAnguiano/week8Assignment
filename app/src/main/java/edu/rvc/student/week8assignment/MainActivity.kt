package edu.rvc.student.week8assignment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submit = findViewById<Button>(R.id.btnPage2)
        val txtsend = findViewById<EditText>(R.id.txtSend)
        val txtsend2 = findViewById<EditText>(R.id.txtSend2)
        val txtEmail = findViewById<EditText>(R.id.txtEmail)

        submit.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, Main2Activity::class.java)

            intent.putExtra("txtsend1",txtsend.text.toString())
            intent.putExtra("txtsend2",txtsend2.text.toString())
            intent.putExtra("email",txtEmail.text.toString())

            startActivity(intent)
        })
    }
}
