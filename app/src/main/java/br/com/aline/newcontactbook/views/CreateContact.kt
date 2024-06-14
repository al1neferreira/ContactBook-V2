package br.com.aline.newcontactbook.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.aline.newcontactbook.components.CustomButton
import br.com.aline.newcontactbook.components.CustomTextField
import br.com.aline.newcontactbook.ui.theme.Blue500

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateContact(navController: NavController) {

    var name by remember { mutableStateOf("") }
    var surname by remember { mutableStateOf("") }
    var phone1 by remember { mutableStateOf("") }
    var phone2 by remember { mutableStateOf("") }
    var cpf by remember { mutableStateOf("") }
    var uf by remember { mutableStateOf("") }
    var birhDate by remember { mutableStateOf("") }
    var createdAt by remember { mutableStateOf("") }


    Scaffold(topBar = {
        TopAppBar(
            modifier = Modifier.fillMaxWidth(),
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = Blue500,
            ),
            title = {
                Text(
                    text = "Adicionar contato",
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color.Black
                )
            })


    }

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(top = 60.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CustomTextField(
                value = name,
                onValueChange = {
                    name = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 50.dp, end = 50.dp),
                label = "Nome ",
                maxLines = 1,
                keyboardType = KeyboardType.Text
            )
            CustomTextField(
                value = surname,
                onValueChange = {
                    surname = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 50.dp, end = 50.dp),
                label = "Sobrenome ",
                maxLines = 1,
                keyboardType = KeyboardType.Text
            )
            CustomTextField(
                value = phone1,
                onValueChange = {
                    phone1 = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 50.dp, end = 50.dp),
                label = "Telefone 1 ",
                maxLines = 1,
                keyboardType = KeyboardType.Number
            )
            CustomTextField(
                value = phone2,
                onValueChange = {
                    phone2 = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 50.dp, end = 50.dp),
                label = "Telefone 2",
                maxLines = 1,
                keyboardType = KeyboardType.Number
            )

            CustomTextField(
                value = cpf,
                onValueChange = {
                    cpf = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 50.dp, end = 50.dp),
                label = "CPF",
                maxLines = 1,
                keyboardType = KeyboardType.Number
            )

            CustomTextField(
                value = uf,
                onValueChange = {
                    uf = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 50.dp, end = 50.dp),
                label = "UF",
                maxLines = 1,
                keyboardType = KeyboardType.Text
            )
            CustomTextField(
                value = birhDate,
                onValueChange = {
                    birhDate = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 50.dp, end = 50.dp),
                label = "Data de nascimento ",
                maxLines = 1,
                keyboardType = KeyboardType.Number
            )

            CustomButton(
                onClick = {
                     if (name.isEmpty()
                        || surname.isEmpty()
                        ||phone1.isEmpty()
                        ||uf.isEmpty()
                        ||birhDate.isEmpty() ) {
                        println("Preencha todos os campos")
                    } else{
                        println("Contato adicionado")
                    }

                },
                text = "SALVAR"
            )
        }
    }
}

@Preview
@Composable
private fun CreatContacPreview() {
    CreateContact(navController = rememberNavController())

}