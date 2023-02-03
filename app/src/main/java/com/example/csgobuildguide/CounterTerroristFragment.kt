package com.example.csgobuildguide



import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.csgobuildguide.databinding.FragmentCounterTerroristBinding
import com.google.firebase.database.FirebaseDatabase
import com.squareup.picasso.Picasso


class CounterTerroristFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counter_terrorist, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val pistol = view?.findViewById<ImageView>(R.id.imageView3)
        val rifle = view?.findViewById<ImageView>(R.id.imageView9)
        val heavy = view?.findViewById<ImageView>(R.id.imageView12)
        val smg = view?.findViewById<ImageView>(R.id.imageView6)
        val equipment = view?.findViewById<ImageView>(R.id.imageView10)
        val granades = view?.findViewById<ImageView>(R.id.imageView13)
        if(pistol!=null){
            pistol.setOnClickListener{
                val callpistolintent = Intent(activity, CounterTerroristGuns::class.java)
                callpistolintent.putExtra("category", "pistols")
                startActivity(callpistolintent)
            }
        }
        if(rifle!=null){
            rifle.setOnClickListener{
                val callpistolintent = Intent(activity, CounterTerroristGuns::class.java)
                callpistolintent.putExtra("category", "rifles")
                startActivity(callpistolintent)
            }
        }
        if(heavy!=null){
            heavy.setOnClickListener{
                val callpistolintent = Intent(activity, CounterTerroristGuns::class.java)
                callpistolintent.putExtra("category", "heavy")
                startActivity(callpistolintent)
            }
        }
        if(smg!=null){
            smg.setOnClickListener{
                val callpistolintent = Intent(activity, CounterTerroristGuns::class.java)
                callpistolintent.putExtra("category", "smg")
                startActivity(callpistolintent)
            }
        }
        if(equipment!=null){
            equipment.setOnClickListener{
                val callpistolintent = Intent(activity, CounterTerroristGuns::class.java)
                callpistolintent.putExtra("category", "equipment")
                startActivity(callpistolintent)
            }
        }
        if(granades!=null){
            granades.setOnClickListener{
                val callpistolintent = Intent(activity, CounterTerroristGuns::class.java)
                callpistolintent.putExtra("category", "granades")
                startActivity(callpistolintent)
            }
        }
    }
}
