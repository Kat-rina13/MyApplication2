package com.example.myapplication2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.recycler_view)
        initAdapter(createAnimals())

    }



        private fun initAdapter(animals: List<Animal>) {
            recyclerView?.layoutManager = LinearLayoutManager(this)
            recyclerView?.adapter = AnimalAdapter(animals)
        }


        private fun createAnimals(): List<Animal> {
            val animals = mutableListOf<Animal>()
            animals.add(Animal("Sam", "Duck", "yellow color", R.drawable.duck_svgrepo_com))
            animals.add(Animal("Jane", "Horse", "brown color", R.drawable.horse_svgrepo_com))
            animals.add(Animal("Jack", "Dog", "white color", R.drawable.dog_3_svgrepo_com))
            animals.add(Animal("Choco", "Cat", "black color", R.drawable.chococat_svgrepo_com))
            animals.add(Animal("Bob", "Cow", "black&white color", R.drawable.cow_svgrepo_com))
            animals.add(Animal("Phoebe", "Pig", "pink color", R.drawable.pig_svgrepo_com))
            animals.add(Animal("Diana", "Sheep", "white color", R.drawable.sheep_svgrepo_com))
            animals.add(Animal("David", "Bear", "brown color", R.drawable.bear_svgrepo_com))
            animals.add(Animal("Frank", "Chicken", "white color", R.drawable.chicken_svgrepo_com))
            animals.add(Animal("Bob", "Frog", "green color", R.drawable.keroppi_svgrepo_com))
            animals.add(Animal("Heidi", "Elephant", "grey color", R.drawable.elephant_svgrepo_com))

            return animals
        }
        

}