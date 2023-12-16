package com.example.cleanjpc.presentation.activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cleanjpc.presentation.viewmodel.PostsViewModel
import com.example.cleanjpc.utils.theme.CleanjpcTheme
import org.koin.androidx.viewmodel.ext.android.viewModel

class PostsActivity : ComponentActivity() {
    private val postsViewModel by viewModel<PostsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanjpcTheme{
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column{
                        Button(
                            onClick = {
                                postsViewModel.getAllPosts()
                            },
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Text("Load Posts")
                        }
                    }
                }
            }
        }
    }
}
