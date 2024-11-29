package com.devjhon.listacompras.LoginRegister

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.devjhon.listacompras.R
import com.devjhon.listacompras.databinding.ActivityVerificarCodigoBinding

class VerificarCodigoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVerificarCodigoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerificarCodigoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigate()
    }

    private fun navigate(){
        binding.btnConfirmarCodigo.setOnClickListener {
            val intent = Intent(this, NovaSenhaActivity::class.java)
            startActivity(intent)
        }
    }
}
