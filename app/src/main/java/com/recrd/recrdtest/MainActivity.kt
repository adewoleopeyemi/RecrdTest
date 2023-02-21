package com.recrd.recrdtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.recrd.recrdtest.presentation.ImagesScreen
import com.recrd.recrdtest.presentation.theme.RecrdTestTheme
import com.recrd.recrdtest.presentation.viewmodel.ImagesViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {
    private val imagesViewModel by viewModel<ImagesViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            RecrdTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = "Route/Image"
                    ) {
                        composable("Route/Image"){
                            LaunchedEffect(key1 = Unit){
                                imagesViewModel.onAction(ImagesViewModel.Action.LoadMoreItems(
                                    getString(R.string.cats_api_key)))
                            }
                            ImagesScreen(viewModel = imagesViewModel)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RecrdTestTheme {
        Greeting("Android")
    }
}