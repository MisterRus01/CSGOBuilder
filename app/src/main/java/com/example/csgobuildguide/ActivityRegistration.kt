package com.example.csgobuildguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.csgobuildguide.databinding.ActivityRegistrationBinding
import com.google.firebase.auth.FirebaseAuth

class ActivityRegistration : AppCompatActivity() {

    private lateinit var binding:ActivityRegistrationBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth= FirebaseAuth.getInstance()

        binding.textView4.setOnClickListener{
            val intent = Intent( this, ActivityLogin::class.java)
            startActivity(intent)
        }

        binding.registrationButton.setOnClickListener{
            val email = binding.emailRegistration.text.toString()
            val nickname = binding.nickname.text.toString()
            val password = binding.password.text.toString()

            if(email.isNotEmpty() && nickname.isNotEmpty() && password.isNotEmpty()) {
                firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (it.isSuccessful) {
                        val intent = Intent( this, ActivityLogin::class.java)
                        startActivity(intent)
                    }else{
                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()

                    }
                }
            }else{
                Toast.makeText(this, "Please, fill all the fields !!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}