package com.example.navigationwithmvvm.view



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK: List<String> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick: () -> Unit
) {
    var nama by remember { mutableStateOf("") }
    var selectedJenis by remember { mutableStateOf(jenisK.first()) }


}
