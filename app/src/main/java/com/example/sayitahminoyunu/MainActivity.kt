package com.example.sayitahminoyunu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayitahminoyunu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.buttonId.setOnClickListener {
            sayiTahmini()
        }
    }


    fun sayiTahmini() {

        var tahminEdilenSayi = binding.tahminEditTextId.text.toString()
        var tahminiSayi = tahminEdilenSayi.toIntOrNull()

        if (tahminiSayi != null) {

            val hileAcık = binding.switchId.isChecked
            val secilenRadioButton = binding.radioGroupId.checkedRadioButtonId
            var randomDeger: Int
            var rnds: Int

            if (hileAcık) {
                randomDeger = when (secilenRadioButton) {

                    R.id.firstRadioId -> 5
                    R.id.secondRadioId -> 15
                    else -> 27
                }
                rnds = (1..randomDeger).random()
                if (tahminiSayi == rnds)
                    binding.textId.text = "Tebrikler! Bildiniz"
                else
                    binding.textId.text = "Üzgünüm, tuttuğum sayı $rnds"

            }
            if (!hileAcık) {

                randomDeger = 30
                rnds = (1..randomDeger).random()
                if (tahminiSayi == rnds)
                    binding.textId.text = "Tebrikler! Bildiniz"
                else
                    binding.textId.text = "Üzgünüm, tuttuğum sayı $rnds"

            }


        }


    }


}