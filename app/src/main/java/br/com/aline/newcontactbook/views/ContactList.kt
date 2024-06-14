package br.com.aline.newcontactbook.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.aline.newcontactbook.ui.theme.Blue500

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContactList(navController: NavController) {

    Scaffold(topBar = {
        TopAppBar(
            modifier = Modifier.fillMaxWidth(),
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = Blue500
            ),
            title = {
                Text(
                    text = "Lista de Contatos",
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color.Black
                )
            })


    },       floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navController.navigate("createContact")
                },
                shape = CircleShape,
                modifier = Modifier.padding(5.dp),
                containerColor = Blue500
            ) {
                Icon(Icons.Filled.Add, "Float Action Button",
                    tint = Color.Black)
            }
        }

    ) {

    }

}

@Preview
@Composable
private fun ContactListPreview() {
    ContactList(navController = rememberNavController())

}