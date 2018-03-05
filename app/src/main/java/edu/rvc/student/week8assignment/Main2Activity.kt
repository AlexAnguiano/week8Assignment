package edu.rvc.student.week8assignment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val txtshow = findViewById<TextView>(R.id.txtShow)
        val txtshow2 = findViewById<TextView>(R.id.txtShow2)
        val txtshow3 = findViewById<TextView>(R.id.txtShow3)

        var strShow: String = intent.getStringExtra("txtsend1")
        var strShow2: String = intent.getStringExtra("txtsend2")
        var strShow3: String = intent.getStringExtra("email")

        txtshow.text = strShow
        txtshow2.text = strShow2
        txtshow3.text = strShow3
       println("Name: ${strShow} Last Name: ${strShow2} Email ${strShow3}")

    }
}
