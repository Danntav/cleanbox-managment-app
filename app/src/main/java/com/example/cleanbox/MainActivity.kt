package com.example.cleanbox.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.cleanbox.R
import com.example.cleanbox.ui.ClientesActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClientes = findViewById<Button>(R.id.btn_clientes)
        val btnProspectos = findViewById<Button>(R.id.btn_prospectos)
        val btnSincronizar = findViewById<Button>(R.id.btn_sincronizar)

        btnClientes.setOnClickListener {
            val intent = Intent(this, ClientesActivity::class.java)
            startActivity(intent)
        }

        btnProspectos.setOnClickListener {
            val intent = Intent(this, ProspectosActivity::class.java)
            startActivity(intent)
        }

        btnSincronizar.setOnClickListener {
            // Aqui vamos implementar a sincronização depois
        }
    }
}
