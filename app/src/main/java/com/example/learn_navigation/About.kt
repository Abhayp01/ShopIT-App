package com.example.learn_navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.learn_navigation.ui.theme.*

@Composable
fun About(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    )
    {
        Column {
            TopBar()
            Spacer(modifier = Modifier.width(8.dp))
            Box(modifier = Modifier){
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.aboutus),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentScale = ContentScale.Crop
                    )
                }
            }
            Spacer(modifier = Modifier.width(40.dp))
            Card(shape = RoundedCornerShape(40.dp),modifier = Modifier
                .background(color = white20)
                .padding(20.dp)
                .fillMaxSize()
            ) {
                Box(
                    modifier = Modifier
                        .padding(20.dp)
                        .fillMaxSize()
                ) {
                    Column(
                    ) {
                        Text(
                            modifier = Modifier,
                            text = "This app aims to Helps the small scale business owners ,who are being suppressed by the big IT ecommerce Companies .\n",
                            style = MaterialTheme.typography.h5,
                            color = DeepBlue,
                            fontWeight = FontWeight.Bold

                        )
                        Text(
                            modifier = Modifier,
                            text = "Through this app small Scale Business owners can share their it product with their customers hence scaling and efficiently selling their products.",
                            style = MaterialTheme.typography.h5,
                            color = DeepBlue,
                            fontWeight = FontWeight.Bold

                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally),
                            text = "Contact us :",
                            style = MaterialTheme.typography.h5,
                            color = Color.Blue,
                            fontWeight = FontWeight.Bold

                        )
                        Text(modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally),
                            textAlign = TextAlign.End,
                            text = "+91 1234567890",
                            style = MaterialTheme.typography.h5,
                            color = Color.Green,
                            fontWeight = FontWeight.Bold

                        )
                    }
                }
            }
            }
        }
    }