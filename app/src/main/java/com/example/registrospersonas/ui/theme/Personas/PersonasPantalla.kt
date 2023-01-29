package com.example.registrospersonas.ui.theme.Personas

import android.annotation.SuppressLint
import android.graphics.Paint
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@SuppressLint("UnrememberedMutableState")
@Composable
fun PersonaPantalla() {
    val Nombre = mutableStateOf("")
    val Telefono = mutableStateOf("")
    val Celular = mutableStateOf("")
    val Email = mutableStateOf("")
    val Direccion = mutableStateOf("")
    val FechaNacimiento = mutableStateOf("")
    val Ocupacion = mutableStateOf("")

    Column(modifier = Modifier) {
        Spacer(modifier = Modifier.padding(110.dp))
        Text(
            text = "Registro Personas", fontSize = 27.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Column(modifier = Modifier.fillMaxWidth()) {
            TextField(
                value = Nombre.value,
                onValueChange = { Nombre.value = it },
                label = { Text("Nombre") },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = Telefono.value,
                onValueChange = { Telefono.value = it },
                label = { Text("Telefono") },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = Celular.value,
                onValueChange = { Celular.value = it },
                label = { Text("Celular") },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = Email.value,
                onValueChange = { Email.value = it },
                label = { Text("Email") },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = Direccion.value,
                onValueChange = { Direccion.value = it },
                label = { Text("Direccion") },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = FechaNacimiento.value,
                onValueChange = { FechaNacimiento.value = it },
                label = { Text("Fecha Nacimiento") },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = Ocupacion.value,
                onValueChange = { Ocupacion.value = it },
                label = { Text("Ocupacion") },
                modifier = Modifier.fillMaxWidth()
            )
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(onClick = {})
                { Text("Guardar") }
            }

        }
    }
}

















