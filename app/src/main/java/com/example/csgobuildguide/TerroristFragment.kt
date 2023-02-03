package com.example.csgobuildguide

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment


public class TerroristFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_terrorist, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val pistol = view?.findViewById<ImageView>(R.id.imageView4)
        val rifle = view?.findViewById<ImageView>(R.id.imageView7)
        val heavy = view?.findViewById<ImageView>(R.id.imageView11)
        val smg = view?.findViewById<ImageView>(R.id.imageView5)
        val equipment = view?.findViewById<ImageView>(R.id.imageView8)
        val granades = view?.findViewById<ImageView>(R.id.imageView14)
        if (pistol != null) {
            pistol.setOnClickListener {
                val callpistolintent = Intent(activity, TerroristGuns::class.java)
                callpistolintent.putExtra("category", "pistols")
                startActivity(callpistolintent)
            }
        }
        if(rifle!=null){
            rifle.setOnClickListener{
                val callpistolintent = Intent(activity, TerroristGuns::class.java)
                callpistolintent.putExtra("category", "rifles")
                startActivity(callpistolintent)
            }
        }
        if(heavy!=null){
            heavy.setOnClickListener{
                val callpistolintent = Intent(activity, TerroristGuns::class.java)
                callpistolintent.putExtra("category", "heavyy")
                startActivity(callpistolintent)
            }
        }
        if(smg!=null){
            smg.setOnClickListener{
                val callpistolintent = Intent(activity, TerroristGuns::class.java)
                callpistolintent.putExtra("category", "smg")
                startActivity(callpistolintent)
            }
        }
        if(equipment!=null){
            equipment.setOnClickListener{
                val callpistolintent = Intent(activity, TerroristGuns::class.java)
                callpistolintent.putExtra("category", "equipment")
                startActivity(callpistolintent)
            }
        }
        if(granades!=null){
            granades.setOnClickListener{
                val callpistolintent = Intent(activity, TerroristGuns::class.java)
                callpistolintent.putExtra("category", "granades")
                startActivity(callpistolintent)
            }
        }
    }
}