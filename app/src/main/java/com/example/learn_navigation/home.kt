package com.example.learn_navigation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.learn_navigation.ui.theme.DeepBlue
import com.example.learn_navigation.ui.theme.Learn_NavigationTheme
import com.example.learn_navigation.ui.theme.Teal200
import com.example.learn_navigation.ui.theme.white10
import com.example.learn_navigation.R


@ExperimentalFoundationApi
@Composable
fun HomeScreen(navController:NavHostController){
    Box(modifier = Modifier
        .background(color = white10)
        .fillMaxSize()
    ) {
        Column {
            TopBar()
            Spacer(modifier = Modifier.height(15.dp))
            Box(modifier = Modifier) {
                Column() {
                    Text(
                        modifier = Modifier.padding(start = 15.dp),
                        text = "Offers",
                        fontSize = MaterialTheme.typography.h5.fontSize,
                        fontWeight = FontWeight.Bold
                    )
                    Promotions()
                }
            }
            ProductList(navController)
            }
        }
//        Text(
//
//            text = "Home",
////            color = MaterialTheme.colors.primary,
//            fontSize = MaterialTheme.typography.h3.fontSize,
//            fontWeight = FontWeight.Bold
//        )

    }

@Composable
fun TopBar() {
        Box(
            modifier = Modifier
                .background(color = DeepBlue)
                .fillMaxWidth()

        ) {
            Column() {
                Text(
                    modifier = Modifier
                        .padding(end = 5.dp)
                        .padding(top = 5.dp)
                        .align(alignment = Alignment.CenterHorizontally),
                    text = "Shop it",
                    style = MaterialTheme.typography.h5,
                    color = Color.White,
                    fontWeight = FontWeight.Bold

                )
                AppBar()

            }
        }
}





@Composable
fun AppBar() {
    Row(
        Modifier
            .padding(16.dp)
            .height(48.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        TextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Search IT Products..", fontSize = 12.sp) },
            singleLine = true,
            leadingIcon = { Icon(imageVector = Icons.Rounded.Search, contentDescription = "Search") },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        )
        Spacer(modifier = Modifier.width(8.dp))
        IconButton(onClick = { }) {
            Icon(imageVector = Icons.Outlined.FavoriteBorder, contentDescription = "", tint = Color.Red)
        }
        IconButton(onClick = {}) {
            Icon(imageVector = Icons.Outlined.Notifications, contentDescription = "", tint = Color.Yellow)
        }
    }
}

@Composable
fun Promotions() {
    LazyRow(
        Modifier.height(160.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            PromotionItem(
                imagePainter= painterResource(id =R.drawable.desktop),
                title = "Desktop",
                subtitle = "Discount",
                header = "10%",
                backgroundColor = MaterialTheme.colors.primary
            )
        }
        item {
            PromotionItem(
                imagePainter = painterResource(id =R.drawable.laptop),
                title = "Laptops",
                subtitle = "Discount",
                header = "20%",
                backgroundColor = Color(0xff6EB6F5)
            )
        }
        item {
            PromotionItem(
                imagePainter = painterResource(id =R.drawable.soft_acc),
                title = "Software & Accessories",
                subtitle = "Discount",
                header = "20%",
                backgroundColor = Color(0xff6EB6F5)
            )
        }
    }
}

@Composable
fun PromotionItem(
    title: String = "",
    subtitle: String = "",
    header: String = "",
    backgroundColor: Color = Color.Transparent,
    imagePainter: Painter
) {
    Card(
        Modifier.width(300.dp),
        shape = RoundedCornerShape(8.dp),
        backgroundColor = backgroundColor,
        elevation = 0.dp
    ) {
        Row {
            Column(
                Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = title, fontSize = 14.sp, color = Color.White)
                Text(text = subtitle, fontSize = 16.sp, color = Color.White, fontWeight = FontWeight.Bold)
                Text(text = header, fontSize = 28.sp, color = Color.White, fontWeight = FontWeight.Bold)
            }
            Image(
                painter = imagePainter, contentDescription = "",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f),
                alignment = Alignment.CenterEnd,
                contentScale = ContentScale.Crop
            )
        }
    }
}
@ExperimentalFoundationApi
@Composable
fun ProductList(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Features",
            style = MaterialTheme.typography.h5,
            modifier = Modifier.padding(15.dp),
            fontWeight = FontWeight.Bold
        )
    }
    LazyVerticalGrid(cells = GridCells.Fixed(2)) {
            item {
                Card(modifier =Modifier
                    .width(150.dp)
                    .height(150.dp)
                    .clickable {
                        navController.navigate(route = Screen.LaptopScreen.rout)
                    }
                ) {
                    ProductCard(
                        imagePainter = painterResource(id = R.drawable.lap),
                        title = "Laptops"
                    )

                }
            }

            item {
                Card(modifier =Modifier
                    .width(150.dp)
                    .height(150.dp)
                    .clickable {
                        navController.navigate(route = Screen.SoftwareScreen.rout)
                    }
                ) {
                    ProductCard(
                        imagePainter = painterResource(id = R.drawable.soft),
                        title = "Softwares"
                    )
                }
            }
        item {
            Card(modifier =Modifier
                .clickable {
                    navController.navigate(route = Screen.DesktopScreen.rout)
                }
                .width(150.dp)
                .height(150.dp)
            ){
                ProductCard(
                    imagePainter = painterResource(id = R.drawable.desk),
                    title = "Desktops")
            }

        }
        item {
            Card(modifier =Modifier
                .width(150.dp)
                .height(150.dp)
                .clickable {
                    navController.navigate(route = Screen.About.rout)
                }
            ) {
                ProductCard(
                    imagePainter = painterResource(id = R.drawable.about),
                    title = "About Us"
                )
            }

        }
    }
}

@Composable
fun ProductCard(title: String = "",
                    imagePainter: Painter) {
    Card(modifier = Modifier
        .width(150.dp)
        .height(150.dp)
        .padding(8.dp), elevation = 2.dp) {
        Column {
            Image(
                painter = imagePainter,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = title,
                modifier = Modifier
                    .padding(2.dp),
                style = MaterialTheme.typography.h6,
            )
        }
    }
}
























@Preview(showBackground = true)
@Composable
fun TopPreview() {
    Learn_NavigationTheme {
        AppBar()
    }
}