package com.example.csgobuildguide


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.csgobuildguide.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lateinit var firebaseAuth: FirebaseAuth
        binding = ActivityMainBinding.inflate(layoutInflater)
        var primaryWeapon = null
        var secundaryWeapon = null
        var granade = null
        var flashbang = null
        var smoke = null
        var zeus = null
        var armor = null
        var armorAndHelmet = null
        var defuseKit = null
        setContentView(binding.root)

        val counterTerrorist = CounterTerroristFragment()
        val terrorist = TerroristFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, counterTerrorist)
            addToBackStack(null)
            commit()
        }

        binding.buttonFragment2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, counterTerrorist)
                addToBackStack(null)
                commit()
            }
        }

        binding.buttonFragment1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, terrorist)
                commit()
            }
        }
        binding.imageView16.setOnClickListener {
            FirebaseAuth.getInstance().signOut();
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
            finish()
        }
        binding.imageView18.setOnClickListener{
            val intent = Intent(this, MyProfileActivity::class.java)
            startActivity(intent)
        }
    }
}