package dev.bchen.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import dev.bchen.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(Alignment.Center),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardContent(
                        modifier = Modifier
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCardContent(modifier: Modifier = Modifier) {
    val name = "Brendan Chen"

    // TODO: editing view

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            modifier = Modifier.height(144.dp),
            color = MaterialTheme.colorScheme.primary
        ) {
            Image(painter = painterResource(id = R.drawable.android_logo), contentDescription = "Android logo")
        }
        
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = name,
            modifier = modifier,
            fontSize = TextUnit(32f, TextUnitType.Sp),
        )

        Spacer(modifier = Modifier.height(32.dp))

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Row {
                Icon(painter = painterResource(id = R.drawable.baseline_email_24), contentDescription = "Email")
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "me@bchen.dev")
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row {
                Icon(painter = painterResource(id = R.drawable.baseline_add_call_24), contentDescription = "Email")
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "+1 (123) 456-7890")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCardContent()
    }
}