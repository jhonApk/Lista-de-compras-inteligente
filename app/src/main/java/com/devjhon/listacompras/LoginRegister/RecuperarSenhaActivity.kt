package com.devjhon.listacompras.LoginRegister

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.devjhon.listacompras.R
import com.devjhon.listacompras.databinding.ActivityRecuperarSenhaBinding
import com.devjhon.listacompras.databinding.ActivityVerificarCodigoBinding

class RecuperarSenhaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecuperarSenhaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecuperarSenhaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigation()
    }

    private  fun navigation(){
        binding.btnRedefinirSenha.setOnClickListener{
            val intent = Intent(this, VerificarCodigoActivity::class.java)
            startActivity(intent)
        }
    }

}
