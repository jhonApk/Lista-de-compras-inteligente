package com.devjhon.listacompras.LoginRegister

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.devjhon.listacompras.R
import com.devjhon.listacompras.databinding.ActivityNovaSenhaBinding

class NovaSenhaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNovaSenhaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNovaSenhaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigate()
    }

    private fun navigate(){
        binding.btnCriarNovaSenha.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
