package com.example.csgobuildguide


import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.csgobuildguide.databinding.ActivityCounterTerroristGunsBinding
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import com.squareup.picasso.Picasso



class CounterTerroristGuns : AppCompatActivity() {
    private val db = Firebase.firestore
    private lateinit var binding: ActivityCounterTerroristGunsBinding
    var firebaseDatabase = FirebaseDatabase.getInstance()
    var database = Firebase.storage
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCounterTerroristGunsBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter_terrorist_guns)


        var category = intent.getStringExtra("category")
        var imageURL = ""
        var imageURL2 = ""
        var imageURL3 = ""
        var imageURL4 = ""
        var imageURL5 = ""
        var imageURL6 = ""
/*Ispricavam se sto je ovako lose napisano ovo dole, no kasnio sam s projektom i moarao sam zuriti*/

        if(category=="pistols") {
            val textView = findViewById<TextView>(R.id.textView5)
            textView.setText("USP-S")
            val textView2 = findViewById<TextView>(R.id.textView19)
            textView2.setText("Desert Eagle")
            val textView3 = findViewById<TextView>(R.id.textView20)
            textView3.setText("Five-SeveN")
            val textView4 = findViewById<TextView>(R.id.textView21)
            textView4.setText("P250")
            val textView5 = findViewById<TextView>(R.id.textView22)
            textView5.setText("Dual Berettas")
            val textView6 = findViewById<TextView>(R.id.textView24)
            textView6.setText("CZ75-Auto")

            val imageItemView = findViewById<ImageView>(R.id.imageView15)
            val imgPath = database.reference.child("/myImage/pistols/usp.png")
            imgPath.downloadUrl.addOnSuccessListener { Uri ->
                imageURL = Uri.toString()
                Picasso.get().load(imageURL).into(imageItemView)
            }
            val imageItemView2 = findViewById<ImageView>(R.id.imageView17)
            val imgPath2 = database.reference.child("/myImage/pistols/eagle.png")
            imgPath2.downloadUrl.addOnSuccessListener { Uri ->
                imageURL2 = Uri.toString()
                Picasso.get().load(imageURL2).into(imageItemView2)
            }
            val imageItemView3 = findViewById<ImageView>(R.id.imageView20)
            val imgPath3 = database.reference.child("/myImage/pistols/five.png")
            imgPath3.downloadUrl.addOnSuccessListener { Uri ->
                imageURL3 = Uri.toString()
                Picasso.get().load(imageURL3).into(imageItemView3)
            }
            val imageItemView4 = findViewById<ImageView>(R.id.imageView21)
            val imgPath4 = database.reference.child("/myImage/pistols/p.png")
            imgPath4.downloadUrl.addOnSuccessListener { Uri ->
                imageURL4 = Uri.toString()
                Picasso.get().load(imageURL4).into(imageItemView4)
            }
            val imageItemView5 = findViewById<ImageView>(R.id.imageView22)
            val imgPath5 = database.reference.child("/myImage/pistols/dual.png")
            imgPath5.downloadUrl.addOnSuccessListener { Uri ->
                imageURL5 = Uri.toString()
                Picasso.get().load(imageURL5).into(imageItemView5)
            }
            val imageItemView6 = findViewById<ImageView>(R.id.imageView23)
            val imgPath6 = database.reference.child("/myImage/pistols/cz.png")
            imgPath6.downloadUrl.addOnSuccessListener { Uri ->
                imageURL6 = Uri.toString()
                Picasso.get().load(imageURL6).into(imageItemView6)
            }
        }
        if(category=="rifles") {
            val textView = findViewById<TextView>(R.id.textView5)
            textView.setText("AUG")
            val textView2 = findViewById<TextView>(R.id.textView19)
            textView2.setText("M4A1-S")
            val textView3 = findViewById<TextView>(R.id.textView20)
            textView3.setText("SCAR-20")
            val textView4 = findViewById<TextView>(R.id.textView21)
            textView4.setText("AWP")
            val textView5 = findViewById<TextView>(R.id.textView22)
            textView5.setText("SSG-08")
            val textView6 = findViewById<TextView>(R.id.textView24)
            textView6.setText("Famas")

            val imageItemView = findViewById<ImageView>(R.id.imageView15)
            val imgPath = database.reference.child("/myImage/rifles/AUG.png")
            imgPath.downloadUrl.addOnSuccessListener { Uri ->
                imageURL = Uri.toString()
                Picasso.get().load(imageURL).into(imageItemView)
            }
            val imageItemView2 = findViewById<ImageView>(R.id.imageView17)
            val imgPath2 = database.reference.child("/myImage/rifles/M4A1S.png")
            imgPath2.downloadUrl.addOnSuccessListener { Uri ->
                imageURL2 = Uri.toString()
                Picasso.get().load(imageURL2).into(imageItemView2)
            }
            val imageItemView3 = findViewById<ImageView>(R.id.imageView20)
            val imgPath3 = database.reference.child("/myImage/rifles/SCAR.png")
            imgPath3.downloadUrl.addOnSuccessListener { Uri ->
                imageURL3 = Uri.toString()
                Picasso.get().load(imageURL3).into(imageItemView3)
            }
            val imageItemView4 = findViewById<ImageView>(R.id.imageView21)
            val imgPath4 = database.reference.child("/myImage/rifles/AWP.png")
            imgPath4.downloadUrl.addOnSuccessListener { Uri ->
                imageURL4 = Uri.toString()
                Picasso.get().load(imageURL4).into(imageItemView4)
            }
            val imageItemView5 = findViewById<ImageView>(R.id.imageView22)
            val imgPath5 = database.reference.child("/myImage/rifles/SSG.png")
            imgPath5.downloadUrl.addOnSuccessListener { Uri ->
                imageURL5 = Uri.toString()
                Picasso.get().load(imageURL5).into(imageItemView5)
            }
            val imageItemView6 = findViewById<ImageView>(R.id.imageView23)
            val imgPath6 = database.reference.child("/myImage/rifles/FAMAS.png")
            imgPath6.downloadUrl.addOnSuccessListener { Uri ->
                imageURL6 = Uri.toString()
                Picasso.get().load(imageURL6).into(imageItemView6)
            }
        }
        if(category=="heavy") {
            val textView = findViewById<TextView>(R.id.textView5)
            textView.setText("MAG-7")
            val textView2 = findViewById<TextView>(R.id.textView19)
            textView2.setText("Nova")
            val textView3 = findViewById<TextView>(R.id.textView20)
            textView3.setText("XM1014")
            val textView4 = findViewById<TextView>(R.id.textView21)
            textView4.setText("M249")
            val textView5 = findViewById<TextView>(R.id.textView22)
            textView5.setText("Negev")
            val textView6 = findViewById<TextView>(R.id.textView24)
            textView6.setText("")

            val imageItemView = findViewById<ImageView>(R.id.imageView15)
            val imgPath = database.reference.child("/myImage/heavy/MAG-7.png")
            imgPath.downloadUrl.addOnSuccessListener { Uri ->
                imageURL = Uri.toString()
                Picasso.get().load(imageURL).into(imageItemView)
            }
            val imageItemView2 = findViewById<ImageView>(R.id.imageView17)
            val imgPath2 = database.reference.child("/myImage/heavy/Nova.png")
            imgPath2.downloadUrl.addOnSuccessListener { Uri ->
                imageURL2 = Uri.toString()
                Picasso.get().load(imageURL2).into(imageItemView2)
            }
            val imageItemView3 = findViewById<ImageView>(R.id.imageView20)
            val imgPath3 = database.reference.child("/myImage/heavy/XM1014.png")
            imgPath3.downloadUrl.addOnSuccessListener { Uri ->
                imageURL3 = Uri.toString()
                Picasso.get().load(imageURL3).into(imageItemView3)
            }
            val imageItemView4 = findViewById<ImageView>(R.id.imageView21)
            val imgPath4 = database.reference.child("/myImage/heavy/M249.png")
            imgPath4.downloadUrl.addOnSuccessListener { Uri ->
                imageURL4 = Uri.toString()
                Picasso.get().load(imageURL4).into(imageItemView4)
            }
            val imageItemView5 = findViewById<ImageView>(R.id.imageView22)
            val imgPath5 = database.reference.child("/myImage/heavy/Negev.png")
            imgPath5.downloadUrl.addOnSuccessListener { Uri ->
                imageURL5 = Uri.toString()
                Picasso.get().load(imageURL5).into(imageItemView5)
            }
            /*val imageItemView6 = findViewById<ImageView>(R.id.imageView23)
            val imgPath6 = database.reference.child("")
            imgPath6.downloadUrl.addOnSuccessListener { Uri ->
                imageURL6 = Uri.toString()
                Picasso.get().load(imageURL6).into(imageItemView6)
            }*/
        }
        if(category=="smg") {
            val textView = findViewById<TextView>(R.id.textView5)
            textView.setText("MP5-SD")
            val textView2 = findViewById<TextView>(R.id.textView19)
            textView2.setText("MP7")
            val textView3 = findViewById<TextView>(R.id.textView20)
            textView3.setText("MP9")
            val textView4 = findViewById<TextView>(R.id.textView21)
            textView4.setText("PP-Bizon")
            val textView5 = findViewById<TextView>(R.id.textView22)
            textView5.setText("P90")
            val textView6 = findViewById<TextView>(R.id.textView24)
            textView6.setText("UMP-45")

            val imageItemView = findViewById<ImageView>(R.id.imageView15)
            val imgPath = database.reference.child("/myImage/smg/MP5-SD.png")
            imgPath.downloadUrl.addOnSuccessListener { Uri ->
                imageURL = Uri.toString()
                Picasso.get().load(imageURL).into(imageItemView)
            }
            val imageItemView2 = findViewById<ImageView>(R.id.imageView17)
            val imgPath2 = database.reference.child("/myImage/smg/MP7.png")
            imgPath2.downloadUrl.addOnSuccessListener { Uri ->
                imageURL2 = Uri.toString()
                Picasso.get().load(imageURL2).into(imageItemView2)
            }
            val imageItemView3 = findViewById<ImageView>(R.id.imageView20)
            val imgPath3 = database.reference.child("/myImage/smg/MP9.png")
            imgPath3.downloadUrl.addOnSuccessListener { Uri ->
                imageURL3 = Uri.toString()
                Picasso.get().load(imageURL3).into(imageItemView3)
            }
            val imageItemView4 = findViewById<ImageView>(R.id.imageView21)
            val imgPath4 = database.reference.child("/myImage/smg/P90.png")
            imgPath4.downloadUrl.addOnSuccessListener { Uri ->
                imageURL4 = Uri.toString()
                Picasso.get().load(imageURL4).into(imageItemView4)
            }
            val imageItemView5 = findViewById<ImageView>(R.id.imageView22)
            val imgPath5 = database.reference.child("/myImage/smg/PP-Bizon.png")
            imgPath5.downloadUrl.addOnSuccessListener { Uri ->
                imageURL5 = Uri.toString()
                Picasso.get().load(imageURL5).into(imageItemView5)
            }
            val imageItemView6 = findViewById<ImageView>(R.id.imageView23)
            val imgPath6 = database.reference.child("/myImage/smg/UMP-45.png")
            imgPath6.downloadUrl.addOnSuccessListener { Uri ->
                imageURL6 = Uri.toString()
                Picasso.get().load(imageURL6).into(imageItemView6)
            }
        }
        if(category=="heavy") {
            val textView = findViewById<TextView>(R.id.textView5)
            textView.setText("MAG-7")
            val textView2 = findViewById<TextView>(R.id.textView19)
            textView2.setText("Nova")
            val textView3 = findViewById<TextView>(R.id.textView20)
            textView3.setText("XM1014")
            val textView4 = findViewById<TextView>(R.id.textView21)
            textView4.setText("M249")
            val textView5 = findViewById<TextView>(R.id.textView22)
            textView5.setText("Negev")
            val textView6 = findViewById<TextView>(R.id.textView24)
            textView6.setText("")

            val imageItemView = findViewById<ImageView>(R.id.imageView15)
            val imgPath = database.reference.child("/myImage/heavy/MAG-7.png")
            imgPath.downloadUrl.addOnSuccessListener { Uri ->
                imageURL = Uri.toString()
                Picasso.get().load(imageURL).into(imageItemView)
            }
            val imageItemView2 = findViewById<ImageView>(R.id.imageView17)
            val imgPath2 = database.reference.child("/myImage/heavy/Nova.png")
            imgPath2.downloadUrl.addOnSuccessListener { Uri ->
                imageURL2 = Uri.toString()
                Picasso.get().load(imageURL2).into(imageItemView2)
            }
            val imageItemView3 = findViewById<ImageView>(R.id.imageView20)
            val imgPath3 = database.reference.child("/myImage/heavy/XM1014.png")
            imgPath3.downloadUrl.addOnSuccessListener { Uri ->
                imageURL3 = Uri.toString()
                Picasso.get().load(imageURL3).into(imageItemView3)
            }
            val imageItemView4 = findViewById<ImageView>(R.id.imageView21)
            val imgPath4 = database.reference.child("/myImage/heavy/M249.png")
            imgPath4.downloadUrl.addOnSuccessListener { Uri ->
                imageURL4 = Uri.toString()
                Picasso.get().load(imageURL4).into(imageItemView4)
            }
            val imageItemView5 = findViewById<ImageView>(R.id.imageView22)
            val imgPath5 = database.reference.child("/myImage/heavy/Negev.png")
            imgPath5.downloadUrl.addOnSuccessListener { Uri ->
                imageURL5 = Uri.toString()
                Picasso.get().load(imageURL5).into(imageItemView5)
            }
            /*val imageItemView6 = findViewById<ImageView>(R.id.imageView23)
            val imgPath6 = database.reference.child("")
            imgPath6.downloadUrl.addOnSuccessListener { Uri ->
                imageURL6 = Uri.toString()
                Picasso.get().load(imageURL6).into(imageItemView6)
            }*/
        }
        if(category=="equipment") {
            val textView = findViewById<TextView>(R.id.textView5)
            textView.setText("Armor")
            val textView2 = findViewById<TextView>(R.id.textView19)
            textView2.setText("Armor and \nhelmet")
            val textView3 = findViewById<TextView>(R.id.textView20)
            textView3.setText("Defuse Kit")
            val textView4 = findViewById<TextView>(R.id.textView21)
            textView4.setText("Tactical \nShield")
            val textView5 = findViewById<TextView>(R.id.textView22)
            textView5.setText("Zeus x27")
            val textView6 = findViewById<TextView>(R.id.textView24)
            textView6.setText("")

            val imageItemView = findViewById<ImageView>(R.id.imageView15)
            val imgPath = database.reference.child("/myImage/equipment/Armor.png")
            imgPath.downloadUrl.addOnSuccessListener { Uri ->
                imageURL = Uri.toString()
                Picasso.get().load(imageURL).into(imageItemView)
            }
            val imageItemView2 = findViewById<ImageView>(R.id.imageView17)
            val imgPath2 = database.reference.child("/myImage/equipment/armorHelmet.png")
            imgPath2.downloadUrl.addOnSuccessListener { Uri ->
                imageURL2 = Uri.toString()
                Picasso.get().load(imageURL2).into(imageItemView2)
            }
            val imageItemView3 = findViewById<ImageView>(R.id.imageView20)
            val imgPath3 = database.reference.child("/myImage/equipment/defuse.png")
            imgPath3.downloadUrl.addOnSuccessListener { Uri ->
                imageURL3 = Uri.toString()
                Picasso.get().load(imageURL3).into(imageItemView3)
            }
            val imageItemView4 = findViewById<ImageView>(R.id.imageView21)
            val imgPath4 = database.reference.child("/myImage/equipment/shield.png")
            imgPath4.downloadUrl.addOnSuccessListener { Uri ->
                imageURL4 = Uri.toString()
                Picasso.get().load(imageURL4).into(imageItemView4)
            }
            val imageItemView5 = findViewById<ImageView>(R.id.imageView22)
            val imgPath5 = database.reference.child("/myImage/equipment/zeus.png")
            imgPath5.downloadUrl.addOnSuccessListener { Uri ->
                imageURL5 = Uri.toString()
                Picasso.get().load(imageURL5).into(imageItemView5)
            }/*
            val imageItemView6 = findViewById<ImageView>(R.id.imageView23)
            val imgPath6 = database.reference.child("/myImage/smg/UMP-45.png")
            imgPath6.downloadUrl.addOnSuccessListener { Uri ->
                imageURL6 = Uri.toString()
                Picasso.get().load(imageURL6).into(imageItemView6)
            }*/
        }

        if(category=="granades") {
            val textView = findViewById<TextView>(R.id.textView5)
            textView.setText("Incendiary \nGrenade")
            val textView2 = findViewById<TextView>(R.id.textView19)
            textView2.setText("Decoy \nGranade")
            val textView3 = findViewById<TextView>(R.id.textView20)
            textView3.setText("Flashbang")
            val textView4 = findViewById<TextView>(R.id.textView21)
            textView4.setText("HE Granade")
            val textView5 = findViewById<TextView>(R.id.textView22)
            textView5.setText("Smoke \nGranade")
            val textView6 = findViewById<TextView>(R.id.textView24)
            textView6.setText("")

            val imageItemView = findViewById<ImageView>(R.id.imageView15)
            val imgPath = database.reference.child("/myImage/granades/vatract.png")
            imgPath.downloadUrl.addOnSuccessListener { Uri ->
                imageURL = Uri.toString()
                Picasso.get().load(imageURL).into(imageItemView)
            }
            val imageItemView2 = findViewById<ImageView>(R.id.imageView17)
            val imgPath2 = database.reference.child("/myImage/granades/decoy.png")
            imgPath2.downloadUrl.addOnSuccessListener { Uri ->
                imageURL2 = Uri.toString()
                Picasso.get().load(imageURL2).into(imageItemView2)
            }
            val imageItemView3 = findViewById<ImageView>(R.id.imageView20)
            val imgPath3 = database.reference.child("/myImage/granades/flashbang.png")
            imgPath3.downloadUrl.addOnSuccessListener { Uri ->
                imageURL3 = Uri.toString()
                Picasso.get().load(imageURL3).into(imageItemView3)
            }
            val imageItemView4 = findViewById<ImageView>(R.id.imageView21)
            val imgPath4 = database.reference.child("/myImage/granades/henade.png")
            imgPath4.downloadUrl.addOnSuccessListener { Uri ->
                imageURL4 = Uri.toString()
                Picasso.get().load(imageURL4).into(imageItemView4)
            }
            val imageItemView5 = findViewById<ImageView>(R.id.imageView22)
            val imgPath5 = database.reference.child("/myImage/granades/smoke.png")
            imgPath5.downloadUrl.addOnSuccessListener { Uri ->
                imageURL5 = Uri.toString()
                Picasso.get().load(imageURL5).into(imageItemView5)
            }
            /*val imageItemView6 = findViewById<ImageView>(R.id.imageView23)
            val imgPath6 = database.reference.child("")
            imgPath6.downloadUrl.addOnSuccessListener { Uri ->
                imageURL6 = Uri.toString()
                Picasso.get().load(imageURL6).into(imageItemView6)
            }*/
        }
    }
}
