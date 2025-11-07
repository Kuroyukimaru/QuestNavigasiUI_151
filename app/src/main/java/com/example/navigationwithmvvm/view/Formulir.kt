package com.example.navigationwithmvvm.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.navigationwithmvvm.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK: List<String> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick: () -> Unit
) {
    var nama by remember { mutableStateOf("") }
    var selectedJenis by remember { mutableStateOf(jenisK.first()) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Form Isian", color = Color.White) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier
                .padding(paddingValues = isiRuang)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Nama Lengkap
            OutlinedTextField(
                value = nama,
                onValueChange = { nama = it },
                singleLine = true,
                label = { Text("Nama Lengkap") },
                modifier = Modifier
                    .padding(top = 20.dp)
                    .width(250.dp)
            )

            HorizontalDivider(
                modifier = Modifier
                    .padding(vertical = 20.dp)
                    .width(250.dp),
                thickness = 1.dp,
                color = Color.Red
            )

            // Jenis Kelamin
            Text(text = "Jenis Kelamin", style = MaterialTheme.typography.titleMedium)
            Row(
                modifier = Modifier.padding(top = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                jenisK.forEach { item ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(horizontal = 10.dp)
                    ) {
                        RadioButton(
                            selected = (selectedJenis == item),
                            onClick = { selectedJenis = item }
                        )
                        Text(text = item)
                    }
                }
            }

            Spacer(modifier = Modifier.height(30.dp))

            // Tombol Submit
            Button(
                onClick = OnSubmitBtnClick,
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.teal_700))
            ) {
                Text("Submit", color = Color.White)
            }


    }
}
