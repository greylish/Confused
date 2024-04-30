package com.jayson.confused.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jayson.confused.ui.theme.screens.about.AboutScreen
import com.jayson.confused.ui.theme.screens.gallery.GalleryScreen
import com.jayson.confused.ui.theme.screens.home.HomeScreen
import com.jayson.confused.ui.theme.screens.product.AddProductsScreen
import com.jayson.confused.ui.theme.screens.product.ViewUploadsScreen
import com.jayson.confused.ui.theme.screens.profile.ProfileScreen
import com.jayson.confused.ui.theme.screens.register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
            navController:NavHostController=rememberNavController(),
            startDestination:String = ROUTE_REGISTER){
    NavHost(navController = navController,
        modifier = modifier,
        startDestination = startDestination) {
        composable(ROUTE_HOME){ HomeScreen(navController)}
        composable(ROUTE_ABOUT){ AboutScreen(navController)}
        composable(ROUTE_GALLERY){ GalleryScreen(navController)}
        composable(ROUTE_LOGIN){ GalleryScreen(navController)}
        composable(ROUTE_REGISTER){ RegisterScreen(navController)}
        composable(ROUTE_PROFILE){ ProfileScreen(navController)}
        composable(ROUTE_ADD_PRODUCT){ AddProductsScreen(navController)}
        composable(ROUTE_VIEW_UPLOAD){
            ViewUploadsScreen(navController)
        }
    }
}
