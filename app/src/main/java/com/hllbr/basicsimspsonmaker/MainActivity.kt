package com.hllbr.basicsimspsonmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun makeSimpson(view : View){
        val name = nameText.text.toString()//eğer toString yazmassak bize editable bir ifade veriyor
        val job = jobText.text.toString()
        var age = ageText.text.toString().toIntOrNull()
        if(age == null){
            age = 0
        }
        //Yöntem 1 =
        //val age = ageText.text.toString().toInt() Güvensiz bir yöntem
        //val ageInt = age.toInt()//2.töntem
        //3.yöntem  val age = ageText.text.toString().toIntOrNull()
        //resultView.text ="Name : ${name},Job : ${job},Age : ${age}"
        val simpson = Simpson(name,job,age)
        resultView.text ="Name : ${simpson.name},Job : ${simpson.job},Age : ${simpson.age}"

        
    }
}