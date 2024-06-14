package br.com.aline.newcontactbook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.aline.newcontactbook.ui.theme.NewContactBookTheme
import br.com.aline.newcontactbook.views.ContactList
import br.com.aline.newcontactbook.views.CreateContact
import br.com.aline.newcontactbook.views.UpdateContact

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewContactBookTheme {

                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "contactList") {
                    composable("contactList"){
                        ContactList(navController)
                    }
                    composable("createContact"){
                        CreateContact(navController)
                    }
                    composable("updateContact"){
                        UpdateContact(navController)
                    }

                }


            }
        }
    }
}


