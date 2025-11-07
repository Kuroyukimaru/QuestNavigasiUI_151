package com.example.navigationwithmvvm.view



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
    )
    }
}
