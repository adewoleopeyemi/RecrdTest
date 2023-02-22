package com.recrd.recrdtest.presentation

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.recrd.recrdtest.domain.models.Cat
import com.recrd.recrdtest.presentation.viewmodel.ImagesViewModel
import org.koin.androidx.compose.getViewModel
import org.koin.androidx.compose.koinViewModel


@Composable
fun ImagesScreen(
    viewModel: ImagesViewModel
) {
    val state = viewModel.state

    if (state.loading){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
        }
    }
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(24.dp)
    ){
        items(state.images.size){i->
            if (i>=state.images.size-1){
                viewModel.onAction(ImagesViewModel.Action.LoadMoreItems(stringResource(id = com.recrd.recrdtest.R.string.cats_api_key)))
            }
            SingleImageItem(state.images[i])
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
fun SingleImageItem(cat: Cat) {
    val ShimmerColorShades = listOf(

        Color.LightGray.copy(0.9f),

        Color.LightGray.copy(0.2f),

        Color.LightGray.copy(0.9f)

    )
    val transition = rememberInfiniteTransition()
    val translateAnim by transition.animateFloat(
        initialValue = 0f,
        targetValue = 1000f,
        animationSpec = infiniteRepeatable(


            tween(durationMillis = 1200, easing = FastOutSlowInEasing),
            RepeatMode.Reverse
        )
    )

    val brush = Brush.linearGradient(
        colors = ShimmerColorShades,
        start = Offset(10f, 10f),
        end = Offset(translateAnim, translateAnim)
    )
    Row(modifier = Modifier
        .fillMaxSize()
        .height(200.dp)
        .clip(RoundedCornerShape(16.dp))
    ) {
        AsyncImage(
            model = cat.url,
            contentDescription = "cat image",
            modifier = Modifier
                .fillMaxSize()
                .background(brush),
            contentScale = ContentScale.Crop,

        )
    }
}
