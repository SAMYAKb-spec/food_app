package com.codewithfk.foodhub.ui.features.food_item_details

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.codewithfk.foodhub.R
import com.codewithfk.foodhub.data.models.FoodItem
import com.codewithfk.foodhub.ui.features.restaurant_details.RestaurantDetails
import com.codewithfk.foodhub.ui.features.restaurant_details.RestaurantDetailsHeader

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun SharedTransitionScope.FoodDetailsScreen(
    navController: NavController,
    foodItem: FoodItem,
    animatedVisibilityScope: AnimatedVisibilityScope
) {
    val count = remember {
        mutableStateOf(0)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ) {
        RestaurantDetailsHeader(
            imageUrl = foodItem.imageUrl,
            restaurantID = foodItem.id,
            animatedVisibilityScope = animatedVisibilityScope,
            onBackButton = { /*TODO*/ }) {
        }
        RestaurantDetails(
            title = foodItem.name,
            description = foodItem.description,
            restaurantID = foodItem.id,
            animatedVisibilityScope = animatedVisibilityScope
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "$${foodItem.price}", color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.headlineLarge
            )
            Spacer(modifier = Modifier.weight(1f))
            Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.add),
                    contentDescription = null,
                    modifier = Modifier.clickable { count.value++ })
                Spacer(modifier = Modifier.size(8.dp))
                Text(text = "${count.value}", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.size(8.dp))
                Image(
                    painter = painterResource(id = R.drawable.minus),
                    contentDescription = null,
                    modifier = Modifier.clickable { count.value-- })

            }
        }
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(8.dp)) {
            Row(
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary)
                    .padding(horizontal = 8.dp)
                    .clip(RoundedCornerShape(32.dp)),
                verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
            ) {
                Image(painter = painterResource(id = R.drawable.cart), contentDescription = null)
                Spacer(modifier = Modifier.size(8.dp))
                Text(text = "Add to Cart".uppercase(), style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}










