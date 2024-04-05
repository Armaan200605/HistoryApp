package com.starmaan.historyapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    //declaring variables
    private lateinit var GenHistory: Button
    private lateinit var clearbut: Button
    private lateinit var inputage: EditText
    private lateinit var TextView: TextView

    @SuppressLint("setTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //initialising

        GenHistory=findViewById(R.id.GenHistory)
        clearbut=findViewById(R.id.clearbut)
        inputage=findViewById(R.id.InputAge)
        TextView=findViewById(R.id.TextView)

        GenHistory.setOnClickListener {
            // create a variable for the age to receive from the user

            val userage = inputage.text.toString().toIntOrNull()
            var response = ""

            // if the age is in between 20 and 110

            if (userage !=null){
                if (userage in 20..110){
                    when(userage){
                        78->response= "Mahatma Gandhi was a civil rights advocate within South Africa. Gandhi also made efforts to bring Indians from all walks of life together while he was in South Africa. He received a lot of recognition for his civil rights efforts.  "
                        95->response= "The first Black president of South Africa was Nelson Mandela.Nelson Mandela co-founded the first black law firm in South African history with fellow ANC member Oliver Tambo. "
                        76->response= "Einstein created the general theory of relativity, a theory of gravitation, by expanding on his special theory of relativity. While Einstein's theory explained gravity as the product of mass and energy bending spacetime itself, Newton's law of universal gravitation portrayed gravity as a force."
                        52->response= "Shakespeare is credited with coining or inventing about 1700 terms during his career. Shakespeare utilised many of the expressions we use on a daily basis for the first time in his plays."
                        67->response= "Painting: The Last Supper. Architecture: When he applied to work for Duke Ludovico Sforza in Milan, he presented himself as an architect. Studies in Anatomy: He was among the first in his field to dissect a human body. Leonardo kept diaries and conducted scientific inquiries in the field of flight."
                        68->response= ""
                        84->response= ""
                        86->response= ""
                        73->response= ""
                        77->response= ""









                    }
                }
            }




        }













    }
}