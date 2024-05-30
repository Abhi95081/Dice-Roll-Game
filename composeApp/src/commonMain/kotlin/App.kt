import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dicegame.composeapp.generated.resources.Res
import dicegame.composeapp.generated.resources.compose_multiplatform
import dicegame.composeapp.generated.resources.dice_1
import dicegame.composeapp.generated.resources.dice_2
import dicegame.composeapp.generated.resources.dice_3
import dicegame.composeapp.generated.resources.dice_4
import dicegame.composeapp.generated.resources.dice_5
import dicegame.composeapp.generated.resources.dice_6
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import kotlin.random.Random

@Composable
@Preview
fun App() {
    MaterialTheme {
        var image by remember {
            mutableStateOf(Res.drawable.dice_2)
        }
        Column {
            Spacer(modifier = Modifier.height(40.dp))
            Text("World Is All About To Roll")

            Image(painterResource(image),null)
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {
                var random = Random.nextInt(6) + 1

                when (random) {

                    1 -> image = Res.drawable.dice_1
                    2 -> image = Res.drawable.dice_2
                    3 -> image = Res.drawable.dice_3
                    4 -> image = Res.drawable.dice_4
                    5 -> image = Res.drawable.dice_5
                    6 -> image = Res.drawable.dice_6
                    else -> image = Res.drawable.compose_multiplatform
                }
            },modifier = Modifier.align(Alignment.CenterHorizontally)
            ){
                Text("Click To Roll The World")
            }

        }

        }
    }
