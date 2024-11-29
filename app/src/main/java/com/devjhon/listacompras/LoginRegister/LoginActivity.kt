package com.devjhon.listacompras.LoginRegister

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.devjhon.listacompras.MainActivity
import com.devjhon.listacompras.R
import com.devjhon.listacompras.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding:  ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigation()
        naviRecSenha()
        naviMain()
    }

    private fun navigation (){
        binding.txtRegistro.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun naviRecSenha (){
        binding.txtEsqueceuSenha.setOnClickListener{
            val senha = Intent(this, RecuperarSenhaActivity::class.java)
            startActivity(senha)
        }
    }

    private fun naviMain(){
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}