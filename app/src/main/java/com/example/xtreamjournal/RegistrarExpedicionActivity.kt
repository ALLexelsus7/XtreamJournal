package com.example.xtreamjournal

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import com.google.android.material.switchmaterial.SwitchMaterial

class RegistrarExpedicionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registrar_expedicion)

        // Ajuste para que el contenido no quede debajo de las barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            val basePadding = (24 * resources.displayMetrics.density).toInt() // 24dp en pixeles
            v.setPadding(
                basePadding + systemBars.left,
                basePadding + systemBars.top,
                basePadding + systemBars.right,
                basePadding + systemBars.bottom
            )
            insets
        }

        // Lógica del Switch para cambiar el texto dinámicamente
        val swEpico = findViewById<SwitchMaterial>(R.id.tbEpico)
        swEpico.setOnCheckedChangeListener { _, isChecked ->
            swEpico.text = if (isChecked) {
                getString(R.string.toggle_epico_on)
            } else {
                getString(R.string.toggle_epico_off)
            }
        }

        // Lógica del botón Guardar
        val btnGuardar = findViewById<MaterialButton>(R.id.btnGuardar)
        btnGuardar.setOnClickListener {
            // Por ahora solo mostramos un mensaje de éxito
            Toast.makeText(this, "¡Bitácora guardada con éxito!", Toast.LENGTH_SHORT).show()
            // Podríamos cerrar la actividad para volver al Home
            finish()
        }
    }
}