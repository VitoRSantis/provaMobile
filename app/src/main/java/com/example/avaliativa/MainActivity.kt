package com.example.avaliativa
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.avaliativa.databinding.ActivityMainBinding
import android.widget.Button
import android.widget.TextView
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //====================DESAFIO===================
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //====================DESAFIO===================



        //====================NORMAL======================
        //val rollButton: Button = findViewById(R.id.roll_button)
        //rollButton.setOnClickListener {roll_Dice() }
        //====================NORMAL======================



        //====================DESAFIO=====================
        val rollButton: Button = findViewById(R.id.RolarDado)
        rollButton.setOnClickListener { Result_dado() }
        //====================DESAFIO=====================
    }

    //===========================NORMAL=============================
    //fun roll_Dice() {
        //val randomInt =(1..6).random()
        //val resultText: TextView = findViewById(R.id.roll_Dice)
        //resultText.text = randomInt.toString()
    //===========================NORMAL=============================


     //===========================DESAFIO============================
     fun Result_dado() {
         val ValorDado = binding.ValorDado.text.toString().toInt()
         val randomInt = (1..ValorDado).random()
         val resultText: TextView = findViewById(R.id.Result_dado)
         resultText.text = randomInt.toString()
     //===========================DESAFIO============================
    }
}
